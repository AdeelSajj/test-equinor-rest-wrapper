package no.equinor.test.wellcom.rest;

import authentication.Authenticate;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;

public class ApiRunner {
    HttpsURLConnection connection = null;
    int responseCode = 0;
    String plannerCloudDevUrl = "https://plannerclouddev.wellcom.equinor.com/WellcomData/v1/";

    String plannerCloudDevUrl1 = "https://api-dev.gateway.equinor.com/wellcom-data/v1";

    public String runApi(String urlConstructor) throws IOException {
        Authenticate authenticate = new Authenticate();
        String response = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(plannerCloudDevUrl + urlConstructor);
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + authenticate.getAccessToken());
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            responseCode = connection.getResponseCode();
            String line = null;
            StringWriter out = new StringWriter(connection.getContentLength() > 0 ? connection.getContentLength() : 2048);
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            response = out.toString();
            System.out.println(response);
        } catch (Exception e) {

        }
        return response;
    }
}

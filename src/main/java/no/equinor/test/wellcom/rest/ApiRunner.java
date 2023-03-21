package no.equinor.test.wellcom.rest;

import authentication.Authenticate;
import net.bytebuddy.dynamic.DynamicType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.text.html.Option;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Optional;

public class ApiRunner {
    private static final transient Logger LOG = LoggerFactory.getLogger(ApiRunner.class);
    HttpsURLConnection connection = null;
    public int responseCode;
    String plannerCloudDevUrl = "https://plannerclouddev.wellcom.equinor.com/WellcomData/v1/";

    String plannerCloudDevUrl1 = "https://api-dev.gateway.equinor.com/wellcom-data/v1";

    public String runApi(String urlConstructor) throws IOException, NullPointerException {
        Authenticate authenticate = new Authenticate();
        String response = null;
        BufferedReader reader;
        String line;
        try {
            URL url = new URL(plannerCloudDevUrl + urlConstructor);
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + authenticate.getAccessToken());
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            responseCode = connection.getResponseCode();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringWriter out = new StringWriter(connection.getContentLength() > 0 ? connection.getContentLength() : 2048);
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            response = out.toString();
            connection.disconnect();
        } catch (Exception e) {
            LOG.info("Following exception is thrown" + e);
        }
        return response;
    }
}

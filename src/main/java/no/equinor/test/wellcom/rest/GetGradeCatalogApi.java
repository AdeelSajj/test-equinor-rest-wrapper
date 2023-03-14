package no.equinor.test.wellcom.rest;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GetGradeCatalogApi {
    private static final transient Logger LOG = LoggerFactory.getLogger(GetGradeCatalogApi.class);
    public void getGradeCatalog() throws IOException, JSONException {


        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("references/gradecatalog");
        System.out.println("Response Code: "+ apiRunner.responseCode);

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        int arraySize =  jsonArray.length();
        LOG.info("This is the size of array:" + arraySize);

        for (int i = 0 ; i<arraySize ; i++)
        {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println("JSON Object: "+jsonObject.toString(4));
        }
    }
}

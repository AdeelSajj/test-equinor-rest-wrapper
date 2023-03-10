package no.equinor.test.wellcom.rest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class GetGradeCatalogApi {
    public void getGradeCatalog() throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("references/gradecatalog");

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        int arraySize =  jsonArray.length();
        System.out.println("This is the size of array:" + arraySize);
        for (int i = 0 ; i<arraySize ; i++)
        {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println("JSON Object: "+jsonObject.toString(4)); 
        }
    }
}

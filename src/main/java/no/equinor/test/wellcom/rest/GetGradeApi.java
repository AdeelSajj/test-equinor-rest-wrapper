package no.equinor.test.wellcom.rest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class GetGradeApi {
    public JSONObject getGrade(String gradeCatalogId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("references/gradecatalog?grade=" + gradeCatalogId);
        System.out.println("Response Code: "+ apiRunner.responseCode);

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        JSONObject jsonObject =  jsonArray.getJSONObject(0);
        System.out.println("Response body: "+jsonObject.toString(4));
        return jsonObject;
    }
}

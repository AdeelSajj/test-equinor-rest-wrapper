package no.equinor.test.wellcom.rest.referenceGradeCatalog;

import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GetGradeApi {
    private static final transient Logger LOG = LoggerFactory.getLogger(GetGradeApi.class);
    public JSONObject getGrade(String gradeCatalogId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("references/gradecatalog?grade=" + gradeCatalogId);
        LOG.info("Response Code: "+ apiRunner.responseCode);

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        JSONObject jsonObject =  jsonArray.getJSONObject(0);
        System.out.println("Response body: "+jsonObject.toString(4));
        return jsonObject;
    }
}

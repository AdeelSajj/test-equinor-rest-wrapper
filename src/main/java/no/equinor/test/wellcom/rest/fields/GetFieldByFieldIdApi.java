package no.equinor.test.wellcom.rest.fields;

import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class GetFieldByFieldIdApi {
    public JSONObject getFieldByFieldId(String fieldId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        JSONObject jsonObject = new JSONObject(apiRunner.runApi("/fields/" +fieldId));
        System.out.println("JSON Object: " + jsonObject.toString(4));
        return jsonObject;
    }
}

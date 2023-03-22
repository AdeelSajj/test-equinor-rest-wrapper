package no.equinor.test.wellcom.rest.wellPath;

import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

public class GetWellPathByWellDesignIdApi {
    public void getWellPathByWellDesignId(String wellDesignId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("wellpath/" + wellDesignId + "?isDetailed=true");

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

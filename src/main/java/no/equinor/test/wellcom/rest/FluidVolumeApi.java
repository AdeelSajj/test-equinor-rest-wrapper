package no.equinor.test.wellcom.rest;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

public class FluidVolumeApi {
    @Test
    public void getFluidVolumeByProjectId() throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        JSONObject jsonObject = new JSONObject(apiRunner.runApi("/projects/:projectId/fluidvolumes?wellboreId=76031664"));
        System.out.println("JSON Object: " + jsonObject.toString(4));
//        return jsonObject;
    }
}

package no.equinor.test.wellcom.rest.fluidVolume;

import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class FluidVolumeApi {
    private static final transient Logger LOG = LoggerFactory.getLogger(FluidVolumeApi.class);

    public void getFluidVolumeByProjectId(String projectid, String wellboreId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("/projects/" + projectid + "/fluidvolumes?wellboreId=" + wellboreId);
        LOG.info("Response Code: "+ apiRunner.responseCode);

        if (response.equals("[]")) {
            LOG.info("The response is empty: " + response);
        }
        else {
        JSONObject jsonObject = new JSONObject(response);
        LOG.info("JSON Object: " + jsonObject.toString(4));
        }
    }
}

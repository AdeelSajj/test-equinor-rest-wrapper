package no.equinor.test.wellcom.rest.fields;

import no.equinor.test.wellcom.rest.ApiRunner;
import no.equinor.test.wellcom.rest.fluidVolume.FluidVolumeApi;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GetFieldByFieldIdApi {
    private static final transient Logger LOG = LoggerFactory.getLogger(GetFieldByFieldIdApi.class);
    public JSONObject getFieldByFieldId(String fieldId) throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        JSONObject jsonObject = new JSONObject(apiRunner.runApi("/fields/" +fieldId));
        LOG.info("JSON Object: " + jsonObject.toString(4));
        return jsonObject;
    }
}

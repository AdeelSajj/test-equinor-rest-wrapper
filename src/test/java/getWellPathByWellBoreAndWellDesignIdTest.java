import authentication.Authenticate;
import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

import static enums.getWellPathsByDesignId.WELL_BORE_ID;
import static enums.getWellPathsByDesignId.WELL_DESIGN_ID;

public class getWellPathByWellBoreAndWellDesignIdTest {
    JSONObject jsonObject = null;
    public String wellDesignId = "175899872";
    public String wellBoreId = "94681574";
    @Test
    public void getWellPathByWellBoreAndWellDesignId() throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("wellpath/" + wellDesignId + "?wellboreId=" + wellBoreId + "&isDetailed=true");

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        jsonObject = jsonArray.getJSONObject(0);
        System.out.println("JSON Object: "+jsonObject.toString(4));
        System.out.println(jsonObject.get(WELL_DESIGN_ID.getWellPathByDesignId));
        System.out.println(jsonObject.getString(WELL_BORE_ID.getWellPathByDesignId));
    }
}

import authentication.Authenticate;
import no.equinor.test.wellcom.rest.ApiRunner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;

public class getWellPathByWellDesignIdTest {
    JSONObject jsonObject = null;
    public String wellDesignId = "175899872";
    @Test
    public void getWellPathByWellDesignId() throws IOException, JSONException {
        ApiRunner apiRunner = new ApiRunner();
        String response = apiRunner.runApi("wellpath/" + wellDesignId + "?isDetailed=true");

        assert response != null;
        JSONArray jsonArray = new JSONArray(response);
        int arraySize =  jsonArray.length();
        System.out.println("This is the size of array:" + arraySize);
        for (int i = 0 ; i<arraySize ; i++)
        {jsonObject = jsonArray.getJSONObject(i);
            System.out.println("JSON Object: "+jsonObject.toString(4));
        }
    }
}

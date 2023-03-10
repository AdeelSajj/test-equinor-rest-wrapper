import lombok.extern.slf4j.Slf4j;
import no.equinor.test.wellcom.rest.GetGradeCatalogApi;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

public class getGradeCatalogTest {
    JSONObject jsonObject = null;

    //OPP-5424
    @Test
    public void getGradeCatalog() throws IOException, JSONException {
        GetGradeCatalogApi getGradeCatalogApi = new GetGradeCatalogApi();

        getGradeCatalogApi.getGradeCatalog();
    }
}

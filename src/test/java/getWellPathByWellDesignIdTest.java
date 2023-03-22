import no.equinor.test.wellcom.rest.wellPath.GetWellPathByWellDesignIdApi;
import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;

public class getWellPathByWellDesignIdTest {
    @Test
    public void getWellPathByWellDesignId() throws IOException, JSONException {
        String wellDesignId = "175899872";

        GetWellPathByWellDesignIdApi getWellPathByWellDesignIdApi = new GetWellPathByWellDesignIdApi();
        getWellPathByWellDesignIdApi.getWellPathByWellDesignId(wellDesignId);
    }
}

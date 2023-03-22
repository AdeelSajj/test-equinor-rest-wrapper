import no.equinor.test.wellcom.rest.wellPath.GetWellPathByWellBoreAndWellDesignIdApi;
import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;

public class getWellPathByWellBoreAndWellDesignIdTest {
    @Test
    public void getWellPathByWellBoreAndWellDesignId() throws IOException, JSONException {
        String wellDesignId = "175899872";
        String wellBoreId = "94681574";

        GetWellPathByWellBoreAndWellDesignIdApi getWellPathByWellBoreAndWellDesignIdApi = new GetWellPathByWellBoreAndWellDesignIdApi();
        getWellPathByWellBoreAndWellDesignIdApi.getWellPathByWellBoreAndWellDesignId(wellDesignId, wellBoreId);
    }
}

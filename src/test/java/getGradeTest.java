import no.equinor.test.wellcom.rest.GetGradeApi;
import models.referencegradecatalog.GradeDetailsController;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

public class getGradeTest {
    JSONObject jsonObject = null;

    @Test
    public void getGrade() throws IOException, JSONException {
        String gradeCatalogId = "X-80MO";
        GetGradeApi getGradeApi = new GetGradeApi();

        jsonObject = getGradeApi.getGrade(gradeCatalogId);
        System.out.println("The value of unit for thermalexp150C is: " + GradeDetailsController.getGradeDetailsObject(jsonObject).getThermalExp150C().getUnit());
        System.out.println("The value of Density150C is: " + GradeDetailsController.getGradeDetailsObject(jsonObject).getDensity150());
    }
}

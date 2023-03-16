import models.referencegradecatalog.GetGradeModel;
import no.equinor.test.wellcom.rest.referenceGradeCatalog.GetGradeApi;
import models.referencegradecatalog.GradeDetailsController;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class getGradeTest {
    private static final transient Logger LOG = LoggerFactory.getLogger(getGradeTest.class);
    JSONObject jsonObject = null;

    @Test
    public void getGrade() throws IOException, JSONException {
        String gradeCatalogId = "X-80MO";
        GetGradeApi getGradeApi = new GetGradeApi();

        jsonObject = getGradeApi.getGrade(gradeCatalogId);
        LOG.info("The value of unit for thermalexp150C is: " + GradeDetailsController.getGradeDetailsObject(jsonObject).getThermalExp150C().getUnit());
        LOG.info("The value of Density150C is: " + GradeDetailsController.getGradeDetailsObject(jsonObject).getDensity150());
        LOG.info("The enum value for min yield unit is: " + GetGradeModel.MinYield.units.KSI);
    }
}

import no.equinor.test.wellcom.rest.fields.GetFieldByFieldIdApi;
import models.fields.FieldDetailsController;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
public class getFieldByFieldIdTest {

    @Test
    public void getFieldByFieldIdTes() throws IOException, JSONException {
        String fieldId = "62215471";
        String updateDate = "2021-12-01T09:32:09       ";
        GetFieldByFieldIdApi getFieldByFieldIdApi = new GetFieldByFieldIdApi();

        JSONObject jsonObject = getFieldByFieldIdApi.getFieldByFieldId(fieldId);
        System.out.println("The value UpdateDate is: " + FieldDetailsController.getFieldDetailsObject(jsonObject).getUpdateDate());
        Assert.assertEquals(FieldDetailsController.getFieldDetailsObject(jsonObject).getUpdateDate(), (updateDate));

    }
}

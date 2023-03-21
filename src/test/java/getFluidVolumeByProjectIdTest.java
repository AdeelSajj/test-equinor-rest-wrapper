import no.equinor.test.wellcom.rest.fluidVolume.FluidVolumeApi;
import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;

public class getFluidVolumeByProjectIdTest {
    @Test
    public void getFluidVolumeByProjectIdTes() throws IOException, JSONException {
        FluidVolumeApi fluidVolumeApi = new FluidVolumeApi();
        fluidVolumeApi.getFluidVolumeByProjectId("94220804", "76031664");
    }
}

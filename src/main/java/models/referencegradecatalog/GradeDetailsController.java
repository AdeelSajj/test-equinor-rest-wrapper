package models.referencegradecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import models.referencegradecatalog.GetGradeModel;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


public class GradeDetailsController {

    public static GetGradeModel getGradeDetailsObject(JSONObject response) {
        GetGradeModel getGradeObj = new GetGradeModel();

//        GetGradeApi getGradeApi = new GetGradeApi();
//        JSONObject response = getGradeApi.getGrade("X-80MO");

        //MinYield
        GetGradeModel.MinYield minYieldObj = getGradeObj.new MinYield();
        JSONObject minYield = (JSONObject) response.get("minYield");
        minYieldObj.setUnit(minYield.get("unit").toString());
        minYieldObj.setValue(minYield.get("value").toString());
        getGradeObj.setMinYield(minYieldObj);

        //HeatCapacity
        GetGradeModel.HeatCapacity heatCapacityObj = getGradeObj.new HeatCapacity();
        JSONObject heatCapacity = (JSONObject) response.get("heatCapacity");
        heatCapacityObj.setUnit(heatCapacity.get("unit").toString());
        heatCapacityObj.setValue(heatCapacity.get("value").toString());
        getGradeObj.setHeatCapacity(heatCapacityObj);

        //Density150
        getGradeObj.setDensity150(response.get("density150").toString());

        //YieldAt500C
        GetGradeModel.YieldAt500C yieldAt500CObj = getGradeObj.new YieldAt500C();
        JSONObject yieldAt500C = (JSONObject) response.get("yieldAt500C");
        yieldAt500CObj.setUnit(yieldAt500C.get("unit").toString());
        yieldAt500CObj.setValue(yieldAt500C.get("value").toString());
        getGradeObj.setYieldAt500C(yieldAt500CObj);

        //ThermalExp500C
        GetGradeModel.ThermalExp500C thermalExp500CObj = getGradeObj.new ThermalExp500C();
        JSONObject thermalExp500C = (JSONObject) response.get("thermalExp500C");
        thermalExp500CObj.setUnit(thermalExp500C.get("unit").toString());
        thermalExp500CObj.setValue(thermalExp500C.get("value").toString());
        getGradeObj.setThermalExp500C(thermalExp500CObj);

        //qcDate
        getGradeObj.setQcDate(response.get("qcDate").toString());

        //AnisotropyHoop
        GetGradeModel.AnisotropyHoop anisotropyHoopObj = getGradeObj.new AnisotropyHoop();
        JSONObject anisotropyHoop = (JSONObject) response.get("anisotropyHoop");
        anisotropyHoopObj.setUnit(anisotropyHoop.get("unit").toString());
        anisotropyHoopObj.setValue(anisotropyHoop.get("value").toString());
        getGradeObj.setAnisotropyHoop(anisotropyHoopObj);

        //Description
        getGradeObj.setDescription(response.get("description").toString());

        //MaxHardness
        GetGradeModel.MaxHardness maxHardnessObj = getGradeObj.new MaxHardness();
        JSONObject maxHardness = (JSONObject) response.get("maxHardness");
        maxHardnessObj.setUnit(maxHardness.get("unit").toString());
        maxHardnessObj.setValue(maxHardness.get("value").toString());
        getGradeObj.setMaxHardness(maxHardnessObj);

        //YoungsModulus25
        GetGradeModel.YoungsModulus25 youngsModulus25Obj = getGradeObj.new YoungsModulus25();
        JSONObject youngsModulus25 = (JSONObject) response.get("youngsModulus25");
        youngsModulus25Obj.setUnit(youngsModulus25.get("unit").toString());
        youngsModulus25Obj.setValue(youngsModulus25.get("value").toString());
        getGradeObj.setYoungsModulus25(youngsModulus25Obj);

        //Density25
        getGradeObj.setDensity25(response.get("density25").toString());

        //GradeCatalogId
        getGradeObj.setGradeCatalogId(response.get("gradeCatalogId").toString());

        //ThermalExp150C
        GetGradeModel.ThermalExp150C thermalExp150CObj = getGradeObj.new ThermalExp150C();
        JSONObject thermalExp150C = (JSONObject) response.get("thermalExp150C");
        thermalExp150CObj.setUnit(thermalExp150C.get("unit").toString());
        thermalExp150CObj.setValue(thermalExp150C.get("value").toString());
        getGradeObj.setThermalExp150C(thermalExp150CObj);

        //PoissonsRatio25
        getGradeObj.setPoissonsRatio25(response.get("poissonsRatio25").toString());

        //ThermalExp100C
        GetGradeModel.ThermalExp100C thermalExp100CObj = getGradeObj.new ThermalExp100C();
        JSONObject thermalExp100C = (JSONObject) response.get("thermalExp100C");
        thermalExp100CObj.setUnit(thermalExp100C.get("unit").toString());
        thermalExp100CObj.setValue(thermalExp100C.get("value").toString());
        getGradeObj.setThermalExp100C(thermalExp100CObj);

        //GradeType
        getGradeObj.setGradeType(response.get("gradeType").toString());

        //ThermalConductivity
        GetGradeModel.ThermalConductivity thermalConductivityObj = getGradeObj.new ThermalConductivity();
        JSONObject thermalConductivity = (JSONObject) response.get("thermalConductivity");
        thermalConductivityObj.setUnit(thermalConductivity.get("unit").toString());
        thermalConductivityObj.setValue(thermalConductivity.get("value").toString());
        getGradeObj.setThermalConductivity(thermalConductivityObj);

        //YieldAt100C
        GetGradeModel.YieldAt100C yieldAt100CObj = getGradeObj.new YieldAt100C();
        JSONObject yieldAt100C = (JSONObject) response.get("yieldAt100C");
        yieldAt100CObj.setUnit(yieldAt100C.get("unit").toString());
        yieldAt100CObj.setValue(yieldAt100C.get("value").toString());
        getGradeObj.setYieldAt100C(yieldAt100CObj);

        //Id
        getGradeObj.setId(response.get("id").toString());

        //YieldAt150C
        GetGradeModel.YieldAt150C yieldAt150CObj = getGradeObj.new YieldAt150C();
        JSONObject yieldAt150C = (JSONObject) response.get("yieldAt150C");
        yieldAt150CObj.setUnit(yieldAt150C.get("unit").toString());
        yieldAt150CObj.setValue(yieldAt150C.get("value").toString());
        getGradeObj.setYieldAt150C(yieldAt150CObj);

        //MinTensileStrength
        GetGradeModel.MinTensileStrength minTensileStrengthObj = getGradeObj.new MinTensileStrength();
        JSONObject minTensileStrength = (JSONObject) response.get("minTensileStrength");
        minTensileStrengthObj.setUnit(minTensileStrength.get("unit").toString());
        minTensileStrengthObj.setValue(minTensileStrength.get("value").toString());
        getGradeObj.setMinTensileStrength(minTensileStrengthObj);

        //AvailableForPWD
        getGradeObj.setAvailableForPWD(response.get("availableForPWD").toString());

        //DataStatus
        getGradeObj.setDataStatus(response.get("dataStatus").toString());

        //RushmoreCode
        getGradeObj.setRushmoreCode(response.get("rushmoreCode").toString());

        //NotInUse
        getGradeObj.setNotInUse(response.get("notInUse").toString());

        //AnisotropyRadial
        GetGradeModel.AnisotropyRadial anisotropyRadialObj = getGradeObj.new AnisotropyRadial();
        JSONObject anisotropyRadial = (JSONObject) response.get("anisotropyRadial");
        anisotropyRadialObj.setUnit(anisotropyRadial.get("unit").toString());
        anisotropyRadialObj.setValue(anisotropyRadial.get("value").toString());
        getGradeObj.setAnisotropyRadial(anisotropyRadialObj);

        //MaxYield
        GetGradeModel.MaxYield maxYieldObj = getGradeObj.new MaxYield();
        JSONObject maxYield = (JSONObject) response.get("maxYield");
        maxYieldObj.setUnit(maxYield.get("unit").toString());
        maxYieldObj.setValue(maxYield.get("value").toString());
        getGradeObj.setMaxYield(maxYieldObj);

        //ThermalExp250C
        GetGradeModel.ThermalExp250C thermalExp250CObj = getGradeObj.new ThermalExp250C();
        JSONObject thermalExp250C = (JSONObject) response.get("thermalExp250C");
        thermalExp250CObj.setUnit(thermalExp250C.get("unit").toString());
        thermalExp250CObj.setValue(thermalExp250C.get("value").toString());
        getGradeObj.setThermalExp250C(thermalExp250CObj);

        //AnisotropyLongitudinal
        getGradeObj.setAnisotropyLongitudinal(response.get("anisotropyLongitudinal").toString());

        //ThermalExp200C
        GetGradeModel.ThermalExp200C thermalExp200CObj = getGradeObj.new ThermalExp200C();
        JSONObject thermalExp200C = (JSONObject) response.get("thermalExp200C");
        thermalExp200CObj.setUnit(thermalExp200C.get("unit").toString());
        thermalExp200CObj.setValue(thermalExp200C.get("value").toString());
        getGradeObj.setThermalExp200C(thermalExp200CObj);


        //YieldAt200C
        GetGradeModel.YieldAt200C yieldAt200CObj = getGradeObj.new YieldAt200C();
        JSONObject yieldAt200C = (JSONObject) response.get("yieldAt200C");
        yieldAt200CObj.setUnit(yieldAt200C.get("unit").toString());
        yieldAt200CObj.setValue(yieldAt200C.get("value").toString());
        getGradeObj.setYieldAt200C(yieldAt200CObj);

        //YieldAt250C
        GetGradeModel.YieldAt250C yieldAt250CObj = getGradeObj.new YieldAt250C();
        JSONObject yieldAt250C = (JSONObject) response.get("yieldAt250C");
        yieldAt250CObj.setUnit(yieldAt250C.get("unit").toString());
        yieldAt250CObj.setValue(yieldAt250C.get("value").toString());
        getGradeObj.setYieldAt250C(yieldAt250CObj);

        return getGradeObj;
    }
}

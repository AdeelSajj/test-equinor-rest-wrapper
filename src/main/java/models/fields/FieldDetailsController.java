package models.fields;

import org.json.JSONObject;

public class FieldDetailsController {
    public static GetFieldByFieldIdModel getFieldDetailsObject(JSONObject response) {
        GetFieldByFieldIdModel getFieldByFieldIdModelObj = new GetFieldByFieldIdModel();

        //UpdateDate
        getFieldByFieldIdModelObj.setUpdateDate(response.get("updateDate").toString());

        //FieldName
        getFieldByFieldIdModelObj.setFieldName(response.get("fieldName").toString());

        //ProjectPhase
        getFieldByFieldIdModelObj.setProjectPhase(response.get("projectPhase").toString());

        //ProjectPhaseName
        getFieldByFieldIdModelObj.setProjectPhaseName(response.get("projectPhaseName").toString());

        //DataStatus
        getFieldByFieldIdModelObj.setDataStatus(response.get("dataStatus").toString());

        //FieldAuthorization
        getFieldByFieldIdModelObj.setFieldAuthorization(response.get("fieldAuthorization").toString());

        //FieldKind
        getFieldByFieldIdModelObj.setFieldKind(response.get("fieldKind").toString());

        //FieldGrouping
        getFieldByFieldIdModelObj.setFieldGrouping(response.get("fieldGrouping").toString());

        //ProjectPhaseId
        getFieldByFieldIdModelObj.setProjectPhaseId(response.get("projectPhaseId").toString());

        //MainFieldId
        getFieldByFieldIdModelObj.setMainFieldId(response.get("mainFieldId").toString());

        //CountryName
        getFieldByFieldIdModelObj.setCountryName(response.get("countryName").toString());

        //Id
        getFieldByFieldIdModelObj.setId(response.get("id").toString());

        //ProjectName
        getFieldByFieldIdModelObj.setProjectName(response.get("projectName").toString());

        //ProjectId
        getFieldByFieldIdModelObj.setProjectId(response.get("projectId").toString());

        //FieldId
        getFieldByFieldIdModelObj.setFieldId(response.get("fieldId").toString());

        return getFieldByFieldIdModelObj;
    }
}

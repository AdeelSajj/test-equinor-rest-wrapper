package enums;

public enum getFieldsByFieldId  {
    UPDATE_DATE("updateDate"),
            FIELD_NAME("fieldName"),
            PROJECT_PHASE("projectPhase"),
            PROJECT_PHASE_NAME("projectPhaseName"),
            DATA_STATUS("dataStatus"),
            FIELD_AUTHORIZATION("fieldAuthorization"),
            FIELD_KIND("fieldKind"),
            FIELD_GROUPING("fieldGrouping"),
            PROJECT_PHASE_ID("projectPhaseId"),
            MAIN_FIELD_ID("mainFieldId"),
            COUNTRY_NAME("countryName"),
            ID("id"),
            PROJECT_NAME("projectName"),
            PROJECT_ID("projectId"),
            FIELD_ID("fieldId");

    public String getFieldByFieldId;

    getFieldsByFieldId(String getFieldByFieldId) {
        this.getFieldByFieldId = getFieldByFieldId;
    }

    enum  CountryNames{
        Norway,
        Sweden,
        Denmark
    }
//    public String getField(){ return getFieldByFieldId; }

}

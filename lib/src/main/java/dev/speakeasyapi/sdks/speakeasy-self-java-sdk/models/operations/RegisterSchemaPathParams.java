package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class RegisterSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public RegisterSchemaPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public RegisterSchemaPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}

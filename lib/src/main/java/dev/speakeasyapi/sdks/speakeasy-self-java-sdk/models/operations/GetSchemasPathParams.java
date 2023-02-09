package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GetSchemasPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetSchemasPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetSchemasPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}

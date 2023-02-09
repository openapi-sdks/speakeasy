package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GetVersionMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetVersionMetadataPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetVersionMetadataPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}

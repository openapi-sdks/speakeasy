package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GetAllApiVersionsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetAllApiVersionsPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
}

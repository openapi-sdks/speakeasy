package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class UpsertApiPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public UpsertApiPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
}

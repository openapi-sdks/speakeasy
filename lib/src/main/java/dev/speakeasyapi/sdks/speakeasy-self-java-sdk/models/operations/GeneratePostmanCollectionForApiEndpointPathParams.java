package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GeneratePostmanCollectionForApiEndpointPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    public String apiEndpointID;
    public GeneratePostmanCollectionForApiEndpointPathParams withApiEndpointID(String apiEndpointID) {
        this.apiEndpointID = apiEndpointID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GeneratePostmanCollectionForApiEndpointPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GeneratePostmanCollectionForApiEndpointPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}

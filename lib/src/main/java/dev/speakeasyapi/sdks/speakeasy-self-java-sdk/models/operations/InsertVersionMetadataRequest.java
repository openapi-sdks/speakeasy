package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class InsertVersionMetadataRequest {
    public InsertVersionMetadataPathParams pathParams;
    public InsertVersionMetadataRequest withPathParams(InsertVersionMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadataInput request;
    public InsertVersionMetadataRequest withRequest(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadataInput request) {
        this.request = request;
        return this;
    }
}

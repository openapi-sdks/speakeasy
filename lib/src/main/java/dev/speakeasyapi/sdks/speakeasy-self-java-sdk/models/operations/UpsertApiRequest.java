package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class UpsertApiRequest {
    public UpsertApiPathParams pathParams;
    public UpsertApiRequest withPathParams(UpsertApiPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiInput request;
    public UpsertApiRequest withRequest(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiInput request) {
        this.request = request;
        return this;
    }
}

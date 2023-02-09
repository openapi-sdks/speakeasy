package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class UpsertApiEndpointRequest {
    public UpsertApiEndpointPathParams pathParams;
    public UpsertApiEndpointRequest withPathParams(UpsertApiEndpointPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpointInput request;
    public UpsertApiEndpointRequest withRequest(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpointInput request) {
        this.request = request;
        return this;
    }
}

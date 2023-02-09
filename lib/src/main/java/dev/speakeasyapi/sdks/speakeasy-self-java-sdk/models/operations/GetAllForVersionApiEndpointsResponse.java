package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import java.time.OffsetDateTime;

public class GetAllForVersionApiEndpointsResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllForVersionApiEndpointsResponse withApiEndpoints(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    public String contentType;
    public GetAllForVersionApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetAllForVersionApiEndpointsResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetAllForVersionApiEndpointsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

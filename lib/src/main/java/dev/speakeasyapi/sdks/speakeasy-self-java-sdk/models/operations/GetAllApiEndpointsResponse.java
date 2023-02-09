package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import java.time.OffsetDateTime;

public class GetAllApiEndpointsResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllApiEndpointsResponse withApiEndpoints(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    public String contentType;
    public GetAllApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetAllApiEndpointsResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetAllApiEndpointsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

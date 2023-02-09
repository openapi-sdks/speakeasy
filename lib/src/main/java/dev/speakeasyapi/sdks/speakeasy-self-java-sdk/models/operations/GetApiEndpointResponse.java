package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetApiEndpointResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint apiEndpoint;
    public GetApiEndpointResponse withApiEndpoint(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    public String contentType;
    public GetApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetApiEndpointResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetApiEndpointResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

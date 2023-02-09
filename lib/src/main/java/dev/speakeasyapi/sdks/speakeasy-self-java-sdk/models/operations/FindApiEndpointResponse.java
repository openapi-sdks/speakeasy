package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class FindApiEndpointResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint apiEndpoint;
    public FindApiEndpointResponse withApiEndpoint(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    public String contentType;
    public FindApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public FindApiEndpointResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public FindApiEndpointResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

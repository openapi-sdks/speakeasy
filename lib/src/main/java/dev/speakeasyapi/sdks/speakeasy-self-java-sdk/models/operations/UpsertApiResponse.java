package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class UpsertApiResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api api;
    public UpsertApiResponse withApi(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api api) {
        this.api = api;
        return this;
    }
    public String contentType;
    public UpsertApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public UpsertApiResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public UpsertApiResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

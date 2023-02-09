package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class DeleteVersionMetadataResponse {
    public String contentType;
    public DeleteVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public DeleteVersionMetadataResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public DeleteVersionMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

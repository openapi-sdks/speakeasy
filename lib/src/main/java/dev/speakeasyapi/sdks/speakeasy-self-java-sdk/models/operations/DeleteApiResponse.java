package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class DeleteApiResponse {
    public String contentType;
    public DeleteApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public DeleteApiResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public DeleteApiResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

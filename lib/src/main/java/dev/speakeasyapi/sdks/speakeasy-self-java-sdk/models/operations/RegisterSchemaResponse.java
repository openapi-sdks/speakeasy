package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class RegisterSchemaResponse {
    public String contentType;
    public RegisterSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public RegisterSchemaResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public RegisterSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetSchemaDiffResponse {
    public String contentType;
    public GetSchemaDiffResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetSchemaDiffResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.SchemaDiff schemaDiff;
    public GetSchemaDiffResponse withSchemaDiff(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.SchemaDiff schemaDiff) {
        this.schemaDiff = schemaDiff;
        return this;
    }
    public Long statusCode;
    public GetSchemaDiffResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

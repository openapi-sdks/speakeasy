package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetSchemaResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Schema schema;
    public GetSchemaResponse withSchema(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    public Long statusCode;
    public GetSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

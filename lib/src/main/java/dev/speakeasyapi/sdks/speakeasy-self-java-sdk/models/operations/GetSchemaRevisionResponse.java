package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetSchemaRevisionResponse {
    public String contentType;
    public GetSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetSchemaRevisionResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Schema schema;
    public GetSchemaRevisionResponse withSchema(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    public Long statusCode;
    public GetSchemaRevisionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class DownloadSchemaResponse {
    public String contentType;
    public DownloadSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public DownloadSchemaResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public byte[] schema;
    public DownloadSchemaResponse withSchema(byte[] schema) {
        this.schema = schema;
        return this;
    }
    public Long statusCode;
    public DownloadSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

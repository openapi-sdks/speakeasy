package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GeneratePostmanCollectionResponse {
    public String contentType;
    public GeneratePostmanCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GeneratePostmanCollectionResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public byte[] postmanCollection;
    public GeneratePostmanCollectionResponse withPostmanCollection(byte[] postmanCollection) {
        this.postmanCollection = postmanCollection;
        return this;
    }
    public Long statusCode;
    public GeneratePostmanCollectionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

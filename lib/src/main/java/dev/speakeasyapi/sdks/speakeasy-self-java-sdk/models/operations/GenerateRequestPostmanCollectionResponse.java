package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GenerateRequestPostmanCollectionResponse {
    public String contentType;
    public GenerateRequestPostmanCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GenerateRequestPostmanCollectionResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public byte[] postmanCollection;
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(byte[] postmanCollection) {
        this.postmanCollection = postmanCollection;
        return this;
    }
    public Long statusCode;
    public GenerateRequestPostmanCollectionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

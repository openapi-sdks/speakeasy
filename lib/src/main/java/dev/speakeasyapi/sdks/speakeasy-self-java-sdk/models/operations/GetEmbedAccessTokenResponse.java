package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetEmbedAccessTokenResponse {
    public String contentType;
    public GetEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse;
    public GetEmbedAccessTokenResponse withEmbedAccessTokenResponse(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.EmbedAccessTokenResponse embedAccessTokenResponse) {
        this.embedAccessTokenResponse = embedAccessTokenResponse;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetEmbedAccessTokenResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetEmbedAccessTokenResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

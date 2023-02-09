package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class RevokeEmbedAccessTokenResponse {
    public String contentType;
    public RevokeEmbedAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public RevokeEmbedAccessTokenResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public RevokeEmbedAccessTokenResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

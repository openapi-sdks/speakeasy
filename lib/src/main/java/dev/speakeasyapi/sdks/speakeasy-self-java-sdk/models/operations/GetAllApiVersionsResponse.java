package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import java.time.OffsetDateTime;

public class GetAllApiVersionsResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api[] apis;
    public GetAllApiVersionsResponse withApis(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api[] apis) {
        this.apis = apis;
        return this;
    }
    public String contentType;
    public GetAllApiVersionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetAllApiVersionsResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetAllApiVersionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

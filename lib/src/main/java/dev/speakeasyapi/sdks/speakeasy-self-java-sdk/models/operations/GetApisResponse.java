package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import java.time.OffsetDateTime;

public class GetApisResponse {
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api[] apis;
    public GetApisResponse withApis(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Api[] apis) {
        this.apis = apis;
        return this;
    }
    public String contentType;
    public GetApisResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetApisResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetApisResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import java.time.OffsetDateTime;

public class GetVersionMetadataResponse {
    public String contentType;
    public GetVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetVersionMetadataResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetVersionMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata[] versionMetadata;
    public GetVersionMetadataResponse withVersionMetadata(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata[] versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
}

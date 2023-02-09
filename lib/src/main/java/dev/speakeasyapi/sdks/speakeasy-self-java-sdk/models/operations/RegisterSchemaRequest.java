package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequest {
    public RegisterSchemaPathParams pathParams;
    public RegisterSchemaRequest withPathParams(RegisterSchemaPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public RegisterSchemaRequestBody request;
    public RegisterSchemaRequest withRequest(RegisterSchemaRequestBody request) {
        this.request = request;
        return this;
    }
}

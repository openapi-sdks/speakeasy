package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
    public RegisterSchemaRequestBody withFile(RegisterSchemaRequestBodyFile file) {
        this.file = file;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class SchemeAPIKey {
    @SpeakeasyMetadata("security:name=x-api-key")
    public String apiKey;
    public SchemeAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}

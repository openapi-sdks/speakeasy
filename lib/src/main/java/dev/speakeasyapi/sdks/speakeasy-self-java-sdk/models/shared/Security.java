package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeAPIKey apiKey;
    public Security withAPIKey(SchemeAPIKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}

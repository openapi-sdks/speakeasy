package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchemaDiffValueChange {
    @JsonProperty("From")
    public String from;
    public SchemaDiffValueChange withFrom(String from) {
        this.from = from;
        return this;
    }
    @JsonProperty("To")
    public String to;
    public SchemaDiffValueChange withTo(String to) {
        this.to = to;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GetAllApiVersionsOp {
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetAllApiVersionsOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
}

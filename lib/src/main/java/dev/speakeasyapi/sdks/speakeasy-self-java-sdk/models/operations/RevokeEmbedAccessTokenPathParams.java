package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class RevokeEmbedAccessTokenPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    public String tokenID;
    public RevokeEmbedAccessTokenPathParams withTokenID(String tokenID) {
        this.tokenID = tokenID;
        return this;
    }
}

package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class DeleteSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public DeleteSchemaPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    public String revisionID;
    public DeleteSchemaPathParams withRevisionID(String revisionID) {
        this.revisionID = revisionID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public DeleteSchemaPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
}

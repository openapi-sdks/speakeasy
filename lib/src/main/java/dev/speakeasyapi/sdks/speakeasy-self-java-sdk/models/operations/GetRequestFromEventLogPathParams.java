package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class GetRequestFromEventLogPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GetRequestFromEventLogPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
}

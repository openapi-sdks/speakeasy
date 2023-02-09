package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GetRequestFromEventLogResponse {
    public String contentType;
    public GetRequestFromEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GetRequestFromEventLogResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public Long statusCode;
    public GetRequestFromEventLogResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.UnboundedRequest unboundedRequest;
    public GetRequestFromEventLogResponse withUnboundedRequest(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.UnboundedRequest unboundedRequest) {
        this.unboundedRequest = unboundedRequest;
        return this;
    }
}

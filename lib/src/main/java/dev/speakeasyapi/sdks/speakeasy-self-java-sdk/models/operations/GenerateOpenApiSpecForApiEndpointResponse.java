package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;



public class GenerateOpenApiSpecForApiEndpointResponse {
    public String contentType;
    public GenerateOpenApiSpecForApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error;
    public GenerateOpenApiSpecForApiEndpointResponse withError(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecForApiEndpointResponse withGenerateOpenApiSpecDiff(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    public Long statusCode;
    public GenerateOpenApiSpecForApiEndpointResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}

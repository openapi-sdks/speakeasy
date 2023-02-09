package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations;

import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Filters filters;
    public QueryEventLogQueryParams withFilters(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
}

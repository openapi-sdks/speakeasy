package dev.speakeasyapi.sdks.speakeasy-self-java-sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.HTTPClient;
import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.HTTPRequest;
import dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Metadata {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Metadata(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * deleteVersionMetadata - Delete metadata for a particular apiID and versionID.
    **/
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.DeleteVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata/{metaKey}/{metaValue}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.DeleteVersionMetadataResponse res = new dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.DeleteVersionMetadataResponse() {{
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * getVersionMetadata - Get all metadata for a particular apiID and versionID.
    **/
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.GetVersionMetadataResponse getVersionMetadata(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.GetVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.GetVersionMetadataResponse res = new dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.GetVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata[].class);
                res.versionMetadata = out;
            }
        }
        else {
            if (dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
    
    /**
     * insertVersionMetadata - Insert metadata for a particular apiID and versionID.
    **/
    public dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.InsertVersionMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.generateURL(baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.InsertVersionMetadataResponse res = new dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.operations.InsertVersionMetadataResponse() {{
            versionMetadata = null;
            error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.VersionMetadata.class);
                res.versionMetadata = out;
            }
        }
        else {
            if (dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.sdks.speakeasy-self-java-sdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}
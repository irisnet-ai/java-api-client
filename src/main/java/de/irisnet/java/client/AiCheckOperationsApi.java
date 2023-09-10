/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in real-time. This is an interactive documentation where you can quickly look up the endpoints and their schemas, while having the opportunity to try things out for yourself.  In the list below, you can see the available endpoints of the API, which can be expanded by clicking on them. Each expanded endpoint lists the request parameters (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail.  Additionally you'll find a 'Try it out' button that allows you to enter your custom parameters and custom body and execute that against the API. <b>Be sure to enter your license key to authorize the requests before using this documentation interactively.</b>  The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. If you click on the right arrow, you can expand the model and get a description of the model and the model parameters. For nested models, you can keep clicking the right arrow for further details.  Clicking the link below the title at the top of this page opens the [OpenAPI specification](https://swagger.io/specification/) (OAS3) in JSON format. The OAS3 Spec allows the generation of clients in many programming languages. There are several free client generators available that can be used to get started easily.
 *
 * The version of the OpenAPI document: v2
 * Contact: info@irisnet.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client;

import de.irisnet.java.ApiCallback;
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.ApiResponse;
import de.irisnet.java.Configuration;
import de.irisnet.java.Pair;
import de.irisnet.java.ProgressRequestBody;
import de.irisnet.java.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import de.irisnet.java.client.model.ApiNotice;
import de.irisnet.java.client.model.CheckResult;
import de.irisnet.java.client.model.Config;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AiCheckOperationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiCheckOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiCheckOperationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for checkImage
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use &#39;data&#39; parameter instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; (optional)
     * @param data The http(s) url or base64 encoded data uri of the image that needs to be checked. (optional)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageCall(UUID configId, String url, String data, Integer detail, Boolean imageEncode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/check-image/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (url != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("url", url));
        }

        if (data != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("data", data));
        }

        if (detail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("detail", detail));
        }

        if (imageEncode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("imageEncode", imageEncode));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "LICENSE-KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkImageValidateBeforeCall(UUID configId, String url, String data, Integer detail, Boolean imageEncode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling checkImage(Async)");
        }

        return checkImageCall(configId, url, data, detail, imageEncode, _callback);

    }

    /**
     * Check an image with the AI.
     * The response (_CheckResult_ schema) is returned immediately after the request.
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use &#39;data&#39; parameter instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; (optional)
     * @param data The http(s) url or base64 encoded data uri of the image that needs to be checked. (optional)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @return CheckResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public CheckResult checkImage(UUID configId, String url, String data, Integer detail, Boolean imageEncode) throws ApiException {
        ApiResponse<CheckResult> localVarResp = checkImageWithHttpInfo(configId, url, data, detail, imageEncode);
        return localVarResp.getData();
    }

    /**
     * Check an image with the AI.
     * The response (_CheckResult_ schema) is returned immediately after the request.
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use &#39;data&#39; parameter instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; (optional)
     * @param data The http(s) url or base64 encoded data uri of the image that needs to be checked. (optional)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @return ApiResponse&lt;CheckResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CheckResult> checkImageWithHttpInfo(UUID configId, String url, String data, Integer detail, Boolean imageEncode) throws ApiException {
        okhttp3.Call localVarCall = checkImageValidateBeforeCall(configId, url, data, detail, imageEncode, null);
        Type localVarReturnType = new TypeToken<CheckResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check an image with the AI. (asynchronously)
     * The response (_CheckResult_ schema) is returned immediately after the request.
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use &#39;data&#39; parameter instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; (optional)
     * @param data The http(s) url or base64 encoded data uri of the image that needs to be checked. (optional)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageAsync(UUID configId, String url, String data, Integer detail, Boolean imageEncode, final ApiCallback<CheckResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkImageValidateBeforeCall(configId, url, data, detail, imageEncode, _callback);
        Type localVarReturnType = new TypeToken<CheckResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for checkStream
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param inUrl The URL of the video stream that the AI should check. (required)
     * @param outUrl The URL of where the AI should send the encoded stream. (optional)
     * @param cycleLength Determine how often (value in milliseconds) the the AI should give a feedback. (optional, default to 500)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkStreamCall(UUID configId, String inUrl, String outUrl, Integer cycleLength, Integer checkRate, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/check-stream/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (inUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inUrl", inUrl));
        }

        if (outUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outUrl", outUrl));
        }

        if (cycleLength != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cycleLength", cycleLength));
        }

        if (checkRate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkRate", checkRate));
        }

        final String[] localVarAccepts = {
            "application/x-ndjson"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "LICENSE-KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkStreamValidateBeforeCall(UUID configId, String inUrl, String outUrl, Integer cycleLength, Integer checkRate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling checkStream(Async)");
        }

        // verify the required parameter 'inUrl' is set
        if (inUrl == null) {
            throw new ApiException("Missing the required parameter 'inUrl' when calling checkStream(Async)");
        }

        return checkStreamCall(configId, inUrl, outUrl, cycleLength, checkRate, _callback);

    }

    /**
     * Check a stream with the AI.
     * The body is continuously send per JSON stream until completion of the video stream. Only then the full _CheckResult_ schema will be shown (past _Events_ omitted).  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;  &lt;b&gt;WARNING: Please do not use the &#39;Try it out&#39; for this operation. The browser is not able to refresh the response preview until the completion of the video stream.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param inUrl The URL of the video stream that the AI should check. (required)
     * @param outUrl The URL of where the AI should send the encoded stream. (optional)
     * @param cycleLength Determine how often (value in milliseconds) the the AI should give a feedback. (optional, default to 500)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @return List&lt;CheckResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public List<CheckResult> checkStream(UUID configId, String inUrl, String outUrl, Integer cycleLength, Integer checkRate) throws ApiException {
        ApiResponse<List<CheckResult>> localVarResp = checkStreamWithHttpInfo(configId, inUrl, outUrl, cycleLength, checkRate);
        return localVarResp.getData();
    }

    /**
     * Check a stream with the AI.
     * The body is continuously send per JSON stream until completion of the video stream. Only then the full _CheckResult_ schema will be shown (past _Events_ omitted).  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;  &lt;b&gt;WARNING: Please do not use the &#39;Try it out&#39; for this operation. The browser is not able to refresh the response preview until the completion of the video stream.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param inUrl The URL of the video stream that the AI should check. (required)
     * @param outUrl The URL of where the AI should send the encoded stream. (optional)
     * @param cycleLength Determine how often (value in milliseconds) the the AI should give a feedback. (optional, default to 500)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @return ApiResponse&lt;List&lt;CheckResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CheckResult>> checkStreamWithHttpInfo(UUID configId, String inUrl, String outUrl, Integer cycleLength, Integer checkRate) throws ApiException {
        okhttp3.Call localVarCall = checkStreamValidateBeforeCall(configId, inUrl, outUrl, cycleLength, checkRate, null);
        Type localVarReturnType = new TypeToken<List<CheckResult>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a stream with the AI. (asynchronously)
     * The body is continuously send per JSON stream until completion of the video stream. Only then the full _CheckResult_ schema will be shown (past _Events_ omitted).  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;  &lt;b&gt;WARNING: Please do not use the &#39;Try it out&#39; for this operation. The browser is not able to refresh the response preview until the completion of the video stream.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param inUrl The URL of the video stream that the AI should check. (required)
     * @param outUrl The URL of where the AI should send the encoded stream. (optional)
     * @param cycleLength Determine how often (value in milliseconds) the the AI should give a feedback. (optional, default to 500)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkStreamAsync(UUID configId, String inUrl, String outUrl, Integer cycleLength, Integer checkRate, final ApiCallback<List<CheckResult>> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkStreamValidateBeforeCall(configId, inUrl, outUrl, cycleLength, checkRate, _callback);
        Type localVarReturnType = new TypeToken<List<CheckResult>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for checkVideo
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url The url to the video that needs to be checked. (required)
     * @param config  (required)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> operation accepted: wait for callback. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkVideoCall(UUID configId, String url, Config config, Integer detail, Boolean imageEncode, Integer checkRate, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = config;

        // create path and map variables
        String localVarPath = "/v2/check-video/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (url != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("url", url));
        }

        if (detail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("detail", detail));
        }

        if (imageEncode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("imageEncode", imageEncode));
        }

        if (checkRate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkRate", checkRate));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "LICENSE-KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkVideoValidateBeforeCall(UUID configId, String url, Config config, Integer detail, Boolean imageEncode, Integer checkRate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling checkVideo(Async)");
        }

        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling checkVideo(Async)");
        }

        // verify the required parameter 'config' is set
        if (config == null) {
            throw new ApiException("Missing the required parameter 'config' when calling checkVideo(Async)");
        }

        return checkVideoCall(configId, url, config, detail, imageEncode, checkRate, _callback);

    }

    /**
     * Check a video with the AI.
     * An empty response is returned immediately. The actual body (_CheckResult_ schema) is send to the _callbackUrl_ after the AI has finished processing.  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url The url to the video that needs to be checked. (required)
     * @param config  (required)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> operation accepted: wait for callback. </td><td>  -  </td></tr>
     </table>
     */
    public void checkVideo(UUID configId, String url, Config config, Integer detail, Boolean imageEncode, Integer checkRate) throws ApiException {
        checkVideoWithHttpInfo(configId, url, config, detail, imageEncode, checkRate);
    }

    /**
     * Check a video with the AI.
     * An empty response is returned immediately. The actual body (_CheckResult_ schema) is send to the _callbackUrl_ after the AI has finished processing.  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url The url to the video that needs to be checked. (required)
     * @param config  (required)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> operation accepted: wait for callback. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> checkVideoWithHttpInfo(UUID configId, String url, Config config, Integer detail, Boolean imageEncode, Integer checkRate) throws ApiException {
        okhttp3.Call localVarCall = checkVideoValidateBeforeCall(configId, url, config, detail, imageEncode, checkRate, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Check a video with the AI. (asynchronously)
     * An empty response is returned immediately. The actual body (_CheckResult_ schema) is send to the _callbackUrl_ after the AI has finished processing.  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;
     * @param configId The configuration id from the Basic Configuration operations. (required)
     * @param url The url to the video that needs to be checked. (required)
     * @param config  (required)
     * @param detail Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. (optional, default to 1)
     * @param imageEncode Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response. (optional, default to false)
     * @param checkRate The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Not enough credits. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> operation accepted: wait for callback. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkVideoAsync(UUID configId, String url, Config config, Integer detail, Boolean imageEncode, Integer checkRate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkVideoValidateBeforeCall(configId, url, config, detail, imageEncode, checkRate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
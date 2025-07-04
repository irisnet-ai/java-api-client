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
import de.irisnet.java.client.model.ParamSet;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetailedConfigurationParametersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DetailedConfigurationParametersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DetailedConfigurationParametersApi(ApiClient apiClient) {
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
     * Build call for clearParameters
     * @param configId The id of the configuration where the parameters should be deleted. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearParametersCall(@javax.annotation.Nonnull UUID configId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/parameters/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clearParametersValidateBeforeCall(@javax.annotation.Nonnull UUID configId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling clearParameters(Async)");
        }

        return clearParametersCall(configId, _callback);

    }

    /**
     * Delete the parameters of the AI configuration.
     * Clears the parameters and restores the defaults for all classifications.
     * @param configId The id of the configuration where the parameters should be deleted. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
     </table>
     */
    public void clearParameters(@javax.annotation.Nonnull UUID configId) throws ApiException {
        clearParametersWithHttpInfo(configId);
    }

    /**
     * Delete the parameters of the AI configuration.
     * Clears the parameters and restores the defaults for all classifications.
     * @param configId The id of the configuration where the parameters should be deleted. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> clearParametersWithHttpInfo(@javax.annotation.Nonnull UUID configId) throws ApiException {
        okhttp3.Call localVarCall = clearParametersValidateBeforeCall(configId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete the parameters of the AI configuration. (asynchronously)
     * Clears the parameters and restores the defaults for all classifications.
     * @param configId The id of the configuration where the parameters should be deleted. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearParametersAsync(@javax.annotation.Nonnull UUID configId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearParametersValidateBeforeCall(configId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getParameters
     * @param configId The id of the configuration for which the parameters are being requested. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configuration with given id not found or parameters for configuration not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getParametersCall(@javax.annotation.Nonnull UUID configId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/parameters/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getParametersValidateBeforeCall(@javax.annotation.Nonnull UUID configId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling getParameters(Async)");
        }

        return getParametersCall(configId, _callback);

    }

    /**
     * Get the parameters of the AI configuration.
     * Returns the parameters stored in the given configuration.
     * @param configId The id of the configuration for which the parameters are being requested. (required)
     * @return ParamSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configuration with given id not found or parameters for configuration not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ParamSet getParameters(@javax.annotation.Nonnull UUID configId) throws ApiException {
        ApiResponse<ParamSet> localVarResp = getParametersWithHttpInfo(configId);
        return localVarResp.getData();
    }

    /**
     * Get the parameters of the AI configuration.
     * Returns the parameters stored in the given configuration.
     * @param configId The id of the configuration for which the parameters are being requested. (required)
     * @return ApiResponse&lt;ParamSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configuration with given id not found or parameters for configuration not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ParamSet> getParametersWithHttpInfo(@javax.annotation.Nonnull UUID configId) throws ApiException {
        okhttp3.Call localVarCall = getParametersValidateBeforeCall(configId, null);
        Type localVarReturnType = new TypeToken<ParamSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the parameters of the AI configuration. (asynchronously)
     * Returns the parameters stored in the given configuration.
     * @param configId The id of the configuration for which the parameters are being requested. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configuration with given id not found or parameters for configuration not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getParametersAsync(@javax.annotation.Nonnull UUID configId, final ApiCallback<ParamSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getParametersValidateBeforeCall(configId, _callback);
        Type localVarReturnType = new TypeToken<ParamSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setParameters
     * @param configId The id of the configuration where the parameters should be added. (required)
     * @param paramSet Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. No previously configured parameters exist. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. Previous user configured parameters are returned. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setParametersCall(@javax.annotation.Nonnull UUID configId, @javax.annotation.Nonnull ParamSet paramSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paramSet;

        // create path and map variables
        String localVarPath = "/v2/config/parameters/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call setParametersValidateBeforeCall(@javax.annotation.Nonnull UUID configId, @javax.annotation.Nonnull ParamSet paramSet, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling setParameters(Async)");
        }

        // verify the required parameter 'paramSet' is set
        if (paramSet == null) {
            throw new ApiException("Missing the required parameter 'paramSet' when calling setParameters(Async)");
        }

        return setParametersCall(configId, paramSet, _callback);

    }

    /**
     * Set parameters to the given AI configuration.
     * Save or modify the parameters stored in the AI configuration.
     * @param configId The id of the configuration where the parameters should be added. (required)
     * @param paramSet Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. (required)
     * @return ParamSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. No previously configured parameters exist. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. Previous user configured parameters are returned. </td><td>  -  </td></tr>
     </table>
     */
    public ParamSet setParameters(@javax.annotation.Nonnull UUID configId, @javax.annotation.Nonnull ParamSet paramSet) throws ApiException {
        ApiResponse<ParamSet> localVarResp = setParametersWithHttpInfo(configId, paramSet);
        return localVarResp.getData();
    }

    /**
     * Set parameters to the given AI configuration.
     * Save or modify the parameters stored in the AI configuration.
     * @param configId The id of the configuration where the parameters should be added. (required)
     * @param paramSet Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. (required)
     * @return ApiResponse&lt;ParamSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. No previously configured parameters exist. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. Previous user configured parameters are returned. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ParamSet> setParametersWithHttpInfo(@javax.annotation.Nonnull UUID configId, @javax.annotation.Nonnull ParamSet paramSet) throws ApiException {
        okhttp3.Call localVarCall = setParametersValidateBeforeCall(configId, paramSet, null);
        Type localVarReturnType = new TypeToken<ParamSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set parameters to the given AI configuration. (asynchronously)
     * Save or modify the parameters stored in the AI configuration.
     * @param configId The id of the configuration where the parameters should be added. (required)
     * @param paramSet Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. No previously configured parameters exist. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. Previous user configured parameters are returned. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setParametersAsync(@javax.annotation.Nonnull UUID configId, @javax.annotation.Nonnull ParamSet paramSet, final ApiCallback<ParamSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = setParametersValidateBeforeCall(configId, paramSet, _callback);
        Type localVarReturnType = new TypeToken<ParamSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

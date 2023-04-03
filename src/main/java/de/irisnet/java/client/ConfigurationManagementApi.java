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
import de.irisnet.java.client.model.Config;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ConfigurationManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConfigurationManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigurationManagementApi(ApiClient apiClient) {
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
     * Build call for deleteConfig
     * @param configId The id of the configuration that should be deleted. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConfigCall(UUID configId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/{configId}"
            .replace("{" + "configId" + "}", localVarApiClient.escapeString(configId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private okhttp3.Call deleteConfigValidateBeforeCall(UUID configId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling deleteConfig(Async)");
        }

        return deleteConfigCall(configId, _callback);

    }

    /**
     * Delete an AI configuration.
     * Deletes the AI configuration with the given id.
     * @param configId The id of the configuration that should be deleted. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteConfig(UUID configId) throws ApiException {
        deleteConfigWithHttpInfo(configId);
    }

    /**
     * Delete an AI configuration.
     * Deletes the AI configuration with the given id.
     * @param configId The id of the configuration that should be deleted. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteConfigWithHttpInfo(UUID configId) throws ApiException {
        okhttp3.Call localVarCall = deleteConfigValidateBeforeCall(configId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an AI configuration. (asynchronously)
     * Deletes the AI configuration with the given id.
     * @param configId The id of the configuration that should be deleted. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConfigAsync(UUID configId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConfigValidateBeforeCall(configId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllConfigs
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllConfigsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/";

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
    private okhttp3.Call getAllConfigsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAllConfigsCall(_callback);

    }

    /**
     * List all saved AI configurations.
     * Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.
     * @return List&lt;Config&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public List<Config> getAllConfigs() throws ApiException {
        ApiResponse<List<Config>> localVarResp = getAllConfigsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List all saved AI configurations.
     * Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.
     * @return ApiResponse&lt;List&lt;Config&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Config>> getAllConfigsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllConfigsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Config>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all saved AI configurations. (asynchronously)
     * Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllConfigsAsync(final ApiCallback<List<Config>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllConfigsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Config>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConfig
     * @param configId The id of the configuration that is being requested. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigCall(UUID configId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/{configId}"
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
    private okhttp3.Call getConfigValidateBeforeCall(UUID configId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configId' is set
        if (configId == null) {
            throw new ApiException("Missing the required parameter 'configId' when calling getConfig(Async)");
        }

        return getConfigCall(configId, _callback);

    }

    /**
     * Get a specific AI configuration.
     * Returns a specific AI configuration for the requested id.
     * @param configId The id of the configuration that is being requested. (required)
     * @return Config
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public Config getConfig(UUID configId) throws ApiException {
        ApiResponse<Config> localVarResp = getConfigWithHttpInfo(configId);
        return localVarResp.getData();
    }

    /**
     * Get a specific AI configuration.
     * Returns a specific AI configuration for the requested id.
     * @param configId The id of the configuration that is being requested. (required)
     * @return ApiResponse&lt;Config&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Config> getConfigWithHttpInfo(UUID configId) throws ApiException {
        okhttp3.Call localVarCall = getConfigValidateBeforeCall(configId, null);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific AI configuration. (asynchronously)
     * Returns a specific AI configuration for the requested id.
     * @param configId The id of the configuration that is being requested. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> configId not found. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigAsync(UUID configId, final ApiCallback<Config> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigValidateBeforeCall(configId, _callback);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setConfig
     * @param config Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Maximum number of stored AI configurations reached. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setConfigCall(Config config, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/config/";

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
    private okhttp3.Call setConfigValidateBeforeCall(Config config, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'config' is set
        if (config == null) {
            throw new ApiException("Missing the required parameter 'config' when calling setConfig(Async)");
        }

        return setConfigCall(config, _callback);

    }

    /**
     * Create a new AI configuration.
     * Create a new AI configuration with the desired prototypes.
     * @param config Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. (required)
     * @return Config
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Maximum number of stored AI configurations reached. </td><td>  -  </td></tr>
     </table>
     */
    public Config setConfig(Config config) throws ApiException {
        ApiResponse<Config> localVarResp = setConfigWithHttpInfo(config);
        return localVarResp.getData();
    }

    /**
     * Create a new AI configuration.
     * Create a new AI configuration with the desired prototypes.
     * @param config Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. (required)
     * @return ApiResponse&lt;Config&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Maximum number of stored AI configurations reached. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Config> setConfigWithHttpInfo(Config config) throws ApiException {
        okhttp3.Call localVarCall = setConfigValidateBeforeCall(config, null);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new AI configuration. (asynchronously)
     * Create a new AI configuration with the desired prototypes.
     * @param config Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Maximum number of stored AI configurations reached. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setConfigAsync(Config config, final ApiCallback<Config> _callback) throws ApiException {

        okhttp3.Call localVarCall = setConfigValidateBeforeCall(config, _callback);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

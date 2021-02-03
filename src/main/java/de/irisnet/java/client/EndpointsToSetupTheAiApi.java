/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses.By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
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


import de.irisnet.java.client.model.INDefineAI;
import de.irisnet.java.client.model.INParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointsToSetupTheAiApi {
    private ApiClient localVarApiClient;

    public EndpointsToSetupTheAiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EndpointsToSetupTheAiApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for setINDefine
     * @param inDefineAI  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setINDefineCall(INDefineAI inDefineAI, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inDefineAI;

        // create path and map variables
        String localVarPath = "/v1/set-definition";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setINDefineValidateBeforeCall(INDefineAI inDefineAI, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'inDefineAI' is set
        if (inDefineAI == null) {
            throw new ApiException("Missing the required parameter 'inDefineAI' when calling setINDefine(Async)");
        }
        

        okhttp3.Call localVarCall = setINDefineCall(inDefineAI, _callback);
        return localVarCall;

    }

    /**
     * Set definitions via pre-defined prototypes.
     * Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.
     * @param inDefineAI  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public void setINDefine(INDefineAI inDefineAI) throws ApiException {
        setINDefineWithHttpInfo(inDefineAI);
    }

    /**
     * Set definitions via pre-defined prototypes.
     * Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.
     * @param inDefineAI  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> setINDefineWithHttpInfo(INDefineAI inDefineAI) throws ApiException {
        okhttp3.Call localVarCall = setINDefineValidateBeforeCall(inDefineAI, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Set definitions via pre-defined prototypes. (asynchronously)
     * Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.
     * @param inDefineAI  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setINDefineAsync(INDefineAI inDefineAI, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = setINDefineValidateBeforeCall(inDefineAI, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for setINParams
     * @param inParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setINParamsCall(INParams inParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inParams;

        // create path and map variables
        String localVarPath = "/v1/set-parameters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setINParamsValidateBeforeCall(INParams inParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'inParams' is set
        if (inParams == null) {
            throw new ApiException("Missing the required parameter 'inParams' when calling setINParams(Async)");
        }
        

        okhttp3.Call localVarCall = setINParamsCall(inParams, _callback);
        return localVarCall;

    }

    /**
     * Set the behaviour parameters for one object class.
     * Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.
     * @param inParams  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public void setINParams(INParams inParams) throws ApiException {
        setINParamsWithHttpInfo(inParams);
    }

    /**
     * Set the behaviour parameters for one object class.
     * Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.
     * @param inParams  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> setINParamsWithHttpInfo(INParams inParams) throws ApiException {
        okhttp3.Call localVarCall = setINParamsValidateBeforeCall(inParams, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Set the behaviour parameters for one object class. (asynchronously)
     * Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.
     * @param inParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad request. Check for badly formatted request body. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setINParamsAsync(INParams inParams, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = setINParamsValidateBeforeCall(inParams, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

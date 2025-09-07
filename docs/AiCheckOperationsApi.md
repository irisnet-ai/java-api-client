# AiCheckOperationsApi

All URIs are relative to *https://api.irisnet.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ageVerification**](AiCheckOperationsApi.md#ageVerification) | **POST** /v2/age-verification/{configId} | Perform an age verfication check for a given selfie with the AI. |
| [**checkIdDocument**](AiCheckOperationsApi.md#checkIdDocument) | **POST** /v2/check-id-document/{configId} | Check an id document with the AI. |
| [**checkImage**](AiCheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI. |
| [**checkPoaDocument**](AiCheckOperationsApi.md#checkPoaDocument) | **POST** /v2/check-poa-document/{configId} | Perform an proof of address check with the AI. |
| [**checkStream**](AiCheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI. |
| [**checkVideo**](AiCheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI. |
| [**faceAuthentication**](AiCheckOperationsApi.md#faceAuthentication) | **POST** /v2/face-authentication/{configId} | Perform a face authentication for a given selfie with the AI. |
| [**liveDocumentCheck**](AiCheckOperationsApi.md#liveDocumentCheck) | **POST** /v2/check-live-id-document/{configId} | Start a guided live id document check with the AI. |


<a id="ageVerification"></a>
# **ageVerification**
> CheckResult ageVerification(configId, biometricCheckRequestData)

Perform an age verfication check for a given selfie with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    BiometricCheckRequestData biometricCheckRequestData = new BiometricCheckRequestData(); // BiometricCheckRequestData | The BiometricCheckRequestData containing data needed for the age verification check.
    try {
      CheckResult result = apiInstance.ageVerification(configId, biometricCheckRequestData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#ageVerification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **biometricCheckRequestData** | [**BiometricCheckRequestData**](BiometricCheckRequestData.md)| The BiometricCheckRequestData containing data needed for the age verification check. | |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **202** | Input accepted: Wait for callback. |  -  |

<a id="checkIdDocument"></a>
# **checkIdDocument**
> CheckResult checkIdDocument(configId, documentCheckRequestData)

Check an id document with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    DocumentCheckRequestData documentCheckRequestData = new DocumentCheckRequestData(); // DocumentCheckRequestData | The DocumentCheckRequestData containing data needed for the id document check.
    try {
      CheckResult result = apiInstance.checkIdDocument(configId, documentCheckRequestData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#checkIdDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **documentCheckRequestData** | [**DocumentCheckRequestData**](DocumentCheckRequestData.md)| The DocumentCheckRequestData containing data needed for the id document check. | |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **202** | Input accepted: Wait for callback. |  -  |

<a id="checkImage"></a>
# **checkImage**
> CheckResult checkImage(configId, url, detail, imageEncode, data)

Check an image with the AI.

The response (_CheckResult_ schema) is returned immediately after the request.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    String url = "url_example"; // String | <s>The url to the image that needs to be checked.</s> Deprecated: Use request body instead. <b>This parameter will be removed in future releases.</b>
    Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object.
    Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response.
    Data data = new Data(); // Data | The http(s) url or base64 encoded body uri of the image that needs to be checked.
    try {
      CheckResult result = apiInstance.checkImage(configId, url, detail, imageEncode, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#checkImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **url** | **String**| &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use request body instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; | [optional] |
| **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. | [optional] [default to 1] |
| **imageEncode** | **Boolean**| Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. | [optional] [default to false] |
| **data** | [**Data**](Data.md)| The http(s) url or base64 encoded body uri of the image that needs to be checked. | [optional] |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **404** | configId not found. |  -  |
| **200** | successful operation. |  -  |

<a id="checkPoaDocument"></a>
# **checkPoaDocument**
> CheckResult checkPoaDocument(configId, poaCheckRequestData)

Perform an proof of address check with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    PoaCheckRequestData poaCheckRequestData = new PoaCheckRequestData(); // PoaCheckRequestData | The PoaCheckRequestData containing data needed for the proof of address check. The DocumentType in the request data must be either 'utility_bill' or 'bank_statement'.
    try {
      CheckResult result = apiInstance.checkPoaDocument(configId, poaCheckRequestData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#checkPoaDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **poaCheckRequestData** | [**PoaCheckRequestData**](PoaCheckRequestData.md)| The PoaCheckRequestData containing data needed for the proof of address check. The DocumentType in the request data must be either &#39;utility_bill&#39; or &#39;bank_statement&#39;. | |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **202** | Input accepted: Wait for callback. |  -  |

<a id="checkStream"></a>
# **checkStream**
> List&lt;CheckResult&gt; checkStream(configId, inUrl, outUrl, cycleLength, checkRate)

Check a stream with the AI.

The body is continuously send per JSON stream until completion of the video stream. Only then the full _CheckResult_ schema will be shown (past _Events_ omitted).  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;  &lt;b&gt;WARNING: Please do not use the &#39;Try it out&#39; for this operation. The browser is not able to refresh the response preview until the completion of the video stream.&lt;b&gt;

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    String inUrl = "inUrl_example"; // String | The URL of the video stream that the AI should check.
    String outUrl = "outUrl_example"; // String | The URL of where the AI should send the encoded stream.
    Integer cycleLength = 500; // Integer | Determine how often (value in milliseconds) the the AI should give a feedback.
    Integer checkRate = 0; // Integer | The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to '1000'.
    try {
      List<CheckResult> result = apiInstance.checkStream(configId, inUrl, outUrl, cycleLength, checkRate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#checkStream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **inUrl** | **String**| The URL of the video stream that the AI should check. | |
| **outUrl** | **String**| The URL of where the AI should send the encoded stream. | [optional] |
| **cycleLength** | **Integer**| Determine how often (value in milliseconds) the the AI should give a feedback. | [optional] [default to 500] |
| **checkRate** | **Integer**| The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. | [optional] [default to 0] |

### Return type

[**List&lt;CheckResult&gt;**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-ndjson

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **404** | configId not found. |  -  |
| **200** | successful operation. |  -  |

<a id="checkVideo"></a>
# **checkVideo**
> checkVideo(configId, url, callback, detail, imageEncode, checkRate)

Check a video with the AI.

An empty response is returned immediately. The actual body (_CheckResult_ schema) is send to the _callbackUrl_ after the AI has finished processing.  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    String url = "url_example"; // String | The url to the video that needs to be checked.
    Callback callback = new Callback(); // Callback | 
    Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object.
    Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output video that can be downloaded afterwards. The output video format will be MP4 containing H.264 encoding independent of the input format. The _Encoded_ schema will be available in the response.
    Integer checkRate = 0; // Integer | The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to '1000'.
    try {
      apiInstance.checkVideo(configId, url, callback, detail, imageEncode, checkRate);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#checkVideo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **url** | **String**| The url to the video that needs to be checked. | |
| **callback** | [**Callback**](Callback.md)|  | |
| **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. | [optional] [default to 1] |
| **imageEncode** | **Boolean**| Specifies whether or not to draw an output video that can be downloaded afterwards. The output video format will be MP4 containing H.264 encoding independent of the input format. The _Encoded_ schema will be available in the response. | [optional] [default to false] |
| **checkRate** | **Integer**| The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. | [optional] [default to 0] |

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **404** | configId not found. |  -  |
| **202** | operation accepted: wait for callback. |  -  |

<a id="faceAuthentication"></a>
# **faceAuthentication**
> CheckResult faceAuthentication(configId, biometricCheckRequestData)

Perform a face authentication for a given selfie with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    BiometricCheckRequestData biometricCheckRequestData = new BiometricCheckRequestData(); // BiometricCheckRequestData | The BiometricCheckRequestData containing data needed for the face authentication.
    try {
      CheckResult result = apiInstance.faceAuthentication(configId, biometricCheckRequestData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#faceAuthentication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **biometricCheckRequestData** | [**BiometricCheckRequestData**](BiometricCheckRequestData.md)| The BiometricCheckRequestData containing data needed for the face authentication. | |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **202** | Input accepted: Wait for callback. |  -  |

<a id="liveDocumentCheck"></a>
# **liveDocumentCheck**
> LiveDocumentCheckResponseData liveDocumentCheck(configId, liveDocumentCheckRequestData)

Start a guided live id document check with the AI.

The synchronous response (_LiveDocumentCheckResponseData_ schema) contains an eventId, possibly a token and an URL to send the enduser to. The actual result (_CheckResult_ schema) of the document check is sent to the provided _callbackUrl_ after the AI has finished processing.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.AiCheckOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    AiCheckOperationsApi apiInstance = new AiCheckOperationsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    LiveDocumentCheckRequestData liveDocumentCheckRequestData = new LiveDocumentCheckRequestData(); // LiveDocumentCheckRequestData | The LiveDocumentCheckRequestData containing data needed for the live id document check.
    try {
      LiveDocumentCheckResponseData result = apiInstance.liveDocumentCheck(configId, liveDocumentCheckRequestData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiCheckOperationsApi#liveDocumentCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **UUID**| The configuration id from the Basic Configuration operations. | |
| **liveDocumentCheckRequestData** | [**LiveDocumentCheckRequestData**](LiveDocumentCheckRequestData.md)| The LiveDocumentCheckRequestData containing data needed for the live id document check. | |

### Return type

[**LiveDocumentCheckResponseData**](LiveDocumentCheckResponseData.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **402** | Not enough credits. |  -  |
| **202** | Input accepted: Send enduser to endUserIdentUrl and wait for status/callback. |  -  |


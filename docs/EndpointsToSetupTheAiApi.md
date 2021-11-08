# EndpointsToSetupTheAiApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setINDefine**](EndpointsToSetupTheAiApi.md#setINDefine) | **POST** /v1/set-definition | Set definitions via pre-defined prototypes.
[**setINParams**](EndpointsToSetupTheAiApi.md#setINParams) | **POST** /v1/set-parameters | Set the behaviour parameters for one object class.


<a name="setINDefine"></a>
# **setINDefine**
> setINDefine(inDefineAI)

Set definitions via pre-defined prototypes.

Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.EndpointsToSetupTheAiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    EndpointsToSetupTheAiApi apiInstance = new EndpointsToSetupTheAiApi(defaultClient);
    INDefineAI inDefineAI = new INDefineAI(); // INDefineAI | 
    try {
      apiInstance.setINDefine(inDefineAI);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsToSetupTheAiApi#setINDefine");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inDefineAI** | [**INDefineAI**](INDefineAI.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad request. Check for badly formatted request body. |  -  |
**200** | successful operation |  -  |

<a name="setINParams"></a>
# **setINParams**
> setINParams(inParams)

Set the behaviour parameters for one object class.

Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.EndpointsToSetupTheAiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    EndpointsToSetupTheAiApi apiInstance = new EndpointsToSetupTheAiApi(defaultClient);
    INParams inParams = new INParams(); // INParams | 
    try {
      apiInstance.setINParams(inParams);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsToSetupTheAiApi#setINParams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inParams** | [**INParams**](INParams.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad request. Check for badly formatted request body. |  -  |
**200** | successful operation |  -  |


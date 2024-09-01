# BalanceEndpointsApi

All URIs are relative to *https://api.irisnet.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCost**](BalanceEndpointsApi.md#getCost) | **GET** /v2/cost/{configId} | Get the cost of the configuration for a single image. |
| [**getLicenseInfo**](BalanceEndpointsApi.md#getLicenseInfo) | **GET** /v2/info/ | Get information for the given license key. |
| [**getVideoCost**](BalanceEndpointsApi.md#getVideoCost) | **GET** /v2/cost/{configId}/{frames} | Get the cost of the configuration for moving images. |
| [**getVideoCost1**](BalanceEndpointsApi.md#getVideoCost1) | **GET** /v2/cost/{configId}/{fps}/{duration} | Get the cost of the configuration for moving images. |


<a id="getCost"></a>
# **getCost**
> Pricing getCost(configId)

Get the cost of the configuration for a single image.

The cost is subtracted from the license key after a successful check-image operation.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.BalanceEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    BalanceEndpointsApi apiInstance = new BalanceEndpointsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    try {
      Pricing result = apiInstance.getCost(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceEndpointsApi#getCost");
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

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | configId not found. |  -  |
| **429** | The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. |  -  |
| **200** | The cost of the given configuration. |  -  |

<a id="getLicenseInfo"></a>
# **getLicenseInfo**
> LicenseInfo getLicenseInfo()

Get information for the given license key.

Get the LicenseInfo schema for the given license key in the authorization header.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.BalanceEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    BalanceEndpointsApi apiInstance = new BalanceEndpointsApi(defaultClient);
    try {
      LicenseInfo result = apiInstance.getLicenseInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceEndpointsApi#getLicenseInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseInfo**](LicenseInfo.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | The entered license key was not found. |  -  |
| **200** | successful operation. |  -  |

<a id="getVideoCost"></a>
# **getVideoCost**
> Pricing getVideoCost(configId, frames)

Get the cost of the configuration for moving images.

The cost is subtracted from the license key after a successful check operation for moving images.  &lt;b&gt;NOTICE: The returned cost is an approximation. The exact cost can only be determined during the check operation.&lt;b&gt;

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.BalanceEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    BalanceEndpointsApi apiInstance = new BalanceEndpointsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    Long frames = 56L; // Long | The number of frames that the AI should check.
    try {
      Pricing result = apiInstance.getVideoCost(configId, frames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceEndpointsApi#getVideoCost");
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
| **frames** | **Long**| The number of frames that the AI should check. | |

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | configId not found. |  -  |
| **429** | The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. |  -  |
| **200** | The cost of the given configuration |  -  |

<a id="getVideoCost1"></a>
# **getVideoCost1**
> Pricing getVideoCost1(configId, fps, duration)

Get the cost of the configuration for moving images.

The cost is subtracted from the license key after a successful check operation for moving images.  &lt;b&gt;NOTICE: The returned cost is an approximation. The exact cost can only be determined during the check operation.&lt;b&gt;

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.BalanceEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    BalanceEndpointsApi apiInstance = new BalanceEndpointsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The configuration id from the Basic Configuration operations.
    Integer fps = 56; // Integer | The frames per second of the video or stream.
    Long duration = 56L; // Long | The duration in seconds of the video or stream.
    try {
      Pricing result = apiInstance.getVideoCost1(configId, fps, duration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceEndpointsApi#getVideoCost1");
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
| **fps** | **Integer**| The frames per second of the video or stream. | |
| **duration** | **Long**| The duration in seconds of the video or stream. | |

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | configId not found. |  -  |
| **429** | The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. |  -  |
| **200** | The cost of the given configuration. |  -  |


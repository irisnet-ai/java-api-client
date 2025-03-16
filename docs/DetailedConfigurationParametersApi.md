# DetailedConfigurationParametersApi

All URIs are relative to *https://api.irisnet.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearParameters**](DetailedConfigurationParametersApi.md#clearParameters) | **DELETE** /v2/config/parameters/{configId} | Delete the parameters of the AI configuration. |
| [**getParameters**](DetailedConfigurationParametersApi.md#getParameters) | **GET** /v2/config/parameters/{configId} | Get the parameters of the AI configuration. |
| [**setParameters**](DetailedConfigurationParametersApi.md#setParameters) | **POST** /v2/config/parameters/{configId} | Set parameters to the given AI configuration. |


<a id="clearParameters"></a>
# **clearParameters**
> clearParameters(configId)

Delete the parameters of the AI configuration.

Clears the parameters and restores the defaults for all classifications.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.DetailedConfigurationParametersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The id of the configuration where the parameters should be deleted.
    try {
      apiInstance.clearParameters(configId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedConfigurationParametersApi#clearParameters");
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
| **configId** | **UUID**| The id of the configuration where the parameters should be deleted. | |

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation. |  -  |
| **404** | configId not found. |  -  |

<a id="getParameters"></a>
# **getParameters**
> ParamSet getParameters(configId)

Get the parameters of the AI configuration.

Returns the parameters stored in the given configuration.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.DetailedConfigurationParametersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The id of the configuration for which the parameters are being requested.
    try {
      ParamSet result = apiInstance.getParameters(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedConfigurationParametersApi#getParameters");
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
| **configId** | **UUID**| The id of the configuration for which the parameters are being requested. | |

### Return type

[**ParamSet**](ParamSet.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | configuration with given id not found or parameters for configuration not found. |  -  |
| **200** | successful operation. |  -  |

<a id="setParameters"></a>
# **setParameters**
> ParamSet setParameters(configId, paramSet)

Set parameters to the given AI configuration.

Save or modify the parameters stored in the AI configuration.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.DetailedConfigurationParametersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The id of the configuration where the parameters should be added.
    ParamSet paramSet = new ParamSet(); // ParamSet | Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters.
    try {
      ParamSet result = apiInstance.setParameters(configId, paramSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedConfigurationParametersApi#setParameters");
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
| **configId** | **UUID**| The id of the configuration where the parameters should be added. | |
| **paramSet** | [**ParamSet**](ParamSet.md)| Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. | |

### Return type

[**ParamSet**](ParamSet.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request. Check for badly formatted request body. |  -  |
| **404** | configId not found. |  -  |
| **200** | successful operation. Previous user configured parameters are returned. |  -  |
| **204** | successful operation. No previously configured parameters exist. |  -  |


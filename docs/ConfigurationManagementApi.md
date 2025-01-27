# ConfigurationManagementApi

All URIs are relative to *https://api.irisnet.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConfig**](ConfigurationManagementApi.md#deleteConfig) | **DELETE** /v2/config/{configId} | Delete an AI configuration. |
| [**getAllConfigs**](ConfigurationManagementApi.md#getAllConfigs) | **GET** /v2/config/ | List all saved AI configurations. |
| [**getConfig**](ConfigurationManagementApi.md#getConfig) | **GET** /v2/config/{configId} | Get a specific AI configuration. |
| [**setConfig**](ConfigurationManagementApi.md#setConfig) | **POST** /v2/config/ | Create a new AI configuration. |


<a id="deleteConfig"></a>
# **deleteConfig**
> deleteConfig(configId)

Delete an AI configuration.

Deletes the AI configuration with the given id.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.ConfigurationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    ConfigurationManagementApi apiInstance = new ConfigurationManagementApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The id of the configuration that should be deleted.
    try {
      apiInstance.deleteConfig(configId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationManagementApi#deleteConfig");
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
| **configId** | **UUID**| The id of the configuration that should be deleted. | |

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation. |  -  |
| **404** | configId not found. |  -  |

<a id="getAllConfigs"></a>
# **getAllConfigs**
> List&lt;Config&gt; getAllConfigs()

List all saved AI configurations.

Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.ConfigurationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    ConfigurationManagementApi apiInstance = new ConfigurationManagementApi(defaultClient);
    try {
      List<Config> result = apiInstance.getAllConfigs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationManagementApi#getAllConfigs");
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

[**List&lt;Config&gt;**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation. |  -  |

<a id="getConfig"></a>
# **getConfig**
> Config getConfig(configId)

Get a specific AI configuration.

Returns a specific AI configuration for the requested id.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.ConfigurationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    ConfigurationManagementApi apiInstance = new ConfigurationManagementApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The id of the configuration that is being requested.
    try {
      Config result = apiInstance.getConfig(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationManagementApi#getConfig");
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
| **configId** | **UUID**| The id of the configuration that is being requested. | |

### Return type

[**Config**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | configId not found. |  -  |
| **200** | successful operation. |  -  |

<a id="setConfig"></a>
# **setConfig**
> Config setConfig(config)

Create a new AI configuration.

Create a new AI configuration with the desired prototypes.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.models.*;
import de.irisnet.java.client.ConfigurationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");
    
    // Configure API key authorization: LICENSE-KEY
    ApiKeyAuth LICENSE-KEY = (ApiKeyAuth) defaultClient.getAuthentication("LICENSE-KEY");
    LICENSE-KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //LICENSE-KEY.setApiKeyPrefix("Token");

    ConfigurationManagementApi apiInstance = new ConfigurationManagementApi(defaultClient);
    Config config = new Config(); // Config | Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes.
    try {
      Config result = apiInstance.setConfig(config);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationManagementApi#setConfig");
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
| **config** | [**Config**](Config.md)| Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. | |

### Return type

[**Config**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Maximum number of stored AI configurations reached. |  -  |
| **400** | Bad request. Check for badly formatted request body. |  -  |
| **200** | successful operation. |  -  |


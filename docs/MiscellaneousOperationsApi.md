# MiscellaneousOperationsApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadProcessed**](MiscellaneousOperationsApi.md#downloadProcessed) | **GET** /v1/download/{filename} | Get the resulting media file.
[**getAICost**](MiscellaneousOperationsApi.md#getAICost) | **GET** /v1/cost | Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.
[**getLicenseInfo**](MiscellaneousOperationsApi.md#getLicenseInfo) | **GET** /v1/info/{licenseKey} | Get information from given license key.


<a name="downloadProcessed"></a>
# **downloadProcessed**
> File downloadProcessed(filename)

Get the resulting media file.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.MiscellaneousOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi(defaultClient);
    String filename = "filename_example"; // String | 
    try {
      File result = apiInstance.downloadProcessed(filename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousOperationsApi#downloadProcessed");
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
 **filename** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the file AI produced file with masking or blurring, depending on given AI parameters. |  -  |
**404** | Specified file was not found. |  -  |

<a name="getAICost"></a>
# **getAICost**
> Long getAICost()

Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.MiscellaneousOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi(defaultClient);
    try {
      Long result = apiInstance.getAICost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousOperationsApi#getAICost");
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

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**429** | The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. |  -  |
**200** | Contains the cost of the AI check with the current set of parameters. |  -  |

<a name="getLicenseInfo"></a>
# **getLicenseInfo**
> LicenseInfo getLicenseInfo(licenseKey)

Get information from given license key.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.MiscellaneousOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi(defaultClient);
    String licenseKey = "licenseKey_example"; // String | License obtained from the https://irisnet.de/subscribe shop.
    try {
      LicenseInfo result = apiInstance.getLicenseInfo(licenseKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousOperationsApi#getLicenseInfo");
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
 **licenseKey** | **String**| License obtained from the https://irisnet.de/subscribe shop. |

### Return type

[**LicenseInfo**](LicenseInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**404** | The entered license key was not found. |  -  |


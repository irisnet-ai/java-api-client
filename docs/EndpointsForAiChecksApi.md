# EndpointsForAiChecksApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkImage**](EndpointsForAiChecksApi.md#checkImage) | **POST** /v1/check-image/{licenseKey} | Upload and check image against previously chosen configuration.
[**checkImageUrl**](EndpointsForAiChecksApi.md#checkImageUrl) | **POST** /v1/check-url/{licenseKey} | Check image url against previously chosen configuration.


<a name="checkImage"></a>
# **checkImage**
> IrisNet checkImage(licenseKey, file, detail)

Upload and check image against previously chosen configuration.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.EndpointsForAiChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    EndpointsForAiChecksApi apiInstance = new EndpointsForAiChecksApi(defaultClient);
    String licenseKey = "licenseKey_example"; // String | License obtained from irisnet.de shop.
    File file = new File("/path/to/file"); // File | 
    Integer detail = 1; // Integer | Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information.
    try {
      IrisNet result = apiInstance.checkImage(licenseKey, file, detail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsForAiChecksApi#checkImage");
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
 **licenseKey** | **String**| License obtained from irisnet.de shop. |
 **file** | **File**|  |
 **detail** | **Integer**| Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. | [optional] [default to 1]

### Return type

[**IrisNet**](IrisNet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**402** | Not enough credits |  -  |

<a name="checkImageUrl"></a>
# **checkImageUrl**
> IrisNet checkImageUrl(url, licenseKey, detail)

Check image url against previously chosen configuration.

### Example
```java
// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.models.*;
import de.irisnet.java.client.EndpointsForAiChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.irisnet.de");

    EndpointsForAiChecksApi apiInstance = new EndpointsForAiChecksApi(defaultClient);
    String url = "url_example"; // String | 
    String licenseKey = "licenseKey_example"; // String | License obtained from irisnet.de shop.
    Integer detail = 1; // Integer | Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information.
    try {
      IrisNet result = apiInstance.checkImageUrl(url, licenseKey, detail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsForAiChecksApi#checkImageUrl");
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
 **url** | **String**|  |
 **licenseKey** | **String**| License obtained from irisnet.de shop. |
 **detail** | **Integer**| Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. | [optional] [default to 1]

### Return type

[**IrisNet**](IrisNet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**402** | Not enough credits |  -  |


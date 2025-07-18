# irisnet-java-client

Irisnet API
- API version: v2
  - Generator version: 7.13.0

Artificial Intelligence (AI) for image- and video-processing in real-time. This is an interactive documentation where you can quickly look up the endpoints and their schemas, while having the opportunity to try things out for yourself.

In the list below, you can see the available endpoints of the API, which can be expanded by clicking on them. Each expanded endpoint lists the request parameters (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail.

Additionally you'll find a 'Try it out' button that allows you to enter your custom parameters and custom body and execute that against the API. <b>Be sure to enter your license key to authorize the requests before using this documentation interactively.</b>

The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.

Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. If you click on the right arrow, you can expand the model and get a description of the model and the model parameters. For nested models, you can keep clicking the right arrow for further details.

Clicking the link below the title at the top of this page opens the [OpenAPI specification](https://swagger.io/specification/) (OAS3) in JSON format. The OAS3 Spec allows the generation of clients in many programming languages. There are several free client generators available that can be used to get started easily.

  For more information, please visit [https://shop.airisprotect.com](https://shop.airisprotect.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>de.irisnet.java.client</groupId>
  <artifactId>irisnet-java-client</artifactId>
  <version>3.7.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'irisnet-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'irisnet-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "de.irisnet.java.client:irisnet-java-client:3.7.3"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/irisnet-java-client-3.7.3.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.Configuration;
import de.irisnet.java.auth.*;
import de.irisnet.java.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://api.irisnet.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AiCheckOperationsApi* | [**ageVerification**](docs/AiCheckOperationsApi.md#ageVerification) | **POST** /v2/age-verification/{configId} | Perform an age verfication check for a given selfie with the AI.
*AiCheckOperationsApi* | [**checkIdDocument**](docs/AiCheckOperationsApi.md#checkIdDocument) | **POST** /v2/check-id-document/{configId} | Check an id document with the AI.
*AiCheckOperationsApi* | [**checkImage**](docs/AiCheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI.
*AiCheckOperationsApi* | [**checkPoaDocument**](docs/AiCheckOperationsApi.md#checkPoaDocument) | **POST** /v2/check-poa-document/{configId} | Perform an proof of address check with the AI.
*AiCheckOperationsApi* | [**checkStream**](docs/AiCheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI.
*AiCheckOperationsApi* | [**checkVideo**](docs/AiCheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI.
*AiCheckOperationsApi* | [**faceAuthentication**](docs/AiCheckOperationsApi.md#faceAuthentication) | **POST** /v2/face-authentication/{configId} | Perform a face authentication for a given selfie with the AI.
*AiCheckOperationsApi* | [**liveDocumentCheck**](docs/AiCheckOperationsApi.md#liveDocumentCheck) | **POST** /v2/check-live-id-document/{configId} | Start a guided live id document check with the AI.
*BalanceEndpointsApi* | [**getCost**](docs/BalanceEndpointsApi.md#getCost) | **GET** /v2/cost/{configId} | Get the cost of the configuration for a single image.
*BalanceEndpointsApi* | [**getLicenseInfo**](docs/BalanceEndpointsApi.md#getLicenseInfo) | **GET** /v2/info/ | Get information for the given license key.
*BalanceEndpointsApi* | [**getVideoCost**](docs/BalanceEndpointsApi.md#getVideoCost) | **GET** /v2/cost/{configId}/{frames} | Get the cost of the configuration for moving images.
*BalanceEndpointsApi* | [**getVideoCost1**](docs/BalanceEndpointsApi.md#getVideoCost1) | **GET** /v2/cost/{configId}/{fps}/{duration} | Get the cost of the configuration for moving images.
*ConfigurationManagementApi* | [**deleteConfig**](docs/ConfigurationManagementApi.md#deleteConfig) | **DELETE** /v2/config/{configId} | Delete an AI configuration.
*ConfigurationManagementApi* | [**getAllConfigs**](docs/ConfigurationManagementApi.md#getAllConfigs) | **GET** /v2/config/ | List all saved AI configurations.
*ConfigurationManagementApi* | [**getConfig**](docs/ConfigurationManagementApi.md#getConfig) | **GET** /v2/config/{configId} | Get a specific AI configuration.
*ConfigurationManagementApi* | [**setConfig**](docs/ConfigurationManagementApi.md#setConfig) | **POST** /v2/config/ | Create a new AI configuration.
*DetailedConfigurationParametersApi* | [**clearParameters**](docs/DetailedConfigurationParametersApi.md#clearParameters) | **DELETE** /v2/config/parameters/{configId} | Delete the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**getParameters**](docs/DetailedConfigurationParametersApi.md#getParameters) | **GET** /v2/config/parameters/{configId} | Get the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**setParameters**](docs/DetailedConfigurationParametersApi.md#setParameters) | **POST** /v2/config/parameters/{configId} | Set parameters to the given AI configuration.


## Documentation for Models

 - [AgeVerificationAttribute](docs/AgeVerificationAttribute.md)
 - [AgeVerificationDetection](docs/AgeVerificationDetection.md)
 - [AgeVerificationSubChecks](docs/AgeVerificationSubChecks.md)
 - [ApiNotice](docs/ApiNotice.md)
 - [BaseAttribute](docs/BaseAttribute.md)
 - [BaseDetection](docs/BaseDetection.md)
 - [BiometricCheckRequestData](docs/BiometricCheckRequestData.md)
 - [BreastDetection](docs/BreastDetection.md)
 - [BrokenRule](docs/BrokenRule.md)
 - [Callback](docs/Callback.md)
 - [CheckResult](docs/CheckResult.md)
 - [Config](docs/Config.md)
 - [Coordinates](docs/Coordinates.md)
 - [Data](docs/Data.md)
 - [Detection](docs/Detection.md)
 - [DocumentCheckRequestData](docs/DocumentCheckRequestData.md)
 - [Encoded](docs/Encoded.md)
 - [Event](docs/Event.md)
 - [FaceDetection](docs/FaceDetection.md)
 - [HairAttribute](docs/HairAttribute.md)
 - [HairDetection](docs/HairDetection.md)
 - [IdDocumentAttribute](docs/IdDocumentAttribute.md)
 - [IdDocumentDetection](docs/IdDocumentDetection.md)
 - [IdDocumentSubChecks](docs/IdDocumentSubChecks.md)
 - [KnownFace](docs/KnownFace.md)
 - [KycUiParameter](docs/KycUiParameter.md)
 - [LicenseInfo](docs/LicenseInfo.md)
 - [LiveDocumentCheckRequestData](docs/LiveDocumentCheckRequestData.md)
 - [LiveDocumentCheckResponseData](docs/LiveDocumentCheckResponseData.md)
 - [Param](docs/Param.md)
 - [ParamSet](docs/ParamSet.md)
 - [PoaCheckRequestData](docs/PoaCheckRequestData.md)
 - [Pricing](docs/Pricing.md)
 - [Rectangle](docs/Rectangle.md)
 - [Summary](docs/Summary.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="LICENSE-KEY"></a>
### LICENSE-KEY

- **Type**: API key
- **API key parameter name**: LICENSE-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@irisnet.de


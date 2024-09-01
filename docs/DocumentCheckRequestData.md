

# DocumentCheckRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callback** | [**Callback**](Callback.md) |  |  |
|**frontImage** | **String** | The base64 encoded front image of the document to be checked in either jpg or png file format |  |
|**backImage** | **String** | The base64 encoded back image of the document to be checked in either jpg or png file format |  [optional] |
|**selfieImage** | **String** | The base64 encoded selfie image to be checked in either jpg or png file format |  [optional] |
|**minimumAcceptedAge** | **Integer** | The minimum accepted age in years for a DocumentCheck. Defaults to 18 if not provided |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional] |
|**documentCountry** | **String** | The document&#39;s country in ISO 3166-1 alpha-2 format |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;passport&quot; |
| DRIVING_LICENSE | &quot;driving_license&quot; |
| NATIONAL_IDENTITY_CARD | &quot;national_identity_card&quot; |
| RESIDENCE_PERMIT | &quot;residence_permit&quot; |
| VISA | &quot;visa&quot; |
| UNKNOWN | &quot;unknown&quot; |




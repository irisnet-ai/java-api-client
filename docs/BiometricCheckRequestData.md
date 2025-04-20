

# BiometricCheckRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callback** | [**Callback**](Callback.md) |  |  |
|**frontImage** | **String** | The base64-encoded front image of the document to be checked in either jpg or png file format. |  [optional] |
|**selfieImage** | **String** | The base64-encoded selfie image to be checked in either jpg or png file format. |  |
|**minimumAcceptedAge** | **Integer** | The minimum age in years accepted for a DocumentCheck, if applicable. Defaults to 18 if not specified. |  [optional] |
|**documentHolderId** | **String** | The documentHolderId from a previous successful DocumentCheck. |  [optional] |




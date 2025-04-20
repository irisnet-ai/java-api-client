

# LiveDocumentCheckRequestData

Data containing neccessary information to handle the enduser live check.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callback** | [**Callback**](Callback.md) |  |  |
|**statusUrl** | **URI** | The URL to send the intermediate status requests to. If not set, no intermediate status requests will be sent. |  [optional] |
|**endUserRedirectUrl** | **URI** | If set the enduser is being redirected to this URL after the check is finished. |  [optional] |
|**tokenValidityInSeconds** | **Long** | The validity duration of a started ident process in seconds. Defaults to 3600 seconds &#x3D; 60 minutes. |  [optional] |
|**documentHolderId** | **String** | The documentHolderId from a previous successful live identification. |  [optional] |
|**minimumAcceptedAge** | **Integer** | The minimum age in years accepted for a check, if applicable. Defaults to 18 if not specified. |  [optional] |




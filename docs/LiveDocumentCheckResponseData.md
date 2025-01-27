

# LiveDocumentCheckResponseData

Response object containing neccessary information to start the enduser live document check on the client side.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | unique id of this live document check |  [optional] |
|**identToken** | **String** | token to secure the live document check, might be null since already incorporated into endUserIdentUrl |  [optional] |
|**endUserIdentUrl** | **URI** | URL to send the enduser to, to start the live document check |  [optional] |




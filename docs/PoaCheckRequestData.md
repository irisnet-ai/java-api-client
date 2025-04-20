

# PoaCheckRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callback** | [**Callback**](Callback.md) |  |  |
|**frontImage** | **String** | The base64-encoded front image of the document to be checked in either jpg or png file format. |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  |
|**documentHolderId** | **String** | The documentHolderId from a previous successful check. |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;passport&quot; |
| DRIVING_LICENSE | &quot;driving_license&quot; |
| NATIONAL_IDENTITY_CARD | &quot;national_identity_card&quot; |
| RESIDENCE_PERMIT | &quot;residence_permit&quot; |
| VISA | &quot;visa&quot; |
| BANK_STATEMENT | &quot;bank_statement&quot; |
| UTILITY_BILL | &quot;utility_bill&quot; |
| TAX_DOCUMENT | &quot;tax_document&quot; |
| UNIDENTIFIED | &quot;unidentified&quot; |
| UNKNOWN | &quot;unknown&quot; |




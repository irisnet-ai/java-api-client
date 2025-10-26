

# PoaDocumentAttribute

Attributes qualifying the _poaDocument_ classification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional] |
|**name** | **String** | The document holder&#39;s name |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional] |
|**issuer** | **String** | The issuer of the document |  [optional] |
|**issuingDate** | **LocalDate** | The issuing date |  [optional] |
|**address** | **String** | The document holder&#39;s address |  [optional] |
|**addressCountry** | **String** | The document holders&#39;s address country in ISO 3166-1 alpha-2 format |  [optional] |



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




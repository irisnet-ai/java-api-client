

# PoaDocumentSubChecks

Contains information on poaDocument sub-checks

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | [**FirstNameEnum**](#FirstNameEnum) | Indicates whether the first name is valid |  [optional] |
|**lastName** | [**LastNameEnum**](#LastNameEnum) | Indicates whether the last name is valid |  [optional] |
|**documentAge** | [**DocumentAgeEnum**](#DocumentAgeEnum) | Indicates whether the age of the document is valid (not older than 3 months) |  [optional] |
|**ipOriginatesInAddressCountry** | [**IpOriginatesInAddressCountryEnum**](#IpOriginatesInAddressCountryEnum) | Indicates whether the client IP originates in the country of the address |  [optional] |
|**ipNearbyAddress** | [**IpNearbyAddressEnum**](#IpNearbyAddressEnum) | Indicates whether the client IP is in reasonable distance from the address |  [optional] |



## Enum: FirstNameEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: LastNameEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: DocumentAgeEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: IpOriginatesInAddressCountryEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: IpNearbyAddressEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |




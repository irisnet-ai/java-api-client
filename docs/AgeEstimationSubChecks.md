

# AgeEstimationSubChecks

Contains information on ageEstimation sub-checks

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**faceLivenessCheck** | [**FaceLivenessCheckEnum**](#FaceLivenessCheckEnum) | Indicates if the selfie image is genuine and not a photo of an image or of a screen |  [optional] |
|**ageValidationCheck** | [**AgeValidationCheckEnum**](#AgeValidationCheckEnum) | Indicates if the estimated age is greater than or equal to a predefined minimum accepted age |  [optional] |



## Enum: FaceLivenessCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: AgeValidationCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |




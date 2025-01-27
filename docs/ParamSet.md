

# ParamSet

A set of parameters/rules that describe how the AI should behave.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thresh** | **Float** | Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives. |  [optional] |
|**grey** | **Integer** | A grey scale color to use for frame or masking. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white. |  [optional] |
|**minDuration** | **Integer** | Set the overall minimum duration in milliseconds for a rule to be broken in moving images. |  [optional] |
|**abortOnSeverity** | **Integer** | Set a severity on which to automatically stop the check operation. Works with moving images.Use &#39;-1&#39; to ignore this option. |  [optional] |
|**params** | [**List&lt;Param&gt;**](Param.md) | A list of parameter sets that describe the rules of the objects. |  [optional] |
|**kycUiParameters** | [**KycUiParameter**](KycUiParameter.md) |  |  [optional] |
|**kycDocumentCountryDenyList** | **String** | A comma separated list of country codes (ISO 3166-1 alpha-2) for which id-documents should be rejected. |  [optional] |






# Config

Can be used to set a multitude of pre-defined commonly used rules without the need of specifying each parameter set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave. |  [optional] |
|**kycCheckParameters** | [**Set&lt;KycCheckParametersEnum&gt;**](#Set&lt;KycCheckParametersEnum&gt;) | Configures your kyc checks. You can combine certain parameters to customize a single check operation. |  [optional] |
|**prototypes** | [**Set&lt;PrototypesEnum&gt;**](#Set&lt;PrototypesEnum&gt;) | Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation. |  [optional] |



## Enum: Set&lt;KycCheckParametersEnum&gt;

| Name | Value |
|---- | -----|
| IDENTITY_DOCUMENT_CHECK | &quot;identityDocumentCheck&quot; |
| AUTOMATED_DOCUMENT_RECOGNITION | &quot;automatedDocumentRecognition&quot; |
| BIOMETRIC_CHECK | &quot;biometricCheck&quot; |
| CONSIDER_KNOWN_FACES | &quot;considerKnownFaces&quot; |
| FORM_AUTOFILL | &quot;formAutofill&quot; |
| LIVE_IDENTIFICATION | &quot;liveIdentification&quot; |
| AGE_VERIFICATION_CHECK | &quot;ageVerificationCheck&quot; |
| LIVE_AGE_VERIFICATION_CHECK | &quot;liveAgeVerificationCheck&quot; |
| LIVE_SELFIE | &quot;liveSelfie&quot; |
| PROOF_OF_ADDRESS | &quot;proofOfAddress&quot; |
| VIDEO_UPLOAD_IDENTIFICATION | &quot;videoUploadIdentification&quot; |
| I_FRAME_FLOW | &quot;iFrameFlow&quot; |
| REDIRECT_FLOW | &quot;redirectFlow&quot; |
| ADD_ENCODINGS_TO_RESULT | &quot;addEncodingsToResult&quot; |



## Enum: Set&lt;PrototypesEnum&gt;

| Name | Value |
|---- | -----|
| NUDITY_CHECK | &quot;nudityCheck&quot; |
| AGE_ESTIMATION | &quot;ageEstimation&quot; |
| ILLEGAL_SYMBOLS | &quot;illegalSymbols&quot; |
| TEXT_RECOGNITION | &quot;textRecognition&quot; |
| ATTRIBUTES_CHECK | &quot;attributesCheck&quot; |
| BODY_ATTRIBUTES | &quot;bodyAttributes&quot; |
| NIPPLE_CHECK | &quot;nippleCheck&quot; |
| UNWANTED_SUBSTANCES | &quot;unwantedSubstances&quot; |
| VIOLENCE_CHECK | &quot;violenceCheck&quot; |
| SELFIE_CHECK | &quot;selfieCheck&quot; |




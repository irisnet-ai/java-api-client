

# Config

Can be used to set a multitude of pre-defined commonly used rules without the need of specifying each parameter set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave. |  [optional] |
|**prototypes** | [**Set&lt;PrototypesEnum&gt;**](#Set&lt;PrototypesEnum&gt;) | Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation. |  [optional] |



## Enum: Set&lt;PrototypesEnum&gt;

| Name | Value |
|---- | -----|
| NUDITYCHECK | &quot;nudityCheck&quot; |
| AGEVERIFICATION | &quot;ageVerification&quot; |
| AGEESTIMATION | &quot;ageEstimation&quot; |
| ILLEGALSYMBOLS | &quot;illegalSymbols&quot; |
| TEXTRECOGNITION | &quot;textRecognition&quot; |
| ATTRIBUTESCHECK | &quot;attributesCheck&quot; |
| BODYATTRIBUTES | &quot;bodyAttributes&quot; |
| NIPPLECHECK | &quot;nippleCheck&quot; |
| UNWANTEDSUBSTANCES | &quot;unwantedSubstances&quot; |
| VIOLENCECHECK | &quot;violenceCheck&quot; |




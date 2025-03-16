

# AgeVerificationDetection

Contains other features specific to _ageVerification_ detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional] |
|**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional] |
|**processedChecks** | [**AgeVerificationSubChecks**](AgeVerificationSubChecks.md) |  |  [optional] |
|**attributes** | [**List&lt;AgeVerificationAttribute&gt;**](AgeVerificationAttribute.md) | Attributes of the _ageVerification_ detection. |  [optional] |




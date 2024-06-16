

# AgeEstimationDetection

Contains further characteristics particular to _ageEstimation_ detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional] |
|**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional] |
|**processedChecks** | [**AgeEstimationSubChecks**](AgeEstimationSubChecks.md) |  |  [optional] |
|**attributes** | [**List&lt;AgeEstimationAttribute&gt;**](AgeEstimationAttribute.md) | Attributes of the _idDocument_ detection. |  [optional] |




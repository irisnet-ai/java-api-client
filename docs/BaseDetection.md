

# BaseDetection

A detection describes the object found with all its details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  |
|**attributes** | [**List&lt;AgeEstimationAttribute&gt;**](AgeEstimationAttribute.md) | Attributes of the _idDocument_ detection. |  [optional] |
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**hasOfficialDocument** | **Boolean** | Indicates whether the identified document is official |  [optional] |
|**comparable** | **Boolean** | Indicates whether the provided selfie-image is comparable to the document |  [optional] |
|**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional] |
|**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional] |
|**documentFrontLivenessScore** | **Integer** | Indicates the liveness score of the front side image of the document |  [optional] |
|**documentBackLivenessScore** | **Integer** | Indicates the liveness score of the back side image of the document |  [optional] |
|**processedChecks** | [**AgeEstimationSubChecks**](AgeEstimationSubChecks.md) |  |  [optional] |
|**documentHolderId** | **String** | The id of the documentHolder |  [optional] |
|**subDetections** | [**List&lt;BaseDetection&gt;**](BaseDetection.md) | A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype. |  [optional] |




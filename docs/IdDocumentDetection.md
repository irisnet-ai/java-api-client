

# IdDocumentDetection

Contains further characteristics particular to _idDocument_ detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**hasOfficialDocument** | **Boolean** | Indicates whether the identified document is official |  [optional] |
|**comparable** | **Boolean** | Indicates whether the provided selfie-image is comparable to the document |  [optional] |
|**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional] |
|**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional] |
|**documentFrontLivenessScore** | **Integer** | Indicates the liveness score of the front side image of the document |  [optional] |
|**documentBackLivenessScore** | **Integer** | Indicates the liveness score of the back side image of the document |  [optional] |
|**processedChecks** | [**IdDocumentSubChecks**](IdDocumentSubChecks.md) |  |  [optional] |
|**attributes** | [**List&lt;IdDocumentAttribute&gt;**](IdDocumentAttribute.md) | Attributes of the _idDocument_ detection. |  [optional] |




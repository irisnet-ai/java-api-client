

# CheckResultDetectionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional] |
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | Attributes characterizing the text. |  [optional] |
|**subDetections** | [**List&lt;BaseDetection&gt;**](BaseDetection.md) | A set of sub-detection for text moderation. |  [optional] |
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**hasOfficialDocument** | **Boolean** | Indicates whether the identified document is official |  [optional] |
|**comparable** | **Boolean** | Indicates whether the provided selfie-image is comparable to the document |  [optional] |
|**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional] |
|**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional] |
|**documentFrontLivenessScore** | **Integer** | Indicates the liveness score of the front side image of the document |  [optional] |
|**documentBackLivenessScore** | **Integer** | Indicates the liveness score of the back side image of the document |  [optional] |
|**processedChecks** | [**PoaDocumentSubChecks**](PoaDocumentSubChecks.md) | The sub-checks that were processed |  [optional] |
|**documentHolderId** | **String** | The id of the documentHolder |  [optional] |
|**knownFaces** | [**List&lt;KnownFace&gt;**](KnownFace.md) | A list of known faces, describing which other documentHolders match this documentHolder with a certain similarity |  [optional] |
|**content** | **String** | The text that was detected |  [optional] |




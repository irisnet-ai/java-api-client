

# PoaDocumentDetection

Contains further characteristics particular to _poaDocument_ detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**checkId** | **String** | The id of the check that lead to the detection |  [optional] |
|**processedChecks** | [**PoaDocumentSubChecks**](PoaDocumentSubChecks.md) | The sub-checks that were processed |  [optional] |
|**attributes** | [**List&lt;PoaDocumentAttribute&gt;**](PoaDocumentAttribute.md) | Attributes of the _poaDocument_ detection. |  [optional] |
|**documentHolderId** | **String** | The id of the documentHolder |  [optional] |




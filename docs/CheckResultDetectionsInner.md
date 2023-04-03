

# CheckResultDetectionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional] |
|**attributes** | [**List&lt;HairAttribute&gt;**](HairAttribute.md) | Contains attributes for the _hair_ classification. |  [optional] |
|**subDetections** | [**List&lt;BaseDetection&gt;**](BaseDetection.md) | A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype. |  [optional] |




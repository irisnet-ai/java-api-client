

# TextDetection

Contains further characteristics regarding the moderation of text.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**content** | **String** | The text that was detected |  [optional] |
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | Attributes characterizing the text. |  [optional] |
|**subDetections** | [**List&lt;BaseDetection&gt;**](BaseDetection.md) | A set of sub-detection for text moderation. |  [optional] |




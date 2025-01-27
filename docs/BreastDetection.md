

# BreastDetection

Contains further characteristics particular to _breast_ detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**id** | **Integer** | The id of the detection object. |  [optional] |
|**probability** | **Integer** | The probability that the object found matches the classification. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |
|**attributes** | [**List&lt;BaseAttribute&gt;**](BaseAttribute.md) | Attributes characterizing the _breast_ detection. Mainly contains attributes that were activated with the _nippleCheck_ prototype. |  [optional] |




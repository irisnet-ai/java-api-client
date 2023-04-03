

# Event

Describes an event that lead to a broken rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** | The classification of the recognized object. |  [optional] |
|**group** | **String** | The group of the classification. |  [optional] |
|**start** | **Float** | The start in seconds where the classification object is found. |  [optional] |
|**duration** | **Float** | The duration of the event in seconds until the classification object is no longer in frame. The current event is ongoing if the duration is not set. |  [optional] |
|**severity** | **Integer** | The severity of the classification object set while configuring the AI. |  [optional] |




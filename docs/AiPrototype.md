

# AiPrototype


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**classifications** | [**Set&lt;AiClassification&gt;**](AiClassification.md) |  |  [optional] |
|**summary** | **String** |  |  [optional] |
|**aliases** | **Set&lt;String&gt;** |  |  [optional] |
|**modes** | **Set&lt;String&gt;** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**routerMethod** | **String** |  |  [optional] |
|**dependsOn** | **Set&lt;String&gt;** |  |  [optional] |
|**hidden** | **Boolean** |  |  [optional] |



## Enum: RouteEnum

| Name | Value |
|---- | -----|
| AI_SERVICE | &quot;AI_SERVICE&quot; |
| TEXT_SERVICE | &quot;TEXT_SERVICE&quot; |
| PROVIDER_SERVICE | &quot;PROVIDER_SERVICE&quot; |




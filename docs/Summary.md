

# Summary

Summarizing the result of the AI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | A simple status string that can be either _accept_ or _reject_. |  [optional] |
|**brokenRulesCount** | **Integer** | The amount of broken rules that are contained in the source media. |  [optional] |
|**helpSuggested** | **Integer** | In cases where the AI is uncertain, this attribute is set (1), indication that it could be useful to double check the source media by a human. |  [optional] |
|**severity** | **Integer** | The highest severity value found amongst the broken rules. |  [optional] |
|**creditsConsumed** | **Integer** | The amount of credits that was consumed for the check. |  [optional] |
|**tags** | **Set&lt;String&gt;** | A list of classification names that were found. |  [optional] |
|**rejectTags** | **Set&lt;String&gt;** | A list of classification names that caused a rule to be broken. |  [optional] |
|**rejectReasons** | **Set&lt;String&gt;** | The names of the classification groups that caused a rule to be broken. |  [optional] |




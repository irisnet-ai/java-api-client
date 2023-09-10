

# Encoded

Contains the resulting media as base64 encoded string or an URL to download that media.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | &lt;s&gt;The original filename of the image or video.&lt;/s&gt; Contains a randomly generated filename. &lt;b&gt;This property will be removed in future releases.&lt;/b&gt; |  [optional] |
|**data** | **File** | The encoded image in base64 format. |  [optional] |
|**downloadUrl** | **String** | A one time URL to download the resulting video. The URL is only valid for 24 hours. |  [optional] |




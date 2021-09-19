

# INObject

Describes a rectangle that stretches around the recognized object. This is useful when redacting or blurring certain recognized objects. Each object contains the name of the classification and coordinates for a rectangle around the recognized object. The origin point (y = 0.0, x = 0.0) of the coordinate system is on the top left of the of the source material. The bottom right of the source is always y = 1 and x = 1.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inClass** | **String** | The classification of the recognized object. |  [optional]
**inGroup** | **String** | The group of the classification. |  [optional]
**inId** | **String** | The group of the classification. |  [optional]
**color** | [**ColorEnum**](#ColorEnum) | The color of the object, e.g. the color of the hair. Is only available for certain classification objects. See list below:  * _hair_ - black, brown, blonde, grey, red, other |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | The style attribute of the object, e.g. the style of the hair. Is only available for certain classification objects. See list below:  * _hair_ - longHaired, shortHaired |  [optional]
**x0** | **Float** | The starting point of the rectangle in the vertical (x) direction. |  [optional]
**y0** | **Float** | The starting point of the rectangle in the horizontal (y) direction. |  [optional]
**width** | **Float** | The distance from the starting point (y0) to end the rectangle in the horizontal direction. |  [optional]
**height** | **Float** | The distance from the starting point (x0) to end the rectangle in the vertical direction. |  [optional]
**probability** | **Integer** | The probability that the object found matches the classification. |  [optional]



## Enum: ColorEnum

Name | Value
---- | -----
BLACK | &quot;black&quot;
BROWN | &quot;brown&quot;
BLONDE | &quot;blonde&quot;
GREY | &quot;grey&quot;
RED | &quot;red&quot;
OTHER | &quot;other&quot;



## Enum: StyleEnum

Name | Value
---- | -----
LONGHAIRED | &quot;longHaired&quot;
SHORTHAIRED | &quot;shortHaired&quot;




# ModelTextTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the text template was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the text template was last updated |  [optional]
**name** | **String** | name of the text template |  [optional]
**text** | **String** | text of your text template |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | object type for which you want to use the text template |  [optional]
**textType** | [**TextTypeEnum**](#TextTypeEnum) | type of your text |  [optional]
**sevUser** | **Object** | sevUser who created the text template |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**main** | **Boolean** | defines if the text template is used as the main template |  [optional]

<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
RE | &quot;RE&quot;
AN | &quot;AN&quot;
AB | &quot;AB&quot;
LI | &quot;LI&quot;
MA | &quot;MA&quot;
MAIL | &quot;MAIL&quot;

<a name="TextTypeEnum"></a>
## Enum: TextTypeEnum
Name | Value
---- | -----
HEAD | &quot;HEAD&quot;
FOOT | &quot;FOOT&quot;

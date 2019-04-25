# ModelCommunicationWay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the communication way was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the communication way was last updated |  [optional]
**contact** | [**ModelContact**](ModelContact.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | type of the communication way |  [optional]
**value** | **String** | value of the communication way |  [optional]
**key** | [**ModelCommunicationWayKey**](ModelCommunicationWayKey.md) |  |  [optional]
**main** | **Boolean** |  |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EMAIL | &quot;EMAIL&quot;
PHONE | &quot;PHONE&quot;
WEB | &quot;WEB&quot;
MOBILE | &quot;MOBILE&quot;

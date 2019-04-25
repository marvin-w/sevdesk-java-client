# ModelSevToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the sevToken was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the sevToken was last updated |  [optional]
**user** | **Object** | SevUser to whom the sevToken belongs |  [optional]
**token** | **String** | token of the sevUser |  [optional]
**expire** | [**OffsetDateTime**](OffsetDateTime.md) | expiration date of the token |  [optional]
**active** | **Boolean** | Defines if the token is active |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**ipAddress** | **String** | Ip address of the user |  [optional]
**userAgent** | **String** | Information about the users system |  [optional]
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Type of the token |  [optional]
**confirmationToken** | **String** | Confirmation token |  [optional]

<a name="TokenTypeEnum"></a>
## Enum: TokenTypeEnum
Name | Value
---- | -----
LOGIN | &quot;LOGIN&quot;
API | &quot;API&quot;
SUPPORT | &quot;SUPPORT&quot;

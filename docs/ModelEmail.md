# ModelEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | creation date of the Email |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the email was last updated |  [optional]
**object** | [**ModelInvoice**](ModelInvoice.md) |  |  [optional]
**from** | **String** | sender of the email |  [optional]
**to** | **String** | recipient of the email |  [optional]
**subject** | **String** | subject of the email |  [optional]
**text** | **String** | text written in the email |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**cc** | **String** | cc of the email |  [optional]
**bcc** | **String** | bcc of the email |  [optional]
**arrived** | [**OffsetDateTime**](OffsetDateTime.md) | arrival date of the email |  [optional]

# ModelOrderLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the order log was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the order was last updated |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | date of the order log |  [optional]
**order** | [**ModelOrder**](ModelOrder.md) |  |  [optional]
**object** | **Object** | the object which was involved in the logged order action (eg. a created invoice) |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**currency** | **String** | currency of the logged order |  [optional]
**amount** | **Float** | amount of the order position |  [optional]
**amountType** | **String** | type of the order position amount, can be one from unity or custom |  [optional]
**taxRate** | **Integer** | tax rate of the order |  [optional]

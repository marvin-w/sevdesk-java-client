# ModelTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | the date the task was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the task was last updated |  [optional]
**name** | **String** |  |  [optional]
**assigned** | [**ModelSevUser**](ModelSevUser.md) |  |  [optional]
**object** | **Object** | can be a contact, invoice, etc to which the task refers to |  [optional]
**deadline** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | **Integer** |  |  [optional]
**category** | [**ModelCategory**](ModelCategory.md) |  |  [optional]
**done** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createUser** | [**ModelSevUser**](ModelSevUser.md) |  |  [optional]
**doneUser** | [**ModelSevUser**](ModelSevUser.md) |  |  [optional]
**noticeCreator** | **Boolean** | notice the creator when the task is finished |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**begin** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

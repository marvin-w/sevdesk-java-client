# ModelOrderPos

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | creation date of the order position |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the order position was last updated |  [optional]
**order** | [**ModelOrder**](ModelOrder.md) |  |  [optional]
**part** | [**ModelPart**](ModelPart.md) |  |  [optional]
**quantity** | **Float** | quantity of the Model_Part |  [optional]
**price** | **Float** | price of the Model_Part |  [optional]
**name** | **String** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**unity** | [**ModelUnity**](ModelUnity.md) |  |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**positionNumber** | **Integer** |  |  [optional]
**text** | **String** |  |  [optional]
**discount** | **Float** |  |  [optional]
**optional** | **Boolean** |  |  [optional]
**optionalChargeable** | **Boolean** |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**sumNet** | **Float** |  |  [optional]
**sumGross** | **Float** |  |  [optional]
**sumDiscount** | **Float** |  |  [optional]

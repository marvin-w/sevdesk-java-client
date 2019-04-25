# ModelVoucherPos

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the voucher positions was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the voucher position was last updated |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**voucher** | [**ModelVoucher**](ModelVoucher.md) |  |  [optional]
**accountingType** | [**ModelAccountingType**](ModelAccountingType.md) |  |  [optional]
**estimatedAccountingType** | [**ModelAccountingType**](ModelAccountingType.md) |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**sum** | **Float** |  |  [optional]
**net** | **Boolean** |  |  [optional]
**isAsset** | **Boolean** |  |  [optional]
**sumNet** | **Float** |  |  [optional]
**sumTax** | **Float** |  |  [optional]
**sumGross** | **Float** |  |  [optional]
**sumNetAccounting** | **Float** |  |  [optional]
**sumTaxAccounting** | **Float** |  |  [optional]
**sumGrossAccounting** | **Float** |  |  [optional]
**comment** | **String** |  |  [optional]
**isGwg** | **Boolean** |  |  [optional]
**cateringTaxRate** | **Float** |  |  [optional]
**cateringTip** | **Float** |  |  [optional]

# ModelCheckAccountTransactionLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the check account transaction log was created |  [optional]
**checkAccountTransaction** | [**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md) |  |  [optional]
**fromStatus** | **Integer** | the status before the logged change |  [optional]
**toStatus** | **Integer** | the status after the logged change |  [optional]
**amountPaid** | **Float** | the logged amount which was paid |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**object** | **Object** | Invoice/Voucher to which the logged transaction belongs |  [optional]

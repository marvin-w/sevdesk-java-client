# ModelVoucherLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the voucher log was created |  [optional]
**voucher** | [**ModelVoucher**](ModelVoucher.md) |  |  [optional]
**fromStatus** | **Integer** | status of the voucher before the logged change |  [optional]
**toStatus** | **Integer** | status of the voucher after the logged change |  [optional]
**amountPayed** | **Float** | amount which was payed |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | date of the booking |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]

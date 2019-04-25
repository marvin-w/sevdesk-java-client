# ModelInvoiceLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the invoice log was created |  [optional]
**invoice** | **Object** | the invoice which is logged |  [optional]
**fromStatus** | **Integer** | status before the change |  [optional]
**toStatus** | **Integer** | status after the change |  [optional]
**ammountPayed** | **Float** | amount that was payed |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | date of the booking |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]

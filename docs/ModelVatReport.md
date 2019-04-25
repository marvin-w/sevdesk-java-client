# ModelVatReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the vat report was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the vat report was last updated |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**country** | [**ModelStaticCountry**](ModelStaticCountry.md) |  |  [optional]
**reportDate** | [**OffsetDateTime**](OffsetDateTime.md) | date of the vat report |  [optional]
**reportingYear** | **String** | year which is reported |  [optional]
**reportingPeriod** | **String** | period which is reported |  [optional]
**reportingPeriodCode** | **String** |  |  [optional]
**reportingValues** | **String** |  |  [optional]
**testCase** | **Boolean** |  |  [optional]
**actualTaxation** | **Boolean** | define if you want to report the main income method or the profit and loss |  [optional]
**corrected** | **Boolean** |  |  [optional]
**resultFinanceAuthority** | **String** |  |  [optional]
**financeAuthorityTicketNumber** | **String** |  |  [optional]

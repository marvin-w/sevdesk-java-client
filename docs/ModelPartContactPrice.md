# ModelPartContactPrice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the part contact price was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the part contact price was last updated |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**contact** | **Object** | contact for which you have a special price |  [optional]
**part** | **Object** | part for which you have a special price |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | type of the part contact price |  [optional]
**priceNet** | **Float** | special net price for contact |  [optional]
**priceGross** | **Float** | special gross price for contact |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SUP_SUPPLIER_ | &quot;sup (SUPPLIER)&quot;
CUST_CUSTOMER_ | &quot;cust (CUSTOMER)&quot;

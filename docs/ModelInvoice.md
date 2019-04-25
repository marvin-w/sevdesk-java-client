# ModelInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNumber** | **String** |  |  [optional]
**contact** | [**ModelContact**](ModelContact.md) |  |  [optional]
**create** | [**OffsetDateTime**](OffsetDateTime.md) | the date the invoice was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | the date the invoice was last updated |  [optional]
**invoiceDate** | [**OffsetDateTime**](OffsetDateTime.md) | the date of the invoice |  [optional]
**header** | **String** | header/subject of the invoice |  [optional]
**headText** | **String** | head text of the invoice |  [optional]
**footText** | **String** | foot text of the invoice |  [optional]
**timeToPay** | [**OffsetDateTime**](OffsetDateTime.md) | time left for paying the invoice, use format dd.MM.yyyy or number for number of days left |  [optional]
**discountTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**discount** | **Float** | the discount value in &#x27;%&#x27; |  [optional]
**addressName** | **String** | the name in the address, equals the contacts name |  [optional]
**addressStreet** | **String** | the street in the address, equals the contacts street |  [optional]
**addressZip** | **String** | the zip-code in the address, equals the contacts zip |  [optional]
**addressCity** | **String** | the city in the address, equals the contacts city |  [optional]
**addressCountry** | [**ModelStaticCountry**](ModelStaticCountry.md) |  |  [optional]
**payDate** | [**OffsetDateTime**](OffsetDateTime.md) | time left for paying the invoice, use format DD.MM.YYYY or number for number of days left |  [optional]
**createUser** | [**ModelSevUser**](ModelSevUser.md) |  |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**deliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | delivery date of the goods from the invoice, please use dd.MM.yyyy |  [optional]
**status** | **Integer** | status of the invoice |  [optional]
**smallSettlement** | **Boolean** |  |  [optional]
**contactPerson** | [**ModelSevUser**](ModelSevUser.md) |  |  [optional]
**taxRate** | **Float** | tax rate used when adding a value added tax regulation |  [optional]
**taxText** | [**TaxTextEnum**](#TaxTextEnum) | additional text when adding a value added tax regulation |  [optional]
**dunningLevel** | **Integer** | dunning level of the invoice |  [optional]
**addressParentName** | **String** | name of the contacts address |  [optional]
**addressContactRef** | [**ModelContactAddress**](ModelContactAddress.md) |  |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) |  |  [optional]
**paymentMethod** | [**ModelPaymentMethod**](ModelPaymentMethod.md) |  |  [optional]
**costCentre** | [**ModelCostCentre**](ModelCostCentre.md) |  |  [optional]
**sendDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**origin** | **Object** |  |  [optional]
**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) | type of the invoice |  [optional]
**accountIntervall** | **Integer** |  |  [optional]
**accountLastInvoice** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**accountNextInvoice** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reminderTotal** | **Float** |  |  [optional]
**reminderDebit** | **Float** |  |  [optional]
**reminderDeadline** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reminderCharge** | **Float** |  |  [optional]
**addressParentName2** | **String** |  |  [optional]
**addressName2** | **String** |  |  [optional]
**taxSet** | [**ModelTaxSet**](ModelTaxSet.md) |  |  [optional]
**addressGender** | **String** |  |  [optional]
**accountEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**address** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**sumNet** | **Float** |  |  [optional]
**sumTax** | **Float** |  |  [optional]
**sumGross** | **Float** |  |  [optional]
**sumDiscounts** | **Float** |  |  [optional]
**sumNetForeignCurrency** | **Float** |  |  [optional]
**sumTaxForeignCurrency** | **Float** |  |  [optional]
**sumGrossForeignCurrency** | **Float** |  |  [optional]
**sumDiscountsForeignCurrency** | **Float** |  |  [optional]
**sumNetAccounting** | **Float** |  |  [optional]
**sumTaxAccounting** | **Float** |  |  [optional]
**sumGrossAccounting** | **Float** |  |  [optional]
**entryType** | [**ModelEntryType**](ModelEntryType.md) |  |  [optional]
**costumerInternalNote** | **String** |  |  [optional]
**showNet** | **Boolean** |  |  [optional]
**enshrined** | **Boolean** |  |  [optional]
**sendType** | **String** |  |  [optional]
**deliveryDateUntil** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="TaxTextEnum"></a>
## Enum: TaxTextEnum
Name | Value
---- | -----
UMSATZSTEUER_AUSWEISEN | &quot;Umsatzsteuer ausweisen&quot;
STEUERFREIE_INNERGEMEINSCHAFTLICHE_LIEFERUNG_EUROP_ISCHE_UNION_ | &quot;Steuerfreie innergemeinschaftliche Lieferung(Europäische Union)&quot;
STEUERSCHULDNERSCHAFT_DES_LEISTUNGSEMPF_NGERS_AU_ERHALB_EU_Z_B_SCHWEIZ_ | &quot;Steuerschuldnerschaft des Leistungsempfängers (Außerhalb EU, z.B. Schweiz)&quot;

<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
EU | &quot;eu&quot;
NOTEU | &quot;noteu&quot;

<a name="InvoiceTypeEnum"></a>
## Enum: InvoiceTypeEnum
Name | Value
---- | -----
RE_INVOICE_ | &quot;RE (Invoice)&quot;
MA_INVOICE_REMINDER_ | &quot;MA (Invoice reminder)&quot;
WKR_PERIODIC_INVOICE_ | &quot;WKR (periodic invoice)&quot;

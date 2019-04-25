# ModelCheckAccountTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | date the check account transaction was created |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | date the check account transaction was last updated |  [optional]
**sevClient** | **Object** | sevClient is the unique id every customer has and is used in nearly all operations |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**entryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**amount** | **Float** | amount of the transaction |  [optional]
**gvCode** | **String** |  |  [optional]
**entryText** | **String** |  |  [optional]
**primaNotaNo** | **String** |  |  [optional]
**paymtPurpose** | **String** |  |  [optional]
**payeePayerBankCode** | **String** | payer bank code |  [optional]
**payeePayerAcctNo** | **String** | payer account number |  [optional]
**payeePayerName** | **String** | payer name |  [optional]
**checkAccount** | [**ModelCheckAccount**](ModelCheckAccount.md) |  |  [optional]
**status** | **Integer** |  |  [optional]
**score** | **String** |  |  [optional]
**compareHash** | **String** | hash to be compared |  [optional]
**entryType** | **Object** |  |  [optional]
**enshrined** | **Boolean** |  |  [optional]
**sourceTransaction** | **Object** | source check account transaction used for transfers |  [optional]
**targetTransaction** | **Object** | destination check account transaction used for transfers |  [optional]
**obonoReceiptUuid** | **String** |  |  [optional]

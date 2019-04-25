# VoucherApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVoucher**](VoucherApi.md#addVoucher) | **POST** /Voucher | Create a new voucher
[**deleteVoucher**](VoucherApi.md#deleteVoucher) | **DELETE** /Voucher/{id} | Delete an existing voucher
[**getVouchers**](VoucherApi.md#getVouchers) | **GET** /Voucher | Get an overview of all vouchers
[**saveVoucher**](VoucherApi.md#saveVoucher) | **POST** /Voucher/Factory/saveVoucher | Create a new voucher
[**updateVoucher**](VoucherApi.md#updateVoucher) | **PUT** /Voucher/{id} | Update an existing voucher
[**voucherBookAmount**](VoucherApi.md#voucherBookAmount) | **PUT** /Voucher/{id}/bookAmmount | Book an amount for a specified voucher
[**voucherChangeStatus**](VoucherApi.md#voucherChangeStatus) | **PUT** /Voucher/{id}/changeStatus | Change status of a specified voucher
[**voucherDeleteDocument**](VoucherApi.md#voucherDeleteDocument) | **DELETE** /Voucher/{id}/deleteDocument | Delete the document of an existing voucher
[**voucherExtractThumb**](VoucherApi.md#voucherExtractThumb) | **GET** /Voucher/Factory/extractThumb | Extract file thumb
[**voucherGetAccountingTypes**](VoucherApi.md#voucherGetAccountingTypes) | **GET** /Voucher/{id}/getAccountingTypes | Get the accounting types of a specified voucher
[**voucherGetCheckAccountTransactionLogs**](VoucherApi.md#voucherGetCheckAccountTransactionLogs) | **GET** /Voucher/{id}/getCheckAccountTransactionLogs | Get the check account transaction logs of a specified voucher
[**voucherGetCheckAccountTransactions**](VoucherApi.md#voucherGetCheckAccountTransactions) | **GET** /Voucher/{id}/getCheckAccountTransactions | Get the check account transactions of a specified voucher
[**voucherGetCurrency**](VoucherApi.md#voucherGetCurrency) | **GET** /Voucher/{id}/getCurrency | Get the currency of a specified voucher
[**voucherGetDebit**](VoucherApi.md#voucherGetDebit) | **GET** /Voucher/{id}/getDebit | Get unpaid amount of a specified voucher
[**voucherGetDelinquent**](VoucherApi.md#voucherGetDelinquent) | **GET** /Voucher/{id}/getDelinquent | Return if the voucher is delinquent
[**voucherGetDependingRecurringVouchers**](VoucherApi.md#voucherGetDependingRecurringVouchers) | **GET** /Voucher/{id}/getDependingRecurringVouchers | Get the depending recurring vouchers of a specified origin voucher
[**voucherGetDocumentImage**](VoucherApi.md#voucherGetDocumentImage) | **GET** /Voucher/{id}/getDocumentImage | Returns the base64 encoded preview content of the vouchers document
[**voucherGetTaxGroups**](VoucherApi.md#voucherGetTaxGroups) | **GET** /Voucher/{id}/getTaxGroupes | Get an overview of all vouchers
[**voucherMarkAsOpen**](VoucherApi.md#voucherMarkAsOpen) | **PUT** /Voucher/{id}/markAsOpen | Mark a specified voucher as open
[**voucherMarkAsPaid**](VoucherApi.md#voucherMarkAsPaid) | **PUT** /Voucher/{id}/markAsPaid | Mark a specified voucher as paid
[**voucherRefundAmount**](VoucherApi.md#voucherRefundAmount) | **PUT** /Voucher/{id}/refundAmmount | Refund an amount for a specified voucher
[**voucherUploadTempFile**](VoucherApi.md#voucherUploadTempFile) | **POST** /Voucher/Factory/uploadTempFile | Upload a temporary file to be used later

<a name="addVoucher"></a>
# **addVoucher**
> ModelVoucher addVoucher()

Create a new voucher

Calls Voucher.php to create a voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
try {
    ModelVoucher result = apiInstance.addVoucher();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#addVoucher");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteVoucher"></a>
# **deleteVoucher**
> deleteVoucher(id)

Delete an existing voucher

Calls the delete() function in Voucher.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of voucher you want to delete
try {
    apiInstance.deleteVoucher(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#deleteVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of voucher you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVouchers"></a>
# **getVouchers**
> ModelVoucher getVouchers(limit, offset, embed)

Get an overview of all vouchers

Calls Voucher.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned vouchers start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelVoucher result = apiInstance.getVouchers(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#getVouchers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned vouchers start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="saveVoucher"></a>
# **saveVoucher**
> ModelVoucherFactory saveVoucher()

Create a new voucher

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new voucher it wont be saved by a POST request with &#x27;/Voucher?para1&#x3D;&amp;...&#x27; but with the saveVoucher function in Factory.php &#x27;Voucher/Factory/saveVoucher?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
try {
    ModelVoucherFactory result = apiInstance.saveVoucher();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#saveVoucher");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelVoucherFactory**](ModelVoucherFactory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updateVoucher"></a>
# **updateVoucher**
> ModelVoucher updateVoucher(id)

Update an existing voucher

Calls Voucher.php to update an existing voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher you want to update
try {
    ModelVoucher result = apiInstance.updateVoucher(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#updateVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher you want to update |

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="voucherBookAmount"></a>
# **voucherBookAmount**
> voucherBookAmount(id)

Book an amount for a specified voucher

Book an amount for the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher for which you want to book an amount
try {
    apiInstance.voucherBookAmount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherBookAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher for which you want to book an amount |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="voucherChangeStatus"></a>
# **voucherChangeStatus**
> voucherChangeStatus(id)

Change status of a specified voucher

Change the status of the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to change the status
try {
    apiInstance.voucherChangeStatus(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherChangeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to change the status |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="voucherDeleteDocument"></a>
# **voucherDeleteDocument**
> voucherDeleteDocument(id)

Delete the document of an existing voucher

Calls the deleteDocument() function in Voucher.php to delete the document of an existing voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to delete the document
try {
    apiInstance.voucherDeleteDocument(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherDeleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to delete the document |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherExtractThumb"></a>
# **voucherExtractThumb**
> voucherExtractThumb(fileName)

Extract file thumb

Calls extractThumb() in Voucher/Factory.php to extract the thumb of the specified file

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
String fileName = "fileName_example"; // String | Name of the file of which you want to extract the thumb
try {
    apiInstance.voucherExtractThumb(fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherExtractThumb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file of which you want to extract the thumb | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetAccountingTypes"></a>
# **voucherGetAccountingTypes**
> ModelAccountingType voucherGetAccountingTypes(id, embed)

Get the accounting types of a specified voucher

Calls getAccountingTypes() in Voucher.php to get the accounting types of the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the accounting types
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingType result = apiInstance.voucherGetAccountingTypes(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetAccountingTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the accounting types |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="voucherGetCheckAccountTransactionLogs"></a>
# **voucherGetCheckAccountTransactionLogs**
> voucherGetCheckAccountTransactionLogs(id, embed)

Get the check account transaction logs of a specified voucher

Calls getCheckAccountTransactionLogs() in Voucher.php to get the check account transaction logs of the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the check account transaction logs
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.voucherGetCheckAccountTransactionLogs(id, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetCheckAccountTransactionLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the check account transaction logs |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetCheckAccountTransactions"></a>
# **voucherGetCheckAccountTransactions**
> voucherGetCheckAccountTransactions(id, embed)

Get the check account transactions of a specified voucher

Calls getCheckAccountTransactions() in Voucher.php to get the check account transactions of the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the check account transactions
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.voucherGetCheckAccountTransactions(id, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetCheckAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the check account transactions |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetCurrency"></a>
# **voucherGetCurrency**
> voucherGetCurrency(id)

Get the currency of a specified voucher

Calls getCurrency() in Voucher.php to get the currency of the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the currency
try {
    apiInstance.voucherGetCurrency(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the currency |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetDebit"></a>
# **voucherGetDebit**
> voucherGetDebit(id)

Get unpaid amount of a specified voucher

Calls getDebit() in Voucher.php to get the unpaid amount of a specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the unpaid amount
try {
    apiInstance.voucherGetDebit(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetDebit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the unpaid amount |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetDelinquent"></a>
# **voucherGetDelinquent**
> voucherGetDelinquent(id)

Return if the voucher is delinquent

Calls getDelinquent() in Voucher.php to get if the voucher is delinquent

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to know if it is delinquent
try {
    apiInstance.voucherGetDelinquent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetDelinquent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to know if it is delinquent |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetDependingRecurringVouchers"></a>
# **voucherGetDependingRecurringVouchers**
> ModelVoucher voucherGetDependingRecurringVouchers(id, embed)

Get the depending recurring vouchers of a specified origin voucher

Calls getDependingRecurringVouchers() in Voucher.php to get the depending recurring vouchers of the specified origin voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the depending recurring vouchers
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelVoucher result = apiInstance.voucherGetDependingRecurringVouchers(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetDependingRecurringVouchers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the depending recurring vouchers |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="voucherGetDocumentImage"></a>
# **voucherGetDocumentImage**
> voucherGetDocumentImage(id)

Returns the base64 encoded preview content of the vouchers document

Calls getDocumentImage() in Voucher.php to return the base64 encoded preview content of the vouchers document

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher of which you want to get the document image
try {
    apiInstance.voucherGetDocumentImage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetDocumentImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher of which you want to get the document image |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherGetTaxGroups"></a>
# **voucherGetTaxGroups**
> voucherGetTaxGroups(id, showTotalSum, withCorrections)

Get an overview of all vouchers

Calls Voucher.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher you want to update
Boolean showTotalSum = true; // Boolean | Define if you want to have the total sum of each tax group
Boolean withCorrections = true; // Boolean | Define if you want to have the total sum with corrections
try {
    apiInstance.voucherGetTaxGroups(id, showTotalSum, withCorrections);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherGetTaxGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher you want to update |
 **showTotalSum** | **Boolean**| Define if you want to have the total sum of each tax group |
 **withCorrections** | **Boolean**| Define if you want to have the total sum with corrections |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherMarkAsOpen"></a>
# **voucherMarkAsOpen**
> ModelVoucher voucherMarkAsOpen(id)

Mark a specified voucher as open

Mark the specified voucher as open

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher you want to mark as open
try {
    ModelVoucher result = apiInstance.voucherMarkAsOpen(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherMarkAsOpen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher you want to mark as open |

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="voucherMarkAsPaid"></a>
# **voucherMarkAsPaid**
> ModelVoucher voucherMarkAsPaid(id)

Mark a specified voucher as paid

Mark the specified voucher as paid

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher you want to mark as paid
try {
    ModelVoucher result = apiInstance.voucherMarkAsPaid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherMarkAsPaid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher you want to mark as paid |

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="voucherRefundAmount"></a>
# **voucherRefundAmount**
> ModelVoucherLog voucherRefundAmount(id)

Refund an amount for a specified voucher

Refund an amount for the specified voucher

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
Integer id = 56; // Integer | Id of the voucher for which you want to refund an amount
try {
    ModelVoucherLog result = apiInstance.voucherRefundAmount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherRefundAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher for which you want to refund an amount |

### Return type

[**ModelVoucherLog**](ModelVoucherLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="voucherUploadTempFile"></a>
# **voucherUploadTempFile**
> ModelVoucherFactory voucherUploadTempFile(file)

Upload a temporary file to be used later

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new voucher it wont be saved by a POST request with &#x27;/Voucher?para1&#x3D;&amp;...&#x27; but with the saveVoucher function in Factory.php &#x27;Voucher/Factory/saveVoucher?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherApi apiInstance = new VoucherApi();
File file = new File("file_example"); // File | 
try {
    ModelVoucherFactory result = apiInstance.voucherUploadTempFile(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherApi#voucherUploadTempFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

[**ModelVoucherFactory**](ModelVoucherFactory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json


# ExportApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportContactCsv**](ExportApi.md#exportContactCsv) | **GET** /Export/contactCsv | Export the specified contact as csv
[**exportContactListCsv**](ExportApi.md#exportContactListCsv) | **GET** /Export/contactListCsv | Export the contact list as csv
[**exportDatev**](ExportApi.md#exportDatev) | **GET** /Export/datev | Datev export as zip with csv´s
[**exportDatevZip**](ExportApi.md#exportDatevZip) | **GET** /Export/datevZip | Export zip for voucher upload
[**exportInventoryPartLogList**](ExportApi.md#exportInventoryPartLogList) | **GET** /Export/inventoryPartLogListCsv | Export the inventory part log as csv
[**exportInvoiceCsv**](ExportApi.md#exportInvoiceCsv) | **GET** /Export/invoiceCsv | Export the invoice list as csv
[**exportInvoiceZip**](ExportApi.md#exportInvoiceZip) | **GET** /Export/invoiceZip | Export the invoice list as zip with csv´s
[**exportPartCsv**](ExportApi.md#exportPartCsv) | **GET** /Export/partCsv | Export the parts as csv
[**exportPebe**](ExportApi.md#exportPebe) | **GET** /Export/pebe | Pebe export as zip with csv´s
[**exportTransactionsCsv**](ExportApi.md#exportTransactionsCsv) | **GET** /Export/transactionsCsv | Export the transactions as csv
[**exportVoucherListCsv**](ExportApi.md#exportVoucherListCsv) | **GET** /Export/voucherListCsv | Export the voucher list as csv
[**exportVoucherZip**](ExportApi.md#exportVoucherZip) | **GET** /Export/voucherZip | Export the voucher list as zip with csv´s

<a name="exportContactCsv"></a>
# **exportContactCsv**
> File exportContactCsv(contactId, contactObjectName, download)

Export the specified contact as csv

Calls contactCsv() in Export.php to export the specified contact as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
Integer contactId = 56; // Integer | Id of the contact you want to export
String contactObjectName = "contactObjectName_example"; // String | Model name which is exported
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.exportContactCsv(contactId, contactObjectName, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportContactCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Integer**| Id of the contact you want to export |
 **contactObjectName** | **String**| Model name which is exported |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportContactListCsv"></a>
# **exportContactListCsv**
> File exportContactListCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterDepth)

Export the contact list as csv

Calls contactListCsv() in Export.php to export the contact list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported contacts
Boolean sevQueryFilterDepth = true; // Boolean | Specify if companies and persons (true) or only persons (false) should be exported
try {
    File result = apiInstance.exportContactListCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterDepth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportContactListCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported contacts | [optional]
 **sevQueryFilterDepth** | **Boolean**| Specify if companies and persons (true) or only persons (false) should be exported | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportDatev"></a>
# **exportDatev**
> File exportDatev(scope, start, end, withEnshrined, enshrine, download)

Datev export as zip with csv´s

Calls datev() in Export.php to export the datev as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String scope = "scope_example"; // String | Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **'I'** (Invoices), **'V'** (Vouchers), **'D'** (Depreciations), **'T'** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: 'IVDT', 'IVT' ...
String start = "start_example"; // String | Specify the start date for the datev export
String end = "end_example"; // String | Specify the end date for the datev export
Boolean withEnshrined = true; // Boolean | Specify if you want to include enshrined models
Object enshrine = null; // Object | Specify if you want to enshrine all models which were included in the export
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.exportDatev(scope, start, end, withEnshrined, enshrine, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportDatev");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... |
 **start** | **String**| Specify the start date for the datev export |
 **end** | **String**| Specify the end date for the datev export |
 **withEnshrined** | **Boolean**| Specify if you want to include enshrined models |
 **enshrine** | [**Object**](.md)| Specify if you want to enshrine all models which were included in the export |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="exportDatevZip"></a>
# **exportDatevZip**
> File exportDatevZip(scope, start, end, withEnshrined, download)

Export zip for voucher upload

Calls datevZip() in Export.php to export the zip for voucher upload.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String scope = "scope_example"; // String | Define what you want to include in the zip export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **'I'** (Invoices), **'V'** (Vouchers), **'D'** (Depreciations), **'T'** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: 'IVDT', 'IVT' ...
String start = "start_example"; // String | Specify the start date for the zip export
String end = "end_example"; // String | Specify the end date for the zip export
Boolean withEnshrined = true; // Boolean | Specify if you want to include enshrined models
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.exportDatevZip(scope, start, end, withEnshrined, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportDatevZip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Define what you want to include in the zip export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... |
 **start** | **String**| Specify the start date for the zip export |
 **end** | **String**| Specify the end date for the zip export |
 **withEnshrined** | **Boolean**| Specify if you want to include enshrined models |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="exportInventoryPartLogList"></a>
# **exportInventoryPartLogList**
> File exportInventoryPartLogList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterPartId, sevQueryFilterPartObjectName)

Export the inventory part log as csv

Calls inventoryPartLogListCsv() in Export.php to export the inventory part log list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported part log
Integer sevQueryFilterPartId = 56; // Integer | Id of the part for which you want to export the part log
String sevQueryFilterPartObjectName = "sevQueryFilterPartObjectName_example"; // String | Object name of part
try {
    File result = apiInstance.exportInventoryPartLogList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterPartId, sevQueryFilterPartObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportInventoryPartLogList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported part log | [optional]
 **sevQueryFilterPartId** | **Integer**| Id of the part for which you want to export the part log | [optional]
 **sevQueryFilterPartObjectName** | **String**| Object name of part | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportInvoiceCsv"></a>
# **exportInvoiceCsv**
> File exportInvoiceCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit)

Export the invoice list as csv

Calls invoiceCsv() in Export.php to export the invoice list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported invoices
try {
    File result = apiInstance.exportInvoiceCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportInvoiceCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported invoices | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportInvoiceZip"></a>
# **exportInvoiceZip**
> File exportInvoiceZip(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit)

Export the invoice list as zip with csv´s

Calls invoiceZip() in Export.php to export the invoice list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported invoices
try {
    File result = apiInstance.exportInvoiceZip(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportInvoiceZip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported invoices | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="exportPartCsv"></a>
# **exportPartCsv**
> File exportPartCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit)

Export the parts as csv

Calls partCsv() in Export.php to export the parts as csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported part
try {
    File result = apiInstance.exportPartCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportPartCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported part | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportPebe"></a>
# **exportPebe**
> File exportPebe(scope, start, end, withEnshrined, enshrine, download)

Pebe export as zip with csv´s

Calls pebe() in Export.php to export the pebe zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String scope = "scope_example"; // String | Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **'I'** (Invoices), **'V'** (Vouchers), **'D'** (Depreciations), **'T'** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: 'IVDT', 'IVT' ...
String start = "start_example"; // String | Specify the start date for the pebe export
String end = "end_example"; // String | Specify the end date for the pebe export
Boolean withEnshrined = true; // Boolean | Specify if you want to include enshrined models
Object enshrine = null; // Object | Specify if you want to enshrine all models which were included in the export
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.exportPebe(scope, start, end, withEnshrined, enshrine, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportPebe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... |
 **start** | **String**| Specify the start date for the pebe export |
 **end** | **String**| Specify the end date for the pebe export |
 **withEnshrined** | **Boolean**| Specify if you want to include enshrined models |
 **enshrine** | [**Object**](.md)| Specify if you want to enshrine all models which were included in the export |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="exportTransactionsCsv"></a>
# **exportTransactionsCsv**
> File exportTransactionsCsv(sevQueryFilterRegister, sevQueryModelName, sevQueryObjectName, sevQueryOrderEntryDate, download, checkAccountId, checkAccountObjectName, sevQueryLimit)

Export the transactions as csv

Calls transactionsCsv() in Export.php to export the transactions as csv. Optionally you can provide a specific check account.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
Boolean sevQueryFilterRegister = true; // Boolean | Specifies if the register is included
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
String sevQueryOrderEntryDate = "sevQueryOrderEntryDate_example"; // String | Order in which you want to have the transactions listed
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer checkAccountId = 56; // Integer | Specify check account for which you want the transactions. Otherwise all transactions will be used
String checkAccountObjectName = "checkAccountObjectName_example"; // String | Check account model name
Integer sevQueryLimit = 56; // Integer | Limit exported transactions
try {
    File result = apiInstance.exportTransactionsCsv(sevQueryFilterRegister, sevQueryModelName, sevQueryObjectName, sevQueryOrderEntryDate, download, checkAccountId, checkAccountObjectName, sevQueryLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportTransactionsCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryFilterRegister** | **Boolean**| Specifies if the register is included |
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **sevQueryOrderEntryDate** | **String**| Order in which you want to have the transactions listed | [enum: desc, asc]
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **checkAccountId** | **Integer**| Specify check account for which you want the transactions. Otherwise all transactions will be used | [optional]
 **checkAccountObjectName** | **String**| Check account model name | [optional]
 **sevQueryLimit** | **Integer**| Limit exported transactions | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportVoucherListCsv"></a>
# **exportVoucherListCsv**
> File exportVoucherListCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterStartDate, sevQueryFilterVoucherType)

Export the voucher list as csv

Calls voucherListCsv() in Export.php to export the voucher list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported vouchers
String sevQueryFilterStartDate = "sevQueryFilterStartDate_example"; // String | Start date of the voucher list
String sevQueryFilterVoucherType = "sevQueryFilterVoucherType_example"; // String | Type of vouchers you want to export
try {
    File result = apiInstance.exportVoucherListCsv(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterStartDate, sevQueryFilterVoucherType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportVoucherListCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported vouchers | [optional]
 **sevQueryFilterStartDate** | **String**| Start date of the voucher list | [optional]
 **sevQueryFilterVoucherType** | **String**| Type of vouchers you want to export | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="exportVoucherZip"></a>
# **exportVoucherZip**
> File exportVoucherZip(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterStartDate, sevQueryFilterVoucherType)

Export the voucher list as zip with csv´s

Calls voucherZip() in Export.php to export the voucher list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportApi apiInstance = new ExportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported vouchers
String sevQueryFilterStartDate = "sevQueryFilterStartDate_example"; // String | Start date of the voucher list
String sevQueryFilterVoucherType = "sevQueryFilterVoucherType_example"; // String | Type of vouchers you want to export
try {
    File result = apiInstance.exportVoucherZip(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryFilterStartDate, sevQueryFilterVoucherType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportVoucherZip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported vouchers | [optional]
 **sevQueryFilterStartDate** | **String**| Start date of the voucher list | [optional]
 **sevQueryFilterVoucherType** | **String**| Type of vouchers you want to export | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip


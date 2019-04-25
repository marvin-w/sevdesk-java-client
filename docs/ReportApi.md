# ReportApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportContact**](ReportApi.md#reportContact) | **GET** /Report/contact | Export the contact
[**reportContactList**](ReportApi.md#reportContactList) | **GET** /Report/contactlist | Export the contact list
[**reportInventory**](ReportApi.md#reportInventory) | **GET** /Report/inventory | Export the inventory
[**reportInvoiceList**](ReportApi.md#reportInvoiceList) | **GET** /Report/invoicelist | Export the invoicelist
[**reportOrderList**](ReportApi.md#reportOrderList) | **GET** /Report/orderlist | Export the order list
[**reportProfitAndLoss**](ReportApi.md#reportProfitAndLoss) | **GET** /Report/profitAndLoss | Export the profit and loss
[**reportRegisterBook**](ReportApi.md#reportRegisterBook) | **GET** /Report/registerBook | Export the register book / cash report
[**reportVoucherList**](ReportApi.md#reportVoucherList) | **GET** /Report/voucherlist | Export the voucher list

<a name="reportContact"></a>
# **reportContact**
> File reportContact(download, contactId, contactObjectName)

Export the contact

Calls contact() in Report.php to export the contact.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer contactId = 56; // Integer | Id of contact which should be exported
String contactObjectName = "contactObjectName_example"; // String | Model name which is exported
try {
    File result = apiInstance.reportContact(download, contactId, contactObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **download** | **Boolean**| Specifies if the document is downloaded |
 **contactId** | **Integer**| Id of contact which should be exported |
 **contactObjectName** | **String**| Model name which is exported |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportContactList"></a>
# **reportContactList**
> File reportContactList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset)

Export the contact list

Calls contactlist() in Report.php to export the contact list.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported contacts
Integer sevQueryOffset = 56; // Integer | Set the index where the exported contacts start
try {
    File result = apiInstance.reportContactList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportContactList");
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
 **sevQueryOffset** | **Integer**| Set the index where the exported contacts start | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportInventory"></a>
# **reportInventory**
> File reportInventory(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset)

Export the inventory

Calls inventory() in Report.php to export the inventory.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported inventory entries
Integer sevQueryOffset = 56; // Integer | Set the index where the exported parts start
try {
    File result = apiInstance.reportInventory(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported inventory entries | [optional]
 **sevQueryOffset** | **Integer**| Set the index where the exported parts start | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportInvoiceList"></a>
# **reportInvoiceList**
> File reportInvoiceList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset)

Export the invoicelist

Calls invoicelist() in Report.php to export the invoices.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported invoices
Integer sevQueryOffset = 56; // Integer | Set the index where the exported invoices should start
try {
    File result = apiInstance.reportInvoiceList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportInvoiceList");
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
 **sevQueryOffset** | **Integer**| Set the index where the exported invoices should start | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportOrderList"></a>
# **reportOrderList**
> File reportOrderList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset)

Export the order list

Calls orderlist() in Report.php to export the orders.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported orders
Integer sevQueryOffset = 56; // Integer | Set the index where the exported orders should start
try {
    File result = apiInstance.reportOrderList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportOrderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported orders | [optional]
 **sevQueryOffset** | **Integer**| Set the index where the exported orders should start | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportProfitAndLoss"></a>
# **reportProfitAndLoss**
> File reportProfitAndLoss(startDate, endDate, taxRule, download)

Export the profit and loss

Calls profitAndLoss() in Report.php to export the profit and loss.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String startDate = "startDate_example"; // String | Start date of the profit and loss calculation
String endDate = "endDate_example"; // String | End date of the profit and loss calculation
Boolean taxRule = true; // Boolean | Specify if you want the net income method or the profit and loss
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.reportProfitAndLoss(startDate, endDate, taxRule, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportProfitAndLoss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Start date of the profit and loss calculation |
 **endDate** | **String**| End date of the profit and loss calculation |
 **taxRule** | **Boolean**| Specify if you want the net income method or the profit and loss |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportRegisterBook"></a>
# **reportRegisterBook**
> File reportRegisterBook(checkAccountId, checkAccountObjectName, startDate, endDate, download)

Export the register book / cash report

Calls registerBook() in Report.php to export the register book / cash report.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
Integer checkAccountId = 56; // Integer | Check account you want to export
String checkAccountObjectName = "checkAccountObjectName_example"; // String | Check account object name
String startDate = "startDate_example"; // String | Start date of the register book / cash report
String endDate = "endDate_example"; // String | End date of the register book / cash report
Boolean download = true; // Boolean | Specifies if the document is downloaded
try {
    File result = apiInstance.reportRegisterBook(checkAccountId, checkAccountObjectName, startDate, endDate, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportRegisterBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkAccountId** | **Integer**| Check account you want to export |
 **checkAccountObjectName** | **String**| Check account object name |
 **startDate** | **String**| Start date of the register book / cash report |
 **endDate** | **String**| End date of the register book / cash report |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="reportVoucherList"></a>
# **reportVoucherList**
> File reportVoucherList(sevQueryFilterStartDate, sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset)

Export the voucher list

Calls voucherlist() in Report.php to export the vouchers.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
String sevQueryFilterStartDate = "sevQueryFilterStartDate_example"; // String | Start date to filter vouchers with
String sevQueryModelName = "sevQueryModelName_example"; // String | Model name which is exported
String sevQueryObjectName = "sevQueryObjectName_example"; // String | SevQuery object name
Boolean download = true; // Boolean | Specifies if the document is downloaded
Integer sevQueryLimit = 56; // Integer | Limit exported vouchers
Integer sevQueryOffset = 56; // Integer | Set the index where the exported vouchers should start
try {
    File result = apiInstance.reportVoucherList(sevQueryFilterStartDate, sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportVoucherList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sevQueryFilterStartDate** | **String**| Start date to filter vouchers with |
 **sevQueryModelName** | **String**| Model name which is exported |
 **sevQueryObjectName** | **String**| SevQuery object name |
 **download** | **Boolean**| Specifies if the document is downloaded | [optional]
 **sevQueryLimit** | **Integer**| Limit exported vouchers | [optional]
 **sevQueryOffset** | **Integer**| Set the index where the exported vouchers should start | [optional]

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf


# CheckAccountTransactionApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCheckAccountTransaction**](CheckAccountTransactionApi.md#addCheckAccountTransaction) | **POST** /CheckAccountTransaction | Create a new check account transaction
[**checkAccountTransactionGetLog**](CheckAccountTransactionApi.md#checkAccountTransactionGetLog) | **GET** /CheckAccountTransaction/{id}/getLog | Get log of a specified check account transaction
[**checkAccountTransactionGetRemainingAmount**](CheckAccountTransactionApi.md#checkAccountTransactionGetRemainingAmount) | **GET** /CheckAccountTransaction/{id}/getRemainingAmount | Get invoice amount which is not assigned yet
[**deleteCheckAccountTransaction**](CheckAccountTransactionApi.md#deleteCheckAccountTransaction) | **DELETE** /CheckAccountTransaction/{id} | Delete an existing check account transaction
[**getCheckAccountTransactions**](CheckAccountTransactionApi.md#getCheckAccountTransactions) | **GET** /CheckAccountTransaction | Get an overview of all check account transactions
[**linkInvoiceToCheckAccountTransaction**](CheckAccountTransactionApi.md#linkInvoiceToCheckAccountTransaction) | **PUT** /CheckAccountTransaction/{id}/linkInvoice | link invoice to check account transaction
[**linkVoucherToCheckAccountTransaction**](CheckAccountTransactionApi.md#linkVoucherToCheckAccountTransaction) | **PUT** /CheckAccountTransaction/{id}/linkVoucher | link voucher to check account transaction
[**updateCheckAccountTransaction**](CheckAccountTransactionApi.md#updateCheckAccountTransaction) | **PUT** /CheckAccountTransaction/{id} | Update a existing check account transaction
[**updateCheckAccountTransactionStatus**](CheckAccountTransactionApi.md#updateCheckAccountTransactionStatus) | **PUT** /CheckAccountTransaction/{id}/changeStatus | Update status of a existing check account transaction

<a name="addCheckAccountTransaction"></a>
# **addCheckAccountTransaction**
> ModelCheckAccountTransaction addCheckAccountTransaction()

Create a new check account transaction

Calls CheckAccountTransaction.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
try {
    ModelCheckAccountTransaction result = apiInstance.addCheckAccountTransaction();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#addCheckAccountTransaction");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="checkAccountTransactionGetLog"></a>
# **checkAccountTransactionGetLog**
> ModelCheckAccountTransactionLog checkAccountTransactionGetLog(id, embed)

Get log of a specified check account transaction

Calls getLog() in CheckAccountTransaction.php to get the log of a specified check account transaction.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | Id of the check account transaction of which you want to get the log
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCheckAccountTransactionLog result = apiInstance.checkAccountTransactionGetLog(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#checkAccountTransactionGetLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the check account transaction of which you want to get the log |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCheckAccountTransactionLog**](ModelCheckAccountTransactionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="checkAccountTransactionGetRemainingAmount"></a>
# **checkAccountTransactionGetRemainingAmount**
> checkAccountTransactionGetRemainingAmount(id)

Get invoice amount which is not assigned yet

Calls getRemainingAmount() in CheckAccountTransaction.php to get invoice amount which is not assigned yet.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | Id of check account transaction you want to use
try {
    apiInstance.checkAccountTransactionGetRemainingAmount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#checkAccountTransactionGetRemainingAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of check account transaction you want to use |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCheckAccountTransaction"></a>
# **deleteCheckAccountTransaction**
> deleteCheckAccountTransaction(id)

Delete an existing check account transaction

Calls the delete() function in CheckAccountTransaction.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | id of check account transaction you want to delete
try {
    apiInstance.deleteCheckAccountTransaction(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#deleteCheckAccountTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of check account transaction you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCheckAccountTransactions"></a>
# **getCheckAccountTransactions**
> ModelCheckAccountTransaction getCheckAccountTransactions(limit, offset, embed)

Get an overview of all check account transactions

Calls CheckAccountTransaction.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned check account transactions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCheckAccountTransaction result = apiInstance.getCheckAccountTransactions(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#getCheckAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned check account transactions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="linkInvoiceToCheckAccountTransaction"></a>
# **linkInvoiceToCheckAccountTransaction**
> ModelCheckAccountTransaction linkInvoiceToCheckAccountTransaction(id)

link invoice to check account transaction

Calls linkInvoice() in CheckAccountTransaction.php.      This will update the specified invoice as well as the status of the check account transaction!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | id of check account transaction you want to update
try {
    ModelCheckAccountTransaction result = apiInstance.linkInvoiceToCheckAccountTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#linkInvoiceToCheckAccountTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of check account transaction you want to update |

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="linkVoucherToCheckAccountTransaction"></a>
# **linkVoucherToCheckAccountTransaction**
> ModelCheckAccountTransaction linkVoucherToCheckAccountTransaction(id)

link voucher to check account transaction

Calls linkVoucher() in CheckAccountTransaction.php.      This will update the specified voucher as well as the status of the check account transaction!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | id of check account transaction you want to update
try {
    ModelCheckAccountTransaction result = apiInstance.linkVoucherToCheckAccountTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#linkVoucherToCheckAccountTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of check account transaction you want to update |

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updateCheckAccountTransaction"></a>
# **updateCheckAccountTransaction**
> ModelCheckAccountTransaction updateCheckAccountTransaction(id)

Update a existing check account transaction

Calls CheckAccountTransaction.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | id of check account transaction you want to update
try {
    ModelCheckAccountTransaction result = apiInstance.updateCheckAccountTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#updateCheckAccountTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of check account transaction you want to update |

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updateCheckAccountTransactionStatus"></a>
# **updateCheckAccountTransactionStatus**
> ModelCheckAccountTransaction updateCheckAccountTransactionStatus(id)

Update status of a existing check account transaction

Calls changeStatus() in CheckAccountTransaction.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionApi apiInstance = new CheckAccountTransactionApi();
Integer id = 56; // Integer | id of check account transaction you want to update
try {
    ModelCheckAccountTransaction result = apiInstance.updateCheckAccountTransactionStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionApi#updateCheckAccountTransactionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of check account transaction you want to update |

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


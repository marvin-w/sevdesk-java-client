# InvoiceLogApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoiceLog**](InvoiceLogApi.md#addInvoiceLog) | **POST** /InvoiceLog | Create a new invoice log
[**deleteInvoiceLog**](InvoiceLogApi.md#deleteInvoiceLog) | **DELETE** /InvoiceLog/{id} | Delete an existing invoice log
[**getInvoiceLogs**](InvoiceLogApi.md#getInvoiceLogs) | **GET** /InvoiceLog | Get an overview of invoice logs
[**updateInvoiceLog**](InvoiceLogApi.md#updateInvoiceLog) | **PUT** /InvoiceLog/{id} | Update an existing invoice log

<a name="addInvoiceLog"></a>
# **addInvoiceLog**
> ModelInvoiceLog addInvoiceLog()

Create a new invoice log

Calls InvoiceLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceLogApi apiInstance = new InvoiceLogApi();
try {
    ModelInvoiceLog result = apiInstance.addInvoiceLog();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceLogApi#addInvoiceLog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoiceLog**](ModelInvoiceLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteInvoiceLog"></a>
# **deleteInvoiceLog**
> deleteInvoiceLog(id)

Delete an existing invoice log

Calls the delete() function in InvoiceLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceLogApi apiInstance = new InvoiceLogApi();
Integer id = 56; // Integer | Id of invoice log you want to delete
try {
    apiInstance.deleteInvoiceLog(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceLogApi#deleteInvoiceLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice log you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInvoiceLogs"></a>
# **getInvoiceLogs**
> ModelInvoiceLog getInvoiceLogs(limit, offset, embed)

Get an overview of invoice logs

Calls InvoiceLog.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceLogApi apiInstance = new InvoiceLogApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned invoice logs start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInvoiceLog result = apiInstance.getInvoiceLogs(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceLogApi#getInvoiceLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned invoice logs start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInvoiceLog**](ModelInvoiceLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateInvoiceLog"></a>
# **updateInvoiceLog**
> ModelInvoiceLog updateInvoiceLog(id)

Update an existing invoice log

Calls InvoiceLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceLogApi apiInstance = new InvoiceLogApi();
Integer id = 56; // Integer | Id of invoice log you want to update
try {
    ModelInvoiceLog result = apiInstance.updateInvoiceLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceLogApi#updateInvoiceLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice log you want to update |

### Return type

[**ModelInvoiceLog**](ModelInvoiceLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


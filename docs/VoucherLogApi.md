# VoucherLogApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVoucherLogEntry**](VoucherLogApi.md#addVoucherLogEntry) | **POST** /VoucherLog | Create a new voucher log entry
[**deleteVoucherLogEntry**](VoucherLogApi.md#deleteVoucherLogEntry) | **DELETE** /VoucherLog/{id} | Delete an existing voucher log entry
[**getVoucherLog**](VoucherLogApi.md#getVoucherLog) | **GET** /VoucherLog | Get an overview of all voucher log entries
[**updateVoucherLogEntry**](VoucherLogApi.md#updateVoucherLogEntry) | **PUT** /VoucherLog/{id} | Update an existing voucher log entry

<a name="addVoucherLogEntry"></a>
# **addVoucherLogEntry**
> ModelVoucherLog addVoucherLogEntry()

Create a new voucher log entry

Calls VoucherLog.php to create a voucher log entry

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherLogApi apiInstance = new VoucherLogApi();
try {
    ModelVoucherLog result = apiInstance.addVoucherLogEntry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherLogApi#addVoucherLogEntry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelVoucherLog**](ModelVoucherLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteVoucherLogEntry"></a>
# **deleteVoucherLogEntry**
> deleteVoucherLogEntry(id)

Delete an existing voucher log entry

Calls the delete() function in VoucherLog.php to delete a voucher log entry

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherLogApi apiInstance = new VoucherLogApi();
Integer id = 56; // Integer | Id of voucher log entry you want to delete
try {
    apiInstance.deleteVoucherLogEntry(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherLogApi#deleteVoucherLogEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of voucher log entry you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVoucherLog"></a>
# **getVoucherLog**
> ModelVoucherLog getVoucherLog(limit, offset, embed)

Get an overview of all voucher log entries

Calls VoucherLog.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherLogApi apiInstance = new VoucherLogApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned voucher log entries start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelVoucherLog result = apiInstance.getVoucherLog(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherLogApi#getVoucherLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned voucher log entries start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelVoucherLog**](ModelVoucherLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateVoucherLogEntry"></a>
# **updateVoucherLogEntry**
> ModelVoucherLog updateVoucherLogEntry(id)

Update an existing voucher log entry

Calls VoucherLog.php to update an existing voucher log entry

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherLogApi apiInstance = new VoucherLogApi();
Integer id = 56; // Integer | Id of the voucher log entry you want to update
try {
    ModelVoucherLog result = apiInstance.updateVoucherLogEntry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherLogApi#updateVoucherLogEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher log entry you want to update |

### Return type

[**ModelVoucherLog**](ModelVoucherLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


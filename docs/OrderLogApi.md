# OrderLogApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderLog**](OrderLogApi.md#addOrderLog) | **POST** /OrderLog | Create a new order log
[**deleteOrderLog**](OrderLogApi.md#deleteOrderLog) | **DELETE** /OrderLog/{id} | Delete an existing order log
[**getOrderLogs**](OrderLogApi.md#getOrderLogs) | **GET** /OrderLog | Get an overview of order logs
[**updateOrderLog**](OrderLogApi.md#updateOrderLog) | **PUT** /OrderLog/{id} | Update an existing order log

<a name="addOrderLog"></a>
# **addOrderLog**
> ModelOrderLog addOrderLog()

Create a new order log

Calls OrderLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLogApi apiInstance = new OrderLogApi();
try {
    ModelOrderLog result = apiInstance.addOrderLog();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLogApi#addOrderLog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelOrderLog**](ModelOrderLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteOrderLog"></a>
# **deleteOrderLog**
> deleteOrderLog(id)

Delete an existing order log

Calls the delete() function in OrderLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLogApi apiInstance = new OrderLogApi();
Integer id = 56; // Integer | Id of order log you want to delete
try {
    apiInstance.deleteOrderLog(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLogApi#deleteOrderLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order log you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrderLogs"></a>
# **getOrderLogs**
> ModelOrderLog getOrderLogs(limit, offset, embed)

Get an overview of order logs

Calls OrderLog.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLogApi apiInstance = new OrderLogApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned order logs start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelOrderLog result = apiInstance.getOrderLogs(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLogApi#getOrderLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned order logs start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelOrderLog**](ModelOrderLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateOrderLog"></a>
# **updateOrderLog**
> ModelOrderLog updateOrderLog(id)

Update an existing order log

Calls OrderLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLogApi apiInstance = new OrderLogApi();
Integer id = 56; // Integer | Id of order log you want to update
try {
    ModelOrderLog result = apiInstance.updateOrderLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLogApi#updateOrderLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order log you want to update |

### Return type

[**ModelOrderLog**](ModelOrderLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


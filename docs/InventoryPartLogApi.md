# InventoryPartLogApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInventoryPartLog**](InventoryPartLogApi.md#addInventoryPartLog) | **POST** /InventoryPartLog | Create a new inventory part log
[**deleteInventoryPartLog**](InventoryPartLogApi.md#deleteInventoryPartLog) | **DELETE** /InventoryPartLog/{id} | Delete an existing inventory part log
[**getInventoryPartLog**](InventoryPartLogApi.md#getInventoryPartLog) | **GET** /InventoryPartLog | Get an overview of InventoryPartLog
[**getInventoryPartLogStock**](InventoryPartLogApi.md#getInventoryPartLogStock) | **GET** /InventoryPartLog/{id}/getStock | Get stock of inventory part involved in part log
[**updateInventoryPartLog**](InventoryPartLogApi.md#updateInventoryPartLog) | **PUT** /InventoryPartLog/{id} | Update an existing inventory part log

<a name="addInventoryPartLog"></a>
# **addInventoryPartLog**
> ModelInventoryPartLog addInventoryPartLog()

Create a new inventory part log

Calls InventoryPartLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InventoryPartLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryPartLogApi apiInstance = new InventoryPartLogApi();
try {
    ModelInventoryPartLog result = apiInstance.addInventoryPartLog();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryPartLogApi#addInventoryPartLog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInventoryPartLog**](ModelInventoryPartLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteInventoryPartLog"></a>
# **deleteInventoryPartLog**
> deleteInventoryPartLog(id)

Delete an existing inventory part log

Calls the delete() function in InventoryPartLog.php    Be aware that this operations sets the stock of your part to the value it had before the acquisition/dispatch and deletes the corresponding feed!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InventoryPartLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryPartLogApi apiInstance = new InventoryPartLogApi();
Integer id = 56; // Integer | id of inventory part log you want to delete
try {
    apiInstance.deleteInventoryPartLog(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryPartLogApi#deleteInventoryPartLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of inventory part log you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInventoryPartLog"></a>
# **getInventoryPartLog**
> ModelInventoryPartLog getInventoryPartLog(limit, offset, embed)

Get an overview of InventoryPartLog

Calls InventoryPartLog.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InventoryPartLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryPartLogApi apiInstance = new InventoryPartLogApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned part logs start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInventoryPartLog result = apiInstance.getInventoryPartLog(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryPartLogApi#getInventoryPartLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned part logs start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInventoryPartLog**](ModelInventoryPartLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInventoryPartLogStock"></a>
# **getInventoryPartLogStock**
> getInventoryPartLogStock(id)

Get stock of inventory part involved in part log

Calls getStock() in InventoryPartLog.php to get the stock of the part involved in the part log

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InventoryPartLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryPartLogApi apiInstance = new InventoryPartLogApi();
Integer id = 56; // Integer | Id of inventory part log you want to get the stock from
try {
    apiInstance.getInventoryPartLogStock(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryPartLogApi#getInventoryPartLogStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of inventory part log you want to get the stock from |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateInventoryPartLog"></a>
# **updateInventoryPartLog**
> ModelInventoryPartLog updateInventoryPartLog(id)

Update an existing inventory part log

Calls InventoryPartLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InventoryPartLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryPartLogApi apiInstance = new InventoryPartLogApi();
Integer id = 56; // Integer | id of inventory part log you want to update
try {
    ModelInventoryPartLog result = apiInstance.updateInventoryPartLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryPartLogApi#updateInventoryPartLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of inventory part log you want to update |

### Return type

[**ModelInventoryPartLog**](ModelInventoryPartLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


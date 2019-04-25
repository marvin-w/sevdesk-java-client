# CheckAccountTransactionLogApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCheckAccountTransactionLog**](CheckAccountTransactionLogApi.md#addCheckAccountTransactionLog) | **POST** /CheckAccountTransactionLog | Create a new logged check account transaction
[**deleteCheckAccountTransactionLog**](CheckAccountTransactionLogApi.md#deleteCheckAccountTransactionLog) | **DELETE** /CheckAccountTransactionLog/{id} | Delete an existing logged check account transaction
[**getCheckAccountTransactionLog**](CheckAccountTransactionLogApi.md#getCheckAccountTransactionLog) | **GET** /CheckAccountTransactionLog | Get an overview of all check account transactions which were logged
[**updateCheckAccountTransactionLog**](CheckAccountTransactionLogApi.md#updateCheckAccountTransactionLog) | **PUT** /CheckAccountTransactionLog/{id} | Update a existing logged check account transaction

<a name="addCheckAccountTransactionLog"></a>
# **addCheckAccountTransactionLog**
> ModelCheckAccountTransactionLog addCheckAccountTransactionLog()

Create a new logged check account transaction

Calls CheckAccountTransactionLog.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionLogApi apiInstance = new CheckAccountTransactionLogApi();
try {
    ModelCheckAccountTransactionLog result = apiInstance.addCheckAccountTransactionLog();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionLogApi#addCheckAccountTransactionLog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCheckAccountTransactionLog**](ModelCheckAccountTransactionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteCheckAccountTransactionLog"></a>
# **deleteCheckAccountTransactionLog**
> deleteCheckAccountTransactionLog(id)

Delete an existing logged check account transaction

Calls the delete() function in CheckAccountTransactionLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionLogApi apiInstance = new CheckAccountTransactionLogApi();
Integer id = 56; // Integer | id of logged check account transaction you want to delete
try {
    apiInstance.deleteCheckAccountTransactionLog(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionLogApi#deleteCheckAccountTransactionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of logged check account transaction you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCheckAccountTransactionLog"></a>
# **getCheckAccountTransactionLog**
> ModelCheckAccountTransactionLog getCheckAccountTransactionLog(limit, offset, embed)

Get an overview of all check account transactions which were logged

Calls CheckAccountTransactionLog.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionLogApi apiInstance = new CheckAccountTransactionLogApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned logged check account transactions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCheckAccountTransactionLog result = apiInstance.getCheckAccountTransactionLog(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionLogApi#getCheckAccountTransactionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned logged check account transactions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCheckAccountTransactionLog**](ModelCheckAccountTransactionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCheckAccountTransactionLog"></a>
# **updateCheckAccountTransactionLog**
> ModelCheckAccountTransactionLog updateCheckAccountTransactionLog(id)

Update a existing logged check account transaction

Calls CheckAccountTransactionLog.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountTransactionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountTransactionLogApi apiInstance = new CheckAccountTransactionLogApi();
Integer id = 56; // Integer | id of logged check account transaction you want to update
try {
    ModelCheckAccountTransactionLog result = apiInstance.updateCheckAccountTransactionLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountTransactionLogApi#updateCheckAccountTransactionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of logged check account transaction you want to update |

### Return type

[**ModelCheckAccountTransactionLog**](ModelCheckAccountTransactionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


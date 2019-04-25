# TaskApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTask**](TaskApi.md#addTask) | **POST** /Task | Create a new task
[**deleteTask**](TaskApi.md#deleteTask) | **DELETE** /Task/{id} | Delete an existing task
[**getTasks**](TaskApi.md#getTasks) | **GET** /Task | Get an overview of all tasks
[**updateTask**](TaskApi.md#updateTask) | **PUT** /Task/{id} | Update an existing Task

<a name="addTask"></a>
# **addTask**
> ModelOrderPos addTask()

Create a new task

Calls Task.php to add a task

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
try {
    ModelOrderPos result = apiInstance.addTask();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#addTask");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelOrderPos**](ModelOrderPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteTask"></a>
# **deleteTask**
> deleteTask(id)

Delete an existing task

TODO: Write backend documentation

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
Integer id = 56; // Integer | id of the task you want to delete
try {
    apiInstance.deleteTask(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#deleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the task you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTasks"></a>
# **getTasks**
> ModelTask getTasks(limit, offset, embed)

Get an overview of all tasks

Calls Task.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned tasks start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelTask result = apiInstance.getTasks(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned tasks start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelTask**](ModelTask.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateTask"></a>
# **updateTask**
> ModelTask updateTask(id)

Update an existing Task

TODO: Enter short backend documentation here

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
Integer id = 56; // Integer | id of task you want to update
try {
    ModelTask result = apiInstance.updateTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of task you want to update |

### Return type

[**ModelTask**](ModelTask.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


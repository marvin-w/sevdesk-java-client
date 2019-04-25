# EntryTypeApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEntryType**](EntryTypeApi.md#addEntryType) | **POST** /EntryType | Create a new entry type
[**deleteEntryType**](EntryTypeApi.md#deleteEntryType) | **DELETE** /EntryType/{id} | Delete an existing entry type
[**entryTypeDeleteReferencedObjects**](EntryTypeApi.md#entryTypeDeleteReferencedObjects) | **DELETE** /EntryType/{id}/deleteReferencedObjects | Delete all objects bound to the specified entry type
[**getEntryTypes**](EntryTypeApi.md#getEntryTypes) | **GET** /EntryType | Get an overview of all entry types
[**updateEntryType**](EntryTypeApi.md#updateEntryType) | **PUT** /EntryType/{id} | Update an existing entry type

<a name="addEntryType"></a>
# **addEntryType**
> ModelEntryType addEntryType()

Create a new entry type

Calls EntryType.php to create an entry type

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.EntryTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryTypeApi apiInstance = new EntryTypeApi();
try {
    ModelEntryType result = apiInstance.addEntryType();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryTypeApi#addEntryType");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelEntryType**](ModelEntryType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteEntryType"></a>
# **deleteEntryType**
> deleteEntryType(id)

Delete an existing entry type

Calls EntryType.php to delete an entry type

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.EntryTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryTypeApi apiInstance = new EntryTypeApi();
Integer id = 56; // Integer | id of entry type you want to delete
try {
    apiInstance.deleteEntryType(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryTypeApi#deleteEntryType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of entry type you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="entryTypeDeleteReferencedObjects"></a>
# **entryTypeDeleteReferencedObjects**
> entryTypeDeleteReferencedObjects(id)

Delete all objects bound to the specified entry type

Tries to delete all objects bound to the specified entry type if they are not in use

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.EntryTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryTypeApi apiInstance = new EntryTypeApi();
Integer id = 56; // Integer | Id of entry type you want to use
try {
    apiInstance.entryTypeDeleteReferencedObjects(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryTypeApi#entryTypeDeleteReferencedObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of entry type you want to use |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEntryTypes"></a>
# **getEntryTypes**
> ModelEntryType getEntryTypes(limit, offset)

Get an overview of all entry types

Calls EntryType.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.EntryTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryTypeApi apiInstance = new EntryTypeApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned entry types start. Default is 0
try {
    ModelEntryType result = apiInstance.getEntryTypes(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryTypeApi#getEntryTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned entry types start. Default is 0 | [optional]

### Return type

[**ModelEntryType**](ModelEntryType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateEntryType"></a>
# **updateEntryType**
> ModelEntryType updateEntryType(id)

Update an existing entry type

Calls EntryType.php to update an entry type

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.EntryTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryTypeApi apiInstance = new EntryTypeApi();
Integer id = 56; // Integer | id of entry type you want to update
try {
    ModelEntryType result = apiInstance.updateEntryType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryTypeApi#updateEntryType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of entry type you want to update |

### Return type

[**ModelEntryType**](ModelEntryType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


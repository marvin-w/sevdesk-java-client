# CategoryApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCategory**](CategoryApi.md#addCategory) | **POST** /Category | Create a new category
[**deleteCategory**](CategoryApi.md#deleteCategory) | **DELETE** /Category/{id} | Delete an existing category
[**getCategories**](CategoryApi.md#getCategories) | **GET** /Category | Get an overview of all categories
[**updateCategory**](CategoryApi.md#updateCategory) | **PUT** /Category/{id} | Update a existing category

<a name="addCategory"></a>
# **addCategory**
> ModelCategory addCategory()

Create a new category

Calls Category.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CategoryApi apiInstance = new CategoryApi();
try {
    ModelCategory result = apiInstance.addCategory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#addCategory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCategory**](ModelCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(id)

Delete an existing category

Calls the delete() function in Category.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CategoryApi apiInstance = new CategoryApi();
Integer id = 56; // Integer | id of category you want to delete
try {
    apiInstance.deleteCategory(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#deleteCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of category you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCategories"></a>
# **getCategories**
> ModelCategory getCategories(limit, offset)

Get an overview of all categories

Calls Category.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CategoryApi apiInstance = new CategoryApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned categories start. Default is 0
try {
    ModelCategory result = apiInstance.getCategories(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned categories start. Default is 0 | [optional]

### Return type

[**ModelCategory**](ModelCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCategory"></a>
# **updateCategory**
> ModelCategory updateCategory(id)

Update a existing category

Calls Category.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CategoryApi apiInstance = new CategoryApi();
Integer id = 56; // Integer | id of category you want to update
try {
    ModelCategory result = apiInstance.updateCategory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#updateCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of category you want to update |

### Return type

[**ModelCategory**](ModelCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


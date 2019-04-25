# TagRelationApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTagRelation**](TagRelationApi.md#addTagRelation) | **POST** /TagRelation | Create a new tag relation
[**deleteTagRelation**](TagRelationApi.md#deleteTagRelation) | **DELETE** /TagRelation/{id} | Delete an existing tag relation
[**getTagRelations**](TagRelationApi.md#getTagRelations) | **GET** /TagRelation | Get an overview of all tag relations
[**updateTagRelation**](TagRelationApi.md#updateTagRelation) | **PUT** /TagRelation/{id} | Update an existing tag relation

<a name="addTagRelation"></a>
# **addTagRelation**
> ModelTagRelation addTagRelation()

Create a new tag relation

Calls TagRelation.php to create a new tag

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TagRelationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagRelationApi apiInstance = new TagRelationApi();
try {
    ModelTagRelation result = apiInstance.addTagRelation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRelationApi#addTagRelation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelTagRelation**](ModelTagRelation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteTagRelation"></a>
# **deleteTagRelation**
> deleteTagRelation(id)

Delete an existing tag relation

Calls the delete() function in TagRelation.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TagRelationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagRelationApi apiInstance = new TagRelationApi();
Integer id = 56; // Integer | Id of tag relation you want to delete
try {
    apiInstance.deleteTagRelation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRelationApi#deleteTagRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of tag relation you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTagRelations"></a>
# **getTagRelations**
> ModelTagRelation getTagRelations(limit, offset, embed)

Get an overview of all tag relations

Calls TagRelation.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TagRelationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagRelationApi apiInstance = new TagRelationApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned tag relations start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelTagRelation result = apiInstance.getTagRelations(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRelationApi#getTagRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned tag relations start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelTagRelation**](ModelTagRelation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateTagRelation"></a>
# **updateTagRelation**
> ModelTagRelation updateTagRelation(id)

Update an existing tag relation

Calls TagRelation.php to update an existing tag

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TagRelationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagRelationApi apiInstance = new TagRelationApi();
Integer id = 56; // Integer | Id of tag relation you want to update
try {
    ModelTagRelation result = apiInstance.updateTagRelation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRelationApi#updateTagRelation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of tag relation you want to update |

### Return type

[**ModelTagRelation**](ModelTagRelation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


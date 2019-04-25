# PartUnityApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartUnity**](PartUnityApi.md#addPartUnity) | **POST** /PartUnity | Create a new part unity
[**deletePartUnity**](PartUnityApi.md#deletePartUnity) | **DELETE** /PartUnity/{id} | Delete an existing part unity
[**getPartUnities**](PartUnityApi.md#getPartUnities) | **GET** /PartUnity | Get an overview of all part unities
[**updatePartUnity**](PartUnityApi.md#updatePartUnity) | **PUT** /PartUnity/{id} | Update an existing part unity

<a name="addPartUnity"></a>
# **addPartUnity**
> ModelPartUnity addPartUnity()

Create a new part unity

Calls PartUnity.php to add a part unity

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartUnityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartUnityApi apiInstance = new PartUnityApi();
try {
    ModelPartUnity result = apiInstance.addPartUnity();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartUnityApi#addPartUnity");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelPartUnity**](ModelPartUnity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deletePartUnity"></a>
# **deletePartUnity**
> deletePartUnity(id)

Delete an existing part unity

Calls PartUnity.php to delete a part unity

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartUnityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartUnityApi apiInstance = new PartUnityApi();
Integer id = 56; // Integer | id of the part unity you want to delete
try {
    apiInstance.deletePartUnity(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PartUnityApi#deletePartUnity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the part unity you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPartUnities"></a>
# **getPartUnities**
> ModelPartUnity getPartUnities(limit, offset, embed)

Get an overview of all part unities

Calls PartUnity.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartUnityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartUnityApi apiInstance = new PartUnityApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned part unities start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelPartUnity result = apiInstance.getPartUnities(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartUnityApi#getPartUnities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned part unities start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelPartUnity**](ModelPartUnity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updatePartUnity"></a>
# **updatePartUnity**
> ModelPartUnity updatePartUnity(id)

Update an existing part unity

Calls PartUnity.php to update a part unity

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartUnityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartUnityApi apiInstance = new PartUnityApi();
Integer id = 56; // Integer | id of part unity you want to update
try {
    ModelPartUnity result = apiInstance.updatePartUnity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartUnityApi#updatePartUnity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of part unity you want to update |

### Return type

[**ModelPartUnity**](ModelPartUnity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


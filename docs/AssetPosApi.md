# AssetPosApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAssetPos**](AssetPosApi.md#addAssetPos) | **POST** /AssetPos | Create a new asset position
[**deleteAssetPosition**](AssetPosApi.md#deleteAssetPosition) | **DELETE** /AssetPos/{id} | Delete an existing asset position
[**getAssetPositions**](AssetPosApi.md#getAssetPositions) | **GET** /AssetPos | Get an overview of all asset positions
[**updateAssetPosition**](AssetPosApi.md#updateAssetPosition) | **PUT** /AssetPos/{id} | Update an existing asset position

<a name="addAssetPos"></a>
# **addAssetPos**
> ModelAssetPos addAssetPos()

Create a new asset position

Calls AssetPos.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetPosApi apiInstance = new AssetPosApi();
try {
    ModelAssetPos result = apiInstance.addAssetPos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetPosApi#addAssetPos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAssetPos**](ModelAssetPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAssetPosition"></a>
# **deleteAssetPosition**
> deleteAssetPosition(id)

Delete an existing asset position

Calls the delete() function in AssetPos.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetPosApi apiInstance = new AssetPosApi();
Integer id = 56; // Integer | id of asset position you want to delete
try {
    apiInstance.deleteAssetPosition(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetPosApi#deleteAssetPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of asset position you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAssetPositions"></a>
# **getAssetPositions**
> ModelAssetPos getAssetPositions(limit, offset, embed)

Get an overview of all asset positions

Calls AssetPos.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetPosApi apiInstance = new AssetPosApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned assets start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAssetPos result = apiInstance.getAssetPositions(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetPosApi#getAssetPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned assets start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAssetPos**](ModelAssetPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAssetPosition"></a>
# **updateAssetPosition**
> ModelAssetPos updateAssetPosition(id)

Update an existing asset position

Calls AssetPos.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetPosApi apiInstance = new AssetPosApi();
Integer id = 56; // Integer | id of asset position you want to update
try {
    ModelAssetPos result = apiInstance.updateAssetPosition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetPosApi#updateAssetPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of asset position you want to update |

### Return type

[**ModelAssetPos**](ModelAssetPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


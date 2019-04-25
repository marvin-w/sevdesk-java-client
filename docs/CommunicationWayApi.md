# CommunicationWayApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommunicationWay**](CommunicationWayApi.md#addCommunicationWay) | **POST** /CommunicationWay | Create a new communication way
[**deleteCommunicationWay**](CommunicationWayApi.md#deleteCommunicationWay) | **DELETE** /CommunicationWay/{id} | Delete an existing communication way
[**getCommunicationWays**](CommunicationWayApi.md#getCommunicationWays) | **GET** /CommunicationWay | Get an overview of all communication ways
[**updateCommunicationWay**](CommunicationWayApi.md#updateCommunicationWay) | **PUT** /CommunicationWay/{id} | Update a existing communication way

<a name="addCommunicationWay"></a>
# **addCommunicationWay**
> ModelCommunicationWay addCommunicationWay()

Create a new communication way

Calls CommunicationWay.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CommunicationWayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommunicationWayApi apiInstance = new CommunicationWayApi();
try {
    ModelCommunicationWay result = apiInstance.addCommunicationWay();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunicationWayApi#addCommunicationWay");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteCommunicationWay"></a>
# **deleteCommunicationWay**
> deleteCommunicationWay(id)

Delete an existing communication way

Calls CommunicationWay.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CommunicationWayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommunicationWayApi apiInstance = new CommunicationWayApi();
Integer id = 56; // Integer | id of communication way you want to delete
try {
    apiInstance.deleteCommunicationWay(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunicationWayApi#deleteCommunicationWay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of communication way you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCommunicationWays"></a>
# **getCommunicationWays**
> ModelCommunicationWay getCommunicationWays(limit, offset, embed)

Get an overview of all communication ways

Calls CommunicationWay.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CommunicationWayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommunicationWayApi apiInstance = new CommunicationWayApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned communication ways start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCommunicationWay result = apiInstance.getCommunicationWays(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunicationWayApi#getCommunicationWays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned communication ways start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCommunicationWay"></a>
# **updateCommunicationWay**
> ModelCommunicationWay updateCommunicationWay(id)

Update a existing communication way

Calls CommunicationWay.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CommunicationWayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommunicationWayApi apiInstance = new CommunicationWayApi();
Integer id = 56; // Integer | id of communication way you want to update
try {
    ModelCommunicationWay result = apiInstance.updateCommunicationWay(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunicationWayApi#updateCommunicationWay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of communication way you want to update |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


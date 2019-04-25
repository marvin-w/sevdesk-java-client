# OrderPosApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderPos**](OrderPosApi.md#addOrderPos) | **POST** /OrderPos | Create a new order position
[**deleteOrderPos**](OrderPosApi.md#deleteOrderPos) | **DELETE** /OrderPos/{id} | Delete an existing order position
[**getOrderPositions**](OrderPosApi.md#getOrderPositions) | **GET** /OrderPos | Get an overview of all order positions
[**updateOrderPos**](OrderPosApi.md#updateOrderPos) | **PUT** /OrderPos/{id} | Update an existing order position

<a name="addOrderPos"></a>
# **addOrderPos**
> ModelOrderPos addOrderPos()

Create a new order position

Calls OrderPos.php.     As described in the Model_Order earlier, some of its parameters get their value from other models/functions.     OrderPos is one of those Models and provides the ability to add products/parts to your order which fills values like sumNet,taxation, etc.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderPosApi apiInstance = new OrderPosApi();
try {
    ModelOrderPos result = apiInstance.addOrderPos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderPosApi#addOrderPos");
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

<a name="deleteOrderPos"></a>
# **deleteOrderPos**
> deleteOrderPos(id)

Delete an existing order position

Calls the delete() function in OrderPos.php. This does NOT delete an order, just the position which belonged to the order!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderPosApi apiInstance = new OrderPosApi();
Integer id = 56; // Integer | id of order position you want to delete
try {
    apiInstance.deleteOrderPos(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderPosApi#deleteOrderPos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of order position you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrderPositions"></a>
# **getOrderPositions**
> ModelOrderPos getOrderPositions(limit, offset, embed)

Get an overview of all order positions

Calls OrderPos.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderPosApi apiInstance = new OrderPosApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned order positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelOrderPos result = apiInstance.getOrderPositions(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderPosApi#getOrderPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned order positions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelOrderPos**](ModelOrderPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateOrderPos"></a>
# **updateOrderPos**
> ModelOrderPos updateOrderPos(id)

Update an existing order position

TODO: Enter short backend documentation here

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderPosApi apiInstance = new OrderPosApi();
Integer id = 56; // Integer | id of order position you want to update
try {
    ModelOrderPos result = apiInstance.updateOrderPos(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderPosApi#updateOrderPos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of order position you want to update |

### Return type

[**ModelOrderPos**](ModelOrderPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


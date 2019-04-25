# PartContactPriceApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartContactPrice**](PartContactPriceApi.md#addPartContactPrice) | **POST** /PartContactPrice | Create a new part contact price
[**deletePartContactPrice**](PartContactPriceApi.md#deletePartContactPrice) | **DELETE** /PartContactPrice/{id} | Delete an existing part contact price
[**getPartContactPrices**](PartContactPriceApi.md#getPartContactPrices) | **GET** /PartContactPrice | Get an overview of all part contact prices
[**updatePartContactPrice**](PartContactPriceApi.md#updatePartContactPrice) | **PUT** /PartContactPrice/{id} | Update an existing part contact price

<a name="addPartContactPrice"></a>
# **addPartContactPrice**
> ModelPartContactPrice addPartContactPrice()

Create a new part contact price

Calls PartContactPrice.php to add a part contact price

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartContactPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartContactPriceApi apiInstance = new PartContactPriceApi();
try {
    ModelPartContactPrice result = apiInstance.addPartContactPrice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartContactPriceApi#addPartContactPrice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelPartContactPrice**](ModelPartContactPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deletePartContactPrice"></a>
# **deletePartContactPrice**
> deletePartContactPrice(id)

Delete an existing part contact price

Calls PartContactPrice.php to delete a part contact price

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartContactPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartContactPriceApi apiInstance = new PartContactPriceApi();
Integer id = 56; // Integer | id of the part contact price you want to delete
try {
    apiInstance.deletePartContactPrice(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PartContactPriceApi#deletePartContactPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the part contact price you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPartContactPrices"></a>
# **getPartContactPrices**
> ModelPartContactPrice getPartContactPrices(limit, offset, embed)

Get an overview of all part contact prices

Calls PartContactPrice.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartContactPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartContactPriceApi apiInstance = new PartContactPriceApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned part contact prices start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelPartContactPrice result = apiInstance.getPartContactPrices(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartContactPriceApi#getPartContactPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned part contact prices start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelPartContactPrice**](ModelPartContactPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updatePartContactPrice"></a>
# **updatePartContactPrice**
> ModelPartContactPrice updatePartContactPrice(id)

Update an existing part contact price

Calls PartContactPrice.php to update a part contact price

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartContactPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartContactPriceApi apiInstance = new PartContactPriceApi();
Integer id = 56; // Integer | id of part contact price you want to update
try {
    ModelPartContactPrice result = apiInstance.updatePartContactPrice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartContactPriceApi#updatePartContactPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of part contact price you want to update |

### Return type

[**ModelPartContactPrice**](ModelPartContactPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


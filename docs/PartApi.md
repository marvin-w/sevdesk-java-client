# PartApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPart**](PartApi.md#addPart) | **POST** /Part | Create a new part
[**bookPart**](PartApi.md#bookPart) | **PUT** /Part/{id}/book | add / remove parts from the stock
[**deletePart**](PartApi.md#deletePart) | **DELETE** /Part/{id} | Delete an existing part
[**duplicatePart**](PartApi.md#duplicatePart) | **POST** /Part/{id}/duplicate | Duplicate an existing part
[**getParts**](PartApi.md#getParts) | **GET** /Part | Get an overview of all parts
[**partGetLastLog**](PartApi.md#partGetLastLog) | **GET** /Part/{id}/getLastLog | Get last log about the part
[**partGetPrice**](PartApi.md#partGetPrice) | **GET** /Part/{id}/getPrice | Get price of a specified part
[**partGetStock**](PartApi.md#partGetStock) | **GET** /Part/{id}/getStock | Get stock of the part
[**partGetStockBefore**](PartApi.md#partGetStockBefore) | **GET** /Part/{id}/getStockBefore | Get stock difference of the part before a specified date
[**updatePart**](PartApi.md#updatePart) | **PUT** /Part/{id} | Update an existing part

<a name="addPart"></a>
# **addPart**
> ModelPart addPart()

Create a new part

Calls Part.php to add a part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
try {
    ModelPart result = apiInstance.addPart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#addPart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelPart**](ModelPart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="bookPart"></a>
# **bookPart**
> ModelPart bookPart(id)

add / remove parts from the stock

Calls book() in Part.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | id of part of which you want to update the stock
try {
    ModelPart result = apiInstance.bookPart(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#bookPart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of part of which you want to update the stock |

### Return type

[**ModelPart**](ModelPart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deletePart"></a>
# **deletePart**
> deletePart(id)

Delete an existing part

Calls the delete() function in Part.php. Be aware that you can&#x27;t delete parts which are used somewhere!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | id of the part you want to delete
try {
    apiInstance.deletePart(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#deletePart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the part you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="duplicatePart"></a>
# **duplicatePart**
> ModelPart duplicatePart(id)

Duplicate an existing part

Calls duplicate() in Part.php to duplicate the specified part. Mind that the stock will be zero

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | Id of the part which you want to duplicate
try {
    ModelPart result = apiInstance.duplicatePart(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#duplicatePart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the part which you want to duplicate |

### Return type

[**ModelPart**](ModelPart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getParts"></a>
# **getParts**
> ModelPart getParts(limit, offset, embed)

Get an overview of all parts

Calls Part.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned parts start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelPart result = apiInstance.getParts(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#getParts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned parts start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelPart**](ModelPart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="partGetLastLog"></a>
# **partGetLastLog**
> ModelInventoryPartLog partGetLastLog(id, maxDate, embed)

Get last log about the part

Calls getLastLog() in Part.php to get the last log about the specified part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | Id of the part of which you want to get the last log
String maxDate = "maxDate_example"; // String | Sets the maximal date if required
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInventoryPartLog result = apiInstance.partGetLastLog(id, maxDate, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#partGetLastLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the part of which you want to get the last log |
 **maxDate** | **String**| Sets the maximal date if required | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInventoryPartLog**](ModelInventoryPartLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="partGetPrice"></a>
# **partGetPrice**
> partGetPrice(id, contactId, contactObjectName, partUnityId, partUnityObjectName)

Get price of a specified part

Calls getPrice() in Part.php to get the price of the specified part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | Id of the part of which you want to get the price
Integer contactId = 56; // Integer | Enter valid contact id here for getting a part contact price
String contactObjectName = "contactObjectName_example"; // String | Enter 'Contact' here for getting a part contact price
Integer partUnityId = 56; // Integer | Enter a valid part unity id here for getting a part unity price
String partUnityObjectName = "partUnityObjectName_example"; // String | Enter 'PartUnity' here for getting a part unity price
try {
    apiInstance.partGetPrice(id, contactId, contactObjectName, partUnityId, partUnityObjectName);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#partGetPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the part of which you want to get the price |
 **contactId** | **Integer**| Enter valid contact id here for getting a part contact price | [optional]
 **contactObjectName** | **String**| Enter &#x27;Contact&#x27; here for getting a part contact price | [optional]
 **partUnityId** | **Integer**| Enter a valid part unity id here for getting a part unity price | [optional]
 **partUnityObjectName** | **String**| Enter &#x27;PartUnity&#x27; here for getting a part unity price | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="partGetStock"></a>
# **partGetStock**
> partGetStock(id, maxDate)

Get stock of the part

Calls getStock() in Part.php to get the stock of the specified part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | Id of the part of which you want to get stock
String maxDate = "maxDate_example"; // String | Sets the maximal date if required. The function will return the stock of the part at the specified date!
try {
    apiInstance.partGetStock(id, maxDate);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#partGetStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the part of which you want to get stock |
 **maxDate** | **String**| Sets the maximal date if required. The function will return the stock of the part at the specified date! | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="partGetStockBefore"></a>
# **partGetStockBefore**
> partGetStockBefore(id, date)

Get stock difference of the part before a specified date

Calls getStockBefore() in Part.php to get the stock difference of the specified part before the specified date

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | Id of the part of which you want to get the stock difference
String date = "date_example"; // String | You will get the stock difference before this specified date, otherwise the current date will be used
try {
    apiInstance.partGetStockBefore(id, date);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#partGetStockBefore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the part of which you want to get the stock difference |
 **date** | **String**| You will get the stock difference before this specified date, otherwise the current date will be used | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePart"></a>
# **updatePart**
> ModelPart updatePart(id)

Update an existing part

Calls PartContactPrice to update a part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartApi apiInstance = new PartApi();
Integer id = 56; // Integer | id of part you want to update
try {
    ModelPart result = apiInstance.updatePart(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartApi#updatePart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of part you want to update |

### Return type

[**ModelPart**](ModelPart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


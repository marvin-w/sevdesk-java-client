# OrderApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrder**](OrderApi.md#addOrder) | **POST** /Order | Create a new order
[**copyOrder**](OrderApi.md#copyOrder) | **POST** /Order/{id}/copy | Copy an existing order
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /Order/{id} | Delete an existing order
[**duplicateOrder**](OrderApi.md#duplicateOrder) | **POST** /Order/{id}/duplicate | Duplicate an existing order
[**getNextOrderNumber**](OrderApi.md#getNextOrderNumber) | **GET** /Order/Factory/getNextOrderNumber | Get the next order number
[**getOrderDiscounts**](OrderApi.md#getOrderDiscounts) | **GET** /Order/{id}/getDiscounts | Get all order discounts
[**getOrders**](OrderApi.md#getOrders) | **GET** /Order | Get an overview of all orders
[**orderChangeStatus**](OrderApi.md#orderChangeStatus) | **PUT** /Order/{id}/changeStatus | Update status of an existing order
[**orderGetChargeableInformation**](OrderApi.md#orderGetChargeableInformation) | **GET** /Order/{id}/getChargeableInformation | Get sum charged already, total net, gross and tax amount and tax rate
[**orderGetChargeableSums**](OrderApi.md#orderGetChargeableSums) | **GET** /Order/{id}/getChargeableSums | Get total net, gross and tax amount of order
[**orderGetMainOrderByLogs**](OrderApi.md#orderGetMainOrderByLogs) | **GET** /Order/{id}/getMainOrderByLogs | Get main order by checking if there are existing order logs of the specified order
[**orderGetPdf**](OrderApi.md#orderGetPdf) | **GET** /Order/{id}/getPdf | Get the order as a pdf
[**orderGetPositions**](OrderApi.md#orderGetPositions) | **GET** /Order/{id}/getPositions | Get all order positions
[**orderGetRelatedObjects**](OrderApi.md#orderGetRelatedObjects) | **GET** /Order/{id}/getRelatedObjects | Get related objects of a specified order
[**orderGetTags**](OrderApi.md#orderGetTags) | **GET** /Order/{id}/getTags | Get tags of the specified order
[**orderGetTax**](OrderApi.md#orderGetTax) | **GET** /Order/{id}/getTax | Get sum tax of the specified order
[**orderGetTaxGroupes**](OrderApi.md#orderGetTaxGroupes) | **GET** /Order/{id}/getTaxGroupes | Get tax groups of the specified order
[**orderGetTotal**](OrderApi.md#orderGetTotal) | **GET** /Order/{id}/getTotal | Get sum gross of the specified order
[**orderGetTotalCalc**](OrderApi.md#orderGetTotalCalc) | **GET** /Order/{id}/getTotalCalc | Get total gross amount of order
[**orderGetTotalNet**](OrderApi.md#orderGetTotalNet) | **GET** /Order/{id}/getTotalNet | Get total net amount of order
[**orderRender**](OrderApi.md#orderRender) | **POST** /Order/{id}/render | Render the order document on doc server and return the metadata
[**orderSendBy**](OrderApi.md#orderSendBy) | **PUT** /Order/{id}/sendBy | Send an order by the desired send type
[**sendOrderViaEmail**](OrderApi.md#sendOrderViaEmail) | **POST** /Order/{id}/sendViaEmail | Send an order via Email
[**sendOrderViaPost**](OrderApi.md#sendOrderViaPost) | **POST** /Order/{id}/sendViaPost | Send an order via post
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /Order/{id} | Update an existing order

<a name="addOrder"></a>
# **addOrder**
> ModelOrder addOrder()

Create a new order

Calls Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
try {
    ModelOrder result = apiInstance.addOrder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="copyOrder"></a>
# **copyOrder**
> ModelOrder copyOrder(id)

Copy an existing order

Calls copy() in Order.php to copy an existing order.    The new orders origin is the copied order, and its version is the copied orders version increased by one.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order which you want to copy
try {
    ModelOrder result = apiInstance.copyOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#copyOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order which you want to copy |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(id)

Delete an existing order

Calls the delete() function in Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | id of order you want to delete
try {
    apiInstance.deleteOrder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of order you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="duplicateOrder"></a>
# **duplicateOrder**
> ModelOrder duplicateOrder(id)

Duplicate an existing order

Calls duplicate() in Order.php to duplicate an existing order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order which you want to duplicate
try {
    ModelOrder result = apiInstance.duplicateOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#duplicateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order which you want to duplicate |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getNextOrderNumber"></a>
# **getNextOrderNumber**
> getNextOrderNumber(orderType, useNextNumber)

Get the next order number

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderType = "orderType_example"; // String | defines the type of order you want to get the next number from
Boolean useNextNumber = true; // Boolean | By default this is true, so the orderNumber will increase by one otherwise the orderNumber will not change
try {
    apiInstance.getNextOrderNumber(orderType, useNextNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getNextOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**| defines the type of order you want to get the next number from | [enum: AN, AB, LI]
 **useNextNumber** | **Boolean**| By default this is true, so the orderNumber will increase by one otherwise the orderNumber will not change |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrderDiscounts"></a>
# **getOrderDiscounts**
> ModelDiscounts getOrderDiscounts(id, limit, offset, embed)

Get all order discounts

Calls getDiscounts() in Order.php to get the discounts of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the discounts
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned order positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDiscounts result = apiInstance.getOrderDiscounts(id, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderDiscounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the discounts |
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned order positions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDiscounts**](ModelDiscounts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getOrders"></a>
# **getOrders**
> ModelOrder getOrders(limit, offset, embed)

Get an overview of all orders

Calls Order.php to get necessary variables. However, not all variables get their value from Order.php directly but from other models like Model_OrderPos

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned invoice positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``
try {
    ModelOrder result = apiInstance.getOrders(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned invoice positions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60; | [optional]

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="orderChangeStatus"></a>
# **orderChangeStatus**
> ModelOrder orderChangeStatus(id)

Update status of an existing order

Calls changeStatus() in Order.php to update the specified orders status

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of order of which you want to change the status
try {
    ModelOrder result = apiInstance.orderChangeStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderChangeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order of which you want to change the status |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="orderGetChargeableInformation"></a>
# **orderGetChargeableInformation**
> orderGetChargeableInformation(id)

Get sum charged already, total net, gross and tax amount and tax rate

Calls getChargeableInformation() in Order.php to get the sum charged already, total net, gross and tax amount and tax rate of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the information
try {
    apiInstance.orderGetChargeableInformation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetChargeableInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the information |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetChargeableSums"></a>
# **orderGetChargeableSums**
> orderGetChargeableSums(id)

Get total net, gross and tax amount of order

Calls getChargeableSums() in Order.php to get the total net, gross and tax amount of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the total net, gross and tax amount
try {
    apiInstance.orderGetChargeableSums(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetChargeableSums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the total net, gross and tax amount |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetMainOrderByLogs"></a>
# **orderGetMainOrderByLogs**
> ModelOrder orderGetMainOrderByLogs(id)

Get main order by checking if there are existing order logs of the specified order

Calls getMainOrderByLogs() in Order.php to get main order by checking if there are existing order logs of the specified order.    If the specified order is not the main order (eg. if there are no existing logs), this will return null!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to know if it is the main order
try {
    ModelOrder result = apiInstance.orderGetMainOrderByLogs(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetMainOrderByLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to know if it is the main order |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="orderGetPdf"></a>
# **orderGetPdf**
> orderGetPdf(id, preventSendBy)

Get the order as a pdf

Calls getPdf() in Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the pdf
Boolean preventSendBy = true; // Boolean | Define if you want to prevent to send the order via pdf
try {
    apiInstance.orderGetPdf(id, preventSendBy);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the pdf |
 **preventSendBy** | **Boolean**| Define if you want to prevent to send the order via pdf | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetPositions"></a>
# **orderGetPositions**
> ModelOrderPos orderGetPositions(id, withOptional, onlyChargeable, limit, offset, embed)

Get all order positions

Calls getPositions() in Order.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the positions
Boolean withOptional = true; // Boolean | Define if you want optional order positions
Boolean onlyChargeable = true; // Boolean | Define if you want only chargeable order positions
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned order positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelOrderPos result = apiInstance.orderGetPositions(id, withOptional, onlyChargeable, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the positions |
 **withOptional** | **Boolean**| Define if you want optional order positions | [optional]
 **onlyChargeable** | **Boolean**| Define if you want only chargeable order positions | [optional]
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

<a name="orderGetRelatedObjects"></a>
# **orderGetRelatedObjects**
> orderGetRelatedObjects(id, includeItself, sortByType, embed)

Get related objects of a specified order

Calls getRelatedObjects() in Order.php to get related objects of the order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the related objects
Boolean includeItself = true; // Boolean | Define if the related objects include the order itself
Boolean sortByType = true; // Boolean | Define if you want the related objects sorted by type
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.orderGetRelatedObjects(id, includeItself, sortByType, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetRelatedObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the related objects |
 **includeItself** | **Boolean**| Define if the related objects include the order itself | [optional]
 **sortByType** | **Boolean**| Define if you want the related objects sorted by type | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTags"></a>
# **orderGetTags**
> orderGetTags(id, embed)

Get tags of the specified order

Calls getTags() in Order.php to get the tags of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the tags
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.orderGetTags(id, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the tags |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTax"></a>
# **orderGetTax**
> orderGetTax(id, foreignCurrency)

Get sum tax of the specified order

Calls getTax() in Order.php to get the sum tax of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the sum tax
Boolean foreignCurrency = true; // Boolean | Specify if a foreign currency is used
try {
    apiInstance.orderGetTax(id, foreignCurrency);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the sum tax |
 **foreignCurrency** | **Boolean**| Specify if a foreign currency is used | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTaxGroupes"></a>
# **orderGetTaxGroupes**
> orderGetTaxGroupes(id)

Get tax groups of the specified order

Calls getTaxGroupes() in Order.php to get the tax groups of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the tax groups
try {
    apiInstance.orderGetTaxGroupes(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTaxGroupes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the tax groups |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTotal"></a>
# **orderGetTotal**
> orderGetTotal(id, foreignCurrency)

Get sum gross of the specified order

Calls getTotal() in Order.php to get the sum gross of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the sum gross
Boolean foreignCurrency = true; // Boolean | Specify if a foreign currency is used
try {
    apiInstance.orderGetTotal(id, foreignCurrency);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTotal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the sum gross |
 **foreignCurrency** | **Boolean**| Specify if a foreign currency is used | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTotalCalc"></a>
# **orderGetTotalCalc**
> orderGetTotalCalc(id)

Get total gross amount of order

Calls getTotalCalc() in Order.php to get the total gross amount of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the total gross amount
try {
    apiInstance.orderGetTotalCalc(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTotalCalc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the total gross amount |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetTotalNet"></a>
# **orderGetTotalNet**
> orderGetTotalNet(id)

Get total net amount of order

Calls getTotalNet() in Order.php to get the total net amount of the specified order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of the order of which you want to get the total net amount
try {
    apiInstance.orderGetTotalNet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetTotalNet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the order of which you want to get the total net amount |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderRender"></a>
# **orderRender**
> orderRender(id)

Render the order document on doc server and return the metadata

Calls render() in Order.php to render an order document on doc server and return the metadata

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of order you want to render
try {
    apiInstance.orderRender(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderRender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order you want to render |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderSendBy"></a>
# **orderSendBy**
> ModelOrder orderSendBy(id, sendType)

Send an order by the desired send type

Calls sendBy() in Order.php to send the order by the desired send type

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of order which you want to send
String sendType = "sendType_example"; // String | Your desired send type. Available are: VM = Mail, VP = Post, VPDF = PDF, PRN = Print
try {
    ModelOrder result = apiInstance.orderSendBy(id, sendType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderSendBy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order which you want to send |
 **sendType** | **String**| Your desired send type. Available are: VM &#x3D; Mail, VP &#x3D; Post, VPDF &#x3D; PDF, PRN &#x3D; Print | [optional]

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="sendOrderViaEmail"></a>
# **sendOrderViaEmail**
> ModelEmail sendOrderViaEmail(id)

Send an order via Email

Calls sendViaEmail in Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of order you want to send via Email
try {
    ModelEmail result = apiInstance.sendOrderViaEmail(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#sendOrderViaEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order you want to send via Email |

### Return type

[**ModelEmail**](ModelEmail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="sendOrderViaPost"></a>
# **sendOrderViaPost**
> ModelOrder sendOrderViaPost(id)

Send an order via post

Calls sendViaPost() in Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Id of order you want to send via post
try {
    ModelOrder result = apiInstance.sendOrderViaPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#sendOrderViaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of order you want to send via post |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateOrder"></a>
# **updateOrder**
> ModelOrder updateOrder(id)

Update an existing order

Calls Order.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | id of order you want to update
try {
    ModelOrder result = apiInstance.updateOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of order you want to update |

### Return type

[**ModelOrder**](ModelOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


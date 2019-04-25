# InvoicePosApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoicePos**](InvoicePosApi.md#addInvoicePos) | **POST** /InvoicePos | Create a new invoice position
[**deleteInvoicePos**](InvoicePosApi.md#deleteInvoicePos) | **DELETE** /InvoicePos/{id} | Delete an existing invoice position
[**getInvoicePositions**](InvoicePosApi.md#getInvoicePositions) | **GET** /InvoicePos | Get an overview of all invoice positions
[**updateInvoicePos**](InvoicePosApi.md#updateInvoicePos) | **PUT** /InvoicePos/{id} | Update an existing invoice position

<a name="addInvoicePos"></a>
# **addInvoicePos**
> ModelInvoicePos addInvoicePos()

Create a new invoice position

Calls InvoicePos.php.    As described in the Model_Invoice earlier, some of its parameters get their value from other models/functions.    InvoicePos is one of those Models and provides the ability to add products/parts to your invoice which fills values like sumNet,taxation, etc.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoicePosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoicePosApi apiInstance = new InvoicePosApi();
try {
    ModelInvoicePos result = apiInstance.addInvoicePos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicePosApi#addInvoicePos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoicePos**](ModelInvoicePos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteInvoicePos"></a>
# **deleteInvoicePos**
> deleteInvoicePos(id)

Delete an existing invoice position

Calls the delete() function in InvoicePos.php. This does NOT delete an invoice, just the position which belonged to the invoice!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoicePosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoicePosApi apiInstance = new InvoicePosApi();
Integer id = 56; // Integer | id of invoice position you want to delete
try {
    apiInstance.deleteInvoicePos(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicePosApi#deleteInvoicePos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice position you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInvoicePositions"></a>
# **getInvoicePositions**
> ModelInvoicePos getInvoicePositions(limit, offset, embed)

Get an overview of all invoice positions

Calls InvoicePos.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoicePosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoicePosApi apiInstance = new InvoicePosApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned invoice positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInvoicePos result = apiInstance.getInvoicePositions(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicePosApi#getInvoicePositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned invoice positions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInvoicePos**](ModelInvoicePos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateInvoicePos"></a>
# **updateInvoicePos**
> ModelInvoicePos updateInvoicePos(id)

Update an existing invoice position

TODO: Enter short backend documentation here

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoicePosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoicePosApi apiInstance = new InvoicePosApi();
Integer id = 56; // Integer | id of invoice position you want to update
try {
    ModelInvoicePos result = apiInstance.updateInvoicePos(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicePosApi#updateInvoicePos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice position you want to update |

### Return type

[**ModelInvoicePos**](ModelInvoicePos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


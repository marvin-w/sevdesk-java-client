# PaymentMethodApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPaymentMethod**](PaymentMethodApi.md#addPaymentMethod) | **POST** /PaymentMethod | Create a new payment method
[**deletePaymentMethod**](PaymentMethodApi.md#deletePaymentMethod) | **DELETE** /PaymentMethod/{id} | Delete an existing payment method
[**getPaymentMethods**](PaymentMethodApi.md#getPaymentMethods) | **GET** /PaymentMethod | Get an overview of all payment methods
[**updatePaymentMethod**](PaymentMethodApi.md#updatePaymentMethod) | **PUT** /PaymentMethod/{id} | Update an existing payment method

<a name="addPaymentMethod"></a>
# **addPaymentMethod**
> ModelPaymentMethod addPaymentMethod()

Create a new payment method

Calls PaymentMethod.php to create a payment method

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
try {
    ModelPaymentMethod result = apiInstance.addPaymentMethod();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#addPaymentMethod");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelPaymentMethod**](ModelPaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deletePaymentMethod"></a>
# **deletePaymentMethod**
> deletePaymentMethod(id)

Delete an existing payment method

Calls the delete() function in PaymentMethod.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
Integer id = 56; // Integer | id of payment method you want to delete
try {
    apiInstance.deletePaymentMethod(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#deletePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of payment method you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPaymentMethods"></a>
# **getPaymentMethods**
> ModelPaymentMethod getPaymentMethods(limit, offset, embed)

Get an overview of all payment methods

Calls PaymentMethod.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned payment methods start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelPaymentMethod result = apiInstance.getPaymentMethods(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#getPaymentMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned payment methods start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelPaymentMethod**](ModelPaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updatePaymentMethod"></a>
# **updatePaymentMethod**
> ModelPaymentMethod updatePaymentMethod(id)

Update an existing payment method

Calls PaymentMethod.php to update a payment method

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
Integer id = 56; // Integer | id of payment method you want to update
try {
    ModelPaymentMethod result = apiInstance.updatePaymentMethod(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#updatePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of payment method you want to update |

### Return type

[**ModelPaymentMethod**](ModelPaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


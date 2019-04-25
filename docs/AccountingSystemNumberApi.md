# AccountingSystemNumberApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccountingSystemNumber**](AccountingSystemNumberApi.md#addAccountingSystemNumber) | **POST** /AccountingSystemNumber | Create a new accounting system number
[**deleteAccountingSystemNumber**](AccountingSystemNumberApi.md#deleteAccountingSystemNumber) | **DELETE** /AccountingSystemNumber/{id} | Delete an existing accounting system number
[**getAccountingSystemNumbers**](AccountingSystemNumberApi.md#getAccountingSystemNumbers) | **GET** /AccountingSystemNumber | Get an overview of all accounting system numbers
[**updateAccountingSystemNumber**](AccountingSystemNumberApi.md#updateAccountingSystemNumber) | **PUT** /AccountingSystemNumber/{id} | Update an existing accounting system number

<a name="addAccountingSystemNumber"></a>
# **addAccountingSystemNumber**
> ModelAccountingSystemNumber addAccountingSystemNumber()

Create a new accounting system number

Calls AccountingSystemNumber.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingSystemNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingSystemNumberApi apiInstance = new AccountingSystemNumberApi();
try {
    ModelAccountingSystemNumber result = apiInstance.addAccountingSystemNumber();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingSystemNumberApi#addAccountingSystemNumber");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingSystemNumber**](ModelAccountingSystemNumber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingSystemNumber"></a>
# **deleteAccountingSystemNumber**
> deleteAccountingSystemNumber(id)

Delete an existing accounting system number

Calls the delete() function in AccountingSystemNumber.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingSystemNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingSystemNumberApi apiInstance = new AccountingSystemNumberApi();
Integer id = 56; // Integer | id of accounting system number you want to delete
try {
    apiInstance.deleteAccountingSystemNumber(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingSystemNumberApi#deleteAccountingSystemNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting system number you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingSystemNumbers"></a>
# **getAccountingSystemNumbers**
> ModelAccountingSystemNumber getAccountingSystemNumbers(limit, offset, embed)

Get an overview of all accounting system numbers

Calls AccountingSystemNumber.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingSystemNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingSystemNumberApi apiInstance = new AccountingSystemNumberApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 1000
Integer offset = 56; // Integer | Set the index where the returned accounting system numbers start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingSystemNumber result = apiInstance.getAccountingSystemNumbers(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingSystemNumberApi#getAccountingSystemNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 1000 | [optional]
 **offset** | **Integer**| Set the index where the returned accounting system numbers start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingSystemNumber**](ModelAccountingSystemNumber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingSystemNumber"></a>
# **updateAccountingSystemNumber**
> ModelAccountingType updateAccountingSystemNumber(id)

Update an existing accounting system number

Calls AccountingSystemNumber.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingSystemNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingSystemNumberApi apiInstance = new AccountingSystemNumberApi();
Integer id = 56; // Integer | id of accounting system number you want to update
try {
    ModelAccountingType result = apiInstance.updateAccountingSystemNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingSystemNumberApi#updateAccountingSystemNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting system number you want to update |

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


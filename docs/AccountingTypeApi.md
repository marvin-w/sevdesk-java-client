# AccountingTypeApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountingTypeGetAccountingNumber**](AccountingTypeApi.md#accountingTypeGetAccountingNumber) | **GET** /AccountingType/{id}/getAccountingNumber | Get accounting system number of the specified accounting type
[**accountingTypeGetAccountingNumberDepreciation**](AccountingTypeApi.md#accountingTypeGetAccountingNumberDepreciation) | **GET** /AccountingType/{id}/getAccountingNumberDepreciation | Get accounting system number depreciation of the specified accounting type
[**accountingTypeGetAccountingSystemNumber**](AccountingTypeApi.md#accountingTypeGetAccountingSystemNumber) | **GET** /AccountingType/{id}/getAccountingSystemNumber | Get accounting system number of the specified accounting type
[**addAccountingType**](AccountingTypeApi.md#addAccountingType) | **POST** /AccountingType | Create a new accounting type
[**addAccountingTypeFactory**](AccountingTypeApi.md#addAccountingTypeFactory) | **POST** /AccountingType/Factory/createType | Create a new accounting type
[**deleteAccountingType**](AccountingTypeApi.md#deleteAccountingType) | **DELETE** /AccountingType/{id} | Delete an existing accounting type
[**getAccountingTypes**](AccountingTypeApi.md#getAccountingTypes) | **GET** /AccountingType | Get an overview of all accounting types
[**updateAccountingType**](AccountingTypeApi.md#updateAccountingType) | **PUT** /AccountingType/{id} | Update an existing accounting type

<a name="accountingTypeGetAccountingNumber"></a>
# **accountingTypeGetAccountingNumber**
> accountingTypeGetAccountingNumber(id)

Get accounting system number of the specified accounting type

Calls getAccountingNumber() in AccountingType.php to get the accounting system number of the specified accounting type.    Basically this function does just calls getAccountingSystemNumber() and returns just the number, not the model.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer id = 56; // Integer | Id of the accounting type for which you want to get the accounting system number
try {
    apiInstance.accountingTypeGetAccountingNumber(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#accountingTypeGetAccountingNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the accounting type for which you want to get the accounting system number |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="accountingTypeGetAccountingNumberDepreciation"></a>
# **accountingTypeGetAccountingNumberDepreciation**
> accountingTypeGetAccountingNumberDepreciation(id)

Get accounting system number depreciation of the specified accounting type

Calls getAccountingNumberDepreciation() in AccountingType.php to get the accounting system number depreciation of the specified accounting type.    Basically this function does just calls getAccountingSystemNumber() and returns just the depreciation, not the model.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer id = 56; // Integer | Id of the accounting type for which you want to get the accounting system number depreciation
try {
    apiInstance.accountingTypeGetAccountingNumberDepreciation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#accountingTypeGetAccountingNumberDepreciation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the accounting type for which you want to get the accounting system number depreciation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="accountingTypeGetAccountingSystemNumber"></a>
# **accountingTypeGetAccountingSystemNumber**
> ModelAccountingSystemNumber accountingTypeGetAccountingSystemNumber(id, embed)

Get accounting system number of the specified accounting type

Calls getAccountingSystemNumber() in AccountingType.php to get the accounting system number of the specified accounting type.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer id = 56; // Integer | Id of the accounting type for which you want to get the accounting system number
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingSystemNumber result = apiInstance.accountingTypeGetAccountingSystemNumber(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#accountingTypeGetAccountingSystemNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the accounting type for which you want to get the accounting system number |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingSystemNumber**](ModelAccountingSystemNumber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="addAccountingType"></a>
# **addAccountingType**
> ModelAccountingType addAccountingType()

Create a new accounting type

Calls AccountingType.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
try {
    ModelAccountingType result = apiInstance.addAccountingType();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#addAccountingType");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="addAccountingTypeFactory"></a>
# **addAccountingTypeFactory**
> ModelAccountingType addAccountingTypeFactory()

Create a new accounting type

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
try {
    ModelAccountingType result = apiInstance.addAccountingTypeFactory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#addAccountingTypeFactory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingType"></a>
# **deleteAccountingType**
> deleteAccountingType(id)

Delete an existing accounting type

Calls the delete() function in AccountingType.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer id = 56; // Integer | id of accounting type you want to delete
try {
    apiInstance.deleteAccountingType(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#deleteAccountingType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting type you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingTypes"></a>
# **getAccountingTypes**
> ModelAccountingType getAccountingTypes(limit, offset, embed)

Get an overview of all accounting types

Calls AccountingType.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 1000
Integer offset = 56; // Integer | Set the index where the returned accounting types start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingType result = apiInstance.getAccountingTypes(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#getAccountingTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 1000 | [optional]
 **offset** | **Integer**| Set the index where the returned accounting types start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingType"></a>
# **updateAccountingType**
> ModelAccountingType updateAccountingType(id)

Update an existing accounting type

Calls AccountingType.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingTypeApi apiInstance = new AccountingTypeApi();
Integer id = 56; // Integer | id of accounting type you want to update
try {
    ModelAccountingType result = apiInstance.updateAccountingType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingTypeApi#updateAccountingType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting type you want to update |

### Return type

[**ModelAccountingType**](ModelAccountingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


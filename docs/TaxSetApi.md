# TaxSetApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTaxSet**](TaxSetApi.md#addTaxSet) | **POST** /TaxSet | Create a new tax set
[**deleteTaxSet**](TaxSetApi.md#deleteTaxSet) | **DELETE** /TaxSet/{id} | Delete an existing tax set
[**getTaxSets**](TaxSetApi.md#getTaxSets) | **GET** /TaxSet | Get an overview of all tax sets
[**updateTaxSet**](TaxSetApi.md#updateTaxSet) | **PUT** /TaxSet/{id} | Update an existing tax set

<a name="addTaxSet"></a>
# **addTaxSet**
> ModelTaxSet addTaxSet()

Create a new tax set

Calls TaxSet.php to create a new tax set

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaxSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxSetApi apiInstance = new TaxSetApi();
try {
    ModelTaxSet result = apiInstance.addTaxSet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxSetApi#addTaxSet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelTaxSet**](ModelTaxSet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteTaxSet"></a>
# **deleteTaxSet**
> deleteTaxSet(id)

Delete an existing tax set

Calls the delete() function in TaxSet.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaxSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxSetApi apiInstance = new TaxSetApi();
Integer id = 56; // Integer | Id of tax set you want to delete
try {
    apiInstance.deleteTaxSet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxSetApi#deleteTaxSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of tax set you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTaxSets"></a>
# **getTaxSets**
> ModelTaxSet getTaxSets(limit, offset, embed)

Get an overview of all tax sets

Calls TaxSet.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaxSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxSetApi apiInstance = new TaxSetApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned tax sets start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelTaxSet result = apiInstance.getTaxSets(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxSetApi#getTaxSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned tax sets start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelTaxSet**](ModelTaxSet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateTaxSet"></a>
# **updateTaxSet**
> ModelTaxSet updateTaxSet(id)

Update an existing tax set

Calls TaxSet.php to update an existing tax set

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TaxSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxSetApi apiInstance = new TaxSetApi();
Integer id = 56; // Integer | Id of tax set you want to update
try {
    ModelTaxSet result = apiInstance.updateTaxSet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxSetApi#updateTaxSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of tax set you want to update |

### Return type

[**ModelTaxSet**](ModelTaxSet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


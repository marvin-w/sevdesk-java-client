# CostCentreApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCostCentre**](CostCentreApi.md#addCostCentre) | **POST** /CostCentre | Create a new cost centre
[**deleteCostCentre**](CostCentreApi.md#deleteCostCentre) | **DELETE** /CostCentre/{id} | Delete an existing cost centre
[**getCostCentre**](CostCentreApi.md#getCostCentre) | **GET** /CostCentre | Get an overview of all cost centre
[**updateCostCentre**](CostCentreApi.md#updateCostCentre) | **PUT** /CostCentre/{id} | Update an existing cost centre

<a name="addCostCentre"></a>
# **addCostCentre**
> ModelCostCentre addCostCentre()

Create a new cost centre

Calls CostCentre.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CostCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CostCentreApi apiInstance = new CostCentreApi();
try {
    ModelCostCentre result = apiInstance.addCostCentre();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCentreApi#addCostCentre");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCostCentre**](ModelCostCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteCostCentre"></a>
# **deleteCostCentre**
> deleteCostCentre(id)

Delete an existing cost centre

Calls the delete() function in CostCentre.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CostCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CostCentreApi apiInstance = new CostCentreApi();
Integer id = 56; // Integer | id of cost centre you want to delete
try {
    apiInstance.deleteCostCentre(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCentreApi#deleteCostCentre");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of cost centre you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCostCentre"></a>
# **getCostCentre**
> ModelCostCentre getCostCentre(limit, offset, embed)

Get an overview of all cost centre

Calls CostCentre.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CostCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CostCentreApi apiInstance = new CostCentreApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned cost centre start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCostCentre result = apiInstance.getCostCentre(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCentreApi#getCostCentre");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned cost centre start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCostCentre**](ModelCostCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCostCentre"></a>
# **updateCostCentre**
> ModelCostCentre updateCostCentre(id)

Update an existing cost centre

Calls CostCentre.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CostCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CostCentreApi apiInstance = new CostCentreApi();
Integer id = 56; // Integer | id of cost centre you want to update
try {
    ModelCostCentre result = apiInstance.updateCostCentre(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCentreApi#updateCostCentre");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of cost centre you want to update |

### Return type

[**ModelCostCentre**](ModelCostCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


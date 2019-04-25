# SevClientConfigApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSevClientConfig**](SevClientConfigApi.md#getSevClientConfig) | **GET** /SevClientConfig | Get an overview of your sevClient config
[**updateSevClientConfig**](SevClientConfigApi.md#updateSevClientConfig) | **PUT** /SevClientConfig/{id} | Update an existing sevClient config

<a name="getSevClientConfig"></a>
# **getSevClientConfig**
> ModelSevClientConfig getSevClientConfig(embed)

Get an overview of your sevClient config

Calls SevClientConfig.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SevClientConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SevClientConfigApi apiInstance = new SevClientConfigApi();
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelSevClientConfig result = apiInstance.getSevClientConfig(embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SevClientConfigApi#getSevClientConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelSevClientConfig**](ModelSevClientConfig.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateSevClientConfig"></a>
# **updateSevClientConfig**
> ModelSevClientConfig updateSevClientConfig(id)

Update an existing sevClient config

Calls SevClientConfig.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SevClientConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SevClientConfigApi apiInstance = new SevClientConfigApi();
Integer id = 56; // Integer | Id of sevClient config you want to update
try {
    ModelSevClientConfig result = apiInstance.updateSevClientConfig(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SevClientConfigApi#updateSevClientConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of sevClient config you want to update |

### Return type

[**ModelSevClientConfig**](ModelSevClientConfig.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


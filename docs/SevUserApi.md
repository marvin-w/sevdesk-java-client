# SevUserApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSevUser**](SevUserApi.md#getSevUser) | **GET** /SevUser | Get an overview of your sevUser
[**sevUserGetApiToken**](SevUserApi.md#sevUserGetApiToken) | **GET** /SevUser/getApiToken | Get the api token of your user

<a name="getSevUser"></a>
# **getSevUser**
> ModelSevUser getSevUser(embed)

Get an overview of your sevUser

Calls SevUser.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SevUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SevUserApi apiInstance = new SevUserApi();
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelSevUser result = apiInstance.getSevUser(embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SevUserApi#getSevUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelSevUser**](ModelSevUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="sevUserGetApiToken"></a>
# **sevUserGetApiToken**
> sevUserGetApiToken()

Get the api token of your user

Calls getApiToken() in SevUser.php to get the api token of your user. Be aware that this only works if your sevUser has certain privileges!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SevUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SevUserApi apiInstance = new SevUserApi();
try {
    apiInstance.sevUserGetApiToken();
} catch (ApiException e) {
    System.err.println("Exception when calling SevUserApi#sevUserGetApiToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# ObjectUsedApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getObjectUsed**](ObjectUsedApi.md#getObjectUsed) | **GET** /ObjectUsed | Get an overview of all objects used

<a name="getObjectUsed"></a>
# **getObjectUsed**
> ModelObjectUsed getObjectUsed(limit, offset)

Get an overview of all objects used

Calls ObjectUsed.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ObjectUsedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ObjectUsedApi apiInstance = new ObjectUsedApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned objects used start. Default is 0
try {
    ModelObjectUsed result = apiInstance.getObjectUsed(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsedApi#getObjectUsed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned objects used start. Default is 0 | [optional]

### Return type

[**ModelObjectUsed**](ModelObjectUsed.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


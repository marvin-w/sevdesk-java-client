# CommunicationWayKeyApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommunicationWayKeys**](CommunicationWayKeyApi.md#getCommunicationWayKeys) | **GET** /CommunicationWayKey | Get an overview of all communication way keys

<a name="getCommunicationWayKeys"></a>
# **getCommunicationWayKeys**
> ModelCommunicationWayKey getCommunicationWayKeys(limit, offset)

Get an overview of all communication way keys

Calls CommunicationWayKey.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CommunicationWayKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommunicationWayKeyApi apiInstance = new CommunicationWayKeyApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned communication way keys start. Default is 0
try {
    ModelCommunicationWayKey result = apiInstance.getCommunicationWayKeys(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunicationWayKeyApi#getCommunicationWayKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned communication way keys start. Default is 0 | [optional]

### Return type

[**ModelCommunicationWayKey**](ModelCommunicationWayKey.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


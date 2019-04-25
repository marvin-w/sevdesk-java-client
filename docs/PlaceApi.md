# PlaceApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlaces**](PlaceApi.md#getPlaces) | **GET** /Place | Get an overview of all places

<a name="getPlaces"></a>
# **getPlaces**
> ModelPlace getPlaces(limit, offset)

Get an overview of all places

Calls Place.php to get necessary variables.    It is recommended to set limit and offset appropriately as there are over 5000 entries for place!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.PlaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlaceApi apiInstance = new PlaceApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 1000
Integer offset = 56; // Integer | Set the index where the returned places start. Default is 0
try {
    ModelPlace result = apiInstance.getPlaces(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceApi#getPlaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 1000 | [optional]
 **offset** | **Integer**| Set the index where the returned places start. Default is 0 | [optional]

### Return type

[**ModelPlace**](ModelPlace.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


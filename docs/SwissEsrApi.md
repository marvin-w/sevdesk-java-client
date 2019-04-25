# SwissEsrApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSwissEsr**](SwissEsrApi.md#getSwissEsr) | **GET** /SwissEsr | Get an overview of swiss esr

<a name="getSwissEsr"></a>
# **getSwissEsr**
> ModelSwissEsr getSwissEsr()

Get an overview of swiss esr

Calls SwissEsr.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SwissEsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SwissEsrApi apiInstance = new SwissEsrApi();
try {
    ModelSwissEsr result = apiInstance.getSwissEsr();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SwissEsrApi#getSwissEsr");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelSwissEsr**](ModelSwissEsr.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


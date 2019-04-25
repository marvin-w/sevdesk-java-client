# SevClientApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sevClientGetSevDeskAccountInvoices**](SevClientApi.md#sevClientGetSevDeskAccountInvoices) | **GET** /SevClient/getSevDeskAccountInvoices | Get sevDesk account invoices

<a name="sevClientGetSevDeskAccountInvoices"></a>
# **sevClientGetSevDeskAccountInvoices**
> sevClientGetSevDeskAccountInvoices()

Get sevDesk account invoices

Get sevDesk account invoices

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SevClientApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SevClientApi apiInstance = new SevClientApi();
try {
    apiInstance.sevClientGetSevDeskAccountInvoices();
} catch (ApiException e) {
    System.err.println("Exception when calling SevClientApi#sevClientGetSevDeskAccountInvoices");
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


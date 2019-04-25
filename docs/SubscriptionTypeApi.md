# SubscriptionTypeApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionTypes**](SubscriptionTypeApi.md#getSubscriptionTypes) | **GET** /SubscriptionType | Get an overview of all subscription types

<a name="getSubscriptionTypes"></a>
# **getSubscriptionTypes**
> ModelSubscriptionType getSubscriptionTypes()

Get an overview of all subscription types

Calls SubscriptionType.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SubscriptionTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionTypeApi apiInstance = new SubscriptionTypeApi();
try {
    ModelSubscriptionType result = apiInstance.getSubscriptionTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionTypeApi#getSubscriptionTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelSubscriptionType**](ModelSubscriptionType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


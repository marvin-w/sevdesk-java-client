# SubscriptionHistoryApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionHistory**](SubscriptionHistoryApi.md#getSubscriptionHistory) | **GET** /SubscriptionHistory | Get an overview of your subscription history

<a name="getSubscriptionHistory"></a>
# **getSubscriptionHistory**
> ModelSubscriptionHistory getSubscriptionHistory(embed)

Get an overview of your subscription history

Calls SubscriptionHistory.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SubscriptionHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionHistoryApi apiInstance = new SubscriptionHistoryApi();
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelSubscriptionHistory result = apiInstance.getSubscriptionHistory(embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionHistoryApi#getSubscriptionHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelSubscriptionHistory**](ModelSubscriptionHistory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


# CurrencyExchangeRateApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencyExchangeRates**](CurrencyExchangeRateApi.md#getCurrencyExchangeRates) | **GET** /CurrencyExchangeRate | Get an overview of all currency exchange rates

<a name="getCurrencyExchangeRates"></a>
# **getCurrencyExchangeRates**
> ModelCurrencyExchangeRate getCurrencyExchangeRates(limit, offset)

Get an overview of all currency exchange rates

Calls CurrencyExchangeRate.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CurrencyExchangeRateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CurrencyExchangeRateApi apiInstance = new CurrencyExchangeRateApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 1000.    Be aware that there are over 100000 entries in the database for currency exchange rate, so using a limit higher than 1000 with offset=0 is not recommended!    However you can set the offset appropriately so you minimize the amount of returned exchange rates and keep loading time to a low.
Integer offset = 56; // Integer | Set the index where the returned currency exchange rates start. Default is 0
try {
    ModelCurrencyExchangeRate result = apiInstance.getCurrencyExchangeRates(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyExchangeRateApi#getCurrencyExchangeRates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 1000.    Be aware that there are over 100000 entries in the database for currency exchange rate, so using a limit higher than 1000 with offset&#x3D;0 is not recommended!    However you can set the offset appropriately so you minimize the amount of returned exchange rates and keep loading time to a low. | [optional]
 **offset** | **Integer**| Set the index where the returned currency exchange rates start. Default is 0 | [optional]

### Return type

[**ModelCurrencyExchangeRate**](ModelCurrencyExchangeRate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


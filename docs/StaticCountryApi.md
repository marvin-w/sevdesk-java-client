# StaticCountryApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStaticCountry**](StaticCountryApi.md#getStaticCountry) | **GET** /StaticCountry | Get staticCountry list
[**getStaticIndustry**](StaticCountryApi.md#getStaticIndustry) | **GET** /StaticIndustry | Get staticIndustry list

<a name="getStaticCountry"></a>
# **getStaticCountry**
> getStaticCountry()

Get staticCountry list

Calls StaticCountry.php to return the staticCountry list which is basically the list of countries.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.StaticCountryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StaticCountryApi apiInstance = new StaticCountryApi();
try {
    apiInstance.getStaticCountry();
} catch (ApiException e) {
    System.err.println("Exception when calling StaticCountryApi#getStaticCountry");
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

<a name="getStaticIndustry"></a>
# **getStaticIndustry**
> getStaticIndustry()

Get staticIndustry list

Calls StaticIndustry.php to return the staticIndustry list which is basically the list of industries.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.StaticCountryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StaticCountryApi apiInstance = new StaticCountryApi();
try {
    apiInstance.getStaticIndustry();
} catch (ApiException e) {
    System.err.println("Exception when calling StaticCountryApi#getStaticIndustry");
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


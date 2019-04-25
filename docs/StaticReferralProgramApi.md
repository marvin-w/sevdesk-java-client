# StaticReferralProgramApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStaticReferralPrograms**](StaticReferralProgramApi.md#getStaticReferralPrograms) | **GET** /StaticReferralProgram | Get staticReferralProgram list

<a name="getStaticReferralPrograms"></a>
# **getStaticReferralPrograms**
> ModelStaticReferralProgram getStaticReferralPrograms()

Get staticReferralProgram list

Calls StaticReferralProgram.php to return the staticReferralProgram list which is basically the list of referral programs.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.StaticReferralProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StaticReferralProgramApi apiInstance = new StaticReferralProgramApi();
try {
    ModelStaticReferralProgram result = apiInstance.getStaticReferralPrograms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticReferralProgramApi#getStaticReferralPrograms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelStaticReferralProgram**](ModelStaticReferralProgram.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


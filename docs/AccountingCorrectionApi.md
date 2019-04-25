# AccountingCorrectionApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccountingCorrection**](AccountingCorrectionApi.md#addAccountingCorrection) | **POST** /AccountingCorrection | Create a new accounting correction
[**deleteAccountingCorrection**](AccountingCorrectionApi.md#deleteAccountingCorrection) | **DELETE** /AccountingCorrection/{id} | Delete an existing accounting correction
[**getAccountingCorrections**](AccountingCorrectionApi.md#getAccountingCorrections) | **GET** /AccountingCorrection | Get an overview of all accounting corrections
[**updateAccountingCorrection**](AccountingCorrectionApi.md#updateAccountingCorrection) | **PUT** /AccountingCorrection/{id} | Update an existing accounting correction

<a name="addAccountingCorrection"></a>
# **addAccountingCorrection**
> ModelAccountingCorrection addAccountingCorrection()

Create a new accounting correction

Calls AccountingCorrection.php to add an accounting correction

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingCorrectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingCorrectionApi apiInstance = new AccountingCorrectionApi();
try {
    ModelAccountingCorrection result = apiInstance.addAccountingCorrection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingCorrectionApi#addAccountingCorrection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingCorrection**](ModelAccountingCorrection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingCorrection"></a>
# **deleteAccountingCorrection**
> deleteAccountingCorrection(id)

Delete an existing accounting correction

Calls AccountingCorrection.php to delete an accounting correction

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingCorrectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingCorrectionApi apiInstance = new AccountingCorrectionApi();
Integer id = 56; // Integer | id of the accounting correction you want to delete
try {
    apiInstance.deleteAccountingCorrection(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingCorrectionApi#deleteAccountingCorrection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the accounting correction you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingCorrections"></a>
# **getAccountingCorrections**
> ModelAccountingCorrection getAccountingCorrections(limit, offset, embed)

Get an overview of all accounting corrections

Calls AccountingCorrection.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingCorrectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingCorrectionApi apiInstance = new AccountingCorrectionApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned accounting corrections start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingCorrection result = apiInstance.getAccountingCorrections(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingCorrectionApi#getAccountingCorrections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned accounting corrections start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingCorrection**](ModelAccountingCorrection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingCorrection"></a>
# **updateAccountingCorrection**
> ModelAccountingCorrection updateAccountingCorrection(id)

Update an existing accounting correction

Calls AccountingCorrection.php to update an accounting correction

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingCorrectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingCorrectionApi apiInstance = new AccountingCorrectionApi();
Integer id = 56; // Integer | id of accounting correction you want to update
try {
    ModelAccountingCorrection result = apiInstance.updateAccountingCorrection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingCorrectionApi#updateAccountingCorrection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting correction you want to update |

### Return type

[**ModelAccountingCorrection**](ModelAccountingCorrection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


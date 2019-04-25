# AccountingChartApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccountingChart**](AccountingChartApi.md#addAccountingChart) | **POST** /AccountingChart | Create a new accounting chart
[**deleteAccountingChart**](AccountingChartApi.md#deleteAccountingChart) | **DELETE** /AccountingChart/{id} | Delete an existing accounting chart
[**getAccountingChart**](AccountingChartApi.md#getAccountingChart) | **GET** /AccountingChart | Get an overview of all accounting charts
[**updateAccountingChart**](AccountingChartApi.md#updateAccountingChart) | **PUT** /AccountingChart/{id} | Update an existing accounting chart

<a name="addAccountingChart"></a>
# **addAccountingChart**
> ModelAccountingChart addAccountingChart()

Create a new accounting chart

Calls AccountingChart.php to add an accounting chart

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingChartApi apiInstance = new AccountingChartApi();
try {
    ModelAccountingChart result = apiInstance.addAccountingChart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingChartApi#addAccountingChart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingChart**](ModelAccountingChart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingChart"></a>
# **deleteAccountingChart**
> deleteAccountingChart(id)

Delete an existing accounting chart

Calls AccountingChart.php to delete an accounting chart

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingChartApi apiInstance = new AccountingChartApi();
Integer id = 56; // Integer | id of the accounting chart you want to delete
try {
    apiInstance.deleteAccountingChart(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingChartApi#deleteAccountingChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the accounting chart you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingChart"></a>
# **getAccountingChart**
> ModelAccountingChart getAccountingChart(limit, offset)

Get an overview of all accounting charts

Calls AccountingChart.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingChartApi apiInstance = new AccountingChartApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned accounting charts start. Default is 0
try {
    ModelAccountingChart result = apiInstance.getAccountingChart(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingChartApi#getAccountingChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned accounting charts start. Default is 0 | [optional]

### Return type

[**ModelAccountingChart**](ModelAccountingChart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingChart"></a>
# **updateAccountingChart**
> ModelAccountingChart updateAccountingChart(id)

Update an existing accounting chart

Calls AccountingChart.php to update an accounting chart

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingChartApi apiInstance = new AccountingChartApi();
Integer id = 56; // Integer | id of accounting chart you want to update
try {
    ModelAccountingChart result = apiInstance.updateAccountingChart(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingChartApi#updateAccountingChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting chart you want to update |

### Return type

[**ModelAccountingChart**](ModelAccountingChart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


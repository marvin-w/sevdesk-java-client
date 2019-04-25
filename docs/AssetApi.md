# AssetApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAsset**](AssetApi.md#addAsset) | **POST** /Asset | Create a new asset
[**assetGetDepreciationAmount**](AssetApi.md#assetGetDepreciationAmount) | **GET** /Asset/{id}/getDepreciationAmount | Get depreciation amount of the specified asset for the given year/month
[**assetGetResidualValue**](AssetApi.md#assetGetResidualValue) | **GET** /Asset/{id}/getResidualValue | Get residual value of the specified asset for the given year/month
[**assetGetVoucher**](AssetApi.md#assetGetVoucher) | **GET** /Asset/{id}/getVoucher | Get voucher of the specified asset
[**deleteAsset**](AssetApi.md#deleteAsset) | **DELETE** /Asset/{id} | Delete an existing asset
[**getAssets**](AssetApi.md#getAssets) | **GET** /Asset | Get an overview of all assets
[**updateAsset**](AssetApi.md#updateAsset) | **PUT** /Asset/{id} | Update an existing asset

<a name="addAsset"></a>
# **addAsset**
> ModelAsset addAsset()

Create a new asset

Calls Asset.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
try {
    ModelAsset result = apiInstance.addAsset();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#addAsset");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAsset**](ModelAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="assetGetDepreciationAmount"></a>
# **assetGetDepreciationAmount**
> assetGetDepreciationAmount(id, year, month)

Get depreciation amount of the specified asset for the given year/month

Calls getDepreciationAmount() in Asset.php to get the depreciation ammount of the specified asset for the given year/month

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer id = 56; // Integer | Id of the asset of which you want to get the depreciation amount
String year = "year_example"; // String | year for which you want to get the depreciation amount
String month = "month_example"; // String | month for which you want to get the depreciation amount
try {
    apiInstance.assetGetDepreciationAmount(id, year, month);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#assetGetDepreciationAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the asset of which you want to get the depreciation amount |
 **year** | **String**| year for which you want to get the depreciation amount | [optional]
 **month** | **String**| month for which you want to get the depreciation amount | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetGetResidualValue"></a>
# **assetGetResidualValue**
> assetGetResidualValue(id, year, month)

Get residual value of the specified asset for the given year/month

Calls getResidualValue() in Asset.php to get the residual value of the specified asset for the given year/month

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer id = 56; // Integer | Id of the asset of which you want to get the residual value
String year = "year_example"; // String | year for which you want to get the residual value
String month = "month_example"; // String | month for which you want to get the residual value
try {
    apiInstance.assetGetResidualValue(id, year, month);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#assetGetResidualValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the asset of which you want to get the residual value |
 **year** | **String**| year for which you want to get the residual value | [optional]
 **month** | **String**| month for which you want to get the residual value | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetGetVoucher"></a>
# **assetGetVoucher**
> ModelVoucher assetGetVoucher(id, embed)

Get voucher of the specified asset

Calls getVoucher() in Asset.php to get the voucher of the specified asset

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer id = 56; // Integer | Id of the asset of which you want to get the voucher
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelVoucher result = apiInstance.assetGetVoucher(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#assetGetVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the asset of which you want to get the voucher |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelVoucher**](ModelVoucher.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteAsset"></a>
# **deleteAsset**
> deleteAsset(id)

Delete an existing asset

Calls the delete() function in Asset.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer id = 56; // Integer | id of asset you want to delete
try {
    apiInstance.deleteAsset(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#deleteAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of asset you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAssets"></a>
# **getAssets**
> ModelAsset getAssets(limit, offset, embed)

Get an overview of all assets

Calls Asset.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned assets start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAsset result = apiInstance.getAssets(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned assets start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAsset**](ModelAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAsset"></a>
# **updateAsset**
> ModelAsset updateAsset(id)

Update an existing asset

Calls Asset.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AssetApi apiInstance = new AssetApi();
Integer id = 56; // Integer | id of asset you want to update
try {
    ModelAsset result = apiInstance.updateAsset(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#updateAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of asset you want to update |

### Return type

[**ModelAsset**](ModelAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


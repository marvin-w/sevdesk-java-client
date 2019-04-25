# VoucherPosApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVoucherPos**](VoucherPosApi.md#addVoucherPos) | **POST** /VoucherPos | Create a new voucher position
[**deleteVoucherPos**](VoucherPosApi.md#deleteVoucherPos) | **DELETE** /VoucherPos/{id} | Delete an existing voucher position
[**getVoucherPositions**](VoucherPosApi.md#getVoucherPositions) | **GET** /VoucherPos | Get an overview of all voucher positions
[**updateVoucherPos**](VoucherPosApi.md#updateVoucherPos) | **PUT** /VoucherPos/{id} | Update an existing voucher position
[**voucherPosGetAdditionalInformation**](VoucherPosApi.md#voucherPosGetAdditionalInformation) | **GET** /VoucherPos/{id}/getAdditionalInfo | Get additional information about the asset which is connected to a specified voucher position
[**voucherPosGetAssetInstance**](VoucherPosApi.md#voucherPosGetAssetInstance) | **GET** /VoucherPos/{id}/getAssetInstance | Get the asset which is connected to a specified voucher position

<a name="addVoucherPos"></a>
# **addVoucherPos**
> ModelVoucherPos addVoucherPos()

Create a new voucher position

Calls VoucherPos.php to create a voucher position

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
try {
    ModelVoucherPos result = apiInstance.addVoucherPos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#addVoucherPos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelVoucherPos**](ModelVoucherPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteVoucherPos"></a>
# **deleteVoucherPos**
> deleteVoucherPos(id)

Delete an existing voucher position

Calls the delete() function in VoucherPos.php to delete a voucher position

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
Integer id = 56; // Integer | Id of voucher position you want to delete
try {
    apiInstance.deleteVoucherPos(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#deleteVoucherPos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of voucher position you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVoucherPositions"></a>
# **getVoucherPositions**
> ModelVoucherPos getVoucherPositions(limit, offset, embed)

Get an overview of all voucher positions

Calls VoucherPos.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned voucher positions start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelVoucherPos result = apiInstance.getVoucherPositions(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#getVoucherPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned voucher positions start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelVoucherPos**](ModelVoucherPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateVoucherPos"></a>
# **updateVoucherPos**
> ModelVoucherPos updateVoucherPos(id)

Update an existing voucher position

Calls VoucherPos.php to update an existing voucher position

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
Integer id = 56; // Integer | Id of the voucher position you want to update
try {
    ModelVoucherPos result = apiInstance.updateVoucherPos(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#updateVoucherPos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher position you want to update |

### Return type

[**ModelVoucherPos**](ModelVoucherPos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="voucherPosGetAdditionalInformation"></a>
# **voucherPosGetAdditionalInformation**
> voucherPosGetAdditionalInformation(id)

Get additional information about the asset which is connected to a specified voucher position

Calls getAdditionalInformation() in VoucherPos.php to get additional information about the asset which is connected to the specified voucher position

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
Integer id = 56; // Integer | Id of the voucher position of which you want to get additional information about the connected asset
try {
    apiInstance.voucherPosGetAdditionalInformation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#voucherPosGetAdditionalInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher position of which you want to get additional information about the connected asset |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="voucherPosGetAssetInstance"></a>
# **voucherPosGetAssetInstance**
> ModelAsset voucherPosGetAssetInstance(id)

Get the asset which is connected to a specified voucher position

Calls getAssetInstance() in VoucherPos.php to get the asset which is connected to the specified voucher position

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VoucherPosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VoucherPosApi apiInstance = new VoucherPosApi();
Integer id = 56; // Integer | Id of the voucher position of which you want to get the connected asset
try {
    ModelAsset result = apiInstance.voucherPosGetAssetInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherPosApi#voucherPosGetAssetInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the voucher position of which you want to get the connected asset |

### Return type

[**ModelAsset**](ModelAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


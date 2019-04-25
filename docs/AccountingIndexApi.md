# AccountingIndexApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccountingIndex**](AccountingIndexApi.md#addAccountingIndex) | **POST** /AccountingIndex | Create a new accounting index
[**deleteAccountingIndex**](AccountingIndexApi.md#deleteAccountingIndex) | **DELETE** /AccountingIndex/{id} | Delete an existing accounting index
[**getAccountingIndexes**](AccountingIndexApi.md#getAccountingIndexes) | **GET** /AccountingIndex | Get an overview of all accounting indexes
[**updateAccountingIndex**](AccountingIndexApi.md#updateAccountingIndex) | **PUT** /AccountingIndex/{id} | Update an existing accounting index

<a name="addAccountingIndex"></a>
# **addAccountingIndex**
> ModelAccountingIndex addAccountingIndex()

Create a new accounting index

Calls AccountingIndex.php to add an accounting index

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingIndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingIndexApi apiInstance = new AccountingIndexApi();
try {
    ModelAccountingIndex result = apiInstance.addAccountingIndex();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingIndexApi#addAccountingIndex");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingIndex**](ModelAccountingIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingIndex"></a>
# **deleteAccountingIndex**
> deleteAccountingIndex(id)

Delete an existing accounting index

Calls AccountingIndex.php to delete an accounting index

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingIndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingIndexApi apiInstance = new AccountingIndexApi();
Integer id = 56; // Integer | id of the accounting index you want to delete
try {
    apiInstance.deleteAccountingIndex(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingIndexApi#deleteAccountingIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the accounting index you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingIndexes"></a>
# **getAccountingIndexes**
> ModelAccountingIndex getAccountingIndexes(limit, offset, embed)

Get an overview of all accounting indexes

Calls AccountingIndex.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingIndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingIndexApi apiInstance = new AccountingIndexApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned accounting indexes start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingIndex result = apiInstance.getAccountingIndexes(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingIndexApi#getAccountingIndexes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned accounting indexes start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingIndex**](ModelAccountingIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingIndex"></a>
# **updateAccountingIndex**
> ModelAccountingIndex updateAccountingIndex(id)

Update an existing accounting index

Calls AccountingIndex.php to update an accounting index

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingIndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingIndexApi apiInstance = new AccountingIndexApi();
Integer id = 56; // Integer | id of accounting index you want to update
try {
    ModelAccountingIndex result = apiInstance.updateAccountingIndex(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingIndexApi#updateAccountingIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting index you want to update |

### Return type

[**ModelAccountingIndex**](ModelAccountingIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


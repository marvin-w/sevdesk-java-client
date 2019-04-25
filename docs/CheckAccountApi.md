# CheckAccountApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCheckAccount**](CheckAccountApi.md#addCheckAccount) | **POST** /CheckAccount | Create a new check account
[**checkAccountGetCurrentBalance**](CheckAccountApi.md#checkAccountGetCurrentBalance) | **GET** /CheckAccount/{id}/getCurrentBalance | Get current balance of the specified check account
[**checkAccountGetPaymentIsSupported**](CheckAccountApi.md#checkAccountGetPaymentIsSupported) | **GET** /CheckAccount/getPaymentIsSupported | Return if a payment method is supported
[**checkAccountSetDefault**](CheckAccountApi.md#checkAccountSetDefault) | **PUT** /CheckAccount/{id}/setDefault | Set the specified check accounts as the default check account
[**checkAccountTransfer**](CheckAccountApi.md#checkAccountTransfer) | **PUT** /CheckAccount/{id}/transfer | Transfer an amount from one check account to another
[**deleteCheckAccount**](CheckAccountApi.md#deleteCheckAccount) | **DELETE** /CheckAccount/{id} | Delete an existing check account
[**getCheckAccounts**](CheckAccountApi.md#getCheckAccounts) | **GET** /CheckAccount | Get an overview of all check accounts
[**updateCheckAccount**](CheckAccountApi.md#updateCheckAccount) | **PUT** /CheckAccount/{id} | Update an existing check account

<a name="addCheckAccount"></a>
# **addCheckAccount**
> ModelCheckAccount addCheckAccount()

Create a new check account

Calls CheckAccount.php to create a check account

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
try {
    ModelCheckAccount result = apiInstance.addCheckAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#addCheckAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelCheckAccount**](ModelCheckAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="checkAccountGetCurrentBalance"></a>
# **checkAccountGetCurrentBalance**
> checkAccountGetCurrentBalance(id)

Get current balance of the specified check account

Calls getCurrentBalance() in CheckAccount.php to get the balance of the specified check account.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer id = 56; // Integer | Id of the check account of which you want the current balance
try {
    apiInstance.checkAccountGetCurrentBalance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#checkAccountGetCurrentBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the check account of which you want the current balance |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkAccountGetPaymentIsSupported"></a>
# **checkAccountGetPaymentIsSupported**
> checkAccountGetPaymentIsSupported()

Return if a payment method is supported

Calls getPaymentIsSupported() in CheckAccount.php to get if a payment method is supported.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
try {
    apiInstance.checkAccountGetPaymentIsSupported();
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#checkAccountGetPaymentIsSupported");
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

<a name="checkAccountSetDefault"></a>
# **checkAccountSetDefault**
> checkAccountSetDefault(id)

Set the specified check accounts as the default check account

Calls setDefault() in CheckAccount.php to set a specified check account as the default check account

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer id = 56; // Integer | Id of check account you want to set as the default check account
try {
    apiInstance.checkAccountSetDefault(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#checkAccountSetDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of check account you want to set as the default check account |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkAccountTransfer"></a>
# **checkAccountTransfer**
> checkAccountTransfer(id, amount, targetId, targetObjectName, date)

Transfer an amount from one check account to another

Calls transfer() in CheckAccount.php to transfer an amount from one check account to another

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer id = 56; // Integer | Id of check account you want to use as source account
String amount = "amount_example"; // String | Amount you want to transfer
Integer targetId = 56; // Integer | Target check account id
String targetObjectName = "targetObjectName_example"; // String | Target check account object name
String date = "date_example"; // String | Date of the transfer
try {
    apiInstance.checkAccountTransfer(id, amount, targetId, targetObjectName, date);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#checkAccountTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of check account you want to use as source account |
 **amount** | **String**| Amount you want to transfer |
 **targetId** | **Integer**| Target check account id |
 **targetObjectName** | **String**| Target check account object name |
 **date** | **String**| Date of the transfer |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCheckAccount"></a>
# **deleteCheckAccount**
> deleteCheckAccount(id)

Delete an existing check account

Calls the delete() function in CheckAccount.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer id = 56; // Integer | Id of check account you want to delete
try {
    apiInstance.deleteCheckAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#deleteCheckAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of check account you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCheckAccounts"></a>
# **getCheckAccounts**
> ModelDiscounts getCheckAccounts(limit, offset, embed)

Get an overview of all check accounts

Calls CheckAccount.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned check accounts start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDiscounts result = apiInstance.getCheckAccounts(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#getCheckAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned check accounts start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDiscounts**](ModelDiscounts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCheckAccount"></a>
# **updateCheckAccount**
> ModelCheckAccount updateCheckAccount(id)

Update an existing check account

Calls CheckAccount.php to update a check account

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.CheckAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CheckAccountApi apiInstance = new CheckAccountApi();
Integer id = 56; // Integer | Id of check account you want to update
try {
    ModelCheckAccount result = apiInstance.updateCheckAccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckAccountApi#updateCheckAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of check account you want to update |

### Return type

[**ModelCheckAccount**](ModelCheckAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


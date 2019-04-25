# AccountingContactApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountingContactIsAvailableDebitorCreditorNumber**](AccountingContactApi.md#accountingContactIsAvailableDebitorCreditorNumber) | **GET** /AccountingContact/isAvailableDebitorCreditorNumber | Return if a debitor / creditor number is available
[**addAccountingContact**](AccountingContactApi.md#addAccountingContact) | **POST** /AccountingContact | Create a new accounting contact
[**deleteAccountingContact**](AccountingContactApi.md#deleteAccountingContact) | **DELETE** /AccountingContact/{id} | Delete an existing accounting contact
[**getAccountingContacts**](AccountingContactApi.md#getAccountingContacts) | **GET** /AccountingContact | Get an overview of all accounting contacts
[**updateAccountingContact**](AccountingContactApi.md#updateAccountingContact) | **PUT** /AccountingContact/{id} | Update an existing accounting contact

<a name="accountingContactIsAvailableDebitorCreditorNumber"></a>
# **accountingContactIsAvailableDebitorCreditorNumber**
> accountingContactIsAvailableDebitorCreditorNumber(contactId, contactObjectName, debitorNumber, creditorNumber)

Return if a debitor / creditor number is available

Calls isAvailableDebitorCreditorNumber() in AccountingContact.php to get if the debitor / creditor number is available.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingContactApi apiInstance = new AccountingContactApi();
Integer contactId = 56; // Integer | If you want to exclude a contact from getting checked you can provide its id here
String contactObjectName = "contactObjectName_example"; // String | Contact object name
String debitorNumber = "debitorNumber_example"; // String | debitor number of which you want to know if it is available
String creditorNumber = "creditorNumber_example"; // String | creditor number of which you want to know if it is available
try {
    apiInstance.accountingContactIsAvailableDebitorCreditorNumber(contactId, contactObjectName, debitorNumber, creditorNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingContactApi#accountingContactIsAvailableDebitorCreditorNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Integer**| If you want to exclude a contact from getting checked you can provide its id here | [optional]
 **contactObjectName** | **String**| Contact object name | [optional]
 **debitorNumber** | **String**| debitor number of which you want to know if it is available | [optional]
 **creditorNumber** | **String**| creditor number of which you want to know if it is available | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addAccountingContact"></a>
# **addAccountingContact**
> ModelAccountingContact addAccountingContact()

Create a new accounting contact

Calls AccountingContact.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingContactApi apiInstance = new AccountingContactApi();
try {
    ModelAccountingContact result = apiInstance.addAccountingContact();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingContactApi#addAccountingContact");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelAccountingContact**](ModelAccountingContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteAccountingContact"></a>
# **deleteAccountingContact**
> deleteAccountingContact(id)

Delete an existing accounting contact

Calls the delete() function in AccountingContact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingContactApi apiInstance = new AccountingContactApi();
Integer id = 56; // Integer | id of accounting contact you want to delete
try {
    apiInstance.deleteAccountingContact(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingContactApi#deleteAccountingContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting contact you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountingContacts"></a>
# **getAccountingContacts**
> ModelAccountingContact getAccountingContacts(limit, offset, embed)

Get an overview of all accounting contacts

Calls AccountingContact.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingContactApi apiInstance = new AccountingContactApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned discounts start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelAccountingContact result = apiInstance.getAccountingContacts(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingContactApi#getAccountingContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned discounts start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelAccountingContact**](ModelAccountingContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAccountingContact"></a>
# **updateAccountingContact**
> ModelAccountingContact updateAccountingContact(id)

Update an existing accounting contact

Calls AccountingContact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AccountingContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountingContactApi apiInstance = new AccountingContactApi();
Integer id = 56; // Integer | id of accounting contact you want to update
try {
    ModelAccountingContact result = apiInstance.updateAccountingContact(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingContactApi#updateAccountingContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of accounting contact you want to update |

### Return type

[**ModelAccountingContact**](ModelAccountingContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


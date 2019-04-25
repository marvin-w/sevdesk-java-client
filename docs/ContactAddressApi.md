# ContactAddressApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactAddress**](ContactAddressApi.md#addContactAddress) | **POST** /ContactAddress | Create a new contact address
[**deleteContactAddress**](ContactAddressApi.md#deleteContactAddress) | **DELETE** /ContactAddress/{id} | Delete an existing contact address
[**getContactAddresses**](ContactAddressApi.md#getContactAddresses) | **GET** /ContactAddress | Get an overview of all contact addresses
[**updateContactAddress**](ContactAddressApi.md#updateContactAddress) | **PUT** /ContactAddress/{id} | Update an existing contact address

<a name="addContactAddress"></a>
# **addContactAddress**
> ModelContactAddress addContactAddress()

Create a new contact address

Calls ContactAddress.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactAddressApi apiInstance = new ContactAddressApi();
try {
    ModelContactAddress result = apiInstance.addContactAddress();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactAddressApi#addContactAddress");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteContactAddress"></a>
# **deleteContactAddress**
> deleteContactAddress(id)

Delete an existing contact address

Calls the delete() function in ContactAddress.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactAddressApi apiInstance = new ContactAddressApi();
Integer id = 56; // Integer | id of contact address you want to delete
try {
    apiInstance.deleteContactAddress(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactAddressApi#deleteContactAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of contact address you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContactAddresses"></a>
# **getContactAddresses**
> ModelContactAddress getContactAddresses(limit, offset, embed)

Get an overview of all contact addresses

Calls ContactAddress.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactAddressApi apiInstance = new ContactAddressApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned contacts start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelContactAddress result = apiInstance.getContactAddresses(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactAddressApi#getContactAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned contacts start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateContactAddress"></a>
# **updateContactAddress**
> ModelContactAddress updateContactAddress(id)

Update an existing contact address

Calls ContactAddress.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactAddressApi apiInstance = new ContactAddressApi();
Integer id = 56; // Integer | id of contact address you want to update
try {
    ModelContactAddress result = apiInstance.updateContactAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactAddressApi#updateContactAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of contact address you want to update |

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


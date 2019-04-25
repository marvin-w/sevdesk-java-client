# ContactApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAddress**](ContactApi.md#addAddress) | **POST** /Contact/{id}/addAddress | Add an address
[**addContact**](ContactApi.md#addContact) | **POST** /Contact | Create a new contact of type person or company
[**addContactCommunicationWay**](ContactApi.md#addContactCommunicationWay) | **POST** /Contact/{id}/addCommunicationWay | Create a new communication way for a contact
[**addMobile**](ContactApi.md#addMobile) | **POST** /Contact/{id}/addMobile | Add a new mobile number
[**addPhone**](ContactApi.md#addPhone) | **POST** /Contact/{id}/addPhone | Add a new phone number
[**addWebsite**](ContactApi.md#addWebsite) | **POST** /Contact/{id}/addWeb | Add a new website
[**contactAddEmail**](ContactApi.md#contactAddEmail) | **POST** /Contact/{id}/addEmail | Add a new email
[**contactFactoryCreateContact**](ContactApi.md#contactFactoryCreateContact) | **POST** /Contact/Factory/create | Create a new contact of type person or company
[**contactGetAddresses**](ContactApi.md#contactGetAddresses) | **GET** /Contact/{id}/getAddresses | Get the addresses of a specified contact
[**deleteContact**](ContactApi.md#deleteContact) | **DELETE** /Contact/{id} | Delete an existing contact
[**getContactBillingAddress**](ContactApi.md#getContactBillingAddress) | **GET** /Contact/{id}/getBillingAddress | Get the billing address of a specified contact
[**getContactBillingEmail**](ContactApi.md#getContactBillingEmail) | **GET** /Contact/{id}/getBillingEmail | Get the billing email of a specified contact
[**getContactCommunicationWays**](ContactApi.md#getContactCommunicationWays) | **GET** /Contact/{id}/getCommunicationWays | Get the communication ways of a specified contact
[**getContactMainAddress**](ContactApi.md#getContactMainAddress) | **GET** /Contact/{id}/getMainAddress | Get the main address of a specified contact
[**getContactMainEmail**](ContactApi.md#getContactMainEmail) | **GET** /Contact/{id}/getMainEmail | Get the main email of a specified contact
[**getContactMainMobile**](ContactApi.md#getContactMainMobile) | **GET** /Contact/{id}/getMainMobile | Get the main mobile of a specified contact
[**getContactMainPhone**](ContactApi.md#getContactMainPhone) | **GET** /Contact/{id}/getMainPhone | Get the main phone of a specified contact
[**getContactMainWebsite**](ContactApi.md#getContactMainWebsite) | **GET** /Contact/{id}/getMainWebsite | Get the main website of a specified contact
[**getContactRelatedCommunicationWays**](ContactApi.md#getContactRelatedCommunicationWays) | **GET** /Contact/{id}/getRelatedCommunicationWays | Get the related communication ways of a specified contact
[**getContactTabsItemCount**](ContactApi.md#getContactTabsItemCount) | **GET** /Contact/{id}/getTabsItemCount | Get number of all invoices, orders, etc. of a specified contact
[**getContacts**](ContactApi.md#getContacts) | **GET** /Contact | Get an overview of all contacts
[**getNextCustomerNumber**](ContactApi.md#getNextCustomerNumber) | **GET** /Contact/Factory/getNextCustomerNumber | Get the next customer number
[**updateContact**](ContactApi.md#updateContact) | **PUT** /Contact/{id} | Update an existing contact

<a name="addAddress"></a>
# **addAddress**
> ModelContactAddress addAddress(id)

Add an address

Adds an address to the contact by calling addAddress() in Contact.php. Address is defined in ContactAddress.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to add an address to
try {
    ModelContactAddress result = apiInstance.addAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to add an address to |

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="addContact"></a>
# **addContact**
> ModelContact addContact()

Create a new contact of type person or company

Creating a new contact of type person/company calls a shared path with the same http-verb.  However, both types require certain parameters which will indicate that their type of contact should be created.  So, using **familyname** or **name** in front of &#x27;category&#x27; will define if either a person or a company is created

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
try {
    ModelContact result = apiInstance.addContact();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addContact");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelContact**](ModelContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="addContactCommunicationWay"></a>
# **addContactCommunicationWay**
> ModelCommunicationWay addContactCommunicationWay(id, value, key, type)

Create a new communication way for a contact

Calls addCommunicationWay() in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to add a communication way to
String value = "value_example"; // String | Value of the communication way you want to add
Integer key = 56; // Integer | Key of the communication way you want to add
String type = "type_example"; // String | Type of communication way you want to add
try {
    ModelCommunicationWay result = apiInstance.addContactCommunicationWay(id, value, key, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addContactCommunicationWay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to add a communication way to |
 **value** | **String**| Value of the communication way you want to add |
 **key** | **Integer**| Key of the communication way you want to add |
 **type** | **String**| Type of communication way you want to add | [optional] [enum: WEB, PHONE, EMAIL, MOBILE]

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="addMobile"></a>
# **addMobile**
> addMobile(id)

Add a new mobile number

Calls addMobile in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to update
try {
    apiInstance.addMobile(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addMobile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to update |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addPhone"></a>
# **addPhone**
> addPhone(id)

Add a new phone number

Calls addPhone() in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to update
try {
    apiInstance.addPhone(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to update |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addWebsite"></a>
# **addWebsite**
> addWebsite(id)

Add a new website

Calls addWeb() in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to update
try {
    apiInstance.addWebsite(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#addWebsite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to update |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="contactAddEmail"></a>
# **contactAddEmail**
> contactAddEmail(id)

Add a new email

Calls addEmail() in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to update
try {
    apiInstance.contactAddEmail(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactAddEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to update |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="contactFactoryCreateContact"></a>
# **contactFactoryCreateContact**
> ModelContact contactFactoryCreateContact()

Create a new contact of type person or company

With the new version of sevdesk some models are not created by calling the model.php directly but by calling the factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;    Creating a new contact of type person/company calls a shared path with the same http-verb.    However, both types require certain parameters which will indicate that their type of contact should be created.    So, using **familyname** or **name** in front of &#x27;category&#x27; will define if either a person or a company is created

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
try {
    ModelContact result = apiInstance.contactFactoryCreateContact();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactFactoryCreateContact");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelContact**](ModelContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="contactGetAddresses"></a>
# **contactGetAddresses**
> ModelContactAddress contactGetAddresses(id, categoryId, categoryObjectName)

Get the addresses of a specified contact

Calls getAddresses() in Contact.php to get the addresses of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the addresses from
Integer categoryId = 56; // Integer | Category of addresses you want to get
String categoryObjectName = "categoryObjectName_example"; // String | 
try {
    ModelContactAddress result = apiInstance.contactGetAddresses(id, categoryId, categoryObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactGetAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the addresses from |
 **categoryId** | **Integer**| Category of addresses you want to get |
 **categoryObjectName** | **String**|  |

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(id)

Delete an existing contact

Calls the delete() function in Contact.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | id of contact you want to delete
try {
    apiInstance.deleteContact(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#deleteContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of contact you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContactBillingAddress"></a>
# **getContactBillingAddress**
> ModelContactAddress getContactBillingAddress(id)

Get the billing address of a specified contact

Calls getBillingAddress() in Contact.php to get the billing address of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the billing address from
try {
    ModelContactAddress result = apiInstance.getContactBillingAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the billing address from |

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactBillingEmail"></a>
# **getContactBillingEmail**
> ModelCommunicationWay getContactBillingEmail(id)

Get the billing email of a specified contact

Calls getBillingEmail() in Contact.php to get the billing email of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the billing email from
try {
    ModelCommunicationWay result = apiInstance.getContactBillingEmail(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactBillingEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the billing email from |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactCommunicationWays"></a>
# **getContactCommunicationWays**
> ModelCommunicationWay getContactCommunicationWays(id, type)

Get the communication ways of a specified contact

Calls getCommunicationWays() in Contact.php to get the communication ways of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the communication ways from
String type = "type_example"; // String | Type of communication ways you want to get
try {
    ModelCommunicationWay result = apiInstance.getContactCommunicationWays(id, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactCommunicationWays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the communication ways from |
 **type** | **String**| Type of communication ways you want to get | [optional] [enum: WEB, PHONE, EMAIL, MOBILE]

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactMainAddress"></a>
# **getContactMainAddress**
> ModelContactAddress getContactMainAddress(id)

Get the main address of a specified contact

Calls getMainAddress() in Contact.php to get the main address of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the main address from
try {
    ModelContactAddress result = apiInstance.getContactMainAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactMainAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the main address from |

### Return type

[**ModelContactAddress**](ModelContactAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactMainEmail"></a>
# **getContactMainEmail**
> ModelCommunicationWay getContactMainEmail(id)

Get the main email of a specified contact

Calls getMainEmail() in Contact.php to get the main email of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the main email from
try {
    ModelCommunicationWay result = apiInstance.getContactMainEmail(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactMainEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the main email from |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactMainMobile"></a>
# **getContactMainMobile**
> ModelCommunicationWay getContactMainMobile(id)

Get the main mobile of a specified contact

Calls getMainMobile() in Contact.php to get the main mobile of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the main mobile from
try {
    ModelCommunicationWay result = apiInstance.getContactMainMobile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactMainMobile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the main mobile from |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactMainPhone"></a>
# **getContactMainPhone**
> ModelCommunicationWay getContactMainPhone(id)

Get the main phone of a specified contact

Calls getMainPhone() in Contact.php to get the main phone of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the main phone from
try {
    ModelCommunicationWay result = apiInstance.getContactMainPhone(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactMainPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the main phone from |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactMainWebsite"></a>
# **getContactMainWebsite**
> ModelCommunicationWay getContactMainWebsite(id)

Get the main website of a specified contact

Calls getMainWebsite() in Contact.php to get the main website of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the main website from
try {
    ModelCommunicationWay result = apiInstance.getContactMainWebsite(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactMainWebsite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the main website from |

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactRelatedCommunicationWays"></a>
# **getContactRelatedCommunicationWays**
> ModelCommunicationWay getContactRelatedCommunicationWays(id, type)

Get the related communication ways of a specified contact

Calls getRelatedCommunicationWays() in Contact.php to get the related communication ways of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the related communication ways from
String type = "type_example"; // String | Type of related communication ways you want to get
try {
    ModelCommunicationWay result = apiInstance.getContactRelatedCommunicationWays(id, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactRelatedCommunicationWays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the related communication ways from |
 **type** | **String**| Type of related communication ways you want to get | [optional] [enum: WEB, PHONE, EMAIL, MOBILE]

### Return type

[**ModelCommunicationWay**](ModelCommunicationWay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getContactTabsItemCount"></a>
# **getContactTabsItemCount**
> getContactTabsItemCount(id)

Get number of all invoices, orders, etc. of a specified contact

Calls getTabsItemCount() in Contact.php to get the number of all invoices, orders, etc. of a specified contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of the contact you want to get the number of all invoices, orders, etc. from
try {
    apiInstance.getContactTabsItemCount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactTabsItemCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the contact you want to get the number of all invoices, orders, etc. from |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContacts"></a>
# **getContacts**
> ModelContact getContacts(depth, limit, offset, embed)

Get an overview of all contacts

Calls Contact.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer depth = 56; // Integer | If depth is set 1 companies and persons will be shown, otherwise only the companies will be shown. Default: 0
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned contacts start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelContact result = apiInstance.getContacts(depth, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **Integer**| If depth is set 1 companies and persons will be shown, otherwise only the companies will be shown. Default: 0 | [optional]
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned contacts start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelContact**](ModelContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getNextCustomerNumber"></a>
# **getNextCustomerNumber**
> getNextCustomerNumber()

Get the next customer number

Get the next customer number in the sequence

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
try {
    apiInstance.getNextCustomerNumber();
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getNextCustomerNumber");
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

<a name="updateContact"></a>
# **updateContact**
> ModelContact updateContact(id)

Update an existing contact

Calls Contact.php to update an existing contact

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Integer id = 56; // Integer | Id of contact you want to update
try {
    ModelContact result = apiInstance.updateContact(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of contact you want to update |

### Return type

[**ModelContact**](ModelContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


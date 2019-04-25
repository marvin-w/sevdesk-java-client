# LetterApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLetter**](LetterApi.md#addLetter) | **POST** /Letter | Create a new letter
[**deleteLetter**](LetterApi.md#deleteLetter) | **DELETE** /Letter/{id} | Delete an existing letter
[**getLetters**](LetterApi.md#getLetters) | **GET** /Letter | Get an overview of all letters
[**letterGetPdf**](LetterApi.md#letterGetPdf) | **GET** /Letter/{id}/getPdf | Get pdf from docserver
[**letterRender**](LetterApi.md#letterRender) | **POST** /Letter/{id}/render | Render a letter to the docserver and return the metadata
[**letterSendBy**](LetterApi.md#letterSendBy) | **PUT** /Letter/{id}/sendBy | Update parameter sendType
[**letterSendViaMail**](LetterApi.md#letterSendViaMail) | **POST** /Letter/{id}/sendViaEmail | Send a letter via mail
[**letterSendViaPost**](LetterApi.md#letterSendViaPost) | **POST** /Letter/{id}/sendViaPost | Send a letter via post
[**updateLetter**](LetterApi.md#updateLetter) | **PUT** /Letter/{id} | Update an existing letter

<a name="addLetter"></a>
# **addLetter**
> ModelLetter addLetter()

Create a new letter

Calls Letter.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
try {
    ModelLetter result = apiInstance.addLetter();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#addLetter");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelLetter**](ModelLetter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteLetter"></a>
# **deleteLetter**
> deleteLetter(id)

Delete an existing letter

Calls the delete() function in Letter.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter you want to delete
try {
    apiInstance.deleteLetter(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#deleteLetter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLetters"></a>
# **getLetters**
> ModelLetter getLetters(limit, offset, embed)

Get an overview of all letters

Calls Letter.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned letters start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelLetter result = apiInstance.getLetters(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#getLetters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned letters start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelLetter**](ModelLetter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="letterGetPdf"></a>
# **letterGetPdf**
> letterGetPdf(id)

Get pdf from docserver

Calls getPdf() in Letter.php to get the pdf of a specified letter from the docserver

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | Id of the letter of which you want to get the pdf
try {
    apiInstance.letterGetPdf(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterGetPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the letter of which you want to get the pdf |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="letterRender"></a>
# **letterRender**
> letterRender(id)

Render a letter to the docserver and return the metadata

Calls render() in Letter.php to render a letter to the docserver and return the metadata.    Note that this does not work for letters created by calling the api directly (eg. over Swagger)!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter you want to render
try {
    apiInstance.letterRender(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterRender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter you want to render |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="letterSendBy"></a>
# **letterSendBy**
> ModelLetter letterSendBy(id)

Update parameter sendType

Calls sendBy() in Letter.php to update the sendType parameter of the letter and change its status to DELIVERED

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter of which you want to update the sendType parameter
try {
    ModelLetter result = apiInstance.letterSendBy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterSendBy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter of which you want to update the sendType parameter |

### Return type

[**ModelLetter**](ModelLetter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="letterSendViaMail"></a>
# **letterSendViaMail**
> letterSendViaMail(id)

Send a letter via mail

Calls sendViaMail() in Letter.php to send a letter via mail.    Note that you can not send a letter created by calling the api directly (eg. over Swagger)!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter you want to send
try {
    apiInstance.letterSendViaMail(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterSendViaMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter you want to send |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="letterSendViaPost"></a>
# **letterSendViaPost**
> letterSendViaPost(id)

Send a letter via post

Calls sendViaPost() in Letter.php to send a letter via post if enabled in your subscription    Note that you can not send a letter created by calling the api directly (eg. over Swagger)!

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter you want to send
try {
    apiInstance.letterSendViaPost(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterSendViaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter you want to send |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateLetter"></a>
# **updateLetter**
> ModelLetter updateLetter(id)

Update an existing letter

Calls Letter.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LetterApi apiInstance = new LetterApi();
Integer id = 56; // Integer | id of letter you want to update
try {
    ModelLetter result = apiInstance.updateLetter(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#updateLetter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of letter you want to update |

### Return type

[**ModelLetter**](ModelLetter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


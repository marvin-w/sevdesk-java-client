# HelpApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helpGetArticle**](HelpApi.md#helpGetArticle) | **GET** /Help/getArticle | Get a specified article
[**helpGetArticles**](HelpApi.md#helpGetArticles) | **GET** /Help/getArticles | Get all help articles for a specified section
[**helpGetCategories**](HelpApi.md#helpGetCategories) | **GET** /Help/getCategories | Get all categories of help articles
[**helpGetSections**](HelpApi.md#helpGetSections) | **GET** /Help/getSections | Get all sections of help articles
[**helpSearchArticles**](HelpApi.md#helpSearchArticles) | **GET** /Help/search | Search for articles

<a name="helpGetArticle"></a>
# **helpGetArticle**
> ModelHelp helpGetArticle(articleId)

Get a specified article

Calls getArticle() in Help.php to get a specified help article

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.HelpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

HelpApi apiInstance = new HelpApi();
Integer articleId = 56; // Integer | Id of the article you want to get
try {
    ModelHelp result = apiInstance.helpGetArticle(articleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelpApi#helpGetArticle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **Integer**| Id of the article you want to get |

### Return type

[**ModelHelp**](ModelHelp.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="helpGetArticles"></a>
# **helpGetArticles**
> ModelHelp helpGetArticles(sectionId, limit, offset)

Get all help articles for a specified section

Calls getArticles() in Help.php to get all help articles for a specified section

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.HelpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

HelpApi apiInstance = new HelpApi();
Integer sectionId = 56; // Integer | Section id you want to get help articles about
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned help articles start. Default is 0
try {
    ModelHelp result = apiInstance.helpGetArticles(sectionId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelpApi#helpGetArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **Integer**| Section id you want to get help articles about |
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned help articles start. Default is 0 | [optional]

### Return type

[**ModelHelp**](ModelHelp.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="helpGetCategories"></a>
# **helpGetCategories**
> ModelHelp helpGetCategories(limit, offset)

Get all categories of help articles

Calls getCategories() in Help.php to get all categories available for searching help articles

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.HelpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

HelpApi apiInstance = new HelpApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned sections start. Default is 0
try {
    ModelHelp result = apiInstance.helpGetCategories(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelpApi#helpGetCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned sections start. Default is 0 | [optional]

### Return type

[**ModelHelp**](ModelHelp.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="helpGetSections"></a>
# **helpGetSections**
> ModelHelp helpGetSections(limit, offset)

Get all sections of help articles

Calls getSections() in Help.php to get all sections available for searching help articles

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.HelpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

HelpApi apiInstance = new HelpApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned sections start. Default is 0
try {
    ModelHelp result = apiInstance.helpGetSections(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelpApi#helpGetSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned sections start. Default is 0 | [optional]

### Return type

[**ModelHelp**](ModelHelp.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="helpSearchArticles"></a>
# **helpSearchArticles**
> ModelHelp helpSearchArticles(name)

Search for articles

Calls search() in Help.php to search for articles

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.HelpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

HelpApi apiInstance = new HelpApi();
String name = "name_example"; // String | String to search for
try {
    ModelHelp result = apiInstance.helpSearchArticles(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelpApi#helpSearchArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| String to search for | [optional]

### Return type

[**ModelHelp**](ModelHelp.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


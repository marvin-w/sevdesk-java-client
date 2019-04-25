# DocServerApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**docServerDeleteLetterPaper**](DocServerApi.md#docServerDeleteLetterPaper) | **POST** /DocServer/deleteLetterpaper | Delete a specified letter paper
[**docServerDeleteTemplate**](DocServerApi.md#docServerDeleteTemplate) | **POST** /DocServer/deleteTemplate | Delete a specified template
[**docServerGetLetterPapers**](DocServerApi.md#docServerGetLetterPapers) | **GET** /DocServer/getLetterpapers | Get an overview of all letter papers
[**docServerGetLetterPapersWithThumb**](DocServerApi.md#docServerGetLetterPapersWithThumb) | **GET** /DocServer/getLetterpapersWithThumb | Get an overview of all letter papers with their thumb
[**docServerGetTemplates**](DocServerApi.md#docServerGetTemplates) | **GET** /DocServer/getTemplates | Get an overview of all templates
[**docServerGetTemplatesWithThumb**](DocServerApi.md#docServerGetTemplatesWithThumb) | **GET** /DocServer/getTemplatesWithThumb | Get an overview of all templates with their thumb
[**docServerSetDefaultLetterPaper**](DocServerApi.md#docServerSetDefaultLetterPaper) | **POST** /DocServer/setDefaultLetterpaper | Set a letter papers as the default letter paper
[**docServerSetDefaultTemplate**](DocServerApi.md#docServerSetDefaultTemplate) | **POST** /DocServer/setDefaultTemplate | Set a template as the default template
[**docServerStoreLetterPaper**](DocServerApi.md#docServerStoreLetterPaper) | **POST** /DocServer/storeLetterpaper | Store a letter paper on the doc server
[**docServerStoreTemplate**](DocServerApi.md#docServerStoreTemplate) | **POST** /DocServer/storeTemplate | Store a template on the doc server
[**docServerTestLetterPaper**](DocServerApi.md#docServerTestLetterPaper) | **POST** /DocServer/testLetterpaper | Test a letter paper
[**docServerTestTemplate**](DocServerApi.md#docServerTestTemplate) | **POST** /DocServer/testTemplate | Test a template

<a name="docServerDeleteLetterPaper"></a>
# **docServerDeleteLetterPaper**
> docServerDeleteLetterPaper()

Delete a specified letter paper

Calls deleteLetterpaper() in DocServer.php to delete a specified letter paper

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerDeleteLetterPaper();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerDeleteLetterPaper");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerDeleteTemplate"></a>
# **docServerDeleteTemplate**
> docServerDeleteTemplate()

Delete a specified template

Calls setDefaultTemplate() in DocServer.php to set the specified template as the default template

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerDeleteTemplate();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerDeleteTemplate");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerGetLetterPapers"></a>
# **docServerGetLetterPapers**
> docServerGetLetterPapers()

Get an overview of all letter papers

Calls getLetterpapers() in DocServer.php to get the stored letter papers

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerGetLetterPapers();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerGetLetterPapers");
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

<a name="docServerGetLetterPapersWithThumb"></a>
# **docServerGetLetterPapersWithThumb**
> docServerGetLetterPapersWithThumb()

Get an overview of all letter papers with their thumb

Calls getLetterpapersWithThumb() in DocServer.php to get the stored letter papers with their thumb.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerGetLetterPapersWithThumb();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerGetLetterPapersWithThumb");
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

<a name="docServerGetTemplates"></a>
# **docServerGetTemplates**
> docServerGetTemplates()

Get an overview of all templates

Calls getTemplates() in DocServer.php to get the stored templates.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerGetTemplates();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerGetTemplates");
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

<a name="docServerGetTemplatesWithThumb"></a>
# **docServerGetTemplatesWithThumb**
> docServerGetTemplatesWithThumb()

Get an overview of all templates with their thumb

Calls getTemplatesWithThumb() in DocServer.php to get the stored templates with their thumb.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerGetTemplatesWithThumb();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerGetTemplatesWithThumb");
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

<a name="docServerSetDefaultLetterPaper"></a>
# **docServerSetDefaultLetterPaper**
> docServerSetDefaultLetterPaper()

Set a letter papers as the default letter paper

Calls setDefaultLetterpaper() in DocServer.php to set the specified letter paper as the default letter paper

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerSetDefaultLetterPaper();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerSetDefaultLetterPaper");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerSetDefaultTemplate"></a>
# **docServerSetDefaultTemplate**
> docServerSetDefaultTemplate()

Set a template as the default template

Calls setDefaultTemplate() in DocServer.php to set the specified template as the default template

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerSetDefaultTemplate();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerSetDefaultTemplate");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerStoreLetterPaper"></a>
# **docServerStoreLetterPaper**
> docServerStoreLetterPaper()

Store a letter paper on the doc server

Calls storeLetterpaper() in DocServer.php to store a letter paper on the doc server

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerStoreLetterPaper();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerStoreLetterPaper");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerStoreTemplate"></a>
# **docServerStoreTemplate**
> docServerStoreTemplate()

Store a template on the doc server

Calls storeTemplate() in DocServer.php to store a template on the doc server

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerStoreTemplate();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerStoreTemplate");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="docServerTestLetterPaper"></a>
# **docServerTestLetterPaper**
> docServerTestLetterPaper(file)

Test a letter paper

Calls testLetterpaper() in DocServer.php to test your letter paper by providing the pdf.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
File file = new File("file_example"); // File | 
try {
    apiInstance.docServerTestLetterPaper(file);
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerTestLetterPaper");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: Not defined

<a name="docServerTestLetterPaper"></a>
# **docServerTestLetterPaper**
> docServerTestLetterPaper(file)

Test a letter paper

Calls testLetterpaper() in DocServer.php to test your letter paper by providing the pdf.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
File file = new File("file_example"); // File | 
try {
    apiInstance.docServerTestLetterPaper(file);
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerTestLetterPaper");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: Not defined

<a name="docServerTestTemplate"></a>
# **docServerTestTemplate**
> docServerTestTemplate()

Test a template

Calls testTemplate() in DocServer.php to test your template by providing the html.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocServerApi apiInstance = new DocServerApi();
try {
    apiInstance.docServerTestTemplate();
} catch (ApiException e) {
    System.err.println("Exception when calling DocServerApi#docServerTestTemplate");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


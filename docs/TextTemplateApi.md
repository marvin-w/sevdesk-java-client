# TextTemplateApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTextTemplate**](TextTemplateApi.md#addTextTemplate) | **POST** /TextTemplate | Create a new text template
[**deleteTextTemplate**](TextTemplateApi.md#deleteTextTemplate) | **DELETE** /TextTemplate/{id} | Delete an existing text template
[**getTextTemplate**](TextTemplateApi.md#getTextTemplate) | **GET** /TextTemplate | Get an overview of all text template
[**updateTextTemplate**](TextTemplateApi.md#updateTextTemplate) | **PUT** /TextTemplate/{id} | Update an existing text template

<a name="addTextTemplate"></a>
# **addTextTemplate**
> ModelTextTemplate addTextTemplate()

Create a new text template

Calls TextTemplate.php to create a new text template

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TextTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TextTemplateApi apiInstance = new TextTemplateApi();
try {
    ModelTextTemplate result = apiInstance.addTextTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextTemplateApi#addTextTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelTextTemplate**](ModelTextTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteTextTemplate"></a>
# **deleteTextTemplate**
> deleteTextTemplate(id)

Delete an existing text template

Calls TextTemplate.php to delete a text template

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TextTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TextTemplateApi apiInstance = new TextTemplateApi();
Integer id = 56; // Integer | Id of text template you want to delete
try {
    apiInstance.deleteTextTemplate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TextTemplateApi#deleteTextTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of text template you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTextTemplate"></a>
# **getTextTemplate**
> ModelTextTemplate getTextTemplate(limit, offset, embed)

Get an overview of all text template

Calls TextTemplate.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TextTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TextTemplateApi apiInstance = new TextTemplateApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned text templates start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelTextTemplate result = apiInstance.getTextTemplate(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextTemplateApi#getTextTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned text templates start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelTextTemplate**](ModelTextTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateTextTemplate"></a>
# **updateTextTemplate**
> ModelTextTemplate updateTextTemplate(id)

Update an existing text template

Calls TextTemplate.php to update an existing text template

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.TextTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TextTemplateApi apiInstance = new TextTemplateApi();
Integer id = 56; // Integer | Id of text template you want to update
try {
    ModelTextTemplate result = apiInstance.updateTextTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextTemplateApi#updateTextTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of text template you want to update |

### Return type

[**ModelTextTemplate**](ModelTextTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


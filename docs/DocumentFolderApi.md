# DocumentFolderApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocumentFolder**](DocumentFolderApi.md#addDocumentFolder) | **POST** /DocumentFolder | Create a new document folder
[**deleteDocumentFolder**](DocumentFolderApi.md#deleteDocumentFolder) | **DELETE** /DocumentFolder/{id} | Delete an existing document folder
[**emptyBin**](DocumentFolderApi.md#emptyBin) | **DELETE** /DocumentFolder/emptyBin | Delete all objects in the bin
[**getDocumentFolderChildren**](DocumentFolderApi.md#getDocumentFolderChildren) | **GET** /DocumentFolder/{id}/getChildren | Returns children (documents and document folders) as &#x27;nodes&#x27; and count of all children as &#x27;total&#x27;
[**getDocumentFolderDocuments**](DocumentFolderApi.md#getDocumentFolderDocuments) | **GET** /DocumentFolder/{id}/getDocuments | Get an overview of all documents in a document folder
[**getDocumentFolderFolders**](DocumentFolderApi.md#getDocumentFolderFolders) | **GET** /DocumentFolder/{id}/getFolders | Get an overview of all folders in a document folder
[**getDocumentFolderPath**](DocumentFolderApi.md#getDocumentFolderPath) | **GET** /DocumentFolder/{id}/getPath | Get path (all parent folders) of this folder
[**getDocumentFolders**](DocumentFolderApi.md#getDocumentFolders) | **GET** /DocumentFolder | Get an overview of all document folders
[**trashDocumentFolder**](DocumentFolderApi.md#trashDocumentFolder) | **PUT** /DocumentFolder/{id}/trash | Trash an existing document folder
[**updateDocumentFolder**](DocumentFolderApi.md#updateDocumentFolder) | **PUT** /DocumentFolder/{id} | Update an existing document folder

<a name="addDocumentFolder"></a>
# **addDocumentFolder**
> ModelDocumentFolder addDocumentFolder()

Create a new document folder

Calls DocumentFolder.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
try {
    ModelDocumentFolder result = apiInstance.addDocumentFolder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#addDocumentFolder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteDocumentFolder"></a>
# **deleteDocumentFolder**
> deleteDocumentFolder(id)

Delete an existing document folder

Calls the delete() function in DocumentFolder.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | id of document folder you want to delete
try {
    apiInstance.deleteDocumentFolder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#deleteDocumentFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document folder you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="emptyBin"></a>
# **emptyBin**
> emptyBin()

Delete all objects in the bin

Calls the emptyBin() function in DocumentFolder.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
try {
    apiInstance.emptyBin();
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#emptyBin");
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

<a name="getDocumentFolderChildren"></a>
# **getDocumentFolderChildren**
> ModelDocumentFolder getDocumentFolderChildren(id, limit, offset, embed)

Returns children (documents and document folders) as &#x27;nodes&#x27; and count of all children as &#x27;total&#x27;

Calls getChildren() in DocumentFolder.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | Document folder of which you want to get the children
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned children start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDocumentFolder result = apiInstance.getDocumentFolderChildren(id, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#getDocumentFolderChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Document folder of which you want to get the children |
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned children start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDocumentFolderDocuments"></a>
# **getDocumentFolderDocuments**
> ModelDocumentFolder getDocumentFolderDocuments(id, limit, offset, embed)

Get an overview of all documents in a document folder

Calls getDocuments() in DocumentFolder.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | Document folder of which you want to get the containing documents
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned documents start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDocumentFolder result = apiInstance.getDocumentFolderDocuments(id, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#getDocumentFolderDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Document folder of which you want to get the containing documents |
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned documents start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDocumentFolderFolders"></a>
# **getDocumentFolderFolders**
> ModelDocumentFolder getDocumentFolderFolders(id, limit, offset, embed)

Get an overview of all folders in a document folder

Calls getFolders() in DocumentFolder.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | Document folder of which you want to get the containing folders
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned folders start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDocumentFolder result = apiInstance.getDocumentFolderFolders(id, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#getDocumentFolderFolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Document folder of which you want to get the containing folders |
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned folders start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDocumentFolderPath"></a>
# **getDocumentFolderPath**
> ModelDocumentFolder getDocumentFolderPath(id)

Get path (all parent folders) of this folder

Calls getPath() in DocumentFolder.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | Document folder of which you want to get the path
try {
    ModelDocumentFolder result = apiInstance.getDocumentFolderPath(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#getDocumentFolderPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Document folder of which you want to get the path |

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDocumentFolders"></a>
# **getDocumentFolders**
> ModelDocumentFolder getDocumentFolders(limit, offset, embed)

Get an overview of all document folders

Calls DocumentFolder.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned document folders start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDocumentFolder result = apiInstance.getDocumentFolders(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#getDocumentFolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned document folders start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="trashDocumentFolder"></a>
# **trashDocumentFolder**
> trashDocumentFolder(id)

Trash an existing document folder

Calls trash() in DocumentFolder.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | id of document folder you want to trash
try {
    apiInstance.trashDocumentFolder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#trashDocumentFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document folder you want to trash |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDocumentFolder"></a>
# **updateDocumentFolder**
> ModelDocumentFolder updateDocumentFolder(id)

Update an existing document folder

Calls DocumentFolder.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentFolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentFolderApi apiInstance = new DocumentFolderApi();
Integer id = 56; // Integer | id of document folder you want to update
try {
    ModelDocumentFolder result = apiInstance.updateDocumentFolder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentFolderApi#updateDocumentFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document folder you want to update |

### Return type

[**ModelDocumentFolder**](ModelDocumentFolder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


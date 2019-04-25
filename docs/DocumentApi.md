# DocumentApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](DocumentApi.md#addDocument) | **POST** /Document | Create a new document. Be aware that there wont be a working document with content!
[**deleteDocument**](DocumentApi.md#deleteDocument) | **DELETE** /Document/{id} | Delete an existing document
[**downloadDocument**](DocumentApi.md#downloadDocument) | **GET** /Document/{id}/download | Download a document
[**factoryAddDocument**](DocumentApi.md#factoryAddDocument) | **POST** /Document/Factory/fileUpload | Upload a file (creating a document)
[**getDocuments**](DocumentApi.md#getDocuments) | **GET** /Document | Get an overview of all documents
[**updateDocument**](DocumentApi.md#updateDocument) | **PUT** /Document/{id} | Update an existing document. Be aware that you can only update its parameter but not the content of the document itself!
[**updateDocumentStatusToTrashed**](DocumentApi.md#updateDocumentStatusToTrashed) | **PUT** /Document/{id}/trash | Update an existing documents status to &#x27;TRASHED&#x27;, be aware that this deletes the document

<a name="addDocument"></a>
# **addDocument**
> ModelDocument addDocument()

Create a new document. Be aware that there wont be a working document with content!

Calls Document.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
try {
    ModelDocument result = apiInstance.addDocument();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#addDocument");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelDocument**](ModelDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(id)

Delete an existing document

Calls the delete() function in Document.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Integer id = 56; // Integer | id of document you want to delete
try {
    apiInstance.deleteDocument(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadDocument"></a>
# **downloadDocument**
> File downloadDocument(id)

Download a document

Calls download() in Document.php to download a document. Will return base64 content.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Integer id = 56; // Integer | Id of the document you want to download
try {
    File result = apiInstance.downloadDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#downloadDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the document you want to download |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="factoryAddDocument"></a>
# **factoryAddDocument**
> factoryAddDocument(file, object, folder)

Upload a file (creating a document)

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the Factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
File file = new File("file_example"); // File | 
String object = "object_example"; // String | object to which you want to upload your file
String folder = "folder_example"; // String | folder to which you want to upload your file
try {
    apiInstance.factoryAddDocument(file, object, folder);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#factoryAddDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **object** | **String**| object to which you want to upload your file | [optional]
 **folder** | **String**| folder to which you want to upload your file | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="getDocuments"></a>
# **getDocuments**
> ModelDocument getDocuments(limit, offset, embed)

Get an overview of all documents

Calls Document.php to get necessary variables

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned documents start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDocument result = apiInstance.getDocuments(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned documents start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDocument**](ModelDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateDocument"></a>
# **updateDocument**
> ModelDocument updateDocument(id)

Update an existing document. Be aware that you can only update its parameter but not the content of the document itself!

Calls Document.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Integer id = 56; // Integer | id of document you want to update
try {
    ModelDocument result = apiInstance.updateDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#updateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document you want to update |

### Return type

[**ModelDocument**](ModelDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updateDocumentStatusToTrashed"></a>
# **updateDocumentStatusToTrashed**
> Object updateDocumentStatusToTrashed(id)

Update an existing documents status to &#x27;TRASHED&#x27;, be aware that this deletes the document

Calls trash() in Document.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Integer id = 56; // Integer | id of document of which you want to update the status to 'TRASHED
try {
    Object result = apiInstance.updateDocumentStatusToTrashed(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#updateDocumentStatusToTrashed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of document of which you want to update the status to &#x27;TRASHED |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


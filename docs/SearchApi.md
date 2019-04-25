# SearchApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /Search/search | Search for a specified term

<a name="search"></a>
# **search**
> search(embed, term, searchType)

Search for a specified term

Calls search() in Search.php to search with a specified term in Contacts, Orders, Invoices, Vouchers, Documents and Parts.    It is also possible to search without defining a model, so sevDesk system operations will also be shown.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String embed = "embed_example"; // String | 
String term = "term_example"; // String | Term you want to search
List<String> searchType = Arrays.asList("searchType_example"); // List<String> | Specify a type (model) that you want to have searched
try {
    apiInstance.search(embed, term, searchType);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embed** | **String**|  | [optional]
 **term** | **String**| Term you want to search | [optional]
 **searchType** | [**List&lt;String&gt;**](String.md)| Specify a type (model) that you want to have searched | [optional] [enum: CONTACT, ORDER, INVOICE, VOUCHER, DOCUMENT, PART]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# FeedApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFeed**](FeedApi.md#addFeed) | **POST** /Feed | Create a new action which will be displayed in the feed
[**deleteFeed**](FeedApi.md#deleteFeed) | **DELETE** /Feed/{id} | Delete an existing feed action
[**getFeeds**](FeedApi.md#getFeeds) | **GET** /Feed | Get an overview of all actions from everyone, which will be displayed in the dashboard
[**getParsedObjectAction**](FeedApi.md#getParsedObjectAction) | **GET** /Feed/{id}/getParsedObjectAction | Get more information about the specific feed object
[**updateFeed**](FeedApi.md#updateFeed) | **PUT** /Feed/{id} | Update an existing Feed action

<a name="addFeed"></a>
# **addFeed**
> ModelFeed addFeed()

Create a new action which will be displayed in the feed

Calls Feed.php to add an action to the feed

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.FeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FeedApi apiInstance = new FeedApi();
try {
    ModelFeed result = apiInstance.addFeed();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedApi#addFeed");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelFeed**](ModelFeed.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteFeed"></a>
# **deleteFeed**
> deleteFeed(id)

Delete an existing feed action

Deletes a feed action

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.FeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FeedApi apiInstance = new FeedApi();
Integer id = 56; // Integer | id of feed action you want to delete
try {
    apiInstance.deleteFeed(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedApi#deleteFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of feed action you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFeeds"></a>
# **getFeeds**
> ModelFeed getFeeds(limit, offset, embed)

Get an overview of all actions from everyone, which will be displayed in the dashboard

Calls Feed.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.FeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FeedApi apiInstance = new FeedApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned feeds start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelFeed result = apiInstance.getFeeds(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedApi#getFeeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned feeds start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelFeed**](ModelFeed.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getParsedObjectAction"></a>
# **getParsedObjectAction**
> getParsedObjectAction(id)

Get more information about the specific feed object

Calls getParsedObjectAction() in Feed.php to get more information about the specified object

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.FeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FeedApi apiInstance = new FeedApi();
Integer id = 56; // Integer | Feed id of the object you want to get more information about
try {
    apiInstance.getParsedObjectAction(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedApi#getParsedObjectAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Feed id of the object you want to get more information about |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateFeed"></a>
# **updateFeed**
> ModelFeed updateFeed(id)

Update an existing Feed action

TODO: Enter short backend documentation here

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.FeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FeedApi apiInstance = new FeedApi();
Integer id = 56; // Integer | id of feed action you want to update
try {
    ModelFeed result = apiInstance.updateFeed(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedApi#updateFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of feed action you want to update |

### Return type

[**ModelFeed**](ModelFeed.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


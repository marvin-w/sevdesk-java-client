# InvoiceApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoice**](InvoiceApi.md#addInvoice) | **POST** /Invoice | Create a new invoice
[**cancelInvoice**](InvoiceApi.md#cancelInvoice) | **GET** /Invoice/{id}/cancel | Cancel an invoice
[**createInvoiceFromOrder**](InvoiceApi.md#createInvoiceFromOrder) | **POST** /Invoice/Factory/createInvoiceFromOrder | Create an new invoice from an existing order
[**createInvoiceReminder**](InvoiceApi.md#createInvoiceReminder) | **POST** /Invoice/Factory/createInvoiceReminder | Create an invoice reminder
[**deleteInvoice**](InvoiceApi.md#deleteInvoice) | **DELETE** /Invoice/{id} | Delete an existing invoice
[**duplicateInvoice**](InvoiceApi.md#duplicateInvoice) | **POST** /Invoice/{id}/duplicate | Duplicate an existing invoice
[**getInvoiceAndReminderAmount**](InvoiceApi.md#getInvoiceAndReminderAmount) | **GET** /Invoice/Factory/getTotalInvoiceReminderAndInvoiceAmount | Get amount of an invoice including reminders
[**getInvoiceAsPdf**](InvoiceApi.md#getInvoiceAsPdf) | **GET** /Invoice/{id}/getPdf | Get the invoice as a PDF
[**getInvoiceReminderAmount**](InvoiceApi.md#getInvoiceReminderAmount) | **GET** /Invoice/Factory/getTotalInvoiceReminderAmount | Get (monetary) amount of all reminders of an invoice
[**getInvoices**](InvoiceApi.md#getInvoices) | **GET** /Invoice | Get an overview of all invoices
[**getNextInvoiceNumber**](InvoiceApi.md#getNextInvoiceNumber) | **GET** /Invoice/Factory/getNextInvoiceNumber | Get the next invoice number
[**invoiceAddPosition**](InvoiceApi.md#invoiceAddPosition) | **PUT** /Invoice/{id}/addPosition | Add a position to an existing invoice
[**invoiceBookAmount**](InvoiceApi.md#invoiceBookAmount) | **PUT** /Invoice/{id}/bookAmmount | Book amount for an invoice
[**invoiceCalcTotalDebit**](InvoiceApi.md#invoiceCalcTotalDebit) | **GET** /Invoice/calcTotalDebit | Calculate total sum of all invoices of current query
[**invoiceCalculateDunningLevel**](InvoiceApi.md#invoiceCalculateDunningLevel) | **GET** /Invoice/{id}/calculateDunningLevel | Get dunning level of an invoice
[**invoiceChangeStatus**](InvoiceApi.md#invoiceChangeStatus) | **PUT** /Invoice/{id}/changeStatus | Change status of an invoice
[**invoiceGetCancled**](InvoiceApi.md#invoiceGetCancled) | **GET** /Invoice/{id}/getCancled | Returns if an invoice is cancled
[**invoiceGetCheckAccountTransactionLogs**](InvoiceApi.md#invoiceGetCheckAccountTransactionLogs) | **GET** /Invoice/{id}/getCheckAccountTransactionLogs | Get check account transaction logs about a specified invoice
[**invoiceGetCheckAccountTransactions**](InvoiceApi.md#invoiceGetCheckAccountTransactions) | **GET** /Invoice/{id}/getCheckAccountTransactions | Get check account transactions of a specified invoice
[**invoiceGetDebit**](InvoiceApi.md#invoiceGetDebit) | **GET** /Invoice/{id}/getDebit | Get debit of an invoice
[**invoiceGetDelinquent**](InvoiceApi.md#invoiceGetDelinquent) | **GET** /Invoice/{id}/getDelinquent | Get if an invoice is delinquent
[**invoiceGetDiscounts**](InvoiceApi.md#invoiceGetDiscounts) | **GET** /Invoice/{id}/getDiscounts | Get the discounts of a specified invoice
[**invoiceGetDocument**](InvoiceApi.md#invoiceGetDocument) | **GET** /Invoice/{id}/getDocument | Get document of an invoice
[**invoiceGetDunnings**](InvoiceApi.md#invoiceGetDunnings) | **GET** /Invoice/{id}/getDunnings | Get invoice dunnings
[**invoiceGetFeed**](InvoiceApi.md#invoiceGetFeed) | **GET** /Invoice/{id}/getFeed | Get the feed of a specified invoice
[**invoiceGetFinalInvoiceId**](InvoiceApi.md#invoiceGetFinalInvoiceId) | **GET** /Invoice/{id}/getFinalInvoiceId | Get final invoice id
[**invoiceGetIsPartiallyPaid**](InvoiceApi.md#invoiceGetIsPartiallyPaid) | **GET** /Invoice/{id}/getIsPartiallyPaid | Returns if the invoice is partially payed
[**invoiceGetLastDunningDate**](InvoiceApi.md#invoiceGetLastDunningDate) | **GET** /Invoice/{id}/getLastDunningDate | Get last dunning date of invoice as timestamp
[**invoiceGetPartialInvoices**](InvoiceApi.md#invoiceGetPartialInvoices) | **GET** /Invoice/{id}/getPartialInvoices | Get partial invoices of a specified invoice
[**invoiceGetPositions**](InvoiceApi.md#invoiceGetPositions) | **GET** /Invoice/{id}/getPositions | Get the positions of a specified invoice
[**invoiceGetRelatedObjects**](InvoiceApi.md#invoiceGetRelatedObjects) | **GET** /Invoice/{id}/getRelatedObjects | Get related objects of a specified invoice
[**invoiceGetSwissEsr**](InvoiceApi.md#invoiceGetSwissEsr) | **GET** /Invoice/getSwissEsr | Get swiss esr
[**invoiceGetSwissEsrData**](InvoiceApi.md#invoiceGetSwissEsrData) | **GET** /Invoice/getSwissEsrData | Get swiss esr data
[**invoiceGetTags**](InvoiceApi.md#invoiceGetTags) | **GET** /Invoice/{id}/getTags | Get the tags of a specified invoice
[**invoiceGetTax**](InvoiceApi.md#invoiceGetTax) | **GET** /Invoice/{id}/getTax | Get invoice tax amount in invoice currency
[**invoiceGetTaxGroups**](InvoiceApi.md#invoiceGetTaxGroups) | **GET** /Invoice/{id}/getTaxGroupes | Get tax groups of invoice
[**invoiceGetTotal**](InvoiceApi.md#invoiceGetTotal) | **GET** /Invoice/{id}/getTotal | Get gross invoice amount in invoice currency
[**invoiceGetTotalCalc**](InvoiceApi.md#invoiceGetTotalCalc) | **GET** /Invoice/{id}/getTotalCalc | Get total invoice amount in invoice currency
[**invoiceGetTotalNet**](InvoiceApi.md#invoiceGetTotalNet) | **GET** /Invoice/{id}/getTotalNet | Get total net invoice amount in invoice currency
[**invoiceHasDiscounts**](InvoiceApi.md#invoiceHasDiscounts) | **GET** /Invoice/{id}/hasDiscounts | Returns if the specified invoice has discounts
[**invoiceIsOrigin**](InvoiceApi.md#invoiceIsOrigin) | **GET** /Invoice/{id}/isOrigin | Returns if the specified invoice is the origin of an order
[**invoiceMarkAsSent**](InvoiceApi.md#invoiceMarkAsSent) | **PUT** /Invoice/{id}/markAsSent | Marks an invoice as sent
[**invoiceRefundAmount**](InvoiceApi.md#invoiceRefundAmount) | **PUT** /Invoice/{id}/refundAmmount | Refund an already payed invoice amount
[**invoiceRender**](InvoiceApi.md#invoiceRender) | **POST** /Invoice/{id}/render | Render invoice document on docserver and return metadata
[**invoiceSendBy**](InvoiceApi.md#invoiceSendBy) | **PUT** /Invoice/{id}/sendBy | Send invoice by desired method
[**saveInvoice**](InvoiceApi.md#saveInvoice) | **POST** /Invoice/Factory/saveInvoice | Create a new invoice (with / without invoice positions and discounts) 
[**sendInvoiceViaEmail**](InvoiceApi.md#sendInvoiceViaEmail) | **POST** /Invoice/{id}/sendViaEmail | Send an invoice via Email
[**sendInvoiceViaPost**](InvoiceApi.md#sendInvoiceViaPost) | **POST** /Invoice/{id}/sendViaPost | Send an invoice via Letter
[**updateInvoice**](InvoiceApi.md#updateInvoice) | **PUT** /Invoice/{id} | Update an existing invoice

<a name="addInvoice"></a>
# **addInvoice**
> ModelInvoice addInvoice()

Create a new invoice

Calls Invoice.php 

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    ModelInvoice result = apiInstance.addInvoice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#addInvoice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="cancelInvoice"></a>
# **cancelInvoice**
> ModelInvoice cancelInvoice(id)

Cancel an invoice

Calls cancel() in Invoice.php to cancel an invoice and creates a cancellation invoice  

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice which you want to cancel
try {
    ModelInvoice result = apiInstance.cancelInvoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#cancelInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice which you want to cancel |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="createInvoiceFromOrder"></a>
# **createInvoiceFromOrder**
> ModelInvoice createInvoiceFromOrder()

Create an new invoice from an existing order

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the Factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    ModelInvoice result = apiInstance.createInvoiceFromOrder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#createInvoiceFromOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="createInvoiceReminder"></a>
# **createInvoiceReminder**
> ModelInvoice createInvoiceReminder()

Create an invoice reminder

With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the Factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    ModelInvoice result = apiInstance.createInvoiceReminder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#createInvoiceReminder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deleteInvoice"></a>
# **deleteInvoice**
> deleteInvoice(id)

Delete an existing invoice

Calls the delete() function in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to delete
try {
    apiInstance.deleteInvoice(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#deleteInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="duplicateInvoice"></a>
# **duplicateInvoice**
> ModelInvoice duplicateInvoice(id)

Duplicate an existing invoice

Calls duplicate() in Invoice.php to duplicate an existing invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to duplicate
try {
    ModelInvoice result = apiInstance.duplicateInvoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#duplicateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to duplicate |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInvoiceAndReminderAmount"></a>
# **getInvoiceAndReminderAmount**
> Object getInvoiceAndReminderAmount(invoiceId, invoiceObjectName)

Get amount of an invoice including reminders

Calls the getTotalInvoiceReminderAndInvoiceAmount function in /Invoice/Factory/ to get the amount of the invoice including its reminders.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer invoiceId = 56; // Integer | id of the invoice you want to get the total amount for
String invoiceObjectName = "invoiceObjectName_example"; // String | 
try {
    Object result = apiInstance.getInvoiceAndReminderAmount(invoiceId, invoiceObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoiceAndReminderAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Integer**| id of the invoice you want to get the total amount for |
 **invoiceObjectName** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInvoiceAsPdf"></a>
# **getInvoiceAsPdf**
> getInvoiceAsPdf(id, download)

Get the invoice as a PDF

Calls getPdf in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the PDF
Boolean download = true; // Boolean | If true PDF will return as filestream otherwise as json object the content base64 encoded
try {
    apiInstance.getInvoiceAsPdf(id, download);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoiceAsPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the PDF |
 **download** | **Boolean**| If true PDF will return as filestream otherwise as json object the content base64 encoded |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInvoiceReminderAmount"></a>
# **getInvoiceReminderAmount**
> Object getInvoiceReminderAmount(invoiceId, invoiceObjectName)

Get (monetary) amount of all reminders of an invoice

Calls the getTotalInvoiceReminderAmount function in /Invoice/Factory/ to get the amount of all reminders of an invoice.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer invoiceId = 56; // Integer | id of the invoice you want to get the reminder amount for
String invoiceObjectName = "invoiceObjectName_example"; // String | 
try {
    Object result = apiInstance.getInvoiceReminderAmount(invoiceId, invoiceObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoiceReminderAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Integer**| id of the invoice you want to get the reminder amount for |
 **invoiceObjectName** | **String**|  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInvoices"></a>
# **getInvoices**
> ModelInvoice getInvoices(limit, offset, embed)

Get an overview of all invoices

Calls Invoice.php to get necessary variables. However, not all variables get their value from Invoice.php directly but from other models like Model_InvoicePos or Model_Part

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer limit = 56; // Integer | Limits the number of entries returned. Default is 100
Integer offset = 56; // Integer | Set the index where the returned invoices start. Default is 0
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInvoice result = apiInstance.getInvoices(limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of entries returned. Default is 100 | [optional]
 **offset** | **Integer**| Set the index where the returned invoices start. Default is 0 | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getNextInvoiceNumber"></a>
# **getNextInvoiceNumber**
> getNextInvoiceNumber(invoiceType, useNextNumber)

Get the next invoice number

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
String invoiceType = "invoiceType_example"; // String | defines the type of invoice you want to get the next number from
Boolean useNextNumber = true; // Boolean | By default this is true, so the invoiceNumber will increase by one otherwise the invoiceNumber will not change
try {
    apiInstance.getNextInvoiceNumber(invoiceType, useNextNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getNextInvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceType** | **String**| defines the type of invoice you want to get the next number from | [enum: RE, MA, WKR]
 **useNextNumber** | **Boolean**| By default this is true, so the invoiceNumber will increase by one otherwise the invoiceNumber will not change |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceAddPosition"></a>
# **invoiceAddPosition**
> ModelInvoice invoiceAddPosition(id)

Add a position to an existing invoice

Calls addPosition() in Invoice.php to add a position to an invoice.    This function is not required anymore as there is a function for creating Invoices in Invoice/Factory which includes adding the position.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to add a position to
try {
    ModelInvoice result = apiInstance.invoiceAddPosition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceAddPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to add a position to |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="invoiceBookAmount"></a>
# **invoiceBookAmount**
> ModelInvoiceLog invoiceBookAmount(id, ammount, date)

Book amount for an invoice

Calls bookAmmount() in Invoice.php to book an invoice amount

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to book an amount
Integer ammount = 56; // Integer | amount which should be booked
String date = "date_example"; // String | booking date
try {
    ModelInvoiceLog result = apiInstance.invoiceBookAmount(id, ammount, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceBookAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to book an amount |
 **ammount** | **Integer**| amount which should be booked |
 **date** | **String**| booking date |

### Return type

[**ModelInvoiceLog**](ModelInvoiceLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="invoiceCalcTotalDebit"></a>
# **invoiceCalcTotalDebit**
> invoiceCalcTotalDebit()

Calculate total sum of all invoices of current query

Calls calcTotalDebit() in Invoice.php to calculate total sum of all invoices of current query

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    apiInstance.invoiceCalcTotalDebit();
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCalcTotalDebit");
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

<a name="invoiceCalculateDunningLevel"></a>
# **invoiceCalculateDunningLevel**
> invoiceCalculateDunningLevel(id)

Get dunning level of an invoice

Calls calculateDunningLevel() in Invoice.php to get the dunning level of an invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the dunning level
try {
    apiInstance.invoiceCalculateDunningLevel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCalculateDunningLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the dunning level |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceChangeStatus"></a>
# **invoiceChangeStatus**
> ModelInvoice invoiceChangeStatus(id, value)

Change status of an invoice

Calls changeStatus() in Invoice.php to book an invoice amount

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to book an amount
Integer value = 56; // Integer | desired status
try {
    ModelInvoice result = apiInstance.invoiceChangeStatus(id, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceChangeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to book an amount |
 **value** | **Integer**| desired status |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetCancled"></a>
# **invoiceGetCancled**
> invoiceGetCancled(id)

Returns if an invoice is cancled

Calls getCancled() in Invoice.php to know if an invoice is cancled

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to know if it is cancled
try {
    apiInstance.invoiceGetCancled(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetCancled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to know if it is cancled |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetCheckAccountTransactionLogs"></a>
# **invoiceGetCheckAccountTransactionLogs**
> ModelCheckAccountTransactionLog invoiceGetCheckAccountTransactionLogs(id, embed)

Get check account transaction logs about a specified invoice

Calls getCheckAccountTransactionLogs() in Invoice.php to get check account transaction logs about the invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of the invoice of which you want to get the check account transaction logs
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCheckAccountTransactionLog result = apiInstance.invoiceGetCheckAccountTransactionLogs(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetCheckAccountTransactionLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the invoice of which you want to get the check account transaction logs |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCheckAccountTransactionLog**](ModelCheckAccountTransactionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetCheckAccountTransactions"></a>
# **invoiceGetCheckAccountTransactions**
> ModelCheckAccountTransaction invoiceGetCheckAccountTransactions(id, embed)

Get check account transactions of a specified invoice

Calls getCheckAccountTransactions() in Invoice.php to get check account transactions of the invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of the invoice of which you want to get the check account transactions
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelCheckAccountTransaction result = apiInstance.invoiceGetCheckAccountTransactions(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetCheckAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the invoice of which you want to get the check account transactions |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelCheckAccountTransaction**](ModelCheckAccountTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetDebit"></a>
# **invoiceGetDebit**
> invoiceGetDebit(id)

Get debit of an invoice

Calls getDebit() in Invoice.php to get debit of an invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the debit
try {
    apiInstance.invoiceGetDebit(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDebit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the debit |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetDelinquent"></a>
# **invoiceGetDelinquent**
> invoiceGetDelinquent(id)

Get if an invoice is delinquent

Calls getDelinquent() in Invoice.php to get if an invoice is delinquent

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to know if its delinquent
try {
    apiInstance.invoiceGetDelinquent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDelinquent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to know if its delinquent |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetDiscounts"></a>
# **invoiceGetDiscounts**
> ModelDiscounts invoiceGetDiscounts(id, embed)

Get the discounts of a specified invoice

Calls getDiscounts() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the discounts
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelDiscounts result = apiInstance.invoiceGetDiscounts(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDiscounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the discounts |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelDiscounts**](ModelDiscounts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetDocument"></a>
# **invoiceGetDocument**
> invoiceGetDocument(id, embed)

Get document of an invoice

Calls getDocument() in Invoice.php to get the document of an invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the document
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.invoiceGetDocument(id, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the document |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetDunnings"></a>
# **invoiceGetDunnings**
> ModelInvoice invoiceGetDunnings(id)

Get invoice dunnings

Calls getDunnings() in Invoice.php to get the dunnings of an invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the dunnings
try {
    ModelInvoice result = apiInstance.invoiceGetDunnings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDunnings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the dunnings |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetFeed"></a>
# **invoiceGetFeed**
> ModelFeed invoiceGetFeed(id, embed)

Get the feed of a specified invoice

Calls getFeed() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the feed
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelFeed result = apiInstance.invoiceGetFeed(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the feed |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelFeed**](ModelFeed.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetFinalInvoiceId"></a>
# **invoiceGetFinalInvoiceId**
> invoiceGetFinalInvoiceId(id)

Get final invoice id

Calls getFinalInvoiceId() in Invoice.php to get final invoice id of the invoice chain

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of the invoice of which you want to get the final invoice id
try {
    apiInstance.invoiceGetFinalInvoiceId(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetFinalInvoiceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the invoice of which you want to get the final invoice id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetIsPartiallyPaid"></a>
# **invoiceGetIsPartiallyPaid**
> invoiceGetIsPartiallyPaid(id)

Returns if the invoice is partially payed

Calls getIsPartiallyPaid() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to know if it is partially paid
try {
    apiInstance.invoiceGetIsPartiallyPaid(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetIsPartiallyPaid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to know if it is partially paid |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetLastDunningDate"></a>
# **invoiceGetLastDunningDate**
> invoiceGetLastDunningDate(id)

Get last dunning date of invoice as timestamp

Calls getLastDunningDate() in Invoice.php to get the date of the last dunning of an invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the date of the last dunning
try {
    apiInstance.invoiceGetLastDunningDate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetLastDunningDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the date of the last dunning |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetPartialInvoices"></a>
# **invoiceGetPartialInvoices**
> ModelInvoice invoiceGetPartialInvoices(id, embed)

Get partial invoices of a specified invoice

Calls getPartialInvoices() in Invoice.php to get partial invoices of the invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of the invoice of which you want to get the partial invoices
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInvoice result = apiInstance.invoiceGetPartialInvoices(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetPartialInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the invoice of which you want to get the partial invoices |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetPositions"></a>
# **invoiceGetPositions**
> ModelInvoicePos invoiceGetPositions(id, limit, offset, embed)

Get the positions of a specified invoice

Calls getPositions() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the positions
Integer limit = 56; // Integer | limits the number of entries returned
Integer offset = 56; // Integer | set the index where the returned entries start
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelInvoicePos result = apiInstance.invoiceGetPositions(id, limit, offset, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the positions |
 **limit** | **Integer**| limits the number of entries returned | [optional]
 **offset** | **Integer**| set the index where the returned entries start | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelInvoicePos**](ModelInvoicePos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetRelatedObjects"></a>
# **invoiceGetRelatedObjects**
> invoiceGetRelatedObjects(id, includeItself, sortByType, embed)

Get related objects of a specified invoice

Calls getRelatedObjects() in Invoice.php to get related objects of the invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of the invoice of which you want to get the related objects
Boolean includeItself = true; // Boolean | Define if the related objects include the invoice itself
Boolean sortByType = true; // Boolean | Define if you want the related objects sorted by type
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    apiInstance.invoiceGetRelatedObjects(id, includeItself, sortByType, embed);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetRelatedObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of the invoice of which you want to get the related objects |
 **includeItself** | **Boolean**| Define if the related objects include the invoice itself | [optional]
 **sortByType** | **Boolean**| Define if you want the related objects sorted by type | [optional]
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetSwissEsr"></a>
# **invoiceGetSwissEsr**
> invoiceGetSwissEsr()

Get swiss esr

Calls getSwissEsr() in Invoice.php to get the swiss esr

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    apiInstance.invoiceGetSwissEsr();
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetSwissEsr");
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

<a name="invoiceGetSwissEsrData"></a>
# **invoiceGetSwissEsrData**
> invoiceGetSwissEsrData()

Get swiss esr data

Calls getSwissEsrData() in Invoice.php to get the swiss esr data

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    apiInstance.invoiceGetSwissEsrData();
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetSwissEsrData");
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

<a name="invoiceGetTags"></a>
# **invoiceGetTags**
> ModelTag invoiceGetTags(id, embed)

Get the tags of a specified invoice

Calls getTags() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the tags
List<String> embed = Arrays.asList("embed_example"); // List<String> | Get some additional information. Embed can handle multiple values, they must be separated by comma. Default ``.
try {
    ModelTag result = apiInstance.invoiceGetTags(id, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the tags |
 **embed** | [**List&lt;String&gt;**](String.md)| Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. | [optional]

### Return type

[**ModelTag**](ModelTag.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceGetTax"></a>
# **invoiceGetTax**
> invoiceGetTax(id, invoiceAmount)

Get invoice tax amount in invoice currency

Calls getTax() in Invoice.php to get tax amount of invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the invoice tax amount
Boolean invoiceAmount = true; // Boolean | Determines whether to use sumTax from invoice or sumTaxAccounting
try {
    apiInstance.invoiceGetTax(id, invoiceAmount);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the invoice tax amount |
 **invoiceAmount** | **Boolean**| Determines whether to use sumTax from invoice or sumTaxAccounting | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetTaxGroups"></a>
# **invoiceGetTaxGroups**
> invoiceGetTaxGroups(id)

Get tax groups of invoice

Calls getTaxGroupes() in Invoice.php to get tax groups

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the tax groups
try {
    apiInstance.invoiceGetTaxGroups(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTaxGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the tax groups |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetTotal"></a>
# **invoiceGetTotal**
> invoiceGetTotal(id, invoiceAmount)

Get gross invoice amount in invoice currency

Calls getTotal() in Invoice.php to get gross amount of invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the gross invoice amount
Boolean invoiceAmount = true; // Boolean | Determines whether to use sumGross from invoice or sumGrossAccounting
try {
    apiInstance.invoiceGetTotal(id, invoiceAmount);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTotal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the gross invoice amount |
 **invoiceAmount** | **Boolean**| Determines whether to use sumGross from invoice or sumGrossAccounting | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetTotalCalc"></a>
# **invoiceGetTotalCalc**
> invoiceGetTotalCalc(id)

Get total invoice amount in invoice currency

Calls getTotalCalc() in Invoice.php to get tax groups

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the invoice amount in invoice currency
try {
    apiInstance.invoiceGetTotalCalc(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTotalCalc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the invoice amount in invoice currency |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceGetTotalNet"></a>
# **invoiceGetTotalNet**
> invoiceGetTotalNet(id, invoiceAmount, withoutDiscounts)

Get total net invoice amount in invoice currency

Calls getTotalNet() in Invoice.php to get total net amount of invoice

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to get the total net invoice amount
Boolean invoiceAmount = true; // Boolean | Determines whether to use sumNet from invoice or sumNetAccounting
Boolean withoutDiscounts = true; // Boolean | Determines whether the total net is calculated with or without the discounts
try {
    apiInstance.invoiceGetTotalNet(id, invoiceAmount, withoutDiscounts);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetTotalNet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to get the total net invoice amount |
 **invoiceAmount** | **Boolean**| Determines whether to use sumNet from invoice or sumNetAccounting | [optional]
 **withoutDiscounts** | **Boolean**| Determines whether the total net is calculated with or without the discounts | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceHasDiscounts"></a>
# **invoiceHasDiscounts**
> invoiceHasDiscounts(id)

Returns if the specified invoice has discounts

Calls hasDiscounts() in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to know if it has discounts
try {
    apiInstance.invoiceHasDiscounts(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceHasDiscounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to know if it has discounts |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceIsOrigin"></a>
# **invoiceIsOrigin**
> invoiceIsOrigin(id)

Returns if the specified invoice is the origin of an order

Calls isOrigin() in Invoice.php to find out if the invoice is the origin of an order

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to know if it is the origin of an order
try {
    apiInstance.invoiceIsOrigin(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceIsOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to know if it is the origin of an order |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceMarkAsSent"></a>
# **invoiceMarkAsSent**
> ModelInvoice invoiceMarkAsSent(id)

Marks an invoice as sent

Calls markAsSent() in Invoice.php to mark an invoice as sent

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice which you want to mark as sent
try {
    ModelInvoice result = apiInstance.invoiceMarkAsSent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceMarkAsSent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice which you want to mark as sent |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceRefundAmount"></a>
# **invoiceRefundAmount**
> ModelInvoice invoiceRefundAmount(id, ammount, date)

Refund an already payed invoice amount

Calls refundAmmount() in Invoice.php to refund an invoice amount

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to refund the amount
Integer ammount = 56; // Integer | amount which should be refunded
String date = "date_example"; // String | booking date
try {
    ModelInvoice result = apiInstance.invoiceRefundAmount(id, ammount, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceRefundAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to refund the amount |
 **ammount** | **Integer**| amount which should be refunded |
 **date** | **String**| booking date |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="invoiceRender"></a>
# **invoiceRender**
> invoiceRender(id)

Render invoice document on docserver and return metadata

Calls render() in Invoice.php to render invoice document on docserver and return the metadata

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice of which you want to render the document and get the metadata
try {
    apiInstance.invoiceRender(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceRender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice of which you want to render the document and get the metadata |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invoiceSendBy"></a>
# **invoiceSendBy**
> ModelInvoice invoiceSendBy(id, sendType)

Send invoice by desired method

Calls sendBy() in Invoice.php to send an invoice by the desired method

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | Id of invoice which you want to send
String sendType = "sendType_example"; // String | desired send type, available are: VM = Mail, VP = Post, VPDF = PDF, PRN = Print
try {
    ModelInvoice result = apiInstance.invoiceSendBy(id, sendType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceSendBy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id of invoice which you want to send |
 **sendType** | **String**| desired send type, available are: VM &#x3D; Mail, VP &#x3D; Post, VPDF &#x3D; PDF, PRN &#x3D; Print |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="saveInvoice"></a>
# **saveInvoice**
> ModelInvoiceFactory saveInvoice()

Create a new invoice (with / without invoice positions and discounts) 

With the new version of sevdesk some models are not created by calling the model.php directly but by calling the factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
try {
    ModelInvoiceFactory result = apiInstance.saveInvoice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#saveInvoice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelInvoiceFactory**](ModelInvoiceFactory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="sendInvoiceViaEmail"></a>
# **sendInvoiceViaEmail**
> ModelEmail sendInvoiceViaEmail(id)

Send an invoice via Email

Calls sendViaEmail in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to send via Email
try {
    ModelEmail result = apiInstance.sendInvoiceViaEmail(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#sendInvoiceViaEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to send via Email |

### Return type

[**ModelEmail**](ModelEmail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="sendInvoiceViaPost"></a>
# **sendInvoiceViaPost**
> ModelInvoice sendInvoiceViaPost(id)

Send an invoice via Letter

Calls sendViaPost in Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to send via Letter
try {
    ModelInvoice result = apiInstance.sendInvoiceViaPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#sendInvoiceViaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to send via Letter |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateInvoice"></a>
# **updateInvoice**
> ModelInvoice updateInvoice(id)

Update an existing invoice

Calls Invoice.php

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | id of invoice you want to update
try {
    ModelInvoice result = apiInstance.updateInvoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#updateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of invoice you want to update |

### Return type

[**ModelInvoice**](ModelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json


# VatReportApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVatReport**](VatReportApi.md#getVatReport) | **GET** /VatReport | Get a vat report for a defined period of time

<a name="getVatReport"></a>
# **getVatReport**
> getVatReport(reportingYear, reportingPeriodCode, noActualTaxationOnInputTax)

Get a vat report for a defined period of time

Calls VatReport.php to get necessary variables.

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.VatReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatReportApi apiInstance = new VatReportApi();
Integer reportingYear = 56; // Integer | Year for which you want to have a vat report
String reportingPeriodCode = "reportingPeriodCode_example"; // String | Define the period for your vat report
Boolean noActualTaxationOnInputTax = true; // Boolean | Define if you want actual taxation on input tax
try {
    apiInstance.getVatReport(reportingYear, reportingPeriodCode, noActualTaxationOnInputTax);
} catch (ApiException e) {
    System.err.println("Exception when calling VatReportApi#getVatReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportingYear** | **Integer**| Year for which you want to have a vat report |
 **reportingPeriodCode** | **String**| Define the period for your vat report | [enum: monthly, quarterly]
 **noActualTaxationOnInputTax** | **Boolean**| Define if you want actual taxation on input tax |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


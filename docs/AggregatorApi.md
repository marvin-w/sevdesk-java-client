# AggregatorApi

All URIs are relative to *https://my.sevdesk.de/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregatorCalcTotalDepreciation**](AggregatorApi.md#aggregatorCalcTotalDepreciation) | **GET** /Aggregator/calcTotalDepreciation | Calculates total sum of all asset amounts for the year of the current query
[**aggregatorGetAccountingScore**](AggregatorApi.md#aggregatorGetAccountingScore) | **GET** /Aggregator/getAccountingScore | Get accounting score
[**aggregatorGetAppRevenueChartData**](AggregatorApi.md#aggregatorGetAppRevenueChartData) | **GET** /Aggregator/getAppRevenueChartData | Get the data which is displayed in the chart on the dashboard in the app
[**aggregatorGetProfitAndLossCalculation**](AggregatorApi.md#aggregatorGetProfitAndLossCalculation) | **GET** /Aggregator/getProfitAndLossCalculation | Calculates the profit and loss over a specified period
[**aggregatorGetTaxInformation**](AggregatorApi.md#aggregatorGetTaxInformation) | **GET** /Aggregator/getTaxInformation | Calculates tax of earnings and spending over a specified period
[**aggregatorGetVoucherCategoryInformation**](AggregatorApi.md#aggregatorGetVoucherCategoryInformation) | **GET** /Aggregator/getVoucherCategoryInformation | Get information about the categories of all vouchers in the year of the current query
[**aggregatorGetVoucherChartData**](AggregatorApi.md#aggregatorGetVoucherChartData) | **GET** /Aggregator/getVoucherChartData | Get voucher chart data
[**aggregatorGetWebRevenueChartData**](AggregatorApi.md#aggregatorGetWebRevenueChartData) | **GET** /Aggregator/getWebRevenueChartData | Get the data which is displayed in the chart on the dashboard

<a name="aggregatorCalcTotalDepreciation"></a>
# **aggregatorCalcTotalDepreciation**
> aggregatorCalcTotalDepreciation()

Calculates total sum of all asset amounts for the year of the current query

Calls calcTotalDepreciation() in Aggregator.php to get total sum of all asset amounts for the year of the current query

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
try {
    apiInstance.aggregatorCalcTotalDepreciation();
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorCalcTotalDepreciation");
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

<a name="aggregatorGetAccountingScore"></a>
# **aggregatorGetAccountingScore**
> aggregatorGetAccountingScore(startdate, enddate)

Get accounting score

Calls getAccountingScore() in Aggregator.php to get your accounting score

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
String startdate = "startdate_example"; // String | Start date for the accounting score calculation
String enddate = "enddate_example"; // String | End date for the accounting score calculation
try {
    apiInstance.aggregatorGetAccountingScore(startdate, enddate);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetAccountingScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startdate** | **String**| Start date for the accounting score calculation | [optional]
 **enddate** | **String**| End date for the accounting score calculation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="aggregatorGetAppRevenueChartData"></a>
# **aggregatorGetAppRevenueChartData**
> aggregatorGetAppRevenueChartData()

Get the data which is displayed in the chart on the dashboard in the app

Calls getAppRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard in the app

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
try {
    apiInstance.aggregatorGetAppRevenueChartData();
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetAppRevenueChartData");
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

<a name="aggregatorGetProfitAndLossCalculation"></a>
# **aggregatorGetProfitAndLossCalculation**
> aggregatorGetProfitAndLossCalculation(startDate, endDate, actualTaxation)

Calculates the profit and loss over a specified period

Calls getProfitAndLossCalculation() in Aggregator.php to calculate the profit and loss over a specified period.    The output of this function is divided into six groups:  * costs - all invoices/vouchers which contain a spending, again separated into direct [dc] and indirect costs [ic]  * earnings - all invoices/vouchers which contain a earning  * totalcosts  * totalearnings  * totalrevenue  * profit - the profit, difference between costs and earnings

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
String startDate = "startDate_example"; // String | Start date of the period you want to calculate
String endDate = "endDate_example"; // String | End date of the period you want to calculate
Boolean actualTaxation = true; // Boolean | Specify if you want to calculate the net income method (true) or the profit and loss (false)
try {
    apiInstance.aggregatorGetProfitAndLossCalculation(startDate, endDate, actualTaxation);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetProfitAndLossCalculation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Start date of the period you want to calculate |
 **endDate** | **String**| End date of the period you want to calculate |
 **actualTaxation** | **Boolean**| Specify if you want to calculate the net income method (true) or the profit and loss (false) |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="aggregatorGetTaxInformation"></a>
# **aggregatorGetTaxInformation**
> aggregatorGetTaxInformation(type, year, period, actualTaxation, noActualTaxationOnInputTax)

Calculates tax of earnings and spending over a specified period

Calls getTaxInformation() in Aggregator.php to calculate tax of earnings and spending over a specified period.    This function will return:  * earningsSum (gross earnings), earningsSumNet (net earnings)  * earningsTax - tax on earnings  * expensesSum (gross expenses), expensesSumNet (net expenses)  * expensesTax - tax on expenses  * earningsTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * expensesTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * remainingTaxPayable - tax which is yet to be payed

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
String type = "type_example"; // String | Tax period you want to calculate with
String year = "year_example"; // String | Year of your tax calculation
Integer period = 56; // Integer | Starting period (month) of your tax calculation
Boolean actualTaxation = true; // Boolean | Specify if you want to calculate the net income method (true) or the profit and loss (false)
Boolean noActualTaxationOnInputTax = true; // Boolean | Specify if you want no actual taxation on input tax
try {
    apiInstance.aggregatorGetTaxInformation(type, year, period, actualTaxation, noActualTaxationOnInputTax);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetTaxInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Tax period you want to calculate with | [enum: monthly, quarterly, semiannual]
 **year** | **String**| Year of your tax calculation |
 **period** | **Integer**| Starting period (month) of your tax calculation |
 **actualTaxation** | **Boolean**| Specify if you want to calculate the net income method (true) or the profit and loss (false) |
 **noActualTaxationOnInputTax** | **Boolean**| Specify if you want no actual taxation on input tax |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="aggregatorGetVoucherCategoryInformation"></a>
# **aggregatorGetVoucherCategoryInformation**
> aggregatorGetVoucherCategoryInformation()

Get information about the categories of all vouchers in the year of the current query

Calls getVoucherCategoryInformation() in Aggregator.php to get information about the categories of all vouchers in the year of the current query

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
try {
    apiInstance.aggregatorGetVoucherCategoryInformation();
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetVoucherCategoryInformation");
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

<a name="aggregatorGetVoucherChartData"></a>
# **aggregatorGetVoucherChartData**
> aggregatorGetVoucherChartData(year)

Get voucher chart data

Calls getVoucherChartData() in Aggregator.php to get voucher chart data

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
String year = "year_example"; // String | Year for which you want to get the voucher chart data
try {
    apiInstance.aggregatorGetVoucherChartData(year);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetVoucherChartData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **String**| Year for which you want to get the voucher chart data |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="aggregatorGetWebRevenueChartData"></a>
# **aggregatorGetWebRevenueChartData**
> aggregatorGetWebRevenueChartData(sumGrossToggle)

Get the data which is displayed in the chart on the dashboard

Calls getWebRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard

### Example
```java
// Import classes:
//import de.wichmann.sevdesk.ApiClient;
//import de.wichmann.sevdesk.ApiException;
//import de.wichmann.sevdesk.Configuration;
//import de.wichmann.sevdesk.auth.*;
//import de.wichmann.sevdesk.api.AggregatorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AggregatorApi apiInstance = new AggregatorApi();
Boolean sumGrossToggle = true; // Boolean | Specify if you want to calculate sum gross instead of net
try {
    apiInstance.aggregatorGetWebRevenueChartData(sumGrossToggle);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregatorApi#aggregatorGetWebRevenueChartData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sumGrossToggle** | **Boolean**| Specify if you want to calculate sum gross instead of net | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class AggregatorApi {
  private ApiClient apiClient;

  public AggregatorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AggregatorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Calculates total sum of all asset amounts for the year of the current query
   * Calls calcTotalDepreciation() in Aggregator.php to get total sum of all asset amounts for the year of the current query
   * @throws ApiException if fails to make API call
   */
  public void aggregatorCalcTotalDepreciation() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Aggregator/calcTotalDepreciation".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get accounting score
   * Calls getAccountingScore() in Aggregator.php to get your accounting score
   * @param startdate Start date for the accounting score calculation (optional)
   * @param enddate End date for the accounting score calculation (optional)
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetAccountingScore(String startdate, String enddate) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Aggregator/getAccountingScore".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startdate", startdate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enddate", enddate));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the data which is displayed in the chart on the dashboard in the app
   * Calls getAppRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard in the app
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetAppRevenueChartData() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Aggregator/getAppRevenueChartData".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Calculates the profit and loss over a specified period
   * Calls getProfitAndLossCalculation() in Aggregator.php to calculate the profit and loss over a specified period.    The output of this function is divided into six groups:  * costs - all invoices/vouchers which contain a spending, again separated into direct [dc] and indirect costs [ic]  * earnings - all invoices/vouchers which contain a earning  * totalcosts  * totalearnings  * totalrevenue  * profit - the profit, difference between costs and earnings
   * @param startDate Start date of the period you want to calculate (required)
   * @param endDate End date of the period you want to calculate (required)
   * @param actualTaxation Specify if you want to calculate the net income method (true) or the profit and loss (false) (required)
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetProfitAndLossCalculation(String startDate, String endDate, Boolean actualTaxation) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling aggregatorGetProfitAndLossCalculation");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling aggregatorGetProfitAndLossCalculation");
    }
    // verify the required parameter 'actualTaxation' is set
    if (actualTaxation == null) {
      throw new ApiException(400, "Missing the required parameter 'actualTaxation' when calling aggregatorGetProfitAndLossCalculation");
    }
    // create path and map variables
    String localVarPath = "/Aggregator/getProfitAndLossCalculation".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualTaxation", actualTaxation));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Calculates tax of earnings and spending over a specified period
   * Calls getTaxInformation() in Aggregator.php to calculate tax of earnings and spending over a specified period.    This function will return:  * earningsSum (gross earnings), earningsSumNet (net earnings)  * earningsTax - tax on earnings  * expensesSum (gross expenses), expensesSumNet (net expenses)  * expensesTax - tax on expenses  * earningsTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * expensesTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * remainingTaxPayable - tax which is yet to be payed
   * @param type Tax period you want to calculate with (required)
   * @param year Year of your tax calculation (required)
   * @param period Starting period (month) of your tax calculation (required)
   * @param actualTaxation Specify if you want to calculate the net income method (true) or the profit and loss (false) (required)
   * @param noActualTaxationOnInputTax Specify if you want no actual taxation on input tax (required)
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetTaxInformation(String type, String year, Integer period, Boolean actualTaxation, Boolean noActualTaxationOnInputTax) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling aggregatorGetTaxInformation");
    }
    // verify the required parameter 'year' is set
    if (year == null) {
      throw new ApiException(400, "Missing the required parameter 'year' when calling aggregatorGetTaxInformation");
    }
    // verify the required parameter 'period' is set
    if (period == null) {
      throw new ApiException(400, "Missing the required parameter 'period' when calling aggregatorGetTaxInformation");
    }
    // verify the required parameter 'actualTaxation' is set
    if (actualTaxation == null) {
      throw new ApiException(400, "Missing the required parameter 'actualTaxation' when calling aggregatorGetTaxInformation");
    }
    // verify the required parameter 'noActualTaxationOnInputTax' is set
    if (noActualTaxationOnInputTax == null) {
      throw new ApiException(400, "Missing the required parameter 'noActualTaxationOnInputTax' when calling aggregatorGetTaxInformation");
    }
    // create path and map variables
    String localVarPath = "/Aggregator/getTaxInformation".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "year", year));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualTaxation", actualTaxation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "noActualTaxationOnInputTax", noActualTaxationOnInputTax));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get information about the categories of all vouchers in the year of the current query
   * Calls getVoucherCategoryInformation() in Aggregator.php to get information about the categories of all vouchers in the year of the current query
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetVoucherCategoryInformation() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Aggregator/getVoucherCategoryInformation".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get voucher chart data
   * Calls getVoucherChartData() in Aggregator.php to get voucher chart data
   * @param year Year for which you want to get the voucher chart data (required)
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetVoucherChartData(String year) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'year' is set
    if (year == null) {
      throw new ApiException(400, "Missing the required parameter 'year' when calling aggregatorGetVoucherChartData");
    }
    // create path and map variables
    String localVarPath = "/Aggregator/getVoucherChartData".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "year", year));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the data which is displayed in the chart on the dashboard
   * Calls getWebRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard
   * @param sumGrossToggle Specify if you want to calculate sum gross instead of net (optional)
   * @throws ApiException if fails to make API call
   */
  public void aggregatorGetWebRevenueChartData(Boolean sumGrossToggle) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Aggregator/getWebRevenueChartData".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sumGrossToggle", sumGrossToggle));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}

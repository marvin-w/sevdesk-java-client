package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.AggregatorApi")
public class AggregatorApi {
    private ApiClient apiClient;

    public AggregatorApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorCalcTotalDepreciation() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Aggregator/calcTotalDepreciation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get accounting score
     * Calls getAccountingScore() in Aggregator.php to get your accounting score
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param startdate Start date for the accounting score calculation
     * @param enddate End date for the accounting score calculation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetAccountingScore(String startdate, String enddate) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Aggregator/getAccountingScore").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startdate", startdate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the data which is displayed in the chart on the dashboard in the app
     * Calls getAppRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard in the app
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetAppRevenueChartData() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Aggregator/getAppRevenueChartData").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Calculates the profit and loss over a specified period
     * Calls getProfitAndLossCalculation() in Aggregator.php to calculate the profit and loss over a specified period.    The output of this function is divided into six groups:  * costs - all invoices/vouchers which contain a spending, again separated into direct [dc] and indirect costs [ic]  * earnings - all invoices/vouchers which contain a earning  * totalcosts  * totalearnings  * totalrevenue  * profit - the profit, difference between costs and earnings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param startDate Start date of the period you want to calculate
     * @param endDate End date of the period you want to calculate
     * @param actualTaxation Specify if you want to calculate the net income method (true) or the profit and loss (false)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetProfitAndLossCalculation(String startDate, String endDate, Boolean actualTaxation) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling aggregatorGetProfitAndLossCalculation");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling aggregatorGetProfitAndLossCalculation");
        }
        // verify the required parameter 'actualTaxation' is set
        if (actualTaxation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actualTaxation' when calling aggregatorGetProfitAndLossCalculation");
        }
        String path = UriComponentsBuilder.fromPath("/Aggregator/getProfitAndLossCalculation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "actualTaxation", actualTaxation));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Calculates tax of earnings and spending over a specified period
     * Calls getTaxInformation() in Aggregator.php to calculate tax of earnings and spending over a specified period.    This function will return:  * earningsSum (gross earnings), earningsSumNet (net earnings)  * earningsTax - tax on earnings  * expensesSum (gross expenses), expensesSumNet (net expenses)  * expensesTax - tax on expenses  * earningsTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * expensesTaxGroups - list of invoices/vouchers which involved a taxation, separated into tax groups  * remainingTaxPayable - tax which is yet to be payed
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param type Tax period you want to calculate with
     * @param year Year of your tax calculation
     * @param period Starting period (month) of your tax calculation
     * @param actualTaxation Specify if you want to calculate the net income method (true) or the profit and loss (false)
     * @param noActualTaxationOnInputTax Specify if you want no actual taxation on input tax
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetTaxInformation(String type, String year, Integer period, Boolean actualTaxation, Boolean noActualTaxationOnInputTax) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling aggregatorGetTaxInformation");
        }
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling aggregatorGetTaxInformation");
        }
        // verify the required parameter 'period' is set
        if (period == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'period' when calling aggregatorGetTaxInformation");
        }
        // verify the required parameter 'actualTaxation' is set
        if (actualTaxation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actualTaxation' when calling aggregatorGetTaxInformation");
        }
        // verify the required parameter 'noActualTaxationOnInputTax' is set
        if (noActualTaxationOnInputTax == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'noActualTaxationOnInputTax' when calling aggregatorGetTaxInformation");
        }
        String path = UriComponentsBuilder.fromPath("/Aggregator/getTaxInformation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "period", period));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "actualTaxation", actualTaxation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "noActualTaxationOnInputTax", noActualTaxationOnInputTax));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get information about the categories of all vouchers in the year of the current query
     * Calls getVoucherCategoryInformation() in Aggregator.php to get information about the categories of all vouchers in the year of the current query
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetVoucherCategoryInformation() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Aggregator/getVoucherCategoryInformation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get voucher chart data
     * Calls getVoucherChartData() in Aggregator.php to get voucher chart data
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param year Year for which you want to get the voucher chart data
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetVoucherChartData(String year) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling aggregatorGetVoucherChartData");
        }
        String path = UriComponentsBuilder.fromPath("/Aggregator/getVoucherChartData").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the data which is displayed in the chart on the dashboard
     * Calls getWebRevenueChartData() in Aggregator.php to get data displayed in the revenue chart on the dashboard
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sumGrossToggle Specify if you want to calculate sum gross instead of net
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void aggregatorGetWebRevenueChartData(Boolean sumGrossToggle) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Aggregator/getWebRevenueChartData").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sumGrossToggle", sumGrossToggle));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

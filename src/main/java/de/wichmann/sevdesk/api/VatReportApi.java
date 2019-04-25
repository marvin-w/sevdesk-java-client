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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class VatReportApi {
  private ApiClient apiClient;

  public VatReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VatReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a vat report for a defined period of time
   * Calls VatReport.php to get necessary variables.
   * @param reportingYear Year for which you want to have a vat report (required)
   * @param reportingPeriodCode Define the period for your vat report (required)
   * @param noActualTaxationOnInputTax Define if you want actual taxation on input tax (required)
   * @throws ApiException if fails to make API call
   */
  public void getVatReport(Integer reportingYear, String reportingPeriodCode, Boolean noActualTaxationOnInputTax) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reportingYear' is set
    if (reportingYear == null) {
      throw new ApiException(400, "Missing the required parameter 'reportingYear' when calling getVatReport");
    }
    // verify the required parameter 'reportingPeriodCode' is set
    if (reportingPeriodCode == null) {
      throw new ApiException(400, "Missing the required parameter 'reportingPeriodCode' when calling getVatReport");
    }
    // verify the required parameter 'noActualTaxationOnInputTax' is set
    if (noActualTaxationOnInputTax == null) {
      throw new ApiException(400, "Missing the required parameter 'noActualTaxationOnInputTax' when calling getVatReport");
    }
    // create path and map variables
    String localVarPath = "/VatReport".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportingYear", reportingYear));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportingPeriodCode", reportingPeriodCode));
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
}

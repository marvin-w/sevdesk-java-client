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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class SevClientApi {
  private ApiClient apiClient;

  public SevClientApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SevClientApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get sevDesk account invoices
   * Get sevDesk account invoices
   * @throws ApiException if fails to make API call
   */
  public void sevClientGetSevDeskAccountInvoices() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/SevClient/getSevDeskAccountInvoices".replaceAll("\\{format\\}","json");

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
}

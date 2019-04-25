package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import de.wichmann.sevdesk.model.ModelCurrencyExchangeRate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class CurrencyExchangeRateApi {
  private ApiClient apiClient;

  public CurrencyExchangeRateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CurrencyExchangeRateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get an overview of all currency exchange rates
   * Calls CurrencyExchangeRate.php to get necessary variables
   * @param limit Limits the number of entries returned. Default is 1000.    Be aware that there are over 100000 entries in the database for currency exchange rate, so using a limit higher than 1000 with offset&#x3D;0 is not recommended!    However you can set the offset appropriately so you minimize the amount of returned exchange rates and keep loading time to a low. (optional)
   * @param offset Set the index where the returned currency exchange rates start. Default is 0 (optional)
   * @return ModelCurrencyExchangeRate
   * @throws ApiException if fails to make API call
   */
  public ModelCurrencyExchangeRate getCurrencyExchangeRates(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/CurrencyExchangeRate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelCurrencyExchangeRate> localVarReturnType = new GenericType<ModelCurrencyExchangeRate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

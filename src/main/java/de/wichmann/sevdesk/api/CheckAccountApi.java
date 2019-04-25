package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import de.wichmann.sevdesk.model.ModelCheckAccount;
import de.wichmann.sevdesk.model.ModelDiscounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class CheckAccountApi {
  private ApiClient apiClient;

  public CheckAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CheckAccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new check account
   * Calls CheckAccount.php to create a check account
   * @return ModelCheckAccount
   * @throws ApiException if fails to make API call
   */
  public ModelCheckAccount addCheckAccount() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/CheckAccount".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelCheckAccount> localVarReturnType = new GenericType<ModelCheckAccount>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get current balance of the specified check account
   * Calls getCurrentBalance() in CheckAccount.php to get the balance of the specified check account.
   * @param id Id of the check account of which you want the current balance (required)
   * @throws ApiException if fails to make API call
   */
  public void checkAccountGetCurrentBalance(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling checkAccountGetCurrentBalance");
    }
    // create path and map variables
    String localVarPath = "/CheckAccount/{id}/getCurrentBalance".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Return if a payment method is supported
   * Calls getPaymentIsSupported() in CheckAccount.php to get if a payment method is supported.
   * @throws ApiException if fails to make API call
   */
  public void checkAccountGetPaymentIsSupported() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/CheckAccount/getPaymentIsSupported".replaceAll("\\{format\\}","json");

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
   * Set the specified check accounts as the default check account
   * Calls setDefault() in CheckAccount.php to set a specified check account as the default check account
   * @param id Id of check account you want to set as the default check account (required)
   * @throws ApiException if fails to make API call
   */
  public void checkAccountSetDefault(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling checkAccountSetDefault");
    }
    // create path and map variables
    String localVarPath = "/CheckAccount/{id}/setDefault".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Transfer an amount from one check account to another
   * Calls transfer() in CheckAccount.php to transfer an amount from one check account to another
   * @param id Id of check account you want to use as source account (required)
   * @param amount Amount you want to transfer (required)
   * @param targetId Target check account id (required)
   * @param targetObjectName Target check account object name (required)
   * @param date Date of the transfer (required)
   * @throws ApiException if fails to make API call
   */
  public void checkAccountTransfer(Integer id, String amount, Integer targetId, String targetObjectName, String date) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling checkAccountTransfer");
    }
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling checkAccountTransfer");
    }
    // verify the required parameter 'targetId' is set
    if (targetId == null) {
      throw new ApiException(400, "Missing the required parameter 'targetId' when calling checkAccountTransfer");
    }
    // verify the required parameter 'targetObjectName' is set
    if (targetObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'targetObjectName' when calling checkAccountTransfer");
    }
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling checkAccountTransfer");
    }
    // create path and map variables
    String localVarPath = "/CheckAccount/{id}/transfer".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target[id]", targetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target[objectName]", targetObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete an existing check account
   * Calls the delete() function in CheckAccount.php
   * @param id Id of check account you want to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCheckAccount(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCheckAccount");
    }
    // create path and map variables
    String localVarPath = "/CheckAccount/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get an overview of all check accounts
   * Calls CheckAccount.php to get necessary variables.
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned check accounts start. Default is 0 (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelDiscounts
   * @throws ApiException if fails to make API call
   */
  public ModelDiscounts getCheckAccounts(Integer limit, Integer offset, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/CheckAccount".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "embed", embed));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelDiscounts> localVarReturnType = new GenericType<ModelDiscounts>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing check account
   * Calls CheckAccount.php to update a check account
   * @param id Id of check account you want to update (required)
   * @return ModelCheckAccount
   * @throws ApiException if fails to make API call
   */
  public ModelCheckAccount updateCheckAccount(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCheckAccount");
    }
    // create path and map variables
    String localVarPath = "/CheckAccount/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelCheckAccount> localVarReturnType = new GenericType<ModelCheckAccount>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

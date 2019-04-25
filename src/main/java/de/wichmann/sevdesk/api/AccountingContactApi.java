package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import de.wichmann.sevdesk.model.ModelAccountingContact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class AccountingContactApi {
  private ApiClient apiClient;

  public AccountingContactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountingContactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Return if a debitor / creditor number is available
   * Calls isAvailableDebitorCreditorNumber() in AccountingContact.php to get if the debitor / creditor number is available.
   * @param contactId If you want to exclude a contact from getting checked you can provide its id here (optional)
   * @param contactObjectName Contact object name (optional)
   * @param debitorNumber debitor number of which you want to know if it is available (optional)
   * @param creditorNumber creditor number of which you want to know if it is available (optional)
   * @throws ApiException if fails to make API call
   */
  public void accountingContactIsAvailableDebitorCreditorNumber(Integer contactId, String contactObjectName, String debitorNumber, String creditorNumber) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/AccountingContact/isAvailableDebitorCreditorNumber".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[id]", contactId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[objectName]", contactObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "debitorNumber", debitorNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creditorNumber", creditorNumber));

    
    
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
   * Create a new accounting contact
   * Calls AccountingContact.php 
   * @return ModelAccountingContact
   * @throws ApiException if fails to make API call
   */
  public ModelAccountingContact addAccountingContact() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/AccountingContact".replaceAll("\\{format\\}","json");

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

    GenericType<ModelAccountingContact> localVarReturnType = new GenericType<ModelAccountingContact>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete an existing accounting contact
   * Calls the delete() function in AccountingContact.php
   * @param id id of accounting contact you want to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAccountingContact(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAccountingContact");
    }
    // create path and map variables
    String localVarPath = "/AccountingContact/{id}".replaceAll("\\{format\\}","json")
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
   * Get an overview of all accounting contacts
   * Calls AccountingContact.php to get necessary variables.
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned discounts start. Default is 0 (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelAccountingContact
   * @throws ApiException if fails to make API call
   */
  public ModelAccountingContact getAccountingContacts(Integer limit, Integer offset, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/AccountingContact".replaceAll("\\{format\\}","json");

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

    GenericType<ModelAccountingContact> localVarReturnType = new GenericType<ModelAccountingContact>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing accounting contact
   * Calls AccountingContact.php
   * @param id id of accounting contact you want to update (required)
   * @return ModelAccountingContact
   * @throws ApiException if fails to make API call
   */
  public ModelAccountingContact updateAccountingContact(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAccountingContact");
    }
    // create path and map variables
    String localVarPath = "/AccountingContact/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<ModelAccountingContact> localVarReturnType = new GenericType<ModelAccountingContact>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import de.wichmann.sevdesk.model.ModelAccountingType;
import de.wichmann.sevdesk.model.ModelVoucher;
import de.wichmann.sevdesk.model.ModelVoucherFactory;
import de.wichmann.sevdesk.model.ModelVoucherLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class VoucherApi {
  private ApiClient apiClient;

  public VoucherApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VoucherApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new voucher
   * Calls Voucher.php to create a voucher
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher addVoucher() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Voucher".replaceAll("\\{format\\}","json");

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

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete an existing voucher
   * Calls the delete() function in Voucher.php
   * @param id Id of voucher you want to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVoucher(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVoucher");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}".replaceAll("\\{format\\}","json")
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
   * Get an overview of all vouchers
   * Calls Voucher.php to get necessary variables.
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned vouchers start. Default is 0 (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher getVouchers(Integer limit, Integer offset, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Voucher".replaceAll("\\{format\\}","json");

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

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create a new voucher
   * With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new voucher it wont be saved by a POST request with &#x27;/Voucher?para1&#x3D;&amp;...&#x27; but with the saveVoucher function in Factory.php &#x27;Voucher/Factory/saveVoucher?para1&#x3D;&#x27;
   * @return ModelVoucherFactory
   * @throws ApiException if fails to make API call
   */
  public ModelVoucherFactory saveVoucher() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Voucher/Factory/saveVoucher".replaceAll("\\{format\\}","json");

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

    GenericType<ModelVoucherFactory> localVarReturnType = new GenericType<ModelVoucherFactory>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing voucher
   * Calls Voucher.php to update an existing voucher
   * @param id Id of the voucher you want to update (required)
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher updateVoucher(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVoucher");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Book an amount for a specified voucher
   * Book an amount for the specified voucher
   * @param id Id of the voucher for which you want to book an amount (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherBookAmount(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherBookAmount");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/bookAmmount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Change status of a specified voucher
   * Change the status of the specified voucher
   * @param id Id of the voucher of which you want to change the status (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherChangeStatus(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherChangeStatus");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/changeStatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete the document of an existing voucher
   * Calls the deleteDocument() function in Voucher.php to delete the document of an existing voucher
   * @param id Id of the voucher of which you want to delete the document (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherDeleteDocument(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherDeleteDocument");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/deleteDocument".replaceAll("\\{format\\}","json")
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
   * Extract file thumb
   * Calls extractThumb() in Voucher/Factory.php to extract the thumb of the specified file
   * @param fileName Name of the file of which you want to extract the thumb (optional)
   * @throws ApiException if fails to make API call
   */
  public void voucherExtractThumb(String fileName) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Voucher/Factory/extractThumb".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));

    
    
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
   * Get the accounting types of a specified voucher
   * Calls getAccountingTypes() in Voucher.php to get the accounting types of the specified voucher
   * @param id Id of the voucher of which you want to get the accounting types (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelAccountingType
   * @throws ApiException if fails to make API call
   */
  public ModelAccountingType voucherGetAccountingTypes(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetAccountingTypes");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getAccountingTypes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "embed", embed));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelAccountingType> localVarReturnType = new GenericType<ModelAccountingType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get the check account transaction logs of a specified voucher
   * Calls getCheckAccountTransactionLogs() in Voucher.php to get the check account transaction logs of the specified voucher
   * @param id Id of the voucher of which you want to get the check account transaction logs (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetCheckAccountTransactionLogs(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetCheckAccountTransactionLogs");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getCheckAccountTransactionLogs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "embed", embed));

    
    
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
   * Get the check account transactions of a specified voucher
   * Calls getCheckAccountTransactions() in Voucher.php to get the check account transactions of the specified voucher
   * @param id Id of the voucher of which you want to get the check account transactions (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetCheckAccountTransactions(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetCheckAccountTransactions");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getCheckAccountTransactions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "embed", embed));

    
    
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
   * Get the currency of a specified voucher
   * Calls getCurrency() in Voucher.php to get the currency of the specified voucher
   * @param id Id of the voucher of which you want to get the currency (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void voucherGetCurrency(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetCurrency");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getCurrency".replaceAll("\\{format\\}","json")
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
   * Get unpaid amount of a specified voucher
   * Calls getDebit() in Voucher.php to get the unpaid amount of a specified voucher
   * @param id Id of the voucher of which you want to get the unpaid amount (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetDebit(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetDebit");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getDebit".replaceAll("\\{format\\}","json")
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
   * Return if the voucher is delinquent
   * Calls getDelinquent() in Voucher.php to get if the voucher is delinquent
   * @param id Id of the voucher of which you want to know if it is delinquent (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetDelinquent(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetDelinquent");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getDelinquent".replaceAll("\\{format\\}","json")
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
   * Get the depending recurring vouchers of a specified origin voucher
   * Calls getDependingRecurringVouchers() in Voucher.php to get the depending recurring vouchers of the specified origin voucher
   * @param id Id of the voucher of which you want to get the depending recurring vouchers (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher voucherGetDependingRecurringVouchers(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetDependingRecurringVouchers");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getDependingRecurringVouchers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "embed", embed));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Returns the base64 encoded preview content of the vouchers document
   * Calls getDocumentImage() in Voucher.php to return the base64 encoded preview content of the vouchers document
   * @param id Id of the voucher of which you want to get the document image (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetDocumentImage(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetDocumentImage");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getDocumentImage".replaceAll("\\{format\\}","json")
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
   * Get an overview of all vouchers
   * Calls Voucher.php to get necessary variables.
   * @param id Id of the voucher you want to update (required)
   * @param showTotalSum Define if you want to have the total sum of each tax group (required)
   * @param withCorrections Define if you want to have the total sum with corrections (required)
   * @throws ApiException if fails to make API call
   */
  public void voucherGetTaxGroups(Integer id, Boolean showTotalSum, Boolean withCorrections) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherGetTaxGroups");
    }
    // verify the required parameter 'showTotalSum' is set
    if (showTotalSum == null) {
      throw new ApiException(400, "Missing the required parameter 'showTotalSum' when calling voucherGetTaxGroups");
    }
    // verify the required parameter 'withCorrections' is set
    if (withCorrections == null) {
      throw new ApiException(400, "Missing the required parameter 'withCorrections' when calling voucherGetTaxGroups");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/getTaxGroupes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "showTotalSum", showTotalSum));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withCorrections", withCorrections));

    
    
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
   * Mark a specified voucher as open
   * Mark the specified voucher as open
   * @param id Id of the voucher you want to mark as open (required)
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher voucherMarkAsOpen(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherMarkAsOpen");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/markAsOpen".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark a specified voucher as paid
   * Mark the specified voucher as paid
   * @param id Id of the voucher you want to mark as paid (required)
   * @return ModelVoucher
   * @throws ApiException if fails to make API call
   */
  public ModelVoucher voucherMarkAsPaid(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherMarkAsPaid");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/markAsPaid".replaceAll("\\{format\\}","json")
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

    GenericType<ModelVoucher> localVarReturnType = new GenericType<ModelVoucher>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Refund an amount for a specified voucher
   * Refund an amount for the specified voucher
   * @param id Id of the voucher for which you want to refund an amount (required)
   * @return ModelVoucherLog
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ModelVoucherLog voucherRefundAmount(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling voucherRefundAmount");
    }
    // create path and map variables
    String localVarPath = "/Voucher/{id}/refundAmmount".replaceAll("\\{format\\}","json")
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

    GenericType<ModelVoucherLog> localVarReturnType = new GenericType<ModelVoucherLog>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Upload a temporary file to be used later
   * With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new voucher it wont be saved by a POST request with &#x27;/Voucher?para1&#x3D;&amp;...&#x27; but with the saveVoucher function in Factory.php &#x27;Voucher/Factory/saveVoucher?para1&#x3D;&#x27;
   * @param file  (required)
   * @return ModelVoucherFactory
   * @throws ApiException if fails to make API call
   */
  public ModelVoucherFactory voucherUploadTempFile(File file) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling voucherUploadTempFile");
    }
    // create path and map variables
    String localVarPath = "/Voucher/Factory/uploadTempFile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelVoucherFactory> localVarReturnType = new GenericType<ModelVoucherFactory>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

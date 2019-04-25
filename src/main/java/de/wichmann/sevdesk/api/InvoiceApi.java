package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import de.wichmann.sevdesk.model.ModelCheckAccountTransaction;
import de.wichmann.sevdesk.model.ModelCheckAccountTransactionLog;
import de.wichmann.sevdesk.model.ModelDiscounts;
import de.wichmann.sevdesk.model.ModelEmail;
import de.wichmann.sevdesk.model.ModelFeed;
import de.wichmann.sevdesk.model.ModelInvoice;
import de.wichmann.sevdesk.model.ModelInvoiceFactory;
import de.wichmann.sevdesk.model.ModelInvoiceLog;
import de.wichmann.sevdesk.model.ModelInvoicePos;
import de.wichmann.sevdesk.model.ModelTag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class InvoiceApi {
  private ApiClient apiClient;

  public InvoiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new invoice
   * Calls Invoice.php 
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice addInvoice() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice".replaceAll("\\{format\\}","json");

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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Cancel an invoice
   * Calls cancel() in Invoice.php to cancel an invoice and creates a cancellation invoice  
   * @param id Id of invoice which you want to cancel (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice cancelInvoice(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelInvoice");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/cancel".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create an new invoice from an existing order
   * With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the Factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice createInvoiceFromOrder() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/Factory/createInvoiceFromOrder".replaceAll("\\{format\\}","json");

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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create an invoice reminder
   * With the new version of sevdesk some models are not created by calling the Model.php directly but by calling the Factory.php because of better performance and flexibility.    Basically the Model.php itself still constructs the model however new instances of the model are created trough the Factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice createInvoiceReminder() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/Factory/createInvoiceReminder".replaceAll("\\{format\\}","json");

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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete an existing invoice
   * Calls the delete() function in Invoice.php
   * @param id id of invoice you want to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvoice(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteInvoice");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}".replaceAll("\\{format\\}","json")
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
   * Duplicate an existing invoice
   * Calls duplicate() in Invoice.php to duplicate an existing invoice
   * @param id id of invoice you want to duplicate (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice duplicateInvoice(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling duplicateInvoice");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/duplicate".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get amount of an invoice including reminders
   * Calls the getTotalInvoiceReminderAndInvoiceAmount function in /Invoice/Factory/ to get the amount of the invoice including its reminders.
   * @param invoiceId id of the invoice you want to get the total amount for (required)
   * @param invoiceObjectName  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getInvoiceAndReminderAmount(Integer invoiceId, String invoiceObjectName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getInvoiceAndReminderAmount");
    }
    // verify the required parameter 'invoiceObjectName' is set
    if (invoiceObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceObjectName' when calling getInvoiceAndReminderAmount");
    }
    // create path and map variables
    String localVarPath = "/Invoice/Factory/getTotalInvoiceReminderAndInvoiceAmount".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoice[id]", invoiceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoice[objectName]", invoiceObjectName));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get the invoice as a PDF
   * Calls getPdf in Invoice.php
   * @param id Id of invoice of which you want to get the PDF (required)
   * @param download If true PDF will return as filestream otherwise as json object the content base64 encoded (required)
   * @throws ApiException if fails to make API call
   */
  public void getInvoiceAsPdf(Integer id, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInvoiceAsPdf");
    }
    // verify the required parameter 'download' is set
    if (download == null) {
      throw new ApiException(400, "Missing the required parameter 'download' when calling getInvoiceAsPdf");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getPdf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));

    
    
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
   * Get (monetary) amount of all reminders of an invoice
   * Calls the getTotalInvoiceReminderAmount function in /Invoice/Factory/ to get the amount of all reminders of an invoice.
   * @param invoiceId id of the invoice you want to get the reminder amount for (required)
   * @param invoiceObjectName  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getInvoiceReminderAmount(Integer invoiceId, String invoiceObjectName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getInvoiceReminderAmount");
    }
    // verify the required parameter 'invoiceObjectName' is set
    if (invoiceObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceObjectName' when calling getInvoiceReminderAmount");
    }
    // create path and map variables
    String localVarPath = "/Invoice/Factory/getTotalInvoiceReminderAmount".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoice[id]", invoiceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoice[objectName]", invoiceObjectName));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get an overview of all invoices
   * Calls Invoice.php to get necessary variables. However, not all variables get their value from Invoice.php directly but from other models like Model_InvoicePos or Model_Part
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned invoices start. Default is 0 (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice getInvoices(Integer limit, Integer offset, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice".replaceAll("\\{format\\}","json");

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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get the next invoice number
   * 
   * @param invoiceType defines the type of invoice you want to get the next number from (required)
   * @param useNextNumber By default this is true, so the invoiceNumber will increase by one otherwise the invoiceNumber will not change (required)
   * @throws ApiException if fails to make API call
   */
  public void getNextInvoiceNumber(String invoiceType, Boolean useNextNumber) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'invoiceType' is set
    if (invoiceType == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceType' when calling getNextInvoiceNumber");
    }
    // verify the required parameter 'useNextNumber' is set
    if (useNextNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'useNextNumber' when calling getNextInvoiceNumber");
    }
    // create path and map variables
    String localVarPath = "/Invoice/Factory/getNextInvoiceNumber".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceType", invoiceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useNextNumber", useNextNumber));

    
    
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
   * Add a position to an existing invoice
   * Calls addPosition() in Invoice.php to add a position to an invoice.    This function is not required anymore as there is a function for creating Invoices in Invoice/Factory which includes adding the position.
   * @param id id of invoice you want to add a position to (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceAddPosition(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceAddPosition");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/addPosition".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Book amount for an invoice
   * Calls bookAmmount() in Invoice.php to book an invoice amount
   * @param id Id of invoice of which you want to book an amount (required)
   * @param ammount amount which should be booked (required)
   * @param date booking date (required)
   * @return ModelInvoiceLog
   * @throws ApiException if fails to make API call
   */
  public ModelInvoiceLog invoiceBookAmount(Integer id, Integer ammount, String date) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceBookAmount");
    }
    // verify the required parameter 'ammount' is set
    if (ammount == null) {
      throw new ApiException(400, "Missing the required parameter 'ammount' when calling invoiceBookAmount");
    }
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling invoiceBookAmount");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/bookAmmount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ammount", ammount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelInvoiceLog> localVarReturnType = new GenericType<ModelInvoiceLog>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Calculate total sum of all invoices of current query
   * Calls calcTotalDebit() in Invoice.php to calculate total sum of all invoices of current query
   * @throws ApiException if fails to make API call
   */
  public void invoiceCalcTotalDebit() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/calcTotalDebit".replaceAll("\\{format\\}","json");

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
   * Get dunning level of an invoice
   * Calls calculateDunningLevel() in Invoice.php to get the dunning level of an invoice
   * @param id Id of invoice of which you want to get the dunning level (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceCalculateDunningLevel(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceCalculateDunningLevel");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/calculateDunningLevel".replaceAll("\\{format\\}","json")
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
   * Change status of an invoice
   * Calls changeStatus() in Invoice.php to book an invoice amount
   * @param id Id of invoice of which you want to book an amount (required)
   * @param value desired status (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceChangeStatus(Integer id, Integer value) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceChangeStatus");
    }
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling invoiceChangeStatus");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/changeStatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Returns if an invoice is cancled
   * Calls getCancled() in Invoice.php to know if an invoice is cancled
   * @param id Id of invoice of which you want to know if it is cancled (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetCancled(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetCancled");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getCancled".replaceAll("\\{format\\}","json")
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
   * Get check account transaction logs about a specified invoice
   * Calls getCheckAccountTransactionLogs() in Invoice.php to get check account transaction logs about the invoice
   * @param id Id of the invoice of which you want to get the check account transaction logs (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelCheckAccountTransactionLog
   * @throws ApiException if fails to make API call
   */
  public ModelCheckAccountTransactionLog invoiceGetCheckAccountTransactionLogs(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetCheckAccountTransactionLogs");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getCheckAccountTransactionLogs".replaceAll("\\{format\\}","json")
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

    GenericType<ModelCheckAccountTransactionLog> localVarReturnType = new GenericType<ModelCheckAccountTransactionLog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get check account transactions of a specified invoice
   * Calls getCheckAccountTransactions() in Invoice.php to get check account transactions of the invoice
   * @param id Id of the invoice of which you want to get the check account transactions (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelCheckAccountTransaction
   * @throws ApiException if fails to make API call
   */
  public ModelCheckAccountTransaction invoiceGetCheckAccountTransactions(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetCheckAccountTransactions");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getCheckAccountTransactions".replaceAll("\\{format\\}","json")
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

    GenericType<ModelCheckAccountTransaction> localVarReturnType = new GenericType<ModelCheckAccountTransaction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get debit of an invoice
   * Calls getDebit() in Invoice.php to get debit of an invoice
   * @param id Id of invoice of which you want to get the debit (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetDebit(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetDebit");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getDebit".replaceAll("\\{format\\}","json")
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
   * Get if an invoice is delinquent
   * Calls getDelinquent() in Invoice.php to get if an invoice is delinquent
   * @param id Id of invoice of which you want to know if its delinquent (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetDelinquent(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetDelinquent");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getDelinquent".replaceAll("\\{format\\}","json")
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
   * Get the discounts of a specified invoice
   * Calls getDiscounts() in Invoice.php
   * @param id Id of invoice of which you want to get the discounts (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelDiscounts
   * @throws ApiException if fails to make API call
   */
  public ModelDiscounts invoiceGetDiscounts(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetDiscounts");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getDiscounts".replaceAll("\\{format\\}","json")
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

    GenericType<ModelDiscounts> localVarReturnType = new GenericType<ModelDiscounts>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get document of an invoice
   * Calls getDocument() in Invoice.php to get the document of an invoice
   * @param id Id of invoice of which you want to get the document (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetDocument(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetDocument");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getDocument".replaceAll("\\{format\\}","json")
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
   * Get invoice dunnings
   * Calls getDunnings() in Invoice.php to get the dunnings of an invoice
   * @param id Id of invoice of which you want to get the dunnings (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceGetDunnings(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetDunnings");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getDunnings".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get the feed of a specified invoice
   * Calls getFeed() in Invoice.php
   * @param id Id of invoice of which you want to get the feed (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelFeed
   * @throws ApiException if fails to make API call
   */
  public ModelFeed invoiceGetFeed(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetFeed");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getFeed".replaceAll("\\{format\\}","json")
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

    GenericType<ModelFeed> localVarReturnType = new GenericType<ModelFeed>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get final invoice id
   * Calls getFinalInvoiceId() in Invoice.php to get final invoice id of the invoice chain
   * @param id Id of the invoice of which you want to get the final invoice id (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetFinalInvoiceId(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetFinalInvoiceId");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getFinalInvoiceId".replaceAll("\\{format\\}","json")
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
   * Returns if the invoice is partially payed
   * Calls getIsPartiallyPaid() in Invoice.php
   * @param id Id of invoice of which you want to know if it is partially paid (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetIsPartiallyPaid(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetIsPartiallyPaid");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getIsPartiallyPaid".replaceAll("\\{format\\}","json")
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
   * Get last dunning date of invoice as timestamp
   * Calls getLastDunningDate() in Invoice.php to get the date of the last dunning of an invoice
   * @param id Id of invoice of which you want to get the date of the last dunning (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetLastDunningDate(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetLastDunningDate");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getLastDunningDate".replaceAll("\\{format\\}","json")
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
   * Get partial invoices of a specified invoice
   * Calls getPartialInvoices() in Invoice.php to get partial invoices of the invoice
   * @param id Id of the invoice of which you want to get the partial invoices (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceGetPartialInvoices(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetPartialInvoices");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getPartialInvoices".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get the positions of a specified invoice
   * Calls getPositions() in Invoice.php
   * @param id Id of invoice of which you want to get the positions (required)
   * @param limit limits the number of entries returned (optional)
   * @param offset set the index where the returned entries start (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelInvoicePos
   * @throws ApiException if fails to make API call
   */
  public ModelInvoicePos invoiceGetPositions(Integer id, Integer limit, Integer offset, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetPositions");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getPositions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ModelInvoicePos> localVarReturnType = new GenericType<ModelInvoicePos>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get related objects of a specified invoice
   * Calls getRelatedObjects() in Invoice.php to get related objects of the invoice
   * @param id Id of the invoice of which you want to get the related objects (required)
   * @param includeItself Define if the related objects include the invoice itself (optional)
   * @param sortByType Define if you want the related objects sorted by type (optional)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetRelatedObjects(Integer id, Boolean includeItself, Boolean sortByType, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetRelatedObjects");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getRelatedObjects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeItself", includeItself));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortByType", sortByType));
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
   * Get swiss esr
   * Calls getSwissEsr() in Invoice.php to get the swiss esr
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetSwissEsr() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/getSwissEsr".replaceAll("\\{format\\}","json");

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
   * Get swiss esr data
   * Calls getSwissEsrData() in Invoice.php to get the swiss esr data
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetSwissEsrData() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/getSwissEsrData".replaceAll("\\{format\\}","json");

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
   * Get the tags of a specified invoice
   * Calls getTags() in Invoice.php
   * @param id Id of invoice of which you want to get the tags (required)
   * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;. (optional)
   * @return ModelTag
   * @throws ApiException if fails to make API call
   */
  public ModelTag invoiceGetTags(Integer id, List<String> embed) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTags");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTags".replaceAll("\\{format\\}","json")
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

    GenericType<ModelTag> localVarReturnType = new GenericType<ModelTag>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get invoice tax amount in invoice currency
   * Calls getTax() in Invoice.php to get tax amount of invoice
   * @param id Id of invoice of which you want to get the invoice tax amount (required)
   * @param invoiceAmount Determines whether to use sumTax from invoice or sumTaxAccounting (optional)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetTax(Integer id, Boolean invoiceAmount) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTax");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTax".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceAmount", invoiceAmount));

    
    
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
   * Get tax groups of invoice
   * Calls getTaxGroupes() in Invoice.php to get tax groups
   * @param id Id of invoice of which you want to get the tax groups (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetTaxGroups(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTaxGroups");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTaxGroupes".replaceAll("\\{format\\}","json")
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
   * Get gross invoice amount in invoice currency
   * Calls getTotal() in Invoice.php to get gross amount of invoice
   * @param id Id of invoice of which you want to get the gross invoice amount (required)
   * @param invoiceAmount Determines whether to use sumGross from invoice or sumGrossAccounting (optional)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetTotal(Integer id, Boolean invoiceAmount) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTotal");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTotal".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceAmount", invoiceAmount));

    
    
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
   * Get total invoice amount in invoice currency
   * Calls getTotalCalc() in Invoice.php to get tax groups
   * @param id Id of invoice of which you want to get the invoice amount in invoice currency (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetTotalCalc(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTotalCalc");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTotalCalc".replaceAll("\\{format\\}","json")
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
   * Get total net invoice amount in invoice currency
   * Calls getTotalNet() in Invoice.php to get total net amount of invoice
   * @param id Id of invoice of which you want to get the total net invoice amount (required)
   * @param invoiceAmount Determines whether to use sumNet from invoice or sumNetAccounting (optional)
   * @param withoutDiscounts Determines whether the total net is calculated with or without the discounts (optional)
   * @throws ApiException if fails to make API call
   */
  public void invoiceGetTotalNet(Integer id, Boolean invoiceAmount, Boolean withoutDiscounts) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceGetTotalNet");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/getTotalNet".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceAmount", invoiceAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withoutDiscounts", withoutDiscounts));

    
    
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
   * Returns if the specified invoice has discounts
   * Calls hasDiscounts() in Invoice.php
   * @param id Id of invoice of which you want to know if it has discounts (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceHasDiscounts(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceHasDiscounts");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/hasDiscounts".replaceAll("\\{format\\}","json")
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
   * Returns if the specified invoice is the origin of an order
   * Calls isOrigin() in Invoice.php to find out if the invoice is the origin of an order
   * @param id Id of invoice of which you want to know if it is the origin of an order (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceIsOrigin(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceIsOrigin");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/isOrigin".replaceAll("\\{format\\}","json")
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
   * Marks an invoice as sent
   * Calls markAsSent() in Invoice.php to mark an invoice as sent
   * @param id Id of invoice which you want to mark as sent (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceMarkAsSent(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceMarkAsSent");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/markAsSent".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Refund an already payed invoice amount
   * Calls refundAmmount() in Invoice.php to refund an invoice amount
   * @param id Id of invoice of which you want to refund the amount (required)
   * @param ammount amount which should be refunded (required)
   * @param date booking date (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceRefundAmount(Integer id, Integer ammount, String date) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceRefundAmount");
    }
    // verify the required parameter 'ammount' is set
    if (ammount == null) {
      throw new ApiException(400, "Missing the required parameter 'ammount' when calling invoiceRefundAmount");
    }
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling invoiceRefundAmount");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/refundAmmount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ammount", ammount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Render invoice document on docserver and return metadata
   * Calls render() in Invoice.php to render invoice document on docserver and return the metadata
   * @param id Id of invoice of which you want to render the document and get the metadata (required)
   * @throws ApiException if fails to make API call
   */
  public void invoiceRender(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceRender");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/render".replaceAll("\\{format\\}","json")
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

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Send invoice by desired method
   * Calls sendBy() in Invoice.php to send an invoice by the desired method
   * @param id Id of invoice which you want to send (required)
   * @param sendType desired send type, available are: VM &#x3D; Mail, VP &#x3D; Post, VPDF &#x3D; PDF, PRN &#x3D; Print (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice invoiceSendBy(Integer id, String sendType) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceSendBy");
    }
    // verify the required parameter 'sendType' is set
    if (sendType == null) {
      throw new ApiException(400, "Missing the required parameter 'sendType' when calling invoiceSendBy");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/sendBy".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sendType", sendType));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create a new invoice (with / without invoice positions and discounts) 
   * With the new version of sevdesk some models are not created by calling the model.php directly but by calling the factory.php because of better performance and flexibility.    Basically the model.php itself still constructs the model however new instances of the model are created trough the factory.php    So for example when you create a new invoice it wont be saved by a POST request with &#x27;/Invoice?para1&#x3D;&amp;...&#x27; but with the saveInvoice function in Factory.php &#x27;Voucher/Factory/saveInvoice?para1&#x3D;&#x27;
   * @return ModelInvoiceFactory
   * @throws ApiException if fails to make API call
   */
  public ModelInvoiceFactory saveInvoice() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Invoice/Factory/saveInvoice".replaceAll("\\{format\\}","json");

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

    GenericType<ModelInvoiceFactory> localVarReturnType = new GenericType<ModelInvoiceFactory>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Send an invoice via Email
   * Calls sendViaEmail in Invoice.php
   * @param id id of invoice you want to send via Email (required)
   * @return ModelEmail
   * @throws ApiException if fails to make API call
   */
  public ModelEmail sendInvoiceViaEmail(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sendInvoiceViaEmail");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/sendViaEmail".replaceAll("\\{format\\}","json")
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

    GenericType<ModelEmail> localVarReturnType = new GenericType<ModelEmail>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Send an invoice via Letter
   * Calls sendViaPost in Invoice.php
   * @param id id of invoice you want to send via Letter (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice sendInvoiceViaPost(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sendInvoiceViaPost");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}/sendViaPost".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing invoice
   * Calls Invoice.php
   * @param id id of invoice you want to update (required)
   * @return ModelInvoice
   * @throws ApiException if fails to make API call
   */
  public ModelInvoice updateInvoice(Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateInvoice");
    }
    // create path and map variables
    String localVarPath = "/Invoice/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<ModelInvoice> localVarReturnType = new GenericType<ModelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

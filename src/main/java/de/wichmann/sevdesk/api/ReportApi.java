package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ReportApi {
  private ApiClient apiClient;

  public ReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Export the contact
   * Calls contact() in Report.php to export the contact.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param download Specifies if the document is downloaded (required)
   * @param contactId Id of contact which should be exported (required)
   * @param contactObjectName Model name which is exported (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportContact(Boolean download, Integer contactId, String contactObjectName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'download' is set
    if (download == null) {
      throw new ApiException(400, "Missing the required parameter 'download' when calling reportContact");
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling reportContact");
    }
    // verify the required parameter 'contactObjectName' is set
    if (contactObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'contactObjectName' when calling reportContact");
    }
    // create path and map variables
    String localVarPath = "/Report/contact".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[id]", contactId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[objectName]", contactObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the contact list
   * Calls contactlist() in Report.php to export the contact list.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported contacts (optional)
   * @param sevQueryOffset Set the index where the exported contacts start (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportContactList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling reportContactList");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling reportContactList");
    }
    // create path and map variables
    String localVarPath = "/Report/contactlist".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[offset]", sevQueryOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the inventory
   * Calls inventory() in Report.php to export the inventory.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported inventory entries (optional)
   * @param sevQueryOffset Set the index where the exported parts start (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportInventory(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling reportInventory");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling reportInventory");
    }
    // create path and map variables
    String localVarPath = "/Report/inventory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[offset]", sevQueryOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the invoicelist
   * Calls invoicelist() in Report.php to export the invoices.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported invoices (optional)
   * @param sevQueryOffset Set the index where the exported invoices should start (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportInvoiceList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling reportInvoiceList");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling reportInvoiceList");
    }
    // create path and map variables
    String localVarPath = "/Report/invoicelist".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[offset]", sevQueryOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the order list
   * Calls orderlist() in Report.php to export the orders.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported orders (optional)
   * @param sevQueryOffset Set the index where the exported orders should start (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportOrderList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling reportOrderList");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling reportOrderList");
    }
    // create path and map variables
    String localVarPath = "/Report/orderlist".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[offset]", sevQueryOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the profit and loss
   * Calls profitAndLoss() in Report.php to export the profit and loss.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param startDate Start date of the profit and loss calculation (required)
   * @param endDate End date of the profit and loss calculation (required)
   * @param taxRule Specify if you want the net income method or the profit and loss (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportProfitAndLoss(String startDate, String endDate, Boolean taxRule, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling reportProfitAndLoss");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling reportProfitAndLoss");
    }
    // verify the required parameter 'taxRule' is set
    if (taxRule == null) {
      throw new ApiException(400, "Missing the required parameter 'taxRule' when calling reportProfitAndLoss");
    }
    // create path and map variables
    String localVarPath = "/Report/profitAndLoss".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRule", taxRule));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the register book / cash report
   * Calls registerBook() in Report.php to export the register book / cash report.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param checkAccountId Check account you want to export (required)
   * @param checkAccountObjectName Check account object name (required)
   * @param startDate Start date of the register book / cash report (required)
   * @param endDate End date of the register book / cash report (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportRegisterBook(Integer checkAccountId, String checkAccountObjectName, String startDate, String endDate, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'checkAccountId' is set
    if (checkAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkAccountId' when calling reportRegisterBook");
    }
    // verify the required parameter 'checkAccountObjectName' is set
    if (checkAccountObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'checkAccountObjectName' when calling reportRegisterBook");
    }
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling reportRegisterBook");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling reportRegisterBook");
    }
    // create path and map variables
    String localVarPath = "/Report/registerBook".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkAccount[id]", checkAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkAccount[objectName]", checkAccountObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Export the voucher list
   * Calls voucherlist() in Report.php to export the vouchers.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryFilterStartDate Start date to filter vouchers with (required)
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported vouchers (optional)
   * @param sevQueryOffset Set the index where the exported vouchers should start (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File reportVoucherList(String sevQueryFilterStartDate, String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryFilterStartDate' is set
    if (sevQueryFilterStartDate == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryFilterStartDate' when calling reportVoucherList");
    }
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling reportVoucherList");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling reportVoucherList");
    }
    // create path and map variables
    String localVarPath = "/Report/voucherlist".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][startDate]", sevQueryFilterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[offset]", sevQueryOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

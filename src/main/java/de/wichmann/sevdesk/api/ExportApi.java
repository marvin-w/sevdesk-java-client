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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ExportApi {
  private ApiClient apiClient;

  public ExportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Export the specified contact as csv
   * Calls contactCsv() in Export.php to export the specified contact as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param contactId Id of the contact you want to export (required)
   * @param contactObjectName Model name which is exported (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportContactCsv(Integer contactId, String contactObjectName, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling exportContactCsv");
    }
    // verify the required parameter 'contactObjectName' is set
    if (contactObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'contactObjectName' when calling exportContactCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/contactCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[id]", contactId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact[objectName]", contactObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Export the contact list as csv
   * Calls contactListCsv() in Export.php to export the contact list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported contacts (optional)
   * @param sevQueryFilterDepth Specify if companies and persons (true) or only persons (false) should be exported (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportContactListCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Boolean sevQueryFilterDepth) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportContactListCsv");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportContactListCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/contactListCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][depth]", sevQueryFilterDepth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Datev export as zip with csv´s
   * Calls datev() in Export.php to export the datev as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param scope Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... (required)
   * @param start Specify the start date for the datev export (required)
   * @param end Specify the end date for the datev export (required)
   * @param withEnshrined Specify if you want to include enshrined models (required)
   * @param enshrine Specify if you want to enshrine all models which were included in the export (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportDatev(String scope, String start, String end, Boolean withEnshrined, Object enshrine, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling exportDatev");
    }
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling exportDatev");
    }
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling exportDatev");
    }
    // verify the required parameter 'withEnshrined' is set
    if (withEnshrined == null) {
      throw new ApiException(400, "Missing the required parameter 'withEnshrined' when calling exportDatev");
    }
    // verify the required parameter 'enshrine' is set
    if (enshrine == null) {
      throw new ApiException(400, "Missing the required parameter 'enshrine' when calling exportDatev");
    }
    // create path and map variables
    String localVarPath = "/Export/datev".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withEnshrined", withEnshrined));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enshrine", enshrine));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * Export zip for voucher upload
   * Calls datevZip() in Export.php to export the zip for voucher upload.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param scope Define what you want to include in the zip export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... (required)
   * @param start Specify the start date for the zip export (required)
   * @param end Specify the end date for the zip export (required)
   * @param withEnshrined Specify if you want to include enshrined models (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportDatevZip(String scope, String start, String end, Boolean withEnshrined, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling exportDatevZip");
    }
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling exportDatevZip");
    }
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling exportDatevZip");
    }
    // verify the required parameter 'withEnshrined' is set
    if (withEnshrined == null) {
      throw new ApiException(400, "Missing the required parameter 'withEnshrined' when calling exportDatevZip");
    }
    // create path and map variables
    String localVarPath = "/Export/datevZip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withEnshrined", withEnshrined));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * Export the inventory part log as csv
   * Calls inventoryPartLogListCsv() in Export.php to export the inventory part log list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported part log (optional)
   * @param sevQueryFilterPartId Id of the part for which you want to export the part log (optional)
   * @param sevQueryFilterPartObjectName Object name of part (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportInventoryPartLogList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryFilterPartId, String sevQueryFilterPartObjectName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportInventoryPartLogList");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportInventoryPartLogList");
    }
    // create path and map variables
    String localVarPath = "/Export/inventoryPartLogListCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][part][id]", sevQueryFilterPartId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][part][objectName]", sevQueryFilterPartObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Export the invoice list as csv
   * Calls invoiceCsv() in Export.php to export the invoice list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported invoices (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportInvoiceCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportInvoiceCsv");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportInvoiceCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/invoiceCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Export the invoice list as zip with csv´s
   * Calls invoiceZip() in Export.php to export the invoice list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported invoices (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportInvoiceZip(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportInvoiceZip");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportInvoiceZip");
    }
    // create path and map variables
    String localVarPath = "/Export/invoiceZip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * Export the parts as csv
   * Calls partCsv() in Export.php to export the parts as csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported part (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportPartCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportPartCsv");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportPartCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/partCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Pebe export as zip with csv´s
   * Calls pebe() in Export.php to export the pebe zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param scope Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ... (required)
   * @param start Specify the start date for the pebe export (required)
   * @param end Specify the end date for the pebe export (required)
   * @param withEnshrined Specify if you want to include enshrined models (required)
   * @param enshrine Specify if you want to enshrine all models which were included in the export (required)
   * @param download Specifies if the document is downloaded (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportPebe(String scope, String start, String end, Boolean withEnshrined, Object enshrine, Boolean download) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling exportPebe");
    }
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling exportPebe");
    }
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling exportPebe");
    }
    // verify the required parameter 'withEnshrined' is set
    if (withEnshrined == null) {
      throw new ApiException(400, "Missing the required parameter 'withEnshrined' when calling exportPebe");
    }
    // verify the required parameter 'enshrine' is set
    if (enshrine == null) {
      throw new ApiException(400, "Missing the required parameter 'enshrine' when calling exportPebe");
    }
    // create path and map variables
    String localVarPath = "/Export/pebe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withEnshrined", withEnshrined));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enshrine", enshrine));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * Export the transactions as csv
   * Calls transactionsCsv() in Export.php to export the transactions as csv. Optionally you can provide a specific check account.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryFilterRegister Specifies if the register is included (required)
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param sevQueryOrderEntryDate Order in which you want to have the transactions listed (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param checkAccountId Specify check account for which you want the transactions. Otherwise all transactions will be used (optional)
   * @param checkAccountObjectName Check account model name (optional)
   * @param sevQueryLimit Limit exported transactions (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportTransactionsCsv(Boolean sevQueryFilterRegister, String sevQueryModelName, String sevQueryObjectName, String sevQueryOrderEntryDate, Boolean download, Integer checkAccountId, String checkAccountObjectName, Integer sevQueryLimit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryFilterRegister' is set
    if (sevQueryFilterRegister == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryFilterRegister' when calling exportTransactionsCsv");
    }
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportTransactionsCsv");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportTransactionsCsv");
    }
    // verify the required parameter 'sevQueryOrderEntryDate' is set
    if (sevQueryOrderEntryDate == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryOrderEntryDate' when calling exportTransactionsCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/transactionsCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkAccount[id]", checkAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkAccount[objectName]", checkAccountObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][register]", sevQueryFilterRegister));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[order][entryDate]", sevQueryOrderEntryDate));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Export the voucher list as csv
   * Calls voucherListCsv() in Export.php to export the voucher list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported vouchers (optional)
   * @param sevQueryFilterStartDate Start date of the voucher list (optional)
   * @param sevQueryFilterVoucherType Type of vouchers you want to export (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportVoucherListCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, String sevQueryFilterStartDate, String sevQueryFilterVoucherType) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportVoucherListCsv");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportVoucherListCsv");
    }
    // create path and map variables
    String localVarPath = "/Export/voucherListCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][startDate]", sevQueryFilterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][voucherType]", sevQueryFilterVoucherType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "text/csv"
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
   * Export the voucher list as zip with csv´s
   * Calls voucherZip() in Export.php to export the voucher list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
   * @param sevQueryModelName Model name which is exported (required)
   * @param sevQueryObjectName SevQuery object name (required)
   * @param download Specifies if the document is downloaded (optional)
   * @param sevQueryLimit Limit exported vouchers (optional)
   * @param sevQueryFilterStartDate Start date of the voucher list (optional)
   * @param sevQueryFilterVoucherType Type of vouchers you want to export (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportVoucherZip(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, String sevQueryFilterStartDate, String sevQueryFilterVoucherType) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sevQueryModelName' is set
    if (sevQueryModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryModelName' when calling exportVoucherZip");
    }
    // verify the required parameter 'sevQueryObjectName' is set
    if (sevQueryObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'sevQueryObjectName' when calling exportVoucherZip");
    }
    // create path and map variables
    String localVarPath = "/Export/voucherZip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[limit]", sevQueryLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][startDate]", sevQueryFilterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[filter][voucherType]", sevQueryFilterVoucherType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[modelName]", sevQueryModelName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sevQuery[objectName]", sevQueryObjectName));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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

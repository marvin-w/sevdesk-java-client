package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;

import java.io.File;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.ExportApi")
public class ExportApi {
    private ApiClient apiClient;

    public ExportApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param contactId Id of the contact you want to export
     * @param contactObjectName Model name which is exported
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportContactCsv(Integer contactId, String contactObjectName, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling exportContactCsv");
        }
        // verify the required parameter 'contactObjectName' is set
        if (contactObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactObjectName' when calling exportContactCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/contactCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contact[id]", contactId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contact[objectName]", contactObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the contact list as csv
     * Calls contactListCsv() in Export.php to export the contact list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported contacts
     * @param sevQueryFilterDepth Specify if companies and persons (true) or only persons (false) should be exported
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportContactListCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Boolean sevQueryFilterDepth) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportContactListCsv");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportContactListCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/contactListCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][depth]", sevQueryFilterDepth));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Datev export as zip with csv´s
     * Calls datev() in Export.php to export the datev as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param scope Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ...
     * @param start Specify the start date for the datev export
     * @param end Specify the end date for the datev export
     * @param withEnshrined Specify if you want to include enshrined models
     * @param enshrine Specify if you want to enshrine all models which were included in the export
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportDatev(String scope, String start, String end, Boolean withEnshrined, Object enshrine, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scope' when calling exportDatev");
        }
        // verify the required parameter 'start' is set
        if (start == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'start' when calling exportDatev");
        }
        // verify the required parameter 'end' is set
        if (end == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'end' when calling exportDatev");
        }
        // verify the required parameter 'withEnshrined' is set
        if (withEnshrined == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'withEnshrined' when calling exportDatev");
        }
        // verify the required parameter 'enshrine' is set
        if (enshrine == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'enshrine' when calling exportDatev");
        }
        String path = UriComponentsBuilder.fromPath("/Export/datev").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end", end));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "withEnshrined", withEnshrined));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enshrine", enshrine));

        final String[] accepts = { 
            "application/zip"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export zip for voucher upload
     * Calls datevZip() in Export.php to export the zip for voucher upload.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param scope Define what you want to include in the zip export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ...
     * @param start Specify the start date for the zip export
     * @param end Specify the end date for the zip export
     * @param withEnshrined Specify if you want to include enshrined models
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportDatevZip(String scope, String start, String end, Boolean withEnshrined, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scope' when calling exportDatevZip");
        }
        // verify the required parameter 'start' is set
        if (start == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'start' when calling exportDatevZip");
        }
        // verify the required parameter 'end' is set
        if (end == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'end' when calling exportDatevZip");
        }
        // verify the required parameter 'withEnshrined' is set
        if (withEnshrined == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'withEnshrined' when calling exportDatevZip");
        }
        String path = UriComponentsBuilder.fromPath("/Export/datevZip").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end", end));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "withEnshrined", withEnshrined));

        final String[] accepts = { 
            "application/zip"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the inventory part log as csv
     * Calls inventoryPartLogListCsv() in Export.php to export the inventory part log list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported part log
     * @param sevQueryFilterPartId Id of the part for which you want to export the part log
     * @param sevQueryFilterPartObjectName Object name of part
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportInventoryPartLogList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryFilterPartId, String sevQueryFilterPartObjectName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportInventoryPartLogList");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportInventoryPartLogList");
        }
        String path = UriComponentsBuilder.fromPath("/Export/inventoryPartLogListCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][part][id]", sevQueryFilterPartId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][part][objectName]", sevQueryFilterPartObjectName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the invoice list as csv
     * Calls invoiceCsv() in Export.php to export the invoice list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported invoices
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportInvoiceCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportInvoiceCsv");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportInvoiceCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/invoiceCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the invoice list as zip with csv´s
     * Calls invoiceZip() in Export.php to export the invoice list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported invoices
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportInvoiceZip(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportInvoiceZip");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportInvoiceZip");
        }
        String path = UriComponentsBuilder.fromPath("/Export/invoiceZip").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/zip"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the parts as csv
     * Calls partCsv() in Export.php to export the parts as csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported part
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportPartCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportPartCsv");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportPartCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/partCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Pebe export as zip with csv´s
     * Calls pebe() in Export.php to export the pebe zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param scope Define what you want to include in the datev export. This parameter takes a string of 4 letters. Each stands for a model that should be included.    Possible letters are: **&#x27;I&#x27;** (Invoices), **&#x27;V&#x27;** (Vouchers), **&#x27;D&#x27;** (Depreciations), **&#x27;T&#x27;** (Transactions).    By providing one of those letter you specify that it should be included in the datev export. Some combinations are: &#x27;IVDT&#x27;, &#x27;IVT&#x27; ...
     * @param start Specify the start date for the pebe export
     * @param end Specify the end date for the pebe export
     * @param withEnshrined Specify if you want to include enshrined models
     * @param enshrine Specify if you want to enshrine all models which were included in the export
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportPebe(String scope, String start, String end, Boolean withEnshrined, Object enshrine, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scope' when calling exportPebe");
        }
        // verify the required parameter 'start' is set
        if (start == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'start' when calling exportPebe");
        }
        // verify the required parameter 'end' is set
        if (end == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'end' when calling exportPebe");
        }
        // verify the required parameter 'withEnshrined' is set
        if (withEnshrined == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'withEnshrined' when calling exportPebe");
        }
        // verify the required parameter 'enshrine' is set
        if (enshrine == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'enshrine' when calling exportPebe");
        }
        String path = UriComponentsBuilder.fromPath("/Export/pebe").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end", end));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "withEnshrined", withEnshrined));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enshrine", enshrine));

        final String[] accepts = { 
            "application/zip"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the transactions as csv
     * Calls transactionsCsv() in Export.php to export the transactions as csv. Optionally you can provide a specific check account.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryFilterRegister Specifies if the register is included
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param sevQueryOrderEntryDate Order in which you want to have the transactions listed
     * @param download Specifies if the document is downloaded
     * @param checkAccountId Specify check account for which you want the transactions. Otherwise all transactions will be used
     * @param checkAccountObjectName Check account model name
     * @param sevQueryLimit Limit exported transactions
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportTransactionsCsv(Boolean sevQueryFilterRegister, String sevQueryModelName, String sevQueryObjectName, String sevQueryOrderEntryDate, Boolean download, Integer checkAccountId, String checkAccountObjectName, Integer sevQueryLimit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryFilterRegister' is set
        if (sevQueryFilterRegister == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryFilterRegister' when calling exportTransactionsCsv");
        }
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportTransactionsCsv");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportTransactionsCsv");
        }
        // verify the required parameter 'sevQueryOrderEntryDate' is set
        if (sevQueryOrderEntryDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryOrderEntryDate' when calling exportTransactionsCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/transactionsCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkAccount[id]", checkAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkAccount[objectName]", checkAccountObjectName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][register]", sevQueryFilterRegister));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[order][entryDate]", sevQueryOrderEntryDate));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the voucher list as csv
     * Calls voucherListCsv() in Export.php to export the voucher list as a csv.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported vouchers
     * @param sevQueryFilterStartDate Start date of the voucher list
     * @param sevQueryFilterVoucherType Type of vouchers you want to export
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportVoucherListCsv(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, String sevQueryFilterStartDate, String sevQueryFilterVoucherType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportVoucherListCsv");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportVoucherListCsv");
        }
        String path = UriComponentsBuilder.fromPath("/Export/voucherListCsv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][startDate]", sevQueryFilterStartDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][voucherType]", sevQueryFilterVoucherType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "text/csv"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the voucher list as zip with csv´s
     * Calls voucherZip() in Export.php to export the voucher list as a zip with csv´s.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported vouchers
     * @param sevQueryFilterStartDate Start date of the voucher list
     * @param sevQueryFilterVoucherType Type of vouchers you want to export
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File exportVoucherZip(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, String sevQueryFilterStartDate, String sevQueryFilterVoucherType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling exportVoucherZip");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling exportVoucherZip");
        }
        String path = UriComponentsBuilder.fromPath("/Export/voucherZip").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][startDate]", sevQueryFilterStartDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][voucherType]", sevQueryFilterVoucherType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/zip"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

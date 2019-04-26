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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.ReportApi")
public class ReportApi {
    private ApiClient apiClient;

    public ReportApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param download Specifies if the document is downloaded
     * @param contactId Id of contact which should be exported
     * @param contactObjectName Model name which is exported
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportContact(Boolean download, Integer contactId, String contactObjectName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'download' is set
        if (download == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'download' when calling reportContact");
        }
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling reportContact");
        }
        // verify the required parameter 'contactObjectName' is set
        if (contactObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactObjectName' when calling reportContact");
        }
        String path = UriComponentsBuilder.fromPath("/Report/contact").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contact[id]", contactId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contact[objectName]", contactObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the contact list
     * Calls contactlist() in Report.php to export the contact list.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported contacts
     * @param sevQueryOffset Set the index where the exported contacts start
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportContactList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling reportContactList");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling reportContactList");
        }
        String path = UriComponentsBuilder.fromPath("/Report/contactlist").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[offset]", sevQueryOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the inventory
     * Calls inventory() in Report.php to export the inventory.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported inventory entries
     * @param sevQueryOffset Set the index where the exported parts start
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportInventory(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling reportInventory");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling reportInventory");
        }
        String path = UriComponentsBuilder.fromPath("/Report/inventory").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[offset]", sevQueryOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the invoicelist
     * Calls invoicelist() in Report.php to export the invoices.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported invoices
     * @param sevQueryOffset Set the index where the exported invoices should start
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportInvoiceList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling reportInvoiceList");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling reportInvoiceList");
        }
        String path = UriComponentsBuilder.fromPath("/Report/invoicelist").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[offset]", sevQueryOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the order list
     * Calls orderlist() in Report.php to export the orders.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported orders
     * @param sevQueryOffset Set the index where the exported orders should start
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportOrderList(String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling reportOrderList");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling reportOrderList");
        }
        String path = UriComponentsBuilder.fromPath("/Report/orderlist").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[offset]", sevQueryOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the profit and loss
     * Calls profitAndLoss() in Report.php to export the profit and loss.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param startDate Start date of the profit and loss calculation
     * @param endDate End date of the profit and loss calculation
     * @param taxRule Specify if you want the net income method or the profit and loss
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportProfitAndLoss(String startDate, String endDate, Boolean taxRule, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling reportProfitAndLoss");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling reportProfitAndLoss");
        }
        // verify the required parameter 'taxRule' is set
        if (taxRule == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taxRule' when calling reportProfitAndLoss");
        }
        String path = UriComponentsBuilder.fromPath("/Report/profitAndLoss").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "taxRule", taxRule));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the register book / cash report
     * Calls registerBook() in Report.php to export the register book / cash report.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param checkAccountId Check account you want to export
     * @param checkAccountObjectName Check account object name
     * @param startDate Start date of the register book / cash report
     * @param endDate End date of the register book / cash report
     * @param download Specifies if the document is downloaded
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportRegisterBook(Integer checkAccountId, String checkAccountObjectName, String startDate, String endDate, Boolean download) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'checkAccountId' is set
        if (checkAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkAccountId' when calling reportRegisterBook");
        }
        // verify the required parameter 'checkAccountObjectName' is set
        if (checkAccountObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkAccountObjectName' when calling reportRegisterBook");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling reportRegisterBook");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling reportRegisterBook");
        }
        String path = UriComponentsBuilder.fromPath("/Report/registerBook").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkAccount[id]", checkAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkAccount[objectName]", checkAccountObjectName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export the voucher list
     * Calls voucherlist() in Report.php to export the vouchers.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param sevQueryFilterStartDate Start date to filter vouchers with
     * @param sevQueryModelName Model name which is exported
     * @param sevQueryObjectName SevQuery object name
     * @param download Specifies if the document is downloaded
     * @param sevQueryLimit Limit exported vouchers
     * @param sevQueryOffset Set the index where the exported vouchers should start
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File reportVoucherList(String sevQueryFilterStartDate, String sevQueryModelName, String sevQueryObjectName, Boolean download, Integer sevQueryLimit, Integer sevQueryOffset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sevQueryFilterStartDate' is set
        if (sevQueryFilterStartDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryFilterStartDate' when calling reportVoucherList");
        }
        // verify the required parameter 'sevQueryModelName' is set
        if (sevQueryModelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryModelName' when calling reportVoucherList");
        }
        // verify the required parameter 'sevQueryObjectName' is set
        if (sevQueryObjectName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sevQueryObjectName' when calling reportVoucherList");
        }
        String path = UriComponentsBuilder.fromPath("/Report/voucherlist").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "download", download));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[filter][startDate]", sevQueryFilterStartDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[limit]", sevQueryLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[offset]", sevQueryOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[modelName]", sevQueryModelName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sevQuery[objectName]", sevQueryObjectName));

        final String[] accepts = { 
            "application/pdf"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

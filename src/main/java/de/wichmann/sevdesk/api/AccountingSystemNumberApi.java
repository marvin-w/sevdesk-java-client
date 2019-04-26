package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;

import de.wichmann.sevdesk.model.ModelAccountingSystemNumber;
import de.wichmann.sevdesk.model.ModelAccountingType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.AccountingSystemNumberApi")
public class AccountingSystemNumberApi {
    private ApiClient apiClient;

    public AccountingSystemNumberApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountingSystemNumberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new accounting system number
     * Calls AccountingSystemNumber.php 
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @return ModelAccountingSystemNumber
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAccountingSystemNumber addAccountingSystemNumber() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/AccountingSystemNumber").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<ModelAccountingSystemNumber> returnType = new ParameterizedTypeReference<ModelAccountingSystemNumber>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an existing accounting system number
     * Calls the delete() function in AccountingSystemNumber.php
     * <p><b>200</b> - deleted
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id id of accounting system number you want to delete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAccountingSystemNumber(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteAccountingSystemNumber");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/AccountingSystemNumber/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an overview of all accounting system numbers
     * Calls AccountingSystemNumber.php to get necessary variables.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param limit Limits the number of entries returned. Default is 1000
     * @param offset Set the index where the returned accounting system numbers start. Default is 0
     * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;.
     * @return ModelAccountingSystemNumber
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAccountingSystemNumber getAccountingSystemNumbers(Integer limit, Integer offset, List<String> embed) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/AccountingSystemNumber").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "embed", embed));

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<ModelAccountingSystemNumber> returnType = new ParameterizedTypeReference<ModelAccountingSystemNumber>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an existing accounting system number
     * Calls AccountingSystemNumber.php
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id id of accounting system number you want to update
     * @return ModelAccountingType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAccountingType updateAccountingSystemNumber(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateAccountingSystemNumber");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/AccountingSystemNumber/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<ModelAccountingType> returnType = new ParameterizedTypeReference<ModelAccountingType>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

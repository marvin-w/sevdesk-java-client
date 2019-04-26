package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;

import de.wichmann.sevdesk.model.ModelAsset;
import de.wichmann.sevdesk.model.ModelVoucher;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.AssetApi")
public class AssetApi {
    private ApiClient apiClient;

    public AssetApi() {
        this(new ApiClient());
    }

    @Autowired
    public AssetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new asset
     * Calls Asset.php 
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @return ModelAsset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAsset addAsset() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Asset").build().toUriString();
        
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

        ParameterizedTypeReference<ModelAsset> returnType = new ParameterizedTypeReference<ModelAsset>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get depreciation amount of the specified asset for the given year/month
     * Calls getDepreciationAmount() in Asset.php to get the depreciation ammount of the specified asset for the given year/month
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id Id of the asset of which you want to get the depreciation amount
     * @param year year for which you want to get the depreciation amount
     * @param month month for which you want to get the depreciation amount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void assetGetDepreciationAmount(Integer id, String year, String month) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling assetGetDepreciationAmount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Asset/{id}/getDepreciationAmount").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "month", month));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get residual value of the specified asset for the given year/month
     * Calls getResidualValue() in Asset.php to get the residual value of the specified asset for the given year/month
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id Id of the asset of which you want to get the residual value
     * @param year year for which you want to get the residual value
     * @param month month for which you want to get the residual value
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void assetGetResidualValue(Integer id, String year, String month) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling assetGetResidualValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Asset/{id}/getResidualValue").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "month", month));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get voucher of the specified asset
     * Calls getVoucher() in Asset.php to get the voucher of the specified asset
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id Id of the asset of which you want to get the voucher
     * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;.
     * @return ModelVoucher
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelVoucher assetGetVoucher(Integer id, List<String> embed) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling assetGetVoucher");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Asset/{id}/getVoucher").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "embed", embed));

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<ModelVoucher> returnType = new ParameterizedTypeReference<ModelVoucher>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an existing asset
     * Calls the delete() function in Asset.php
     * <p><b>200</b> - deleted
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id id of asset you want to delete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAsset(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteAsset");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Asset/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get an overview of all assets
     * Calls Asset.php to get necessary variables.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param limit Limits the number of entries returned. Default is 100
     * @param offset Set the index where the returned assets start. Default is 0
     * @param embed Get some additional information. Embed can handle multiple values, they must be separated by comma. Default &#x60;&#x60;.
     * @return ModelAsset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAsset getAssets(Integer limit, Integer offset, List<String> embed) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/Asset").build().toUriString();
        
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

        ParameterizedTypeReference<ModelAsset> returnType = new ParameterizedTypeReference<ModelAsset>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an existing asset
     * Calls Asset.php
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param id id of asset you want to update
     * @return ModelAsset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAsset updateAsset(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateAsset");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Asset/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ModelAsset> returnType = new ParameterizedTypeReference<ModelAsset>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.DocServerApi")
public class DocServerApi {
    private ApiClient apiClient;

    public DocServerApi() {
        this(new ApiClient());
    }

    @Autowired
    public DocServerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a specified letter paper
     * Calls deleteLetterpaper() in DocServer.php to delete a specified letter paper
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerDeleteLetterPaper() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/deleteLetterpaper").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a specified template
     * Calls setDefaultTemplate() in DocServer.php to set the specified template as the default template
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerDeleteTemplate() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/deleteTemplate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an overview of all letter papers
     * Calls getLetterpapers() in DocServer.php to get the stored letter papers
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerGetLetterPapers() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/getLetterpapers").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an overview of all letter papers with their thumb
     * Calls getLetterpapersWithThumb() in DocServer.php to get the stored letter papers with their thumb.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerGetLetterPapersWithThumb() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/getLetterpapersWithThumb").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an overview of all templates
     * Calls getTemplates() in DocServer.php to get the stored templates.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerGetTemplates() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/getTemplates").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an overview of all templates with their thumb
     * Calls getTemplatesWithThumb() in DocServer.php to get the stored templates with their thumb.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerGetTemplatesWithThumb() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/getTemplatesWithThumb").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set a letter papers as the default letter paper
     * Calls setDefaultLetterpaper() in DocServer.php to set the specified letter paper as the default letter paper
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerSetDefaultLetterPaper() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/setDefaultLetterpaper").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set a template as the default template
     * Calls setDefaultTemplate() in DocServer.php to set the specified template as the default template
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerSetDefaultTemplate() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/setDefaultTemplate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Store a letter paper on the doc server
     * Calls storeLetterpaper() in DocServer.php to store a letter paper on the doc server
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerStoreLetterPaper() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/storeLetterpaper").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Store a template on the doc server
     * Calls storeTemplate() in DocServer.php to store a template on the doc server
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerStoreTemplate() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/storeTemplate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Test a letter paper
     * Calls testLetterpaper() in DocServer.php to test your letter paper by providing the pdf.
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param file The file parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerTestLetterPaper(File file) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling docServerTestLetterPaper");
        }
        String path = UriComponentsBuilder.fromPath("/DocServer/testLetterpaper").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Test a template
     * Calls testTemplate() in DocServer.php to test your template by providing the html.
     * <p><b>201</b> - created
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void docServerTestTemplate() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/DocServer/testTemplate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

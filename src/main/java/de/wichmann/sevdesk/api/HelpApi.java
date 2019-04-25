package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.ApiClient;
import de.wichmann.sevdesk.Configuration;
import de.wichmann.sevdesk.Pair;

import javax.ws.rs.core.GenericType;

import de.wichmann.sevdesk.model.ModelHelp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class HelpApi {
  private ApiClient apiClient;

  public HelpApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HelpApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a specified article
   * Calls getArticle() in Help.php to get a specified help article
   * @param articleId Id of the article you want to get (required)
   * @return ModelHelp
   * @throws ApiException if fails to make API call
   */
  public ModelHelp helpGetArticle(Integer articleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'articleId' is set
    if (articleId == null) {
      throw new ApiException(400, "Missing the required parameter 'articleId' when calling helpGetArticle");
    }
    // create path and map variables
    String localVarPath = "/Help/getArticle".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "articleId", articleId));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelHelp> localVarReturnType = new GenericType<ModelHelp>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all help articles for a specified section
   * Calls getArticles() in Help.php to get all help articles for a specified section
   * @param sectionId Section id you want to get help articles about (required)
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned help articles start. Default is 0 (optional)
   * @return ModelHelp
   * @throws ApiException if fails to make API call
   */
  public ModelHelp helpGetArticles(Integer sectionId, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'sectionId' is set
    if (sectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sectionId' when calling helpGetArticles");
    }
    // create path and map variables
    String localVarPath = "/Help/getArticles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sectionId", sectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelHelp> localVarReturnType = new GenericType<ModelHelp>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all categories of help articles
   * Calls getCategories() in Help.php to get all categories available for searching help articles
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned sections start. Default is 0 (optional)
   * @return ModelHelp
   * @throws ApiException if fails to make API call
   */
  public ModelHelp helpGetCategories(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Help/getCategories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelHelp> localVarReturnType = new GenericType<ModelHelp>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all sections of help articles
   * Calls getSections() in Help.php to get all sections available for searching help articles
   * @param limit Limits the number of entries returned. Default is 100 (optional)
   * @param offset Set the index where the returned sections start. Default is 0 (optional)
   * @return ModelHelp
   * @throws ApiException if fails to make API call
   */
  public ModelHelp helpGetSections(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Help/getSections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelHelp> localVarReturnType = new GenericType<ModelHelp>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Search for articles
   * Calls search() in Help.php to search for articles
   * @param name String to search for (optional)
   * @return ModelHelp
   * @throws ApiException if fails to make API call
   */
  public ModelHelp helpSearchArticles(String name) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/Help/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<ModelHelp> localVarReturnType = new GenericType<ModelHelp>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

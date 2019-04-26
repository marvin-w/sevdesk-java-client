package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;

import de.wichmann.sevdesk.model.ModelCurrencyExchangeRate;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.CurrencyExchangeRateApi")
public class CurrencyExchangeRateApi {
    private ApiClient apiClient;

    public CurrencyExchangeRateApi() {
        this(new ApiClient());
    }

    @Autowired
    public CurrencyExchangeRateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an overview of all currency exchange rates
     * Calls CurrencyExchangeRate.php to get necessary variables
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param limit Limits the number of entries returned. Default is 1000.    Be aware that there are over 100000 entries in the database for currency exchange rate, so using a limit higher than 1000 with offset&#x3D;0 is not recommended!    However you can set the offset appropriately so you minimize the amount of returned exchange rates and keep loading time to a low.
     * @param offset Set the index where the returned currency exchange rates start. Default is 0
     * @return ModelCurrencyExchangeRate
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelCurrencyExchangeRate getCurrencyExchangeRates(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/CurrencyExchangeRate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<ModelCurrencyExchangeRate> returnType = new ParameterizedTypeReference<ModelCurrencyExchangeRate>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiClient;


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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")@Component("de.wichmann.sevdesk.api.VatReportApi")
public class VatReportApi {
    private ApiClient apiClient;

    public VatReportApi() {
        this(new ApiClient());
    }

    @Autowired
    public VatReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a vat report for a defined period of time
     * Calls VatReport.php to get necessary variables.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - invalid request
     * <p><b>401</b> - authentication required
     * @param reportingYear Year for which you want to have a vat report
     * @param reportingPeriodCode Define the period for your vat report
     * @param noActualTaxationOnInputTax Define if you want actual taxation on input tax
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getVatReport(Integer reportingYear, String reportingPeriodCode, Boolean noActualTaxationOnInputTax) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'reportingYear' is set
        if (reportingYear == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportingYear' when calling getVatReport");
        }
        // verify the required parameter 'reportingPeriodCode' is set
        if (reportingPeriodCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportingPeriodCode' when calling getVatReport");
        }
        // verify the required parameter 'noActualTaxationOnInputTax' is set
        if (noActualTaxationOnInputTax == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'noActualTaxationOnInputTax' when calling getVatReport");
        }
        String path = UriComponentsBuilder.fromPath("/VatReport").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reportingYear", reportingYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reportingPeriodCode", reportingPeriodCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "noActualTaxationOnInputTax", noActualTaxationOnInputTax));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

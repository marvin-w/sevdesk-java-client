/*
 * sevDesk
 * # Getting started  The sevDesk API v1 uses a token authentication.    You need to click on the authorization button (lock symbol) and enter your api-key there.    The token can be found on [https://my.sevdesk.de](https://my.sevdesk.de).    settings-->user-->specific user    # General information    The sevDesk api uses **models** to represent the different categories like **contacts** and **invoices**.    Every time you request such a model from the api, it will return the whole model schema including the unique **model id** and all the other objects and parameters that are included in the model.    Have a look at it in the developer console of your desired browser, especially if you are looking for specific parameters like the model id.    # URL    The basic URL contains four elements. **BaseURL** + **Controller** + **Version** + **Model**: [https://my.sevdesk.de/api/v1/Contact/](https://my.sevdesk.de/api/v1/Contact/)    # Basic Operations    Access a list of models: [https://my.sevdesk.de/api/v1/{Model}/](https://my.sevdesk.de/api/v1/{Model}/)    Access a specific model: [https://my.sevdesk.de/api/v1/{Model}/{id}](https://my.sevdesk.de/api/v1/{Model}/{id})    The **id** of a specific model can usually be found in the **developer console** of your browser or when opening a specific model, in the **url**.    Call a model function: [https://my.sevdesk.de/api/v1/{Model}/{id}/{Function}](https://my.sevdesk.de/api/v1/{Model}/{id}/{Function})    Each operation can be used with different HTTP methods:  * GET - read data  * POST - create data  * PUT - update existing data  * DELETE - delete data    # Useful Parameters    For each request, there are some specific parameters.    **GET Query Parameters**  * **limit** - limits the number of entries returned  * **offset** - set the index where the returned entries should start  * **embed** - embed can be used to get some additional information about a model. For example you can get the addresses of a contact with **embed=addresses**    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=addresses`    * If there is a need to get more information about the country in the addresses, embed can be extended by **addresses.country**    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=addresses,addresses.country`    * Some models also contain other models. By default these models are only filled with an id and objectName. If you want to get more information about the nested model you can use embed too.    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=parent`    * Every model also has specified 'query parameters'. These can be used to filter the results. E.g. all Contacts with a 'Company' in their name    `[GET]https://my.sevdesk.de/api/v1/Contact/?name=Company`    * **countAll** If countAll is set to 1 the total number of entries will be returned additionally  * **orderBy** Is an array that can be filled with objects containing the the properties field and arrangement    `json: orderBy = [{field:'parent' ,arrangement:'desc'},{field:'name' ,arrangement:'asc'}];`    `url: ?orderBy[0][field]=parent&orderBy[0][arrangement]=desc&orderBy[1][field]=name&orderBy[1][arrangement]=asc`
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.wichmann.sevdesk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.wichmann.sevdesk.model.ModelStaticCountry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelVatReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelVatReport {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("country")

  private ModelStaticCountry country = null;

  @JsonProperty("reportDate")

  private OffsetDateTime reportDate = null;

  @JsonProperty("reportingYear")

  private String reportingYear = null;

  @JsonProperty("reportingPeriod")

  private String reportingPeriod = null;

  @JsonProperty("reportingPeriodCode")

  private String reportingPeriodCode = null;

  @JsonProperty("reportingValues")

  private String reportingValues = null;

  @JsonProperty("testCase")

  private Boolean testCase = null;

  @JsonProperty("actualTaxation")

  private Boolean actualTaxation = null;

  @JsonProperty("corrected")

  private Boolean corrected = null;

  @JsonProperty("resultFinanceAuthority")

  private String resultFinanceAuthority = null;

  @JsonProperty("financeAuthorityTicketNumber")

  private String financeAuthorityTicketNumber = null;
  public ModelVatReport create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the vat report was created
  * @return create
  **/
  @Schema(description = "date the vat report was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelVatReport update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the vat report was last updated
  * @return update
  **/
  @Schema(description = "date the vat report was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelVatReport sevClient(Object sevClient) {
    this.sevClient = sevClient;
    return this;
  }

  

  /**
  * sevClient is the unique id every customer has and is used in nearly all operations
  * @return sevClient
  **/
  @Schema(description = "sevClient is the unique id every customer has and is used in nearly all operations")
  public Object getSevClient() {
    return sevClient;
  }
  public void setSevClient(Object sevClient) {
    this.sevClient = sevClient;
  }
  public ModelVatReport country(ModelStaticCountry country) {
    this.country = country;
    return this;
  }

  

  /**
  * Get country
  * @return country
  **/
  @Schema(description = "")
  public ModelStaticCountry getCountry() {
    return country;
  }
  public void setCountry(ModelStaticCountry country) {
    this.country = country;
  }
  public ModelVatReport reportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  

  /**
  * date of the vat report
  * @return reportDate
  **/
  @Schema(description = "date of the vat report")
  public OffsetDateTime getReportDate() {
    return reportDate;
  }
  public void setReportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
  }
  public ModelVatReport reportingYear(String reportingYear) {
    this.reportingYear = reportingYear;
    return this;
  }

  

  /**
  * year which is reported
  * @return reportingYear
  **/
  @Schema(description = "year which is reported")
  public String getReportingYear() {
    return reportingYear;
  }
  public void setReportingYear(String reportingYear) {
    this.reportingYear = reportingYear;
  }
  public ModelVatReport reportingPeriod(String reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
    return this;
  }

  

  /**
  * period which is reported
  * @return reportingPeriod
  **/
  @Schema(description = "period which is reported")
  public String getReportingPeriod() {
    return reportingPeriod;
  }
  public void setReportingPeriod(String reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }
  public ModelVatReport reportingPeriodCode(String reportingPeriodCode) {
    this.reportingPeriodCode = reportingPeriodCode;
    return this;
  }

  

  /**
  * Get reportingPeriodCode
  * @return reportingPeriodCode
  **/
  @Schema(description = "")
  public String getReportingPeriodCode() {
    return reportingPeriodCode;
  }
  public void setReportingPeriodCode(String reportingPeriodCode) {
    this.reportingPeriodCode = reportingPeriodCode;
  }
  public ModelVatReport reportingValues(String reportingValues) {
    this.reportingValues = reportingValues;
    return this;
  }

  

  /**
  * Get reportingValues
  * @return reportingValues
  **/
  @Schema(description = "")
  public String getReportingValues() {
    return reportingValues;
  }
  public void setReportingValues(String reportingValues) {
    this.reportingValues = reportingValues;
  }
  public ModelVatReport testCase(Boolean testCase) {
    this.testCase = testCase;
    return this;
  }

  

  /**
  * Get testCase
  * @return testCase
  **/
  @Schema(description = "")
  public Boolean isTestCase() {
    return testCase;
  }
  public void setTestCase(Boolean testCase) {
    this.testCase = testCase;
  }
  public ModelVatReport actualTaxation(Boolean actualTaxation) {
    this.actualTaxation = actualTaxation;
    return this;
  }

  

  /**
  * define if you want to report the main income method or the profit and loss
  * @return actualTaxation
  **/
  @Schema(description = "define if you want to report the main income method or the profit and loss")
  public Boolean isActualTaxation() {
    return actualTaxation;
  }
  public void setActualTaxation(Boolean actualTaxation) {
    this.actualTaxation = actualTaxation;
  }
  public ModelVatReport corrected(Boolean corrected) {
    this.corrected = corrected;
    return this;
  }

  

  /**
  * Get corrected
  * @return corrected
  **/
  @Schema(description = "")
  public Boolean isCorrected() {
    return corrected;
  }
  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }
  public ModelVatReport resultFinanceAuthority(String resultFinanceAuthority) {
    this.resultFinanceAuthority = resultFinanceAuthority;
    return this;
  }

  

  /**
  * Get resultFinanceAuthority
  * @return resultFinanceAuthority
  **/
  @Schema(description = "")
  public String getResultFinanceAuthority() {
    return resultFinanceAuthority;
  }
  public void setResultFinanceAuthority(String resultFinanceAuthority) {
    this.resultFinanceAuthority = resultFinanceAuthority;
  }
  public ModelVatReport financeAuthorityTicketNumber(String financeAuthorityTicketNumber) {
    this.financeAuthorityTicketNumber = financeAuthorityTicketNumber;
    return this;
  }

  

  /**
  * Get financeAuthorityTicketNumber
  * @return financeAuthorityTicketNumber
  **/
  @Schema(description = "")
  public String getFinanceAuthorityTicketNumber() {
    return financeAuthorityTicketNumber;
  }
  public void setFinanceAuthorityTicketNumber(String financeAuthorityTicketNumber) {
    this.financeAuthorityTicketNumber = financeAuthorityTicketNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVatReport modelVatReport = (ModelVatReport) o;
    return Objects.equals(this.create, modelVatReport.create) &&
        Objects.equals(this.update, modelVatReport.update) &&
        Objects.equals(this.sevClient, modelVatReport.sevClient) &&
        Objects.equals(this.country, modelVatReport.country) &&
        Objects.equals(this.reportDate, modelVatReport.reportDate) &&
        Objects.equals(this.reportingYear, modelVatReport.reportingYear) &&
        Objects.equals(this.reportingPeriod, modelVatReport.reportingPeriod) &&
        Objects.equals(this.reportingPeriodCode, modelVatReport.reportingPeriodCode) &&
        Objects.equals(this.reportingValues, modelVatReport.reportingValues) &&
        Objects.equals(this.testCase, modelVatReport.testCase) &&
        Objects.equals(this.actualTaxation, modelVatReport.actualTaxation) &&
        Objects.equals(this.corrected, modelVatReport.corrected) &&
        Objects.equals(this.resultFinanceAuthority, modelVatReport.resultFinanceAuthority) &&
        Objects.equals(this.financeAuthorityTicketNumber, modelVatReport.financeAuthorityTicketNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, sevClient, country, reportDate, reportingYear, reportingPeriod, reportingPeriodCode, reportingValues, testCase, actualTaxation, corrected, resultFinanceAuthority, financeAuthorityTicketNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVatReport {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportingYear: ").append(toIndentedString(reportingYear)).append("\n");
    sb.append("    reportingPeriod: ").append(toIndentedString(reportingPeriod)).append("\n");
    sb.append("    reportingPeriodCode: ").append(toIndentedString(reportingPeriodCode)).append("\n");
    sb.append("    reportingValues: ").append(toIndentedString(reportingValues)).append("\n");
    sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
    sb.append("    actualTaxation: ").append(toIndentedString(actualTaxation)).append("\n");
    sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
    sb.append("    resultFinanceAuthority: ").append(toIndentedString(resultFinanceAuthority)).append("\n");
    sb.append("    financeAuthorityTicketNumber: ").append(toIndentedString(financeAuthorityTicketNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

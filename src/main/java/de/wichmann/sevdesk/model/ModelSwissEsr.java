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
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelSwissEsr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelSwissEsr {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("addressCityCredit")

  private String addressCityCredit = null;

  @JsonProperty("addressZipCredit")

  private String addressZipCredit = null;

  @JsonProperty("postSubscriberNumberBank")

  private String postSubscriberNumberBank = null;

  @JsonProperty("internalSubscriberNumber")

  private String internalSubscriberNumber = null;

  @JsonProperty("documentTypeCode")

  private String documentTypeCode = null;

  @JsonProperty("isEsr")

  private Integer isEsr = null;
  public ModelSwissEsr create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the swiss esr was created
  * @return create
  **/
  @Schema(description = "date the swiss esr was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelSwissEsr update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the swiss esr was last updated
  * @return update
  **/
  @Schema(description = "date the swiss esr was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelSwissEsr sevClient(Object sevClient) {
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
  public ModelSwissEsr addressCityCredit(String addressCityCredit) {
    this.addressCityCredit = addressCityCredit;
    return this;
  }

  

  /**
  * Get addressCityCredit
  * @return addressCityCredit
  **/
  @Schema(description = "")
  public String getAddressCityCredit() {
    return addressCityCredit;
  }
  public void setAddressCityCredit(String addressCityCredit) {
    this.addressCityCredit = addressCityCredit;
  }
  public ModelSwissEsr addressZipCredit(String addressZipCredit) {
    this.addressZipCredit = addressZipCredit;
    return this;
  }

  

  /**
  * Get addressZipCredit
  * @return addressZipCredit
  **/
  @Schema(description = "")
  public String getAddressZipCredit() {
    return addressZipCredit;
  }
  public void setAddressZipCredit(String addressZipCredit) {
    this.addressZipCredit = addressZipCredit;
  }
  public ModelSwissEsr postSubscriberNumberBank(String postSubscriberNumberBank) {
    this.postSubscriberNumberBank = postSubscriberNumberBank;
    return this;
  }

  

  /**
  * Get postSubscriberNumberBank
  * @return postSubscriberNumberBank
  **/
  @Schema(description = "")
  public String getPostSubscriberNumberBank() {
    return postSubscriberNumberBank;
  }
  public void setPostSubscriberNumberBank(String postSubscriberNumberBank) {
    this.postSubscriberNumberBank = postSubscriberNumberBank;
  }
  public ModelSwissEsr internalSubscriberNumber(String internalSubscriberNumber) {
    this.internalSubscriberNumber = internalSubscriberNumber;
    return this;
  }

  

  /**
  * Get internalSubscriberNumber
  * @return internalSubscriberNumber
  **/
  @Schema(description = "")
  public String getInternalSubscriberNumber() {
    return internalSubscriberNumber;
  }
  public void setInternalSubscriberNumber(String internalSubscriberNumber) {
    this.internalSubscriberNumber = internalSubscriberNumber;
  }
  public ModelSwissEsr documentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

  

  /**
  * Get documentTypeCode
  * @return documentTypeCode
  **/
  @Schema(description = "")
  public String getDocumentTypeCode() {
    return documentTypeCode;
  }
  public void setDocumentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }
  public ModelSwissEsr isEsr(Integer isEsr) {
    this.isEsr = isEsr;
    return this;
  }

  

  /**
  * Get isEsr
  * @return isEsr
  **/
  @Schema(description = "")
  public Integer getIsEsr() {
    return isEsr;
  }
  public void setIsEsr(Integer isEsr) {
    this.isEsr = isEsr;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSwissEsr modelSwissEsr = (ModelSwissEsr) o;
    return Objects.equals(this.create, modelSwissEsr.create) &&
        Objects.equals(this.update, modelSwissEsr.update) &&
        Objects.equals(this.sevClient, modelSwissEsr.sevClient) &&
        Objects.equals(this.addressCityCredit, modelSwissEsr.addressCityCredit) &&
        Objects.equals(this.addressZipCredit, modelSwissEsr.addressZipCredit) &&
        Objects.equals(this.postSubscriberNumberBank, modelSwissEsr.postSubscriberNumberBank) &&
        Objects.equals(this.internalSubscriberNumber, modelSwissEsr.internalSubscriberNumber) &&
        Objects.equals(this.documentTypeCode, modelSwissEsr.documentTypeCode) &&
        Objects.equals(this.isEsr, modelSwissEsr.isEsr);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, sevClient, addressCityCredit, addressZipCredit, postSubscriberNumberBank, internalSubscriberNumber, documentTypeCode, isEsr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSwissEsr {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    addressCityCredit: ").append(toIndentedString(addressCityCredit)).append("\n");
    sb.append("    addressZipCredit: ").append(toIndentedString(addressZipCredit)).append("\n");
    sb.append("    postSubscriberNumberBank: ").append(toIndentedString(postSubscriberNumberBank)).append("\n");
    sb.append("    internalSubscriberNumber: ").append(toIndentedString(internalSubscriberNumber)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    isEsr: ").append(toIndentedString(isEsr)).append("\n");
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

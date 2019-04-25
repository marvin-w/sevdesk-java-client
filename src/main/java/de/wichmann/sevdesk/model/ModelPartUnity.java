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
 * ModelPartUnity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ModelPartUnity {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("part")

  private Object part = null;

  @JsonProperty("price")

  private Float price = null;

  @JsonProperty("factor")

  private Float factor = null;

  @JsonProperty("unity")

  private Object unity = null;
  public ModelPartUnity create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the part unity was created
  * @return create
  **/
  @Schema(description = "date the part unity was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelPartUnity update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the part unity was last updated
  * @return update
  **/
  @Schema(description = "date the part unity was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelPartUnity sevClient(Object sevClient) {
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
  public ModelPartUnity part(Object part) {
    this.part = part;
    return this;
  }

  

  /**
  * part involved in the part unity
  * @return part
  **/
  @Schema(description = "part involved in the part unity")
  public Object getPart() {
    return part;
  }
  public void setPart(Object part) {
    this.part = part;
  }
  public ModelPartUnity price(Float price) {
    this.price = price;
    return this;
  }

  

  /**
  * price of the part
  * @return price
  **/
  @Schema(description = "price of the part")
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }
  public ModelPartUnity factor(Float factor) {
    this.factor = factor;
    return this;
  }

  

  /**
  * factor of the part
  * @return factor
  **/
  @Schema(description = "factor of the part")
  public Float getFactor() {
    return factor;
  }
  public void setFactor(Float factor) {
    this.factor = factor;
  }
  public ModelPartUnity unity(Object unity) {
    this.unity = unity;
    return this;
  }

  

  /**
  * unity of the part
  * @return unity
  **/
  @Schema(description = "unity of the part")
  public Object getUnity() {
    return unity;
  }
  public void setUnity(Object unity) {
    this.unity = unity;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPartUnity modelPartUnity = (ModelPartUnity) o;
    return Objects.equals(this.create, modelPartUnity.create) &&
        Objects.equals(this.update, modelPartUnity.update) &&
        Objects.equals(this.sevClient, modelPartUnity.sevClient) &&
        Objects.equals(this.part, modelPartUnity.part) &&
        Objects.equals(this.price, modelPartUnity.price) &&
        Objects.equals(this.factor, modelPartUnity.factor) &&
        Objects.equals(this.unity, modelPartUnity.unity);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, sevClient, part, price, factor, unity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPartUnity {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    unity: ").append(toIndentedString(unity)).append("\n");
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
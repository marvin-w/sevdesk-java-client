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
 * ModelDocumentIndex
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ModelDocumentIndex {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("user")

  private Object user = null;

  @JsonProperty("document")

  private Object document = null;

  @JsonProperty("index")

  private Integer index = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("status")

  private Integer status = null;

  @JsonProperty("extension")

  private String extension = null;

  @JsonProperty("mimeType")

  private String mimeType = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;
  public ModelDocumentIndex create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the document index was created
  * @return create
  **/
  @Schema(description = "date the document index was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelDocumentIndex update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the document index was last updated
  * @return update
  **/
  @Schema(description = "date the document index was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelDocumentIndex user(Object user) {
    this.user = user;
    return this;
  }

  

  /**
  * user that created the document index
  * @return user
  **/
  @Schema(description = "user that created the document index")
  public Object getUser() {
    return user;
  }
  public void setUser(Object user) {
    this.user = user;
  }
  public ModelDocumentIndex document(Object document) {
    this.document = document;
    return this;
  }

  

  /**
  * the document to which the index belongs
  * @return document
  **/
  @Schema(description = "the document to which the index belongs")
  public Object getDocument() {
    return document;
  }
  public void setDocument(Object document) {
    this.document = document;
  }
  public ModelDocumentIndex index(Integer index) {
    this.index = index;
    return this;
  }

  

  /**
  * index
  * @return index
  **/
  @Schema(description = "index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }
  public ModelDocumentIndex name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ModelDocumentIndex status(Integer status) {
    this.status = status;
    return this;
  }

  

  /**
  * status of the document index
  * @return status
  **/
  @Schema(description = "status of the document index")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public ModelDocumentIndex extension(String extension) {
    this.extension = extension;
    return this;
  }

  

  /**
  * Get extension
  * @return extension
  **/
  @Schema(description = "")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public ModelDocumentIndex mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  

  /**
  * Get mimeType
  * @return mimeType
  **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  public ModelDocumentIndex sevClient(Object sevClient) {
    this.sevClient = sevClient;
    return this;
  }

  

  /**
  * sevClient that created the document index
  * @return sevClient
  **/
  @Schema(description = "sevClient that created the document index")
  public Object getSevClient() {
    return sevClient;
  }
  public void setSevClient(Object sevClient) {
    this.sevClient = sevClient;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentIndex modelDocumentIndex = (ModelDocumentIndex) o;
    return Objects.equals(this.create, modelDocumentIndex.create) &&
        Objects.equals(this.update, modelDocumentIndex.update) &&
        Objects.equals(this.user, modelDocumentIndex.user) &&
        Objects.equals(this.document, modelDocumentIndex.document) &&
        Objects.equals(this.index, modelDocumentIndex.index) &&
        Objects.equals(this.name, modelDocumentIndex.name) &&
        Objects.equals(this.status, modelDocumentIndex.status) &&
        Objects.equals(this.extension, modelDocumentIndex.extension) &&
        Objects.equals(this.mimeType, modelDocumentIndex.mimeType) &&
        Objects.equals(this.sevClient, modelDocumentIndex.sevClient);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, user, document, index, name, status, extension, mimeType, sevClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentIndex {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
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

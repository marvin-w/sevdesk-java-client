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
import de.wichmann.sevdesk.model.ModelDocumentFolder;
import de.wichmann.sevdesk.model.ModelSevUser;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelDocument
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelDocument {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("object")

  private Object object = null;

  @JsonProperty("documentNumber")

  private String documentNumber = null;

  @JsonProperty("baseObject")

  private OffsetDateTime baseObject = null;

  @JsonProperty("createUser")

  private ModelSevUser createUser = null;

  @JsonProperty("updateUser")

  private ModelSevUser updateUser = null;

  @JsonProperty("mimeType")

  private String mimeType = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("objectAction")

  private Object objectAction = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("folder")

  private ModelDocumentFolder folder = null;

  @JsonProperty("filename")

  private String filename = null;

  @JsonProperty("status")

  private Integer status = null;

  @JsonProperty("extension")

  private String extension = null;

  @JsonProperty("filesize")

  private Integer filesize = null;
  public ModelDocument create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the document was created
  * @return create
  **/
  @Schema(description = "date the document was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelDocument update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the document was last updated
  * @return update
  **/
  @Schema(description = "date the document was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelDocument object(Object object) {
    this.object = object;
    return this;
  }

  

  /**
  * Get object
  * @return object
  **/
  @Schema(description = "")
  public Object getObject() {
    return object;
  }
  public void setObject(Object object) {
    this.object = object;
  }
  public ModelDocument documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  

  /**
  * Get documentNumber
  * @return documentNumber
  **/
  @Schema(description = "")
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }
  public ModelDocument baseObject(OffsetDateTime baseObject) {
    this.baseObject = baseObject;
    return this;
  }

  

  /**
  * Get baseObject
  * @return baseObject
  **/
  @Schema(description = "")
  public OffsetDateTime getBaseObject() {
    return baseObject;
  }
  public void setBaseObject(OffsetDateTime baseObject) {
    this.baseObject = baseObject;
  }
  public ModelDocument createUser(ModelSevUser createUser) {
    this.createUser = createUser;
    return this;
  }

  

  /**
  * Get createUser
  * @return createUser
  **/
  @Schema(description = "")
  public ModelSevUser getCreateUser() {
    return createUser;
  }
  public void setCreateUser(ModelSevUser createUser) {
    this.createUser = createUser;
  }
  public ModelDocument updateUser(ModelSevUser updateUser) {
    this.updateUser = updateUser;
    return this;
  }

  

  /**
  * Get updateUser
  * @return updateUser
  **/
  @Schema(description = "")
  public ModelSevUser getUpdateUser() {
    return updateUser;
  }
  public void setUpdateUser(ModelSevUser updateUser) {
    this.updateUser = updateUser;
  }
  public ModelDocument mimeType(String mimeType) {
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
  public ModelDocument description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ModelDocument objectAction(Object objectAction) {
    this.objectAction = objectAction;
    return this;
  }

  

  /**
  * Get objectAction
  * @return objectAction
  **/
  @Schema(description = "")
  public Object getObjectAction() {
    return objectAction;
  }
  public void setObjectAction(Object objectAction) {
    this.objectAction = objectAction;
  }
  public ModelDocument sevClient(Object sevClient) {
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
  public ModelDocument folder(ModelDocumentFolder folder) {
    this.folder = folder;
    return this;
  }

  

  /**
  * Get folder
  * @return folder
  **/
  @Schema(description = "")
  public ModelDocumentFolder getFolder() {
    return folder;
  }
  public void setFolder(ModelDocumentFolder folder) {
    this.folder = folder;
  }
  public ModelDocument filename(String filename) {
    this.filename = filename;
    return this;
  }

  

  /**
  * Get filename
  * @return filename
  **/
  @Schema(description = "")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }
  public ModelDocument status(Integer status) {
    this.status = status;
    return this;
  }

  

  /**
  * Get status
  * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public ModelDocument extension(String extension) {
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
  public ModelDocument filesize(Integer filesize) {
    this.filesize = filesize;
    return this;
  }

  

  /**
  * Get filesize
  * @return filesize
  **/
  @Schema(description = "")
  public Integer getFilesize() {
    return filesize;
  }
  public void setFilesize(Integer filesize) {
    this.filesize = filesize;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocument modelDocument = (ModelDocument) o;
    return Objects.equals(this.create, modelDocument.create) &&
        Objects.equals(this.update, modelDocument.update) &&
        Objects.equals(this.object, modelDocument.object) &&
        Objects.equals(this.documentNumber, modelDocument.documentNumber) &&
        Objects.equals(this.baseObject, modelDocument.baseObject) &&
        Objects.equals(this.createUser, modelDocument.createUser) &&
        Objects.equals(this.updateUser, modelDocument.updateUser) &&
        Objects.equals(this.mimeType, modelDocument.mimeType) &&
        Objects.equals(this.description, modelDocument.description) &&
        Objects.equals(this.objectAction, modelDocument.objectAction) &&
        Objects.equals(this.sevClient, modelDocument.sevClient) &&
        Objects.equals(this.folder, modelDocument.folder) &&
        Objects.equals(this.filename, modelDocument.filename) &&
        Objects.equals(this.status, modelDocument.status) &&
        Objects.equals(this.extension, modelDocument.extension) &&
        Objects.equals(this.filesize, modelDocument.filesize);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, object, documentNumber, baseObject, createUser, updateUser, mimeType, description, objectAction, sevClient, folder, filename, status, extension, filesize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocument {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    baseObject: ").append(toIndentedString(baseObject)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    objectAction: ").append(toIndentedString(objectAction)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
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

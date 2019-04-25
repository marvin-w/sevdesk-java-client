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
 * ModelCheckAccount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ModelCheckAccount {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("type")

  private String type = null;

  @JsonProperty("importType")

  private String importType = null;

  @JsonProperty("currency")

  private String currency = null;

  @JsonProperty("checkAccId")

  private String checkAccId = null;

  @JsonProperty("defaultAccount")

  private String defaultAccount = null;

  @JsonProperty("status")

  private Integer status = null;

  @JsonProperty("translationCode")

  private String translationCode = null;

  @JsonProperty("bankServer")

  private String bankServer = null;

  @JsonProperty("balance")

  private Float balance = null;

  @JsonProperty("accountingNumber")

  private Integer accountingNumber = null;

  @JsonProperty("iban")

  private String iban = null;

  @JsonProperty("bic")

  private String bic = null;

  @JsonProperty("baseAccount")

  private Boolean baseAccount = null;

  @JsonProperty("priority")

  private Float priority = null;
  public ModelCheckAccount create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the CheckAccount was created
  * @return create
  **/
  @Schema(description = "date the CheckAccount was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelCheckAccount update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the CheckAccount was last updated
  * @return update
  **/
  @Schema(description = "date the CheckAccount was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelCheckAccount sevClient(Object sevClient) {
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
  public ModelCheckAccount name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * name of the CheckAccount
  * @return name
  **/
  @Schema(description = "name of the CheckAccount")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ModelCheckAccount type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * type of the CheckAccount
  * @return type
  **/
  @Schema(description = "type of the CheckAccount")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public ModelCheckAccount importType(String importType) {
    this.importType = importType;
    return this;
  }

  

  /**
  * Get importType
  * @return importType
  **/
  @Schema(description = "")
  public String getImportType() {
    return importType;
  }
  public void setImportType(String importType) {
    this.importType = importType;
  }
  public ModelCheckAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

  

  /**
  * Get currency
  * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  public ModelCheckAccount checkAccId(String checkAccId) {
    this.checkAccId = checkAccId;
    return this;
  }

  

  /**
  * Get checkAccId
  * @return checkAccId
  **/
  @Schema(description = "")
  public String getCheckAccId() {
    return checkAccId;
  }
  public void setCheckAccId(String checkAccId) {
    this.checkAccId = checkAccId;
  }
  public ModelCheckAccount defaultAccount(String defaultAccount) {
    this.defaultAccount = defaultAccount;
    return this;
  }

  

  /**
  * boolean showing whether this account is the default account or not
  * @return defaultAccount
  **/
  @Schema(description = "boolean showing whether this account is the default account or not")
  public String getDefaultAccount() {
    return defaultAccount;
  }
  public void setDefaultAccount(String defaultAccount) {
    this.defaultAccount = defaultAccount;
  }
  public ModelCheckAccount status(Integer status) {
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
  public ModelCheckAccount translationCode(String translationCode) {
    this.translationCode = translationCode;
    return this;
  }

  

  /**
  * Get translationCode
  * @return translationCode
  **/
  @Schema(description = "")
  public String getTranslationCode() {
    return translationCode;
  }
  public void setTranslationCode(String translationCode) {
    this.translationCode = translationCode;
  }
  public ModelCheckAccount bankServer(String bankServer) {
    this.bankServer = bankServer;
    return this;
  }

  

  /**
  * Get bankServer
  * @return bankServer
  **/
  @Schema(description = "")
  public String getBankServer() {
    return bankServer;
  }
  public void setBankServer(String bankServer) {
    this.bankServer = bankServer;
  }
  public ModelCheckAccount balance(Float balance) {
    this.balance = balance;
    return this;
  }

  

  /**
  * Get balance
  * @return balance
  **/
  @Schema(description = "")
  public Float getBalance() {
    return balance;
  }
  public void setBalance(Float balance) {
    this.balance = balance;
  }
  public ModelCheckAccount accountingNumber(Integer accountingNumber) {
    this.accountingNumber = accountingNumber;
    return this;
  }

  

  /**
  * Get accountingNumber
  * @return accountingNumber
  **/
  @Schema(description = "")
  public Integer getAccountingNumber() {
    return accountingNumber;
  }
  public void setAccountingNumber(Integer accountingNumber) {
    this.accountingNumber = accountingNumber;
  }
  public ModelCheckAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

  

  /**
  * Get iban
  * @return iban
  **/
  @Schema(description = "")
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }
  public ModelCheckAccount bic(String bic) {
    this.bic = bic;
    return this;
  }

  

  /**
  * Get bic
  * @return bic
  **/
  @Schema(description = "")
  public String getBic() {
    return bic;
  }
  public void setBic(String bic) {
    this.bic = bic;
  }
  public ModelCheckAccount baseAccount(Boolean baseAccount) {
    this.baseAccount = baseAccount;
    return this;
  }

  

  /**
  * Get baseAccount
  * @return baseAccount
  **/
  @Schema(description = "")
  public Boolean isBaseAccount() {
    return baseAccount;
  }
  public void setBaseAccount(Boolean baseAccount) {
    this.baseAccount = baseAccount;
  }
  public ModelCheckAccount priority(Float priority) {
    this.priority = priority;
    return this;
  }

  

  /**
  * Get priority
  * @return priority
  **/
  @Schema(description = "")
  public Float getPriority() {
    return priority;
  }
  public void setPriority(Float priority) {
    this.priority = priority;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCheckAccount modelCheckAccount = (ModelCheckAccount) o;
    return Objects.equals(this.create, modelCheckAccount.create) &&
        Objects.equals(this.update, modelCheckAccount.update) &&
        Objects.equals(this.sevClient, modelCheckAccount.sevClient) &&
        Objects.equals(this.name, modelCheckAccount.name) &&
        Objects.equals(this.type, modelCheckAccount.type) &&
        Objects.equals(this.importType, modelCheckAccount.importType) &&
        Objects.equals(this.currency, modelCheckAccount.currency) &&
        Objects.equals(this.checkAccId, modelCheckAccount.checkAccId) &&
        Objects.equals(this.defaultAccount, modelCheckAccount.defaultAccount) &&
        Objects.equals(this.status, modelCheckAccount.status) &&
        Objects.equals(this.translationCode, modelCheckAccount.translationCode) &&
        Objects.equals(this.bankServer, modelCheckAccount.bankServer) &&
        Objects.equals(this.balance, modelCheckAccount.balance) &&
        Objects.equals(this.accountingNumber, modelCheckAccount.accountingNumber) &&
        Objects.equals(this.iban, modelCheckAccount.iban) &&
        Objects.equals(this.bic, modelCheckAccount.bic) &&
        Objects.equals(this.baseAccount, modelCheckAccount.baseAccount) &&
        Objects.equals(this.priority, modelCheckAccount.priority);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, sevClient, name, type, importType, currency, checkAccId, defaultAccount, status, translationCode, bankServer, balance, accountingNumber, iban, bic, baseAccount, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCheckAccount {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    checkAccId: ").append(toIndentedString(checkAccId)).append("\n");
    sb.append("    defaultAccount: ").append(toIndentedString(defaultAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    translationCode: ").append(toIndentedString(translationCode)).append("\n");
    sb.append("    bankServer: ").append(toIndentedString(bankServer)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    accountingNumber: ").append(toIndentedString(accountingNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    baseAccount: ").append(toIndentedString(baseAccount)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

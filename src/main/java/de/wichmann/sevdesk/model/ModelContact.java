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
import de.wichmann.sevdesk.model.ModelCategory;
import de.wichmann.sevdesk.model.ModelContact;
import de.wichmann.sevdesk.model.ModelContactAddress;
import de.wichmann.sevdesk.model.ModelEntryType;
import de.wichmann.sevdesk.model.ModelPaymentMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelContact
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelContact {

  @JsonProperty("address")

  private ModelContactAddress address = null;

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("status")

  private Integer status = null;

  @JsonProperty("customerNumber")

  private Integer customerNumber = null;

  @JsonProperty("parent")

  private ModelContact parent = null;

  @JsonProperty("surename")

  private String surename = null;

  @JsonProperty("familyname")

  private String familyname = null;

  @JsonProperty("titel")

  private String titel = null;

  @JsonProperty("category")

  private ModelCategory category = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("academicTitle")

  private String academicTitle = null;

  @JsonProperty("gender")

  private String gender = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("name2")

  private String name2 = null;

  @JsonProperty("birthday")

  private OffsetDateTime birthday = null;

  @JsonProperty("vatNumber")

  private String vatNumber = null;

  @JsonProperty("bankAccount")

  private String bankAccount = null;

  @JsonProperty("bankNumber")

  private String bankNumber = null;

  @JsonProperty("paymentMethod")

  private ModelPaymentMethod paymentMethod = null;

  @JsonProperty("entryType")

  private ModelEntryType entryType = null;

  @JsonProperty("defaultCashbackTime")

  private Integer defaultCashbackTime = null;

  @JsonProperty("defaultCashbackPercent")

  private Integer defaultCashbackPercent = null;

  @JsonProperty("defaultTimeToPay")

  private Integer defaultTimeToPay = null;

  @JsonProperty("taxNumber")

  private String taxNumber = null;

  @JsonProperty("taxOffice")

  private String taxOffice = null;
  public ModelContact address(ModelContactAddress address) {
    this.address = address;
    return this;
  }

  

  /**
  * Get address
  * @return address
  **/
  @Schema(description = "")
  public ModelContactAddress getAddress() {
    return address;
  }
  public void setAddress(ModelContactAddress address) {
    this.address = address;
  }
  public ModelContact create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * the creation date of the contact
  * @return create
  **/
  @Schema(description = "the creation date of the contact")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelContact update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date, the contact was last updated
  * @return update
  **/
  @Schema(description = "date, the contact was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelContact name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * name of the contact
  * @return name
  **/
  @Schema(description = "name of the contact")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ModelContact status(Integer status) {
    this.status = status;
    return this;
  }

  

  /**
  * status of the contact
  * @return status
  **/
  @Schema(description = "status of the contact")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public ModelContact customerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  

  /**
  * customer number of the contact
  * @return customerNumber
  **/
  @Schema(description = "customer number of the contact")
  public Integer getCustomerNumber() {
    return customerNumber;
  }
  public void setCustomerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
  }
  public ModelContact parent(ModelContact parent) {
    this.parent = parent;
    return this;
  }

  

  /**
  * Get parent
  * @return parent
  **/
  @Schema(description = "")
  public ModelContact getParent() {
    return parent;
  }
  public void setParent(ModelContact parent) {
    this.parent = parent;
  }
  public ModelContact surename(String surename) {
    this.surename = surename;
    return this;
  }

  

  /**
  * surname of the contact
  * @return surename
  **/
  @Schema(description = "surname of the contact")
  public String getSurename() {
    return surename;
  }
  public void setSurename(String surename) {
    this.surename = surename;
  }
  public ModelContact familyname(String familyname) {
    this.familyname = familyname;
    return this;
  }

  

  /**
  * family name of the contact
  * @return familyname
  **/
  @Schema(description = "family name of the contact")
  public String getFamilyname() {
    return familyname;
  }
  public void setFamilyname(String familyname) {
    this.familyname = familyname;
  }
  public ModelContact titel(String titel) {
    this.titel = titel;
    return this;
  }

  

  /**
  * title of the contact
  * @return titel
  **/
  @Schema(description = "title of the contact")
  public String getTitel() {
    return titel;
  }
  public void setTitel(String titel) {
    this.titel = titel;
  }
  public ModelContact category(ModelCategory category) {
    this.category = category;
    return this;
  }

  

  /**
  * Get category
  * @return category
  **/
  @Schema(description = "")
  public ModelCategory getCategory() {
    return category;
  }
  public void setCategory(ModelCategory category) {
    this.category = category;
  }
  public ModelContact description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * description of the contact
  * @return description
  **/
  @Schema(description = "description of the contact")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ModelContact academicTitle(String academicTitle) {
    this.academicTitle = academicTitle;
    return this;
  }

  

  /**
  * any academic title of the contact
  * @return academicTitle
  **/
  @Schema(description = "any academic title of the contact")
  public String getAcademicTitle() {
    return academicTitle;
  }
  public void setAcademicTitle(String academicTitle) {
    this.academicTitle = academicTitle;
  }
  public ModelContact gender(String gender) {
    this.gender = gender;
    return this;
  }

  

  /**
  * gender of the contact
  * @return gender
  **/
  @Schema(description = "gender of the contact")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public ModelContact sevClient(Object sevClient) {
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
  public ModelContact name2(String name2) {
    this.name2 = name2;
    return this;
  }

  

  /**
  * second name of the contact
  * @return name2
  **/
  @Schema(description = "second name of the contact")
  public String getName2() {
    return name2;
  }
  public void setName2(String name2) {
    this.name2 = name2;
  }
  public ModelContact birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

  

  /**
  * birthday of the contact
  * @return birthday
  **/
  @Schema(description = "birthday of the contact")
  public OffsetDateTime getBirthday() {
    return birthday;
  }
  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }
  public ModelContact vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  

  /**
  * vat number of the contact
  * @return vatNumber
  **/
  @Schema(description = "vat number of the contact")
  public String getVatNumber() {
    return vatNumber;
  }
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }
  public ModelContact bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  

  /**
  * bank account of the contact
  * @return bankAccount
  **/
  @Schema(description = "bank account of the contact")
  public String getBankAccount() {
    return bankAccount;
  }
  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }
  public ModelContact bankNumber(String bankNumber) {
    this.bankNumber = bankNumber;
    return this;
  }

  

  /**
  * bank number of the contact
  * @return bankNumber
  **/
  @Schema(description = "bank number of the contact")
  public String getBankNumber() {
    return bankNumber;
  }
  public void setBankNumber(String bankNumber) {
    this.bankNumber = bankNumber;
  }
  public ModelContact paymentMethod(ModelPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  

  /**
  * Get paymentMethod
  * @return paymentMethod
  **/
  @Schema(description = "")
  public ModelPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(ModelPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  public ModelContact entryType(ModelEntryType entryType) {
    this.entryType = entryType;
    return this;
  }

  

  /**
  * Get entryType
  * @return entryType
  **/
  @Schema(description = "")
  public ModelEntryType getEntryType() {
    return entryType;
  }
  public void setEntryType(ModelEntryType entryType) {
    this.entryType = entryType;
  }
  public ModelContact defaultCashbackTime(Integer defaultCashbackTime) {
    this.defaultCashbackTime = defaultCashbackTime;
    return this;
  }

  

  /**
  * default cashback time of the contact
  * @return defaultCashbackTime
  **/
  @Schema(description = "default cashback time of the contact")
  public Integer getDefaultCashbackTime() {
    return defaultCashbackTime;
  }
  public void setDefaultCashbackTime(Integer defaultCashbackTime) {
    this.defaultCashbackTime = defaultCashbackTime;
  }
  public ModelContact defaultCashbackPercent(Integer defaultCashbackPercent) {
    this.defaultCashbackPercent = defaultCashbackPercent;
    return this;
  }

  

  /**
  * default cashback percentage of the contact
  * @return defaultCashbackPercent
  **/
  @Schema(description = "default cashback percentage of the contact")
  public Integer getDefaultCashbackPercent() {
    return defaultCashbackPercent;
  }
  public void setDefaultCashbackPercent(Integer defaultCashbackPercent) {
    this.defaultCashbackPercent = defaultCashbackPercent;
  }
  public ModelContact defaultTimeToPay(Integer defaultTimeToPay) {
    this.defaultTimeToPay = defaultTimeToPay;
    return this;
  }

  

  /**
  * default time to pay of the contact
  * @return defaultTimeToPay
  **/
  @Schema(description = "default time to pay of the contact")
  public Integer getDefaultTimeToPay() {
    return defaultTimeToPay;
  }
  public void setDefaultTimeToPay(Integer defaultTimeToPay) {
    this.defaultTimeToPay = defaultTimeToPay;
  }
  public ModelContact taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

  

  /**
  * tax number of the contact
  * @return taxNumber
  **/
  @Schema(description = "tax number of the contact")
  public String getTaxNumber() {
    return taxNumber;
  }
  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }
  public ModelContact taxOffice(String taxOffice) {
    this.taxOffice = taxOffice;
    return this;
  }

  

  /**
  * tax office of the contact
  * @return taxOffice
  **/
  @Schema(description = "tax office of the contact")
  public String getTaxOffice() {
    return taxOffice;
  }
  public void setTaxOffice(String taxOffice) {
    this.taxOffice = taxOffice;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelContact modelContact = (ModelContact) o;
    return Objects.equals(this.address, modelContact.address) &&
        Objects.equals(this.create, modelContact.create) &&
        Objects.equals(this.update, modelContact.update) &&
        Objects.equals(this.name, modelContact.name) &&
        Objects.equals(this.status, modelContact.status) &&
        Objects.equals(this.customerNumber, modelContact.customerNumber) &&
        Objects.equals(this.parent, modelContact.parent) &&
        Objects.equals(this.surename, modelContact.surename) &&
        Objects.equals(this.familyname, modelContact.familyname) &&
        Objects.equals(this.titel, modelContact.titel) &&
        Objects.equals(this.category, modelContact.category) &&
        Objects.equals(this.description, modelContact.description) &&
        Objects.equals(this.academicTitle, modelContact.academicTitle) &&
        Objects.equals(this.gender, modelContact.gender) &&
        Objects.equals(this.sevClient, modelContact.sevClient) &&
        Objects.equals(this.name2, modelContact.name2) &&
        Objects.equals(this.birthday, modelContact.birthday) &&
        Objects.equals(this.vatNumber, modelContact.vatNumber) &&
        Objects.equals(this.bankAccount, modelContact.bankAccount) &&
        Objects.equals(this.bankNumber, modelContact.bankNumber) &&
        Objects.equals(this.paymentMethod, modelContact.paymentMethod) &&
        Objects.equals(this.entryType, modelContact.entryType) &&
        Objects.equals(this.defaultCashbackTime, modelContact.defaultCashbackTime) &&
        Objects.equals(this.defaultCashbackPercent, modelContact.defaultCashbackPercent) &&
        Objects.equals(this.defaultTimeToPay, modelContact.defaultTimeToPay) &&
        Objects.equals(this.taxNumber, modelContact.taxNumber) &&
        Objects.equals(this.taxOffice, modelContact.taxOffice);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(address, create, update, name, status, customerNumber, parent, surename, familyname, titel, category, description, academicTitle, gender, sevClient, name2, birthday, vatNumber, bankAccount, bankNumber, paymentMethod, entryType, defaultCashbackTime, defaultCashbackPercent, defaultTimeToPay, taxNumber, taxOffice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelContact {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    surename: ").append(toIndentedString(surename)).append("\n");
    sb.append("    familyname: ").append(toIndentedString(familyname)).append("\n");
    sb.append("    titel: ").append(toIndentedString(titel)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    academicTitle: ").append(toIndentedString(academicTitle)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankNumber: ").append(toIndentedString(bankNumber)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    defaultCashbackTime: ").append(toIndentedString(defaultCashbackTime)).append("\n");
    sb.append("    defaultCashbackPercent: ").append(toIndentedString(defaultCashbackPercent)).append("\n");
    sb.append("    defaultTimeToPay: ").append(toIndentedString(defaultTimeToPay)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    taxOffice: ").append(toIndentedString(taxOffice)).append("\n");
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

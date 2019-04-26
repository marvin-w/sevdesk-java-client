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
import de.wichmann.sevdesk.model.ModelDiscounts;
import de.wichmann.sevdesk.model.ModelInvoice;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Below are the models which can be used for the functions in Invoice/Factory.php. Beware that you need to use them without the underscore at the beginning!
 */
@Schema(description = "Below are the models which can be used for the functions in Invoice/Factory.php. Beware that you need to use them without the underscore at the beginning!")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelInvoiceFactory {

  @JsonProperty("invoice")

  private ModelInvoice invoice = null;

  @JsonProperty("invoicePosSave[]")

  private ModelInvoice invoicePosSave = null;

  @JsonProperty("invoicePosDelete[]")

  private ModelInvoice invoicePosDelete = null;

  @JsonProperty("discountSave[]")

  private ModelDiscounts discountSave = null;

  @JsonProperty("discountDelete[]")

  private ModelDiscounts discountDelete = null;
  public ModelInvoiceFactory invoice(ModelInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

  

  /**
  * Get invoice
  * @return invoice
  **/
  @Schema(description = "")
  public ModelInvoice getInvoice() {
    return invoice;
  }
  public void setInvoice(ModelInvoice invoice) {
    this.invoice = invoice;
  }
  public ModelInvoiceFactory invoicePosSave(ModelInvoice invoicePosSave) {
    this.invoicePosSave = invoicePosSave;
    return this;
  }

  

  /**
  * Get invoicePosSave
  * @return invoicePosSave
  **/
  @Schema(description = "")
  public ModelInvoice getInvoicePosSave() {
    return invoicePosSave;
  }
  public void setInvoicePosSave(ModelInvoice invoicePosSave) {
    this.invoicePosSave = invoicePosSave;
  }
  public ModelInvoiceFactory invoicePosDelete(ModelInvoice invoicePosDelete) {
    this.invoicePosDelete = invoicePosDelete;
    return this;
  }

  

  /**
  * Get invoicePosDelete
  * @return invoicePosDelete
  **/
  @Schema(description = "")
  public ModelInvoice getInvoicePosDelete() {
    return invoicePosDelete;
  }
  public void setInvoicePosDelete(ModelInvoice invoicePosDelete) {
    this.invoicePosDelete = invoicePosDelete;
  }
  public ModelInvoiceFactory discountSave(ModelDiscounts discountSave) {
    this.discountSave = discountSave;
    return this;
  }

  

  /**
  * Get discountSave
  * @return discountSave
  **/
  @Schema(description = "")
  public ModelDiscounts getDiscountSave() {
    return discountSave;
  }
  public void setDiscountSave(ModelDiscounts discountSave) {
    this.discountSave = discountSave;
  }
  public ModelInvoiceFactory discountDelete(ModelDiscounts discountDelete) {
    this.discountDelete = discountDelete;
    return this;
  }

  

  /**
  * Get discountDelete
  * @return discountDelete
  **/
  @Schema(description = "")
  public ModelDiscounts getDiscountDelete() {
    return discountDelete;
  }
  public void setDiscountDelete(ModelDiscounts discountDelete) {
    this.discountDelete = discountDelete;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInvoiceFactory modelInvoiceFactory = (ModelInvoiceFactory) o;
    return Objects.equals(this.invoice, modelInvoiceFactory.invoice) &&
        Objects.equals(this.invoicePosSave, modelInvoiceFactory.invoicePosSave) &&
        Objects.equals(this.invoicePosDelete, modelInvoiceFactory.invoicePosDelete) &&
        Objects.equals(this.discountSave, modelInvoiceFactory.discountSave) &&
        Objects.equals(this.discountDelete, modelInvoiceFactory.discountDelete);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(invoice, invoicePosSave, invoicePosDelete, discountSave, discountDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInvoiceFactory {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    invoicePosSave: ").append(toIndentedString(invoicePosSave)).append("\n");
    sb.append("    invoicePosDelete: ").append(toIndentedString(invoicePosDelete)).append("\n");
    sb.append("    discountSave: ").append(toIndentedString(discountSave)).append("\n");
    sb.append("    discountDelete: ").append(toIndentedString(discountDelete)).append("\n");
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

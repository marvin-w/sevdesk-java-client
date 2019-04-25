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
import de.wichmann.sevdesk.model.ModelInvoice;
import de.wichmann.sevdesk.model.ModelPart;
import de.wichmann.sevdesk.model.ModelUnity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelInvoicePos
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ModelInvoicePos {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("invoice")

  private ModelInvoice invoice = null;

  @JsonProperty("part")

  private ModelPart part = null;

  @JsonProperty("quantity")

  private Float quantity = null;

  @JsonProperty("price")

  private Float price = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("priority")

  private Integer priority = null;

  @JsonProperty("unity")

  private ModelUnity unity = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("positionNumber")

  private Integer positionNumber = null;

  @JsonProperty("text")

  private String text = null;

  @JsonProperty("discount")

  private Float discount = null;

  @JsonProperty("taxRate")

  private Float taxRate = null;

  @JsonProperty("temporary")

  private Boolean temporary = null;

  @JsonProperty("sumNet")

  private Float sumNet = null;

  @JsonProperty("sumGross")

  private Float sumGross = null;

  @JsonProperty("sumDiscount")

  private Float sumDiscount = null;

  @JsonProperty("sumTax")

  private Float sumTax = null;

  @JsonProperty("sumNetAccounting")

  private Float sumNetAccounting = null;

  @JsonProperty("sumTaxAccounting")

  private Float sumTaxAccounting = null;

  @JsonProperty("sumGrossAccounting")

  private Float sumGrossAccounting = null;

  @JsonProperty("priceNet")

  private Float priceNet = null;

  @JsonProperty("priceGross")

  private Float priceGross = null;

  @JsonProperty("priceTax")

  private Float priceTax = null;
  public ModelInvoicePos create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * creation date of the invoice position
  * @return create
  **/
  @Schema(description = "creation date of the invoice position")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelInvoicePos update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the invoice position was last updated
  * @return update
  **/
  @Schema(description = "date the invoice position was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelInvoicePos invoice(ModelInvoice invoice) {
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
  public ModelInvoicePos part(ModelPart part) {
    this.part = part;
    return this;
  }

  

  /**
  * Get part
  * @return part
  **/
  @Schema(description = "")
  public ModelPart getPart() {
    return part;
  }
  public void setPart(ModelPart part) {
    this.part = part;
  }
  public ModelInvoicePos quantity(Float quantity) {
    this.quantity = quantity;
    return this;
  }

  

  /**
  * the quantity of the product/part
  * @return quantity
  **/
  @Schema(description = "the quantity of the product/part")
  public Float getQuantity() {
    return quantity;
  }
  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }
  public ModelInvoicePos price(Float price) {
    this.price = price;
    return this;
  }

  

  /**
  * the price of the product/part
  * @return price
  **/
  @Schema(description = "the price of the product/part")
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }
  public ModelInvoicePos name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * the name of the product/part
  * @return name
  **/
  @Schema(description = "the name of the product/part")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ModelInvoicePos priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  

  /**
  * Get priority
  * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }
  public ModelInvoicePos unity(ModelUnity unity) {
    this.unity = unity;
    return this;
  }

  

  /**
  * Get unity
  * @return unity
  **/
  @Schema(description = "")
  public ModelUnity getUnity() {
    return unity;
  }
  public void setUnity(ModelUnity unity) {
    this.unity = unity;
  }
  public ModelInvoicePos sevClient(Object sevClient) {
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
  public ModelInvoicePos positionNumber(Integer positionNumber) {
    this.positionNumber = positionNumber;
    return this;
  }

  

  /**
  * Get positionNumber
  * @return positionNumber
  **/
  @Schema(description = "")
  public Integer getPositionNumber() {
    return positionNumber;
  }
  public void setPositionNumber(Integer positionNumber) {
    this.positionNumber = positionNumber;
  }
  public ModelInvoicePos text(String text) {
    this.text = text;
    return this;
  }

  

  /**
  * Get text
  * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public ModelInvoicePos discount(Float discount) {
    this.discount = discount;
    return this;
  }

  

  /**
  * does not get filled, discount is handled in the discount_model
  * @return discount
  **/
  @Schema(description = "does not get filled, discount is handled in the discount_model")
  public Float getDiscount() {
    return discount;
  }
  public void setDiscount(Float discount) {
    this.discount = discount;
  }
  public ModelInvoicePos taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  

  /**
  * tax rate in percent
  * @return taxRate
  **/
  @Schema(description = "tax rate in percent")
  public Float getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }
  public ModelInvoicePos temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

  

  /**
  * Get temporary
  * @return temporary
  **/
  @Schema(description = "")
  public Boolean isTemporary() {
    return temporary;
  }
  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }
  public ModelInvoicePos sumNet(Float sumNet) {
    this.sumNet = sumNet;
    return this;
  }

  

  /**
  * Get sumNet
  * @return sumNet
  **/
  @Schema(description = "")
  public Float getSumNet() {
    return sumNet;
  }
  public void setSumNet(Float sumNet) {
    this.sumNet = sumNet;
  }
  public ModelInvoicePos sumGross(Float sumGross) {
    this.sumGross = sumGross;
    return this;
  }

  

  /**
  * Get sumGross
  * @return sumGross
  **/
  @Schema(description = "")
  public Float getSumGross() {
    return sumGross;
  }
  public void setSumGross(Float sumGross) {
    this.sumGross = sumGross;
  }
  public ModelInvoicePos sumDiscount(Float sumDiscount) {
    this.sumDiscount = sumDiscount;
    return this;
  }

  

  /**
  * does not get filled, sumDiscount is handled in the discount_model
  * @return sumDiscount
  **/
  @Schema(description = "does not get filled, sumDiscount is handled in the discount_model")
  public Float getSumDiscount() {
    return sumDiscount;
  }
  public void setSumDiscount(Float sumDiscount) {
    this.sumDiscount = sumDiscount;
  }
  public ModelInvoicePos sumTax(Float sumTax) {
    this.sumTax = sumTax;
    return this;
  }

  

  /**
  * Get sumTax
  * @return sumTax
  **/
  @Schema(description = "")
  public Float getSumTax() {
    return sumTax;
  }
  public void setSumTax(Float sumTax) {
    this.sumTax = sumTax;
  }
  public ModelInvoicePos sumNetAccounting(Float sumNetAccounting) {
    this.sumNetAccounting = sumNetAccounting;
    return this;
  }

  

  /**
  * equals sumNet
  * @return sumNetAccounting
  **/
  @Schema(description = "equals sumNet")
  public Float getSumNetAccounting() {
    return sumNetAccounting;
  }
  public void setSumNetAccounting(Float sumNetAccounting) {
    this.sumNetAccounting = sumNetAccounting;
  }
  public ModelInvoicePos sumTaxAccounting(Float sumTaxAccounting) {
    this.sumTaxAccounting = sumTaxAccounting;
    return this;
  }

  

  /**
  * equals sumTax
  * @return sumTaxAccounting
  **/
  @Schema(description = "equals sumTax")
  public Float getSumTaxAccounting() {
    return sumTaxAccounting;
  }
  public void setSumTaxAccounting(Float sumTaxAccounting) {
    this.sumTaxAccounting = sumTaxAccounting;
  }
  public ModelInvoicePos sumGrossAccounting(Float sumGrossAccounting) {
    this.sumGrossAccounting = sumGrossAccounting;
    return this;
  }

  

  /**
  * equals sumGross
  * @return sumGrossAccounting
  **/
  @Schema(description = "equals sumGross")
  public Float getSumGrossAccounting() {
    return sumGrossAccounting;
  }
  public void setSumGrossAccounting(Float sumGrossAccounting) {
    this.sumGrossAccounting = sumGrossAccounting;
  }
  public ModelInvoicePos priceNet(Float priceNet) {
    this.priceNet = priceNet;
    return this;
  }

  

  /**
  * net price of the product/part (one)
  * @return priceNet
  **/
  @Schema(description = "net price of the product/part (one)")
  public Float getPriceNet() {
    return priceNet;
  }
  public void setPriceNet(Float priceNet) {
    this.priceNet = priceNet;
  }
  public ModelInvoicePos priceGross(Float priceGross) {
    this.priceGross = priceGross;
    return this;
  }

  

  /**
  * gross price of the product/part (one)
  * @return priceGross
  **/
  @Schema(description = "gross price of the product/part (one)")
  public Float getPriceGross() {
    return priceGross;
  }
  public void setPriceGross(Float priceGross) {
    this.priceGross = priceGross;
  }
  public ModelInvoicePos priceTax(Float priceTax) {
    this.priceTax = priceTax;
    return this;
  }

  

  /**
  * Get priceTax
  * @return priceTax
  **/
  @Schema(description = "")
  public Float getPriceTax() {
    return priceTax;
  }
  public void setPriceTax(Float priceTax) {
    this.priceTax = priceTax;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInvoicePos modelInvoicePos = (ModelInvoicePos) o;
    return Objects.equals(this.create, modelInvoicePos.create) &&
        Objects.equals(this.update, modelInvoicePos.update) &&
        Objects.equals(this.invoice, modelInvoicePos.invoice) &&
        Objects.equals(this.part, modelInvoicePos.part) &&
        Objects.equals(this.quantity, modelInvoicePos.quantity) &&
        Objects.equals(this.price, modelInvoicePos.price) &&
        Objects.equals(this.name, modelInvoicePos.name) &&
        Objects.equals(this.priority, modelInvoicePos.priority) &&
        Objects.equals(this.unity, modelInvoicePos.unity) &&
        Objects.equals(this.sevClient, modelInvoicePos.sevClient) &&
        Objects.equals(this.positionNumber, modelInvoicePos.positionNumber) &&
        Objects.equals(this.text, modelInvoicePos.text) &&
        Objects.equals(this.discount, modelInvoicePos.discount) &&
        Objects.equals(this.taxRate, modelInvoicePos.taxRate) &&
        Objects.equals(this.temporary, modelInvoicePos.temporary) &&
        Objects.equals(this.sumNet, modelInvoicePos.sumNet) &&
        Objects.equals(this.sumGross, modelInvoicePos.sumGross) &&
        Objects.equals(this.sumDiscount, modelInvoicePos.sumDiscount) &&
        Objects.equals(this.sumTax, modelInvoicePos.sumTax) &&
        Objects.equals(this.sumNetAccounting, modelInvoicePos.sumNetAccounting) &&
        Objects.equals(this.sumTaxAccounting, modelInvoicePos.sumTaxAccounting) &&
        Objects.equals(this.sumGrossAccounting, modelInvoicePos.sumGrossAccounting) &&
        Objects.equals(this.priceNet, modelInvoicePos.priceNet) &&
        Objects.equals(this.priceGross, modelInvoicePos.priceGross) &&
        Objects.equals(this.priceTax, modelInvoicePos.priceTax);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, invoice, part, quantity, price, name, priority, unity, sevClient, positionNumber, text, discount, taxRate, temporary, sumNet, sumGross, sumDiscount, sumTax, sumNetAccounting, sumTaxAccounting, sumGrossAccounting, priceNet, priceGross, priceTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInvoicePos {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    unity: ").append(toIndentedString(unity)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    positionNumber: ").append(toIndentedString(positionNumber)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    sumNet: ").append(toIndentedString(sumNet)).append("\n");
    sb.append("    sumGross: ").append(toIndentedString(sumGross)).append("\n");
    sb.append("    sumDiscount: ").append(toIndentedString(sumDiscount)).append("\n");
    sb.append("    sumTax: ").append(toIndentedString(sumTax)).append("\n");
    sb.append("    sumNetAccounting: ").append(toIndentedString(sumNetAccounting)).append("\n");
    sb.append("    sumTaxAccounting: ").append(toIndentedString(sumTaxAccounting)).append("\n");
    sb.append("    sumGrossAccounting: ").append(toIndentedString(sumGrossAccounting)).append("\n");
    sb.append("    priceNet: ").append(toIndentedString(priceNet)).append("\n");
    sb.append("    priceGross: ").append(toIndentedString(priceGross)).append("\n");
    sb.append("    priceTax: ").append(toIndentedString(priceTax)).append("\n");
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

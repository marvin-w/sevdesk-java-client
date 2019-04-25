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
import de.wichmann.sevdesk.model.ModelAccountingType;
import de.wichmann.sevdesk.model.ModelVoucher;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * ModelVoucherPos
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:13:41.764+02:00[Europe/Berlin]")public class ModelVoucherPos {

  @JsonProperty("create")

  private OffsetDateTime create = null;

  @JsonProperty("update")

  private OffsetDateTime update = null;

  @JsonProperty("sevClient")

  private Object sevClient = null;

  @JsonProperty("voucher")

  private ModelVoucher voucher = null;

  @JsonProperty("accountingType")

  private ModelAccountingType accountingType = null;

  @JsonProperty("estimatedAccountingType")

  private ModelAccountingType estimatedAccountingType = null;

  @JsonProperty("taxRate")

  private Float taxRate = null;

  @JsonProperty("sum")

  private Float sum = null;

  @JsonProperty("net")

  private Boolean net = null;

  @JsonProperty("isAsset")

  private Boolean isAsset = null;

  @JsonProperty("sumNet")

  private Float sumNet = 0.0f;

  @JsonProperty("sumTax")

  private Float sumTax = 0.0f;

  @JsonProperty("sumGross")

  private Float sumGross = 0.0f;

  @JsonProperty("sumNetAccounting")

  private Float sumNetAccounting = 0.0f;

  @JsonProperty("sumTaxAccounting")

  private Float sumTaxAccounting = 0.0f;

  @JsonProperty("sumGrossAccounting")

  private Float sumGrossAccounting = 0.0f;

  @JsonProperty("comment")

  private String comment = null;

  @JsonProperty("isGwg")

  private Boolean isGwg = null;

  @JsonProperty("cateringTaxRate")

  private Float cateringTaxRate = null;

  @JsonProperty("cateringTip")

  private Float cateringTip = null;
  public ModelVoucherPos create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

  

  /**
  * date the voucher positions was created
  * @return create
  **/
  @Schema(description = "date the voucher positions was created")
  public OffsetDateTime getCreate() {
    return create;
  }
  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }
  public ModelVoucherPos update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  

  /**
  * date the voucher position was last updated
  * @return update
  **/
  @Schema(description = "date the voucher position was last updated")
  public OffsetDateTime getUpdate() {
    return update;
  }
  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }
  public ModelVoucherPos sevClient(Object sevClient) {
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
  public ModelVoucherPos voucher(ModelVoucher voucher) {
    this.voucher = voucher;
    return this;
  }

  

  /**
  * Get voucher
  * @return voucher
  **/
  @Schema(description = "")
  public ModelVoucher getVoucher() {
    return voucher;
  }
  public void setVoucher(ModelVoucher voucher) {
    this.voucher = voucher;
  }
  public ModelVoucherPos accountingType(ModelAccountingType accountingType) {
    this.accountingType = accountingType;
    return this;
  }

  

  /**
  * Get accountingType
  * @return accountingType
  **/
  @Schema(description = "")
  public ModelAccountingType getAccountingType() {
    return accountingType;
  }
  public void setAccountingType(ModelAccountingType accountingType) {
    this.accountingType = accountingType;
  }
  public ModelVoucherPos estimatedAccountingType(ModelAccountingType estimatedAccountingType) {
    this.estimatedAccountingType = estimatedAccountingType;
    return this;
  }

  

  /**
  * Get estimatedAccountingType
  * @return estimatedAccountingType
  **/
  @Schema(description = "")
  public ModelAccountingType getEstimatedAccountingType() {
    return estimatedAccountingType;
  }
  public void setEstimatedAccountingType(ModelAccountingType estimatedAccountingType) {
    this.estimatedAccountingType = estimatedAccountingType;
  }
  public ModelVoucherPos taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  

  /**
  * Get taxRate
  * @return taxRate
  **/
  @Schema(description = "")
  public Float getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }
  public ModelVoucherPos sum(Float sum) {
    this.sum = sum;
    return this;
  }

  

  /**
  * Get sum
  * @return sum
  **/
  @Schema(description = "")
  public Float getSum() {
    return sum;
  }
  public void setSum(Float sum) {
    this.sum = sum;
  }
  public ModelVoucherPos net(Boolean net) {
    this.net = net;
    return this;
  }

  

  /**
  * Get net
  * @return net
  **/
  @Schema(description = "")
  public Boolean isNet() {
    return net;
  }
  public void setNet(Boolean net) {
    this.net = net;
  }
  public ModelVoucherPos isAsset(Boolean isAsset) {
    this.isAsset = isAsset;
    return this;
  }

  

  /**
  * Get isAsset
  * @return isAsset
  **/
  @Schema(description = "")
  public Boolean isIsAsset() {
    return isAsset;
  }
  public void setIsAsset(Boolean isAsset) {
    this.isAsset = isAsset;
  }
  public ModelVoucherPos sumNet(Float sumNet) {
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
  public ModelVoucherPos sumTax(Float sumTax) {
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
  public ModelVoucherPos sumGross(Float sumGross) {
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
  public ModelVoucherPos sumNetAccounting(Float sumNetAccounting) {
    this.sumNetAccounting = sumNetAccounting;
    return this;
  }

  

  /**
  * Get sumNetAccounting
  * @return sumNetAccounting
  **/
  @Schema(description = "")
  public Float getSumNetAccounting() {
    return sumNetAccounting;
  }
  public void setSumNetAccounting(Float sumNetAccounting) {
    this.sumNetAccounting = sumNetAccounting;
  }
  public ModelVoucherPos sumTaxAccounting(Float sumTaxAccounting) {
    this.sumTaxAccounting = sumTaxAccounting;
    return this;
  }

  

  /**
  * Get sumTaxAccounting
  * @return sumTaxAccounting
  **/
  @Schema(description = "")
  public Float getSumTaxAccounting() {
    return sumTaxAccounting;
  }
  public void setSumTaxAccounting(Float sumTaxAccounting) {
    this.sumTaxAccounting = sumTaxAccounting;
  }
  public ModelVoucherPos sumGrossAccounting(Float sumGrossAccounting) {
    this.sumGrossAccounting = sumGrossAccounting;
    return this;
  }

  

  /**
  * Get sumGrossAccounting
  * @return sumGrossAccounting
  **/
  @Schema(description = "")
  public Float getSumGrossAccounting() {
    return sumGrossAccounting;
  }
  public void setSumGrossAccounting(Float sumGrossAccounting) {
    this.sumGrossAccounting = sumGrossAccounting;
  }
  public ModelVoucherPos comment(String comment) {
    this.comment = comment;
    return this;
  }

  

  /**
  * Get comment
  * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public ModelVoucherPos isGwg(Boolean isGwg) {
    this.isGwg = isGwg;
    return this;
  }

  

  /**
  * Get isGwg
  * @return isGwg
  **/
  @Schema(description = "")
  public Boolean isIsGwg() {
    return isGwg;
  }
  public void setIsGwg(Boolean isGwg) {
    this.isGwg = isGwg;
  }
  public ModelVoucherPos cateringTaxRate(Float cateringTaxRate) {
    this.cateringTaxRate = cateringTaxRate;
    return this;
  }

  

  /**
  * Get cateringTaxRate
  * @return cateringTaxRate
  **/
  @Schema(description = "")
  public Float getCateringTaxRate() {
    return cateringTaxRate;
  }
  public void setCateringTaxRate(Float cateringTaxRate) {
    this.cateringTaxRate = cateringTaxRate;
  }
  public ModelVoucherPos cateringTip(Float cateringTip) {
    this.cateringTip = cateringTip;
    return this;
  }

  

  /**
  * Get cateringTip
  * @return cateringTip
  **/
  @Schema(description = "")
  public Float getCateringTip() {
    return cateringTip;
  }
  public void setCateringTip(Float cateringTip) {
    this.cateringTip = cateringTip;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVoucherPos modelVoucherPos = (ModelVoucherPos) o;
    return Objects.equals(this.create, modelVoucherPos.create) &&
        Objects.equals(this.update, modelVoucherPos.update) &&
        Objects.equals(this.sevClient, modelVoucherPos.sevClient) &&
        Objects.equals(this.voucher, modelVoucherPos.voucher) &&
        Objects.equals(this.accountingType, modelVoucherPos.accountingType) &&
        Objects.equals(this.estimatedAccountingType, modelVoucherPos.estimatedAccountingType) &&
        Objects.equals(this.taxRate, modelVoucherPos.taxRate) &&
        Objects.equals(this.sum, modelVoucherPos.sum) &&
        Objects.equals(this.net, modelVoucherPos.net) &&
        Objects.equals(this.isAsset, modelVoucherPos.isAsset) &&
        Objects.equals(this.sumNet, modelVoucherPos.sumNet) &&
        Objects.equals(this.sumTax, modelVoucherPos.sumTax) &&
        Objects.equals(this.sumGross, modelVoucherPos.sumGross) &&
        Objects.equals(this.sumNetAccounting, modelVoucherPos.sumNetAccounting) &&
        Objects.equals(this.sumTaxAccounting, modelVoucherPos.sumTaxAccounting) &&
        Objects.equals(this.sumGrossAccounting, modelVoucherPos.sumGrossAccounting) &&
        Objects.equals(this.comment, modelVoucherPos.comment) &&
        Objects.equals(this.isGwg, modelVoucherPos.isGwg) &&
        Objects.equals(this.cateringTaxRate, modelVoucherPos.cateringTaxRate) &&
        Objects.equals(this.cateringTip, modelVoucherPos.cateringTip);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, update, sevClient, voucher, accountingType, estimatedAccountingType, taxRate, sum, net, isAsset, sumNet, sumTax, sumGross, sumNetAccounting, sumTaxAccounting, sumGrossAccounting, comment, isGwg, cateringTaxRate, cateringTip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVoucherPos {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    sevClient: ").append(toIndentedString(sevClient)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    estimatedAccountingType: ").append(toIndentedString(estimatedAccountingType)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    isAsset: ").append(toIndentedString(isAsset)).append("\n");
    sb.append("    sumNet: ").append(toIndentedString(sumNet)).append("\n");
    sb.append("    sumTax: ").append(toIndentedString(sumTax)).append("\n");
    sb.append("    sumGross: ").append(toIndentedString(sumGross)).append("\n");
    sb.append("    sumNetAccounting: ").append(toIndentedString(sumNetAccounting)).append("\n");
    sb.append("    sumTaxAccounting: ").append(toIndentedString(sumTaxAccounting)).append("\n");
    sb.append("    sumGrossAccounting: ").append(toIndentedString(sumGrossAccounting)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isGwg: ").append(toIndentedString(isGwg)).append("\n");
    sb.append("    cateringTaxRate: ").append(toIndentedString(cateringTaxRate)).append("\n");
    sb.append("    cateringTip: ").append(toIndentedString(cateringTip)).append("\n");
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

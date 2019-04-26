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

/**
 * ModelStaticReferralProgram
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")public class ModelStaticReferralProgram {

  @JsonProperty("headline")

  private String headline = null;

  @JsonProperty("text")

  private String text = null;

  @JsonProperty("rewardAmountLead")

  private Float rewardAmountLead = null;

  @JsonProperty("rewardAmount")

  private Float rewardAmount = null;

  @JsonProperty("rewardPercentage")

  private Float rewardPercentage = null;

  @JsonProperty("rewardType")

  private String rewardType = null;

  @JsonProperty("earningAmount")

  private Float earningAmount = null;
  public ModelStaticReferralProgram headline(String headline) {
    this.headline = headline;
    return this;
  }

  

  /**
  * Get headline
  * @return headline
  **/
  @Schema(description = "")
  public String getHeadline() {
    return headline;
  }
  public void setHeadline(String headline) {
    this.headline = headline;
  }
  public ModelStaticReferralProgram text(String text) {
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
  public ModelStaticReferralProgram rewardAmountLead(Float rewardAmountLead) {
    this.rewardAmountLead = rewardAmountLead;
    return this;
  }

  

  /**
  * Get rewardAmountLead
  * @return rewardAmountLead
  **/
  @Schema(description = "")
  public Float getRewardAmountLead() {
    return rewardAmountLead;
  }
  public void setRewardAmountLead(Float rewardAmountLead) {
    this.rewardAmountLead = rewardAmountLead;
  }
  public ModelStaticReferralProgram rewardAmount(Float rewardAmount) {
    this.rewardAmount = rewardAmount;
    return this;
  }

  

  /**
  * Get rewardAmount
  * @return rewardAmount
  **/
  @Schema(description = "")
  public Float getRewardAmount() {
    return rewardAmount;
  }
  public void setRewardAmount(Float rewardAmount) {
    this.rewardAmount = rewardAmount;
  }
  public ModelStaticReferralProgram rewardPercentage(Float rewardPercentage) {
    this.rewardPercentage = rewardPercentage;
    return this;
  }

  

  /**
  * Get rewardPercentage
  * @return rewardPercentage
  **/
  @Schema(description = "")
  public Float getRewardPercentage() {
    return rewardPercentage;
  }
  public void setRewardPercentage(Float rewardPercentage) {
    this.rewardPercentage = rewardPercentage;
  }
  public ModelStaticReferralProgram rewardType(String rewardType) {
    this.rewardType = rewardType;
    return this;
  }

  

  /**
  * Get rewardType
  * @return rewardType
  **/
  @Schema(description = "")
  public String getRewardType() {
    return rewardType;
  }
  public void setRewardType(String rewardType) {
    this.rewardType = rewardType;
  }
  public ModelStaticReferralProgram earningAmount(Float earningAmount) {
    this.earningAmount = earningAmount;
    return this;
  }

  

  /**
  * Get earningAmount
  * @return earningAmount
  **/
  @Schema(description = "")
  public Float getEarningAmount() {
    return earningAmount;
  }
  public void setEarningAmount(Float earningAmount) {
    this.earningAmount = earningAmount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelStaticReferralProgram modelStaticReferralProgram = (ModelStaticReferralProgram) o;
    return Objects.equals(this.headline, modelStaticReferralProgram.headline) &&
        Objects.equals(this.text, modelStaticReferralProgram.text) &&
        Objects.equals(this.rewardAmountLead, modelStaticReferralProgram.rewardAmountLead) &&
        Objects.equals(this.rewardAmount, modelStaticReferralProgram.rewardAmount) &&
        Objects.equals(this.rewardPercentage, modelStaticReferralProgram.rewardPercentage) &&
        Objects.equals(this.rewardType, modelStaticReferralProgram.rewardType) &&
        Objects.equals(this.earningAmount, modelStaticReferralProgram.earningAmount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(headline, text, rewardAmountLead, rewardAmount, rewardPercentage, rewardType, earningAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelStaticReferralProgram {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rewardAmountLead: ").append(toIndentedString(rewardAmountLead)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardPercentage: ").append(toIndentedString(rewardPercentage)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
    sb.append("    earningAmount: ").append(toIndentedString(earningAmount)).append("\n");
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

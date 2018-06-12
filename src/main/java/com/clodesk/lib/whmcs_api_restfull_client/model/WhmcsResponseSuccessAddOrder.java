/*
 * WHMCS API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.clodesk.lib.whmcs_api_restfull_client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WhmcsResponseSuccessAddOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-12T14:57:36.589Z")
public class WhmcsResponseSuccessAddOrder {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("orderid")
  private Integer orderid = null;

  @JsonProperty("invoiceid")
  private Integer invoiceid = null;

  @JsonProperty("productids")
  private String productids = null;

  @JsonProperty("addonids")
  private String addonids = null;

  @JsonProperty("domainids")
  private String domainids = null;

  public WhmcsResponseSuccessAddOrder result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the operation: success or error
   * @return result
  **/
  @ApiModelProperty(value = "The result of the operation: success or error")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public WhmcsResponseSuccessAddOrder orderid(Integer orderid) {
    this.orderid = orderid;
    return this;
  }

   /**
   * The Order ID for the created order
   * @return orderid
  **/
  @ApiModelProperty(value = "The Order ID for the created order")
  public Integer getOrderid() {
    return orderid;
  }

  public void setOrderid(Integer orderid) {
    this.orderid = orderid;
  }

  public WhmcsResponseSuccessAddOrder invoiceid(Integer invoiceid) {
    this.invoiceid = invoiceid;
    return this;
  }

   /**
   * The Invoice ID created for the order
   * @return invoiceid
  **/
  @ApiModelProperty(value = "The Invoice ID created for the order")
  public Integer getInvoiceid() {
    return invoiceid;
  }

  public void setInvoiceid(Integer invoiceid) {
    this.invoiceid = invoiceid;
  }

  public WhmcsResponseSuccessAddOrder productids(String productids) {
    this.productids = productids;
    return this;
  }

   /**
   * The Product/Service ID(s) created by the order
   * @return productids
  **/
  @ApiModelProperty(value = "The Product/Service ID(s) created by the order")
  public String getProductids() {
    return productids;
  }

  public void setProductids(String productids) {
    this.productids = productids;
  }

  public WhmcsResponseSuccessAddOrder addonids(String addonids) {
    this.addonids = addonids;
    return this;
  }

   /**
   * The Addon ID(s) created by the order
   * @return addonids
  **/
  @ApiModelProperty(value = "The Addon ID(s) created by the order")
  public String getAddonids() {
    return addonids;
  }

  public void setAddonids(String addonids) {
    this.addonids = addonids;
  }

  public WhmcsResponseSuccessAddOrder domainids(String domainids) {
    this.domainids = domainids;
    return this;
  }

   /**
   * The Domain ID(s) created by the order
   * @return domainids
  **/
  @ApiModelProperty(value = "The Domain ID(s) created by the order")
  public String getDomainids() {
    return domainids;
  }

  public void setDomainids(String domainids) {
    this.domainids = domainids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhmcsResponseSuccessAddOrder whmcsResponseSuccessAddOrder = (WhmcsResponseSuccessAddOrder) o;
    return Objects.equals(this.result, whmcsResponseSuccessAddOrder.result) &&
        Objects.equals(this.orderid, whmcsResponseSuccessAddOrder.orderid) &&
        Objects.equals(this.invoiceid, whmcsResponseSuccessAddOrder.invoiceid) &&
        Objects.equals(this.productids, whmcsResponseSuccessAddOrder.productids) &&
        Objects.equals(this.addonids, whmcsResponseSuccessAddOrder.addonids) &&
        Objects.equals(this.domainids, whmcsResponseSuccessAddOrder.domainids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, orderid, invoiceid, productids, addonids, domainids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhmcsResponseSuccessAddOrder {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    orderid: ").append(toIndentedString(orderid)).append("\n");
    sb.append("    invoiceid: ").append(toIndentedString(invoiceid)).append("\n");
    sb.append("    productids: ").append(toIndentedString(productids)).append("\n");
    sb.append("    addonids: ").append(toIndentedString(addonids)).append("\n");
    sb.append("    domainids: ").append(toIndentedString(domainids)).append("\n");
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


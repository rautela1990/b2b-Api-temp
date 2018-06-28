package com.tollgroup.dto;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PalletTransaction
 */
@JsonInclude(Include.NON_NULL)
public class PalletTransaction   {
  @JsonProperty("palletId")
  private Long palletId = null;

  @NotNull
  @JsonProperty("shipmentId")
  private Long shipmentId = null;

  @JsonProperty("chepCustomerOwnQuantity")
  private Integer chepCustomerOwnQuantity = null;

  @JsonProperty("chepExchangeQuantity")
  private Integer chepExchangeQuantity = null;

  @JsonProperty("chepTransferToTollQuantity")
  private Integer chepTransferToTollQuantity = null;

  @JsonProperty("chepDocketNo")
  private String chepDocketNo = null;

  @JsonProperty("loscamCustomerOwnQuantity")
  private Integer loscamCustomerOwnQuantity = null;

  @JsonProperty("loscamExchangeQuantity")
  private Integer loscamExchangeQuantity = null;

  @JsonProperty("loscamTransferToTollQuantity")
  private Integer loscamTransferToTollQuantity = null;

  @JsonProperty("loscamDocketNo")
  private String loscamDocketNo = null;

  @JsonProperty("lhepOtherExchangeQuantity")
  private Integer lhepOtherExchangeQuantity = null;

  @JsonProperty("chepOtherTransferToTollQuantity")
  private Integer chepOtherTransferToTollQuantity = null;

  @JsonProperty("chepOtherDocketNo")
  private String chepOtherDocketNo = null;

  @JsonProperty("otherCustomerOwnQuantity")
  private Integer otherCustomerOwnQuantity = null;

  @JsonProperty("loscamOtherExchangeQuantity")
  private Integer loscamOtherExchangeQuantity = null;

  @JsonProperty("loscamOtherTransferToTollQuantity")
  private Integer loscamOtherTransferToTollQuantity = null;

  @JsonProperty("loscamOtherDocket")
  private Integer loscamOtherDocket = null;

  @JsonProperty("chepOtherExchangeQuantity")
  private String chepOtherExchangeQuantity = null;
  
  @JsonProperty("palletTransactionType")
  private String palletTransactionType = null;

  public PalletTransaction palletId(Long palletId) {
    this.palletId = palletId;
    return this;
  }

   /**
   * Get palletId
   * @return palletId
  **/
  public Long getPalletId() {
    return palletId;
  }

  public void setPalletId(Long palletId) {
    this.palletId = palletId;
  }

  public PalletTransaction shipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  public Long getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  public PalletTransaction chepCustomerOwnQuantity(Integer chepCustomerOwnQuantity) {
    this.chepCustomerOwnQuantity = chepCustomerOwnQuantity;
    return this;
  }

   /**
   * Get chepCustomerOwnQuantity
   * @return chepCustomerOwnQuantity
  **/
  public Integer getChepCustomerOwnQuantity() {
    return chepCustomerOwnQuantity;
  }

  public void setChepCustomerOwnQuantity(Integer chepCustomerOwnQuantity) {
    this.chepCustomerOwnQuantity = chepCustomerOwnQuantity;
  }

  public PalletTransaction chepExchangeQuantity(Integer chepExchangeQuantity) {
    this.chepExchangeQuantity = chepExchangeQuantity;
    return this;
  }

   /**
   * Get chepExchangeQuantity
   * @return chepExchangeQuantity
  **/
  public Integer getChepExchangeQuantity() {
    return chepExchangeQuantity;
  }

  public void setChepExchangeQuantity(Integer chepExchangeQuantity) {
    this.chepExchangeQuantity = chepExchangeQuantity;
  }

  public PalletTransaction chepTransferToTollQuantity(Integer chepTransferToTollQuantity) {
    this.chepTransferToTollQuantity = chepTransferToTollQuantity;
    return this;
  }

   /**
   * Get chepTransferToTollQuantity
   * @return chepTransferToTollQuantity
  **/
  public Integer getChepTransferToTollQuantity() {
    return chepTransferToTollQuantity;
  }

  public void setChepTransferToTollQuantity(Integer chepTransferToTollQuantity) {
    this.chepTransferToTollQuantity = chepTransferToTollQuantity;
  }

  public PalletTransaction chepDocketNo(String chepDocketNo) {
    this.chepDocketNo = chepDocketNo;
    return this;
  }

   /**
   * Get chepDocketNo
   * @return chepDocketNo
  **/
  public String getChepDocketNo() {
    return chepDocketNo;
  }

  public void setChepDocketNo(String chepDocketNo) {
    this.chepDocketNo = chepDocketNo;
  }

  public PalletTransaction loscamCustomerOwnQuantity(Integer loscamCustomerOwnQuantity) {
    this.loscamCustomerOwnQuantity = loscamCustomerOwnQuantity;
    return this;
  }

   /**
   * Get loscamCustomerOwnQuantity
   * @return loscamCustomerOwnQuantity
  **/
  public Integer getLoscamCustomerOwnQuantity() {
    return loscamCustomerOwnQuantity;
  }

  public void setLoscamCustomerOwnQuantity(Integer loscamCustomerOwnQuantity) {
    this.loscamCustomerOwnQuantity = loscamCustomerOwnQuantity;
  }

  public PalletTransaction loscamExchangeQuantity(Integer loscamExchangeQuantity) {
    this.loscamExchangeQuantity = loscamExchangeQuantity;
    return this;
  }

   /**
   * Get loscamExchangeQuantity
   * @return loscamExchangeQuantity
  **/
  public Integer getLoscamExchangeQuantity() {
    return loscamExchangeQuantity;
  }

  public void setLoscamExchangeQuantity(Integer loscamExchangeQuantity) {
    this.loscamExchangeQuantity = loscamExchangeQuantity;
  }

  public PalletTransaction loscamTransferToTollQuantity(Integer loscamTransferToTollQuantity) {
    this.loscamTransferToTollQuantity = loscamTransferToTollQuantity;
    return this;
  }

   /**
   * Get loscamTransferToTollQuantity
   * @return loscamTransferToTollQuantity
  **/
  public Integer getLoscamTransferToTollQuantity() {
    return loscamTransferToTollQuantity;
  }

  public void setLoscamTransferToTollQuantity(Integer loscamTransferToTollQuantity) {
    this.loscamTransferToTollQuantity = loscamTransferToTollQuantity;
  }

  public PalletTransaction loscamDocketNo(String loscamDocketNo) {
    this.loscamDocketNo = loscamDocketNo;
    return this;
  }

   /**
   * Get loscamDocketNo
   * @return loscamDocketNo
  **/
  public String getLoscamDocketNo() {
    return loscamDocketNo;
  }

  public void setLoscamDocketNo(String loscamDocketNo) {
    this.loscamDocketNo = loscamDocketNo;
  }

  public PalletTransaction chepOtherTransferToTollQuantity(Integer chepOtherTransferToTollQuantity) {
    this.chepOtherTransferToTollQuantity = chepOtherTransferToTollQuantity;
    return this;
  }

   /**
   * Get chepOtherTransferToTollQuantity
   * @return chepOtherTransferToTollQuantity
  **/
  public Integer getChepOtherTransferToTollQuantity() {
    return chepOtherTransferToTollQuantity;
  }

  public void setChepOtherTransferToTollQuantity(Integer chepOtherTransferToTollQuantity) {
    this.chepOtherTransferToTollQuantity = chepOtherTransferToTollQuantity;
  }

  public PalletTransaction chepOtherDocketNo(String chepOtherDocketNo) {
    this.chepOtherDocketNo = chepOtherDocketNo;
    return this;
  }

   /**
   * Get chepOtherDocketNo
   * @return chepOtherDocketNo
  **/
  public String getChepOtherDocketNo() {
    return chepOtherDocketNo;
  }

  public void setChepOtherDocketNo(String chepOtherDocketNo) {
    this.chepOtherDocketNo = chepOtherDocketNo;
  }

  public PalletTransaction otherCustomerOwnQuantity(Integer otherCustomerOwnQuantity) {
    this.otherCustomerOwnQuantity = otherCustomerOwnQuantity;
    return this;
  }

   /**
   * Get otherCustomerOwnQuantity
   * @return otherCustomerOwnQuantity
  **/
  public Integer getOtherCustomerOwnQuantity() {
    return otherCustomerOwnQuantity;
  }

  public void setOtherCustomerOwnQuantity(Integer otherCustomerOwnQuantity) {
    this.otherCustomerOwnQuantity = otherCustomerOwnQuantity;
  }

  public PalletTransaction loscamOtherExchangeQuantity(Integer loscamOtherExchangeQuantity) {
    this.loscamOtherExchangeQuantity = loscamOtherExchangeQuantity;
    return this;
  }

   /**
   * Get loscamOtherExchangeQuantity
   * @return loscamOtherExchangeQuantity
  **/
  public Integer getLoscamOtherExchangeQuantity() {
    return loscamOtherExchangeQuantity;
  }

  public void setLoscamOtherExchangeQuantity(Integer loscamOtherExchangeQuantity) {
    this.loscamOtherExchangeQuantity = loscamOtherExchangeQuantity;
  }

  public PalletTransaction loscamOtherTransferToTollQuantity(Integer loscamOtherTransferToTollQuantity) {
    this.loscamOtherTransferToTollQuantity = loscamOtherTransferToTollQuantity;
    return this;
  }

   /**
   * Get loscamOtherTransferToTollQuantity
   * @return loscamOtherTransferToTollQuantity
  **/
  public Integer getLoscamOtherTransferToTollQuantity() {
    return loscamOtherTransferToTollQuantity;
  }

  public void setLoscamOtherTransferToTollQuantity(Integer loscamOtherTransferToTollQuantity) {
    this.loscamOtherTransferToTollQuantity = loscamOtherTransferToTollQuantity;
  }

  public PalletTransaction loscamOtherDocket(Integer loscamOtherDocket) {
    this.loscamOtherDocket = loscamOtherDocket;
    return this;
  }

   /**
   * Get loscamOtherDocket
   * @return loscamOtherDocket
  **/
  public Integer getLoscamOtherDocket() {
    return loscamOtherDocket;
  }

  public void setLoscamOtherDocket(Integer loscamOtherDocket) {
    this.loscamOtherDocket = loscamOtherDocket;
  }

  public PalletTransaction chepOtherExchangeQuantity(String chepOtherExchangeQuantity) {
    this.chepOtherExchangeQuantity = chepOtherExchangeQuantity;
    return this;
  }

   /**
   * Get chepOtherExchangeQuantity
   * @return chepOtherExchangeQuantity
  **/
  public String getChepOtherExchangeQuantity() {
    return chepOtherExchangeQuantity;
  }

  public void setChepOtherExchangeQuantity(String chepOtherExchangeQuantity) {
    this.chepOtherExchangeQuantity = chepOtherExchangeQuantity;
  }
  
  public PalletTransaction palletTransactionType(String palletTransactionType) {
	  this.palletTransactionType = palletTransactionType;
	  return this;
  }
  
  /**
   * Get palletTransactionType
   * @return palletTransactionType
   **/
  public String getPalletTransactionType() {
	  return palletTransactionType;
  }
  
  public void setPalletTransactionType(String palletTransactionType) {
	  this.palletTransactionType = palletTransactionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalletTransaction palletTransaction = (PalletTransaction) o;
    return Objects.equals(this.palletId, palletTransaction.palletId) &&
        Objects.equals(this.shipmentId, palletTransaction.shipmentId) &&
        Objects.equals(this.chepCustomerOwnQuantity, palletTransaction.chepCustomerOwnQuantity) &&
        Objects.equals(this.chepExchangeQuantity, palletTransaction.chepExchangeQuantity) &&
        Objects.equals(this.chepTransferToTollQuantity, palletTransaction.chepTransferToTollQuantity) &&
        Objects.equals(this.chepDocketNo, palletTransaction.chepDocketNo) &&
        Objects.equals(this.loscamCustomerOwnQuantity, palletTransaction.loscamCustomerOwnQuantity) &&
        Objects.equals(this.loscamExchangeQuantity, palletTransaction.loscamExchangeQuantity) &&
        Objects.equals(this.loscamTransferToTollQuantity, palletTransaction.loscamTransferToTollQuantity) &&
        Objects.equals(this.loscamDocketNo, palletTransaction.loscamDocketNo) &&
        Objects.equals(this.chepOtherTransferToTollQuantity, palletTransaction.chepOtherTransferToTollQuantity) &&
        Objects.equals(this.chepOtherDocketNo, palletTransaction.chepOtherDocketNo) &&
        Objects.equals(this.otherCustomerOwnQuantity, palletTransaction.otherCustomerOwnQuantity) &&
        Objects.equals(this.loscamOtherExchangeQuantity, palletTransaction.loscamOtherExchangeQuantity) &&
        Objects.equals(this.loscamOtherTransferToTollQuantity, palletTransaction.loscamOtherTransferToTollQuantity) &&
        Objects.equals(this.loscamOtherDocket, palletTransaction.loscamOtherDocket) &&
        Objects.equals(this.chepOtherExchangeQuantity, palletTransaction.chepOtherExchangeQuantity) &&
        Objects.equals(this.palletTransactionType, palletTransaction.palletTransactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palletId, shipmentId, chepCustomerOwnQuantity, chepExchangeQuantity, chepTransferToTollQuantity, chepDocketNo, loscamCustomerOwnQuantity, loscamExchangeQuantity, loscamTransferToTollQuantity, loscamDocketNo, chepOtherTransferToTollQuantity, chepOtherDocketNo, otherCustomerOwnQuantity, loscamOtherExchangeQuantity, loscamOtherTransferToTollQuantity, loscamOtherDocket, chepOtherExchangeQuantity, palletTransactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalletTransaction {\n");
    
    sb.append("    palletId: ").append(toIndentedString(palletId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    chepCustomerOwnQuantity: ").append(toIndentedString(chepCustomerOwnQuantity)).append("\n");
    sb.append("    chepExchangeQuantity: ").append(toIndentedString(chepExchangeQuantity)).append("\n");
    sb.append("    chepTransferToTollQuantity: ").append(toIndentedString(chepTransferToTollQuantity)).append("\n");
    sb.append("    chepDocketNo: ").append(toIndentedString(chepDocketNo)).append("\n");
    sb.append("    loscamCustomerOwnQuantity: ").append(toIndentedString(loscamCustomerOwnQuantity)).append("\n");
    sb.append("    loscamExchangeQuantity: ").append(toIndentedString(loscamExchangeQuantity)).append("\n");
    sb.append("    loscamTransferToTollQuantity: ").append(toIndentedString(loscamTransferToTollQuantity)).append("\n");
    sb.append("    loscamDocketNo: ").append(toIndentedString(loscamDocketNo)).append("\n");
    sb.append("    chepOtherTransferToTollQuantity: ").append(toIndentedString(chepOtherTransferToTollQuantity)).append("\n");
    sb.append("    chepOtherDocketNo: ").append(toIndentedString(chepOtherDocketNo)).append("\n");
    sb.append("    otherCustomerOwnQuantity: ").append(toIndentedString(otherCustomerOwnQuantity)).append("\n");
    sb.append("    loscamOtherExchangeQuantity: ").append(toIndentedString(loscamOtherExchangeQuantity)).append("\n");
    sb.append("    loscamOtherTransferToTollQuantity: ").append(toIndentedString(loscamOtherTransferToTollQuantity)).append("\n");
    sb.append("    loscamOtherDocket: ").append(toIndentedString(loscamOtherDocket)).append("\n");
    sb.append("    palletTransactionType: ").append(toIndentedString(palletTransactionType)).append("\n");
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


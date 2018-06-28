package com.tollgroup.dto;

import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference
 */
public class Reference   {
  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("shipmentId")
  private Long shipmentId = null;

  @JsonProperty("referenceType")
  private String referenceType = null;

  @Size(min = 0, max = 20)
  @JsonProperty("referenceValue")
  private String referenceValue = null;

  @JsonProperty("referenceSeq")
  private Integer referenceSeq = null;

  public Reference referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public Reference shipmentId(Long shipmentId) {
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

  public Reference referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Get referenceType
   * @return referenceType
  **/
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public Reference referenceValue(String referenceValue) {
    this.referenceValue = referenceValue;
    return this;
  }

   /**
   * Get referenceValue
   * @return referenceValue
  **/
  public String getReferenceValue() {
    return referenceValue;
  }

  public void setReferenceValue(String referenceValue) {
    this.referenceValue = referenceValue;
  }

  public Reference referenceSeq(Integer referenceSeq) {
    this.referenceSeq = referenceSeq;
    return this;
  }

   /**
   * Get referenceSeq
   * @return referenceSeq
  **/
  public Integer getReferenceSeq() {
    return referenceSeq;
  }

  public void setReferenceSeq(Integer referenceSeq) {
    this.referenceSeq = referenceSeq;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.referenceId, reference.referenceId) &&
        Objects.equals(this.shipmentId, reference.shipmentId) &&
        Objects.equals(this.referenceType, reference.referenceType) &&
        Objects.equals(this.referenceValue, reference.referenceValue) &&
        Objects.equals(this.referenceSeq, reference.referenceSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, shipmentId, referenceType, referenceValue, referenceSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceValue: ").append(toIndentedString(referenceValue)).append("\n");
    sb.append("    referenceSeq: ").append(toIndentedString(referenceSeq)).append("\n");
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


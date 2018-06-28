package com.tollgroup.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DangerousGood
 */
@JsonInclude(Include.NON_NULL)
public class DangerousGood   {
  @JsonProperty("shipmentLineDgId")
  private Long shipmentLineDgId = null;

  @JsonProperty("shipmentLineId")
  private Long shipmentLineId = null;

  @JsonProperty("packTypeId")
  private Long packTypeId = null;

  @JsonProperty("dgSeq")
  private Integer dgSeq = null;

  @JsonProperty("dgUnNumber")
  private String dgUnNumber = null;

  @JsonProperty("dgClass")
  private String dgClass = null;

  @JsonProperty("dgPackageDescription")
  private String dgPackageDescription = null;

  @JsonProperty("packagingGroup")
  private String packagingGroup = null;

  @JsonProperty("shippingName")
  private String shippingName = null;

  @JsonProperty("dgWeight")
  private Double dgWeight = null;

  @JsonProperty("lineDgWeightUom")
  private String lineDgWeightUom = null;

  @JsonProperty("technicalName")
  private String technicalName = null;

  @JsonProperty("dgPackageQuantity")
  private Integer dgPackageQuantity = null;

  @JsonProperty("dgPackageQuantityUom")
  private String dgPackageQuantityUom = null;

  @JsonProperty("subRisk")
  private String subRisk = null;

  @JsonProperty("otherDgInformation")
  private String otherDgInformation = null;

  @JsonProperty("dgPackageType")
  private String dgPackageType = null;

  public DangerousGood shipmentLineDgId(Long shipmentLineDgId) {
    this.shipmentLineDgId = shipmentLineDgId;
    return this;
  }

   /**
   * Get shipmentLineDgId
   * @return shipmentLineDgId
  **/
  public Long getShipmentLineDgId() {
    return shipmentLineDgId;
  }

  public void setShipmentLineDgId(Long shipmentLineDgId) {
    this.shipmentLineDgId = shipmentLineDgId;
  }

  public DangerousGood shipmentLineId(Long shipmentLineId) {
    this.shipmentLineId = shipmentLineId;
    return this;
  }

   /**
   * Get shipmentLineId
   * @return shipmentLineId
  **/
  public Long getShipmentLineId() {
    return shipmentLineId;
  }

  public void setShipmentLineId(Long shipmentLineId) {
    this.shipmentLineId = shipmentLineId;
  }

  public DangerousGood packTypeId(Long packTypeId) {
    this.packTypeId = packTypeId;
    return this;
  }

   /**
   * Get packTypeId
   * @return packTypeId
  **/
  public Long getPackTypeId() {
    return packTypeId;
  }

  public void setPackTypeId(Long packTypeId) {
    this.packTypeId = packTypeId;
  }

  public DangerousGood dgSeq(Integer dgSeq) {
    this.dgSeq = dgSeq;
    return this;
  }

   /**
   * Get dgSeq
   * @return dgSeq
  **/
  public Integer getDgSeq() {
    return dgSeq;
  }

  public void setDgSeq(Integer dgSeq) {
    this.dgSeq = dgSeq;
  }

  public DangerousGood dgUnNumber(String dgUnNumber) {
    this.dgUnNumber = dgUnNumber;
    return this;
  }

   /**
   * Get dgUnNumber
   * @return dgUnNumber
  **/
  public String getDgUnNumber() {
    return dgUnNumber;
  }

  public void setDgUnNumber(String dgUnNumber) {
    this.dgUnNumber = dgUnNumber;
  }

  public DangerousGood dgClass(String dgClass) {
    this.dgClass = dgClass;
    return this;
  }

   /**
   * Get dgClass
   * @return dgClass
  **/
  public String getDgClass() {
    return dgClass;
  }

  public void setDgClass(String dgClass) {
    this.dgClass = dgClass;
  }

  public DangerousGood dgPackageDescription(String dgPackageDescription) {
    this.dgPackageDescription = dgPackageDescription;
    return this;
  }

   /**
   * Get dgPackageDescription
   * @return dgPackageDescription
  **/
  public String getDgPackageDescription() {
    return dgPackageDescription;
  }

  public void setDgPackageDescription(String dgPackageDescription) {
    this.dgPackageDescription = dgPackageDescription;
  }

  public DangerousGood packagingGroup(String packagingGroup) {
    this.packagingGroup = packagingGroup;
    return this;
  }

   /**
   * Get packagingGroup
   * @return packagingGroup
  **/
  public String getPackagingGroup() {
    return packagingGroup;
  }

  public void setPackagingGroup(String packagingGroup) {
    this.packagingGroup = packagingGroup;
  }

  public DangerousGood shippingName(String shippingName) {
    this.shippingName = shippingName;
    return this;
  }

   /**
   * Get shippingName
   * @return shippingName
  **/
  public String getShippingName() {
    return shippingName;
  }

  public void setShippingName(String shippingName) {
    this.shippingName = shippingName;
  }

  public DangerousGood dgWeight(Double dgWeight) {
    this.dgWeight = dgWeight;
    return this;
  }

   /**
   * Get dgWeight
   * @return dgWeight
  **/
  public Double getDgWeight() {
    return dgWeight;
  }

  public void setDgWeight(Double dgWeight) {
    this.dgWeight = dgWeight;
  }

  public DangerousGood lineDgWeightUom(String lineDgWeightUom) {
    this.lineDgWeightUom = lineDgWeightUom;
    return this;
  }

   /**
   * Get lineDgWeightUom
   * @return lineDgWeightUom
  **/
  public String getLineDgWeightUom() {
    return lineDgWeightUom;
  }

  public void setLineDgWeightUom(String lineDgWeightUom) {
    this.lineDgWeightUom = lineDgWeightUom;
  }

  public DangerousGood technicalName(String technicalName) {
    this.technicalName = technicalName;
    return this;
  }

   /**
   * Get technicalName
   * @return technicalName
  **/
  public String getTechnicalName() {
    return technicalName;
  }

  public void setTechnicalName(String technicalName) {
    this.technicalName = technicalName;
  }

  public DangerousGood dgPackageQuantity(Integer dgPackageQuantity) {
    this.dgPackageQuantity = dgPackageQuantity;
    return this;
  }

   /**
   * Get dgPackageQuantity
   * @return dgPackageQuantity
  **/
  public Integer getDgPackageQuantity() {
    return dgPackageQuantity;
  }

  public void setDgPackageQuantity(Integer dgPackageQuantity) {
    this.dgPackageQuantity = dgPackageQuantity;
  }

  public DangerousGood dgPackageQuantityUom(String dgPackageQuantityUom) {
    this.dgPackageQuantityUom = dgPackageQuantityUom;
    return this;
  }

   /**
   * Get dgPackageQuantityUOM
   * @return dgPackageQuantityUOM
  **/
  public String getDgPackageQuantityUOM() {
    return dgPackageQuantityUom;
  }

  public void setDgPackageQuantityUOM(String dgPackageQuantityUom) {
    this.dgPackageQuantityUom = dgPackageQuantityUom;
  }

  public DangerousGood subRisk(String subRisk) {
    this.subRisk = subRisk;
    return this;
  }

   /**
   * Get subRisk
   * @return subRisk
  **/
  public String getSubRisk() {
    return subRisk;
  }

  public void setSubRisk(String subRisk) {
    this.subRisk = subRisk;
  }

  public DangerousGood otherDgInformation(String otherDgInformation) {
    this.otherDgInformation = otherDgInformation;
    return this;
  }

   /**
   * Get otherDgInformation
   * @return otherDgInformation
  **/
  public String getOtherDgInformation() {
    return otherDgInformation;
  }

  public void setOtherDgInformation(String otherDgInformation) {
    this.otherDgInformation = otherDgInformation;
  }

  public DangerousGood dgPackageType(String dgPackageType) {
    this.dgPackageType = dgPackageType;
    return this;
  }

   /**
   * Get dgPackageType
   * @return dgPackageType
  **/
  public String getDgPackageType() {
    return dgPackageType;
  }

  public void setDgPackageType(String dgPackageType) {
    this.dgPackageType = dgPackageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DangerousGood dangerousGood = (DangerousGood) o;
    return Objects.equals(this.shipmentLineDgId, dangerousGood.shipmentLineDgId) &&
        Objects.equals(this.shipmentLineId, dangerousGood.shipmentLineId) &&
        Objects.equals(this.packTypeId, dangerousGood.packTypeId) &&
        Objects.equals(this.dgSeq, dangerousGood.dgSeq) &&
        Objects.equals(this.dgUnNumber, dangerousGood.dgUnNumber) &&
        Objects.equals(this.dgClass, dangerousGood.dgClass) &&
        Objects.equals(this.dgPackageDescription, dangerousGood.dgPackageDescription) &&
        Objects.equals(this.packagingGroup, dangerousGood.packagingGroup) &&
        Objects.equals(this.shippingName, dangerousGood.shippingName) &&
        Objects.equals(this.dgWeight, dangerousGood.dgWeight) &&
        Objects.equals(this.lineDgWeightUom, dangerousGood.lineDgWeightUom) &&
        Objects.equals(this.technicalName, dangerousGood.technicalName) &&
        Objects.equals(this.dgPackageQuantity, dangerousGood.dgPackageQuantity) &&
        Objects.equals(this.dgPackageQuantityUom, dangerousGood.dgPackageQuantityUom) &&
        Objects.equals(this.subRisk, dangerousGood.subRisk) &&
        Objects.equals(this.otherDgInformation, dangerousGood.otherDgInformation) &&
        Objects.equals(this.dgPackageType, dangerousGood.dgPackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentLineDgId, shipmentLineId, packTypeId, dgSeq, dgUnNumber, dgClass, dgPackageDescription, packagingGroup, shippingName, dgWeight, lineDgWeightUom, technicalName, dgPackageQuantity, dgPackageQuantityUom, subRisk, otherDgInformation, dgPackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DangerousGood {\n");
    
    sb.append("    shipmentLineDgId: ").append(toIndentedString(shipmentLineDgId)).append("\n");
    sb.append("    shipmentLineId: ").append(toIndentedString(shipmentLineId)).append("\n");
    sb.append("    packTypeId: ").append(toIndentedString(packTypeId)).append("\n");
    sb.append("    dgSeq: ").append(toIndentedString(dgSeq)).append("\n");
    sb.append("    dgUnNumber: ").append(toIndentedString(dgUnNumber)).append("\n");
    sb.append("    dgClass: ").append(toIndentedString(dgClass)).append("\n");
    sb.append("    dgPackageDescription: ").append(toIndentedString(dgPackageDescription)).append("\n");
    sb.append("    packagingGroup: ").append(toIndentedString(packagingGroup)).append("\n");
    sb.append("    shippingName: ").append(toIndentedString(shippingName)).append("\n");
    sb.append("    dgWeight: ").append(toIndentedString(dgWeight)).append("\n");
    sb.append("    lineDgWeightUom: ").append(toIndentedString(lineDgWeightUom)).append("\n");
    sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
    sb.append("    dgPackageQuantity: ").append(toIndentedString(dgPackageQuantity)).append("\n");
    sb.append("    dgPackageQuantityUOM: ").append(toIndentedString(dgPackageQuantityUom)).append("\n");
    sb.append("    subRisk: ").append(toIndentedString(subRisk)).append("\n");
    sb.append("    otherDgInformation: ").append(toIndentedString(otherDgInformation)).append("\n");
    sb.append("    dgPackageType: ").append(toIndentedString(dgPackageType)).append("\n");
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


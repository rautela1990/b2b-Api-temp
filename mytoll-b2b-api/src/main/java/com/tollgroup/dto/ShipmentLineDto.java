package com.tollgroup.dto;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ShipmentLine
 */
@JsonInclude(Include.NON_NULL)
public class ShipmentLineDto {
	
	@JsonProperty("shipmentLineId")
	private Long shipmentLineId = null;


	@JsonProperty("shipmentId")
	@NotNull
	private Long shipmentId = null;

	@JsonProperty("lineItemDescription")
	private String lineItemDescription = null;

	
	@JsonProperty("seqNo")
	@NotNull
	private Integer seqNo = null;

	@JsonProperty("perPallet")
	private Boolean perPallet = null;

	@JsonProperty("perPalletQty")
	private Integer perPalletQty = null;

	@JsonProperty("senderReference")
	private String senderReference = null;

	@JsonProperty("receiverReference")
	private String receiverReference = null;

	@JsonProperty("createdByTemplate")
	private Boolean createdByTemplate = null;

	
	@JsonProperty("status")
	@NotNull
	private String status = null;

	@JsonProperty("templateId")
	private String templateId = null;

	@JsonProperty("itemCount")
	private Integer itemCount = null;

	@JsonProperty("billingtypeDescription")
	private String billingtypeDescription = null;

	@JsonProperty("billingCode")
	private String billingCode = null;

	@JsonProperty("containsDangerousGoods")
	private Boolean containsDangerousGoods = null;

	@JsonProperty("itemType")
	private String itemType = null;

	@JsonProperty("miscUnitsCount")
	private Integer miscUnitsCount = null;

	@JsonProperty("dimensions")
	@Valid
	private Dimensions dimensions = null;

	@JsonProperty("shipmentLinesDangerousGoods")
	private DangerousGoods shipmentLinesDangerousGoods = null;

	@JsonProperty("shipmentLineItems")
	private ShipmentLineItems shipmentLineItems;

	public ShipmentLineDto shipmentLineId(Long shipmentLineId) {
		this.shipmentLineId = shipmentLineId;
		return this;
	}

	/**
	 * Get shipmentLineId
	 * 
	 * @return shipmentLineId
	 **/
	public Long getShipmentLineId() {
		return shipmentLineId;
	}

	public void setShipmentLineId(Long shipmentLineId) {
		this.shipmentLineId = shipmentLineId;
	}

	public ShipmentLineDto shipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
		return this;
	}

	/**
	 * Get shipmentId
	 * 
	 * @return shipmentId
	 **/
	public Long getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}

	public ShipmentLineDto lineItemDescription(String lineItemDescription) {
		this.lineItemDescription = lineItemDescription;
		return this;
	}

	/**
	 * Get lineItemDescription
	 * 
	 * @return lineItemDescription
	 **/
	public String getLineItemDescription() {
		return lineItemDescription;
	}

	public void setLineItemDescription(String lineItemDescription) {
		this.lineItemDescription = lineItemDescription;
	}

	public ShipmentLineDto seqNo(Integer seqNo) {
		this.seqNo = seqNo;
		return this;
	}

	/**
	 * Get seqNo
	 * 
	 * @return seqNo
	 **/
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public ShipmentLineDto perPallet(Boolean perPallet) {
		this.perPallet = perPallet;
		return this;
	}

	/**
	 * Get perPallet
	 * 
	 * @return perPallet
	 **/
	public Boolean getPerPallet() {
		return perPallet;
	}

	public void setPerPallet(Boolean perPallet) {
		this.perPallet = perPallet;
	}

	public ShipmentLineDto perPalletQty(Integer perPalletQty) {
		this.perPalletQty = perPalletQty;
		return this;
	}

	/**
	 * Get perPalletQty
	 * 
	 * @return perPalletQty
	 **/
	public Integer getPerPalletQty() {
		return perPalletQty;
	}

	public void setPerPalletQty(Integer perPalletQty) {
		this.perPalletQty = perPalletQty;
	}

	public ShipmentLineDto senderReference(String senderReference) {
		this.senderReference = senderReference;
		return this;
	}

	/**
	 * Get senderReference
	 * 
	 * @return senderReference
	 **/
	public String getSenderReference() {
		return senderReference;
	}

	public void setSenderReference(String senderReference) {
		this.senderReference = senderReference;
	}

	public ShipmentLineDto receiverReference(String receiverReference) {
		this.receiverReference = receiverReference;
		return this;
	}

	/**
	 * Get receiverReference
	 * 
	 * @return receiverReference
	 **/
	public String getReceiverReference() {
		return receiverReference;
	}

	public void setReceiverReference(String receiverReference) {
		this.receiverReference = receiverReference;
	}

	public ShipmentLineDto createdByTemplate(Boolean createdByTemplate) {
		this.createdByTemplate = createdByTemplate;
		return this;
	}

	/**
	 * Get createdByTemplate
	 * 
	 * @return createdByTemplate
	 **/
	public Boolean getCreatedByTemplate() {
		return createdByTemplate;
	}

	public void setCreatedByTemplate(Boolean createdByTemplate) {
		this.createdByTemplate = createdByTemplate;
	}

	public ShipmentLineDto status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ShipmentLineDto templateId(String templateId) {
		this.templateId = templateId;
		return this;
	}

	/**
	 * Get templateId
	 * 
	 * @return templateId
	 **/
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public ShipmentLineDto itemCount(Integer itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	/**
	 * This will be the number of items in the line
	 * 
	 * @return itemCount
	 **/
	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public ShipmentLineDto billingtypeDescription(String billingtypeDescription) {
		this.billingtypeDescription = billingtypeDescription;
		return this;
	}

	/**
	 * Get billingTypeDescription
	 * 
	 * @return billingTypeDescription
	 **/
	public String getBillingtypeDescription() {
		return billingtypeDescription;
	}

	public void setBillingtypeDescription(String billingtypeDescription) {
		this.billingtypeDescription = billingtypeDescription;
	}

	public ShipmentLineDto billingCode(String billingCode) {
		this.billingCode = billingCode;
		return this;
	}

	/**
	 * Get billingCode
	 * 
	 * @return billingCode
	 **/
	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	public ShipmentLineDto containsDangerousGoods(Boolean containsDangerousGoods) {
		this.containsDangerousGoods = containsDangerousGoods;
		return this;
	}

	/**
	 * Get containsDangerousGoods
	 * 
	 * @return containsDangerousGoods
	 **/
	public Boolean getContainsDangerousGoods() {
		return containsDangerousGoods;
	}

	public void setContainsDangerousGoods(Boolean containsDangerousGoods) {
		this.containsDangerousGoods = containsDangerousGoods;
	}

	public ShipmentLineDto itemType(String itemType) {
		this.itemType = itemType;
		return this;
	}

	/**
	 * This is the choice of Items , Misc Units , Pallets
	 * 
	 * @return itemType
	 **/
	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public ShipmentLineDto miscUnitsCount(Integer miscUnitsCount) {
		this.miscUnitsCount = miscUnitsCount;
		return this;
	}

	/**
	 * This will be the number of garments in the line
	 * 
	 * @return miscUnitsCount
	 **/
	public Integer getMiscUnitsCount() {
		return miscUnitsCount;
	}

	public void setMiscUnitsCount(Integer miscUnitsCount) {
		this.miscUnitsCount = miscUnitsCount;
	}

	public ShipmentLineDto dimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	/**
	 * Get dimensions
	 * 
	 * @return dimensions
	 **/
	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public ShipmentLineDto shipmentLinesDangerousGoods(DangerousGoods shipmentLinesDangerousGoods) {
		this.shipmentLinesDangerousGoods = shipmentLinesDangerousGoods;
		return this;
	}

	/**
	 * Get shipmentLinesDangerousGoods
	 * 
	 * @return shipmentLinesDangerousGoods
	 **/
	public DangerousGoods getShipmentLinesDangerousGoods() {
		return shipmentLinesDangerousGoods;
	}

	public void setShipmentLinesDangerousGoods(DangerousGoods shipmentLinesDangerousGoods) {
		this.shipmentLinesDangerousGoods = shipmentLinesDangerousGoods;
	}

	public ShipmentLineDto shipmentLineItems(ShipmentLineItems shipmentLineItems) {
		this.shipmentLineItems = shipmentLineItems;
		return this;
	}

	public ShipmentLineItems getShipmentLineItems() {
		return shipmentLineItems;
	}

	public void setShipmentLineItems(ShipmentLineItems shipmentLineItems) {
		this.shipmentLineItems = shipmentLineItems;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShipmentLineDto shipmentLine = (ShipmentLineDto) o;
		return Objects.equals(this.shipmentLineId, shipmentLine.shipmentLineId)
				&& Objects.equals(this.shipmentId, shipmentLine.shipmentId)
				&& Objects.equals(this.lineItemDescription, shipmentLine.lineItemDescription)
				&& Objects.equals(this.seqNo, shipmentLine.seqNo)
				&& Objects.equals(this.perPallet, shipmentLine.perPallet)
				&& Objects.equals(this.perPalletQty, shipmentLine.perPalletQty)
				&& Objects.equals(this.senderReference, shipmentLine.senderReference)
				&& Objects.equals(this.receiverReference, shipmentLine.receiverReference)
				&& Objects.equals(this.createdByTemplate, shipmentLine.createdByTemplate)
				&& Objects.equals(this.status, shipmentLine.status)
				&& Objects.equals(this.templateId, shipmentLine.templateId)
				&& Objects.equals(this.itemCount, shipmentLine.itemCount)
				&& Objects.equals(this.billingtypeDescription, shipmentLine.billingtypeDescription)
				&& Objects.equals(this.billingCode, shipmentLine.billingCode)
				&& Objects.equals(this.containsDangerousGoods, shipmentLine.containsDangerousGoods)
				&& Objects.equals(this.itemType, shipmentLine.itemType)
				&& Objects.equals(this.miscUnitsCount, shipmentLine.miscUnitsCount)
				&& Objects.equals(this.dimensions, shipmentLine.dimensions)
				&& Objects.equals(this.shipmentLinesDangerousGoods, shipmentLine.shipmentLinesDangerousGoods);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shipmentLineId, shipmentId, lineItemDescription, seqNo, perPallet, perPalletQty,
				senderReference, receiverReference, createdByTemplate, status, templateId, itemCount,
				billingtypeDescription, billingCode, containsDangerousGoods, itemType, miscUnitsCount, dimensions,
				shipmentLinesDangerousGoods);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ShipmentLine {\n");

		sb.append("    shipmentLineId: ").append(toIndentedString(shipmentLineId)).append("\n");
		sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
		sb.append("    lineItemDescription: ").append(toIndentedString(lineItemDescription)).append("\n");
		sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
		sb.append("    perPallet: ").append(toIndentedString(perPallet)).append("\n");
		sb.append("    perPalletQty: ").append(toIndentedString(perPalletQty)).append("\n");
		sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
		sb.append("    receiverReference: ").append(toIndentedString(receiverReference)).append("\n");
		sb.append("    createdByTemplate: ").append(toIndentedString(createdByTemplate)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
		sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
		sb.append("    billingType: ").append(toIndentedString(billingtypeDescription)).append("\n");
		sb.append("    billingType: ").append(toIndentedString(billingCode)).append("\n");
		sb.append("    containsDangerousGoods: ").append(toIndentedString(containsDangerousGoods)).append("\n");
		sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
		sb.append("    miscUnitsCount: ").append(toIndentedString(miscUnitsCount)).append("\n");
		sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
		sb.append("    shipmentLinesDangerousGoods: ").append(toIndentedString(shipmentLinesDangerousGoods))
				.append("\n");
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

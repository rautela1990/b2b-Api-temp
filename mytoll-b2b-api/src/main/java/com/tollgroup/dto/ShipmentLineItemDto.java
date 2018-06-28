package com.tollgroup.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class ShipmentLineItemDto {
	@JsonProperty("itemId")
	private Long itemId = null;

	@JsonProperty("seqNo")
	private Integer seqNo = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("itemLabelNo")
	private String itemLabelNo;

	@JsonProperty("prevItemLabelNo")
	private String prevItemLabelNo;

	@JsonProperty("isPrinted")
	private Integer isPrinted = null;

	@JsonProperty("itemPrintedSeq")
	private Integer itemPrintedSeq;

	@JsonProperty("itemPrintedTotal")
	private Integer itemPrintedTotal;

	@JsonProperty("itemVolume")
	private Double itemVolume;

	@JsonProperty("itemWeight")
	private Double itemWeight;

	@JsonProperty("isActive")
	private Integer isActive;

	@JsonProperty("barCode")
	private String barCode;

	@JsonProperty("fullBarCode")
	private String fullBarCode;

	@JsonProperty("qrCode")
	private String qrCode;
	
	private Long prevItemId=null;

	public ShipmentLineItemDto itemId(Long itemId) {
		this.itemId = itemId;
		return this;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public ShipmentLineItemDto seqNo(Integer seqNo) {
		this.seqNo = seqNo;
		return this;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public ShipmentLineItemDto description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public ShipmentLineItemDto prevItemLabelNo(String prevItemLabelNo) {
		this.prevItemLabelNo = prevItemLabelNo;
		return this;
	}

	public String getPrevItemLabelNo() {
		return prevItemLabelNo;
	}

	public void setPrevItemLabelNo(String prevItemLabelNo) {
		this.prevItemLabelNo = prevItemLabelNo;
	}

	public ShipmentLineItemDto itemLabelNo(String itemLabelNo) {
		this.itemLabelNo = itemLabelNo;
		return this;
	}

	public String getItemLabelNo() {
		return itemLabelNo;
	}

	public void setItemLabelNo(String itemLabelNo) {
		this.itemLabelNo = itemLabelNo;
	}

	public ShipmentLineItemDto isPrinted(Integer isPrinted) {
		this.isPrinted = isPrinted;
		return this;
	}

	public Integer getIsPrinted() {
		return isPrinted;
	}

	public void setIsPrinted(Integer isPrinted) {
		this.isPrinted = isPrinted;
	}

	public ShipmentLineItemDto itemPrintedSeq(Integer itemPrintedSeq) {
		this.itemPrintedSeq = itemPrintedSeq;
		return this;
	}

	public Integer getItemPrintedSeq() {
		return itemPrintedSeq;
	}

	public void setItemPrintedSeq(Integer itemPrintedSeq) {
		this.itemPrintedSeq = itemPrintedSeq;
	}

	public ShipmentLineItemDto itemPrintedTotal(Integer itemPrintedTotal) {
		this.itemPrintedTotal = itemPrintedTotal;
		return this;
	}

	public Integer getItemPrintedTotal() {
		return itemPrintedTotal;
	}

	public void setItemPrintedTotal(Integer itemPrintedTotal) {
		this.itemPrintedTotal = itemPrintedTotal;
	}

	public ShipmentLineItemDto isActive(Integer isActive) {
		this.isActive = isActive;
		return this;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public ShipmentLineItemDto barCode(String barCode) {
		this.barCode = barCode;
		return this;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public ShipmentLineItemDto fullBarCode(String fullBarCode) {
		this.fullBarCode = fullBarCode;
		return this;
	}

	public String getFullBarCode() {
		return fullBarCode;
	}

	public void setFullBarCode(String fullBarCode) {
		this.fullBarCode = fullBarCode;
	}

	public ShipmentLineItemDto qrCode(String qrCode) {
		this.qrCode = qrCode;
		return this;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public ShipmentLineItemDto itemVolume(Double itemVolume) {
		this.itemVolume = itemVolume;
		return this;
	}

	public Double getItemVolume() {
		return itemVolume;
	}

	public void setItemVolume(Double itemVolume) {
		this.itemVolume = itemVolume;
	}

	public ShipmentLineItemDto itemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
		return this;
	}

	public Double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}

	public Long getPrevItemId() {
		return prevItemId;
	}

	public void setPrevItemId(Long prevItemId) {
		this.prevItemId = prevItemId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemId, seqNo, description, itemLabelNo, isPrinted, itemPrintedSeq, itemPrintedTotal,
				itemVolume, itemWeight, isActive, barCode, fullBarCode, qrCode);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShipmentLineItemDto lineItem = (ShipmentLineItemDto) o;
		return Objects.equals(this.itemId, lineItem.itemId)
				&& Objects.equals(this.itemLabelNo, lineItem.itemLabelNo)
				&& Objects.equals(this.seqNo, lineItem.seqNo)
				&& Objects.equals(this.description, lineItem.description)
				&& Objects.equals(this.isPrinted, lineItem.isPrinted)
				&& Objects.equals(this.itemPrintedSeq, lineItem.itemPrintedSeq)
				&& Objects.equals(this.itemPrintedTotal, lineItem.itemPrintedTotal)
				&& Objects.equals(this.isActive, lineItem.isActive)
				&& Objects.equals(this.barCode, lineItem.barCode)
				&& Objects.equals(this.fullBarCode, lineItem.fullBarCode)
				&& Objects.equals(this.qrCode, lineItem.qrCode)
				&& Objects.equals(this.itemWeight, lineItem.itemWeight)
				&& Objects.equals(this.itemVolume, lineItem.itemVolume);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ShipmentLine {\n");

		sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
		sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    itemLabelNo: ").append(toIndentedString(itemLabelNo)).append("\n");
		sb.append("    isPrinted: ").append(toIndentedString(isPrinted)).append("\n");
		sb.append("    itemPrintedSeq: ").append(toIndentedString(itemPrintedSeq)).append("\n");
		sb.append("    itemPrintedTotal: ").append(toIndentedString(itemPrintedTotal)).append("\n");
		sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
		sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
		sb.append("    fullBarCode: ").append(toIndentedString(fullBarCode)).append("\n");
		sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
		sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
		sb.append("    itemVolume: ").append(toIndentedString(itemVolume)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

package com.tollgroup.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ShipmentLineItem.
 */
@Entity
@Table(name = "shipment_line_item")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentLineItem extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;

    @NotNull
    @Column(name = "seq_no", nullable = false)
    private Integer seqNo;

    @Size(max = 80)
    @Column(name = "description", length = 80)
    private String description;

    @Size(max = 25)
    @Column(name = "item_label_no", length = 25)
    private String itemLabelNo;

    @Column(name = "is_printed")
    private Integer isPrinted;

    @NotNull
    @Column(name = "is_active", nullable = false)
    private Integer isActive;

    @Column(name = "item_printed_seq")
    private Integer itemPrintedSeq;

    @Column(name = "item_printed_total")
    private Integer itemPrintedTotal;

    @Column(name = "version")
    private Integer version;

    @Column(name = "item_length")
    private Double itemLength;

    @Column(name = "item_width")
    private Double itemWidth;

    @Column(name = "item_height")
    private Double itemHeight;

    @Column(name = "dimension_qty")
    private Integer dimensionQty;

    @Column(name = "item_volume")
    private Double itemVolume;

    @Column(name = "item_weight")
    private Double itemWeight;
    
    @Column(name = "misc_unit_count")
    private Integer miscUnitCount;

    @Size(max = 5)
    @Column(name = "item_weight_uom", length = 5)
    private String itemWeightUom;

    @Size(max = 5)
    @Column(name = "item_length_uom", length = 5)
    private String itemLengthUom;

    @Size(max = 255)
    @Column(name = "semi_bar_code", length = 255)
    private String semiBarCode;
    
    @Size(max = 255)
    @Column(name = "full_bar_code", length = 255)
    private String fullBarCode;

    @Size(max = 1500)
    @Column(name = "qr_code", length = 1500)
    private String qrCode;

    @Column(name = "previous_item_id")
    private Long previousItemId;
    
    @Size(max = 25)
    @Column(name = "previous_item_label_no", length = 25)
    private String previousItemLabelNo;

	@ManyToOne/*(cascade = CascadeType.ALL)*/
	@JoinColumn(name = "shipment_line_id", nullable = false)
	private ShipmentLine shipmentLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public ShipmentLineItem seqNo(Integer seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getDescription() {
        return description;
    }

    public ShipmentLineItem description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemLabelNo() {
        return itemLabelNo;
    }

    public ShipmentLineItem itemLabelNo(String itemLabelNo) {
        this.itemLabelNo = itemLabelNo;
        return this;
    }

    public void setItemLabelNo(String itemLabelNo) {
        this.itemLabelNo = itemLabelNo;
    }
    
    public String getPreviousItemLabelNo() {
    	return previousItemLabelNo;
    }
    
    public ShipmentLineItem previousItemLabelNo(String previousItemLabelNo) {
    	this.previousItemLabelNo = previousItemLabelNo;
    	return this;
    }
    
    public void setPreviousItemLabelNo(String previousItemLabelNo) {
    	this.previousItemLabelNo = previousItemLabelNo;
    }

    public Integer getIsPrinted() {
        return isPrinted;
    }

    public ShipmentLineItem isPrinted(Integer isPrinted) {
        this.isPrinted = isPrinted;
        return this;
    }

    public void setIsPrinted(Integer isPrinted) {
        this.isPrinted = isPrinted;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public ShipmentLineItem isActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getItemPrintedSeq() {
        return itemPrintedSeq;
    }

    public ShipmentLineItem itemPrintedSeq(Integer itemPrintedSeq) {
        this.itemPrintedSeq = itemPrintedSeq;
        return this;
    }

    public void setItemPrintedSeq(Integer itemPrintedSeq) {
        this.itemPrintedSeq = itemPrintedSeq;
    }

    public Integer getItemPrintedTotal() {
        return itemPrintedTotal;
    }

    public ShipmentLineItem itemPrintedTotal(Integer itemPrintedTotal) {
        this.itemPrintedTotal = itemPrintedTotal;
        return this;
    }

    public void setItemPrintedTotal(Integer itemPrintedTotal) {
        this.itemPrintedTotal = itemPrintedTotal;
    }

    public Integer getVersion() {
        return version;
    }

    public ShipmentLineItem version(Integer version) {
        this.version = version;
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Double getItemLength() {
        return itemLength;
    }

    public ShipmentLineItem itemLength(Double itemLength) {
        this.itemLength = itemLength;
        return this;
    }

    public void setItemLength(Double itemLength) {
        this.itemLength = itemLength;
    }

    public Double getItemWidth() {
        return itemWidth;
    }

    public ShipmentLineItem itemWidth(Double itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public void setItemWidth(Double itemWidth) {
        this.itemWidth = itemWidth;
    }

    public Double getItemHeight() {
        return itemHeight;
    }

    public ShipmentLineItem itemHeight(Double itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public void setItemHeight(Double itemHeight) {
        this.itemHeight = itemHeight;
    }

    public Integer getDimensionQty() {
        return dimensionQty;
    }

    public ShipmentLineItem dimensionQty(Integer dimensionQty) {
        this.dimensionQty = dimensionQty;
        return this;
    }

    public void setDimensionQty(Integer dimensionQty) {
        this.dimensionQty = dimensionQty;
    }

    public Double getItemVolume() {
        return itemVolume;
    }

    public ShipmentLineItem itemVolume(Double itemVolume) {
        this.itemVolume = itemVolume;
        return this;
    }

    public void setItemVolume(Double itemVolume) {
        this.itemVolume = itemVolume;
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public ShipmentLineItem itemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
        return this;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }
    
    public Integer getMiscUnitCount() {
        return miscUnitCount;
    }

    public ShipmentLineItem miscUnitCount(Integer miscUnitCount) {
        this.miscUnitCount = miscUnitCount;
        return this;
    }

    public void setMiscUnitCount(Integer miscUnitCount) {
        this.miscUnitCount = miscUnitCount;
    }

    public String getItemWeightUom() {
        return itemWeightUom;
    }

    public ShipmentLineItem itemWeightUom(String itemWeightUom) {
        this.itemWeightUom = itemWeightUom;
        return this;
    }

    public void setItemWeightUom(String itemWeightUom) {
        this.itemWeightUom = itemWeightUom;
    }

    public String getItemLengthUom() {
        return itemLengthUom;
    }

    public ShipmentLineItem itemLengthUom(String itemLengthUom) {
        this.itemLengthUom = itemLengthUom;
        return this;
    }

    public void setItemLengthUom(String itemLengthUom) {
        this.itemLengthUom = itemLengthUom;
    }

    public String getSemiBarCode() {
        return semiBarCode;
    }

    public ShipmentLineItem semiBarCode(String semiBarCode) {
        this.semiBarCode = semiBarCode;
        return this;
    }

    public void setSemiBarCode(String semiBarCode) {
        this.semiBarCode = semiBarCode;
    }
    
    public String getFullBarCode() {
        return fullBarCode;
    }

    public ShipmentLineItem fullBarCode(String fullBarCode) {
        this.fullBarCode = fullBarCode;
        return this;
    }

    public void setFullBarCode(String fullBarCode) {
        this.fullBarCode = fullBarCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public ShipmentLineItem qrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Long getPreviousItemId() {
        return previousItemId;
    }

    public ShipmentLineItem previousItemId(Long previousItemId) {
        this.previousItemId = previousItemId;
        return this;
    }

    public void setPreviousItemId(Long previousItemId) {
        this.previousItemId = previousItemId;
    }

    public ShipmentLine getShipmentLine() {
        return shipmentLine;
    }

    public ShipmentLineItem shipmentLine(ShipmentLine shipmentLine) {
        this.shipmentLine = shipmentLine;
        return this;
    }

    public void setShipmentLine(ShipmentLine shipmentLine) {
        this.shipmentLine = shipmentLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentLineItem shipmentLineItem = (ShipmentLineItem) o;
        if(shipmentLineItem.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentLineItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ShipmentLineItem{" +
            "id=" + id +
            ", seqNo='" + seqNo + "'" +
            ", description='" + description + "'" +
            ", itemLabelNo='" + itemLabelNo + "'" +
            ", previousItemLabelNo='" + previousItemLabelNo + "'" +
            ", isPrinted='" + isPrinted + "'" +
            ", isActive='" + isActive + "'" +
            ", itemPrintedSeq='" + itemPrintedSeq + "'" +
            ", itemPrintedTotal='" + itemPrintedTotal + "'" +
            ", version='" + version + "'" +
            ", itemLength='" + itemLength + "'" +
            ", itemWidth='" + itemWidth + "'" +
            ", itemHeight='" + itemHeight + "'" +
            ", dimensionQty='" + dimensionQty + "'" +
            ", itemVolume='" + itemVolume + "'" +
            ", itemWeight='" + itemWeight + "'" +
            ", miscUnitCount='" + miscUnitCount + "'" +
            ", itemWeightUom='" + itemWeightUom + "'" +
            ", itemLengthUom='" + itemLengthUom + "'" +
            ", semiBarCode='" + semiBarCode + "'" +
            ", fullBarCode='" + fullBarCode + "'" +
            ", qrCode='" + qrCode + "'" +
            ", previousItemId='" + previousItemId + "'" +
            '}';
    }
}

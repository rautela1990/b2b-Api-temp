package com.tollgroup.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OrderBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A ShipmentLine.
 */
@Entity
@Table(name = "shipment_line")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentLine extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipment_line_id")
    private Long id;

    @Size(max = 100)
    @Column(name = "description", length = 100)
    private String description;
    
    @Size(max = 45)
    @Column(name = "item_type", length = 45)
    private String itemType;

    @Column(name = "seq_no")
    private Integer seqNo;

    @Size(max = 40)
    @Column(name = "reference1", length = 40)
    private String reference1;

    @Size(max = 40)
    @Column(name = "reference2", length = 40)
    private String reference2;

    @Column(name = "item_count")
    private Integer itemCount;

    @Column(name = "misc_unit_count")
    private Integer miscUnitCount;

    @Column(name = "length")
    private Double length;

    @Column(name = "width")
    private Double width;

    @Column(name = "height")
    private Double height;

    @Column(name = "total_volume")
    private Double totalVolume;

    @Column(name = "total_weight")
    private Double totalWeight;
    
    @Column(name = "total_quantity")
    private Double totalQuantity;

    @Size(max = 5)
    @Column(name = "weight_uom", length = 5)
    private String weightUom;

    @Size(max = 5)
    @Column(name = "volume_uom", length = 5)
    private String volumeUom;
    
    @Column(name = "per_unit_volume")
    private Double perUnitVolume;
    
    @Column(name = "is_volume_only")
    private Integer isVolumeOnly;

    @Size(max = 255)
    @Column(name = "billing_type_description", length = 255)
    private String billingTypeDescription;
    
    @Size(max = 3)
    @Column(name = "billing_code", length = 3)
    private String billingCode;
    
    @Column(name = "per_pallet_qty")
    private Integer perPalletQty;
    
    @Column(name = "is_per_pallet")
    private Boolean isPerPallet;

    @Column(name = "is_dangerous_goods")
    private Integer isDangerousGoods;

    @NotNull
    @Size(max = 1)
    @Column(name = "status", length = 1, nullable = false)
    private String status;

    @Column(name = "created_by_template")
    private Integer createdByTemplate;

    @Column(name = "version")
    private Integer version;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipment_id", nullable = false)
	private Shipment shipment;

    @OneToMany(mappedBy = "shipmentLine", cascade = CascadeType.REMOVE, orphanRemoval=true)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @OrderBy(clause = "seq_no")
    private Set<ShipmentLineItem> shipmentLineItems = new HashSet<>();

    @OneToMany(mappedBy = "shipmentLine", cascade = CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ShipmentLineDg> shipmentLineDgs = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public ShipmentLine description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getItemType() {
        return itemType;
    }

    public ShipmentLine itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public ShipmentLine seqNo(Integer seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getReference1() {
        return reference1;
    }

    public ShipmentLine reference1(String reference1) {
        this.reference1 = reference1;
        return this;
    }

    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    public String getReference2() {
        return reference2;
    }

    public ShipmentLine reference2(String reference2) {
        this.reference2 = reference2;
        return this;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public ShipmentLine itemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getMiscUnitCount() {
        return miscUnitCount;
    }

    public ShipmentLine miscUnitCount(Integer miscUnitCount) {
        this.miscUnitCount = miscUnitCount;
        return this;
    }

    public void setMiscUnitCount(Integer miscUnitCount) {
        this.miscUnitCount = miscUnitCount;
    }

    public Double getLength() {
        return length;
    }

    public ShipmentLine length(Double length) {
        this.length = length;
        return this;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public ShipmentLine width(Double width) {
        this.width = width;
        return this;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public ShipmentLine height(Double height) {
        this.height = height;
        return this;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public ShipmentLine totalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public ShipmentLine totalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }
    
    public Double getTotalQuantity() {
        return totalQuantity;
    }

    public ShipmentLine totalQuantity(Double totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    public void setTotalQuantity(Double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public ShipmentLine weightUom(String weightUom) {
        this.weightUom = weightUom;
        return this;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom;
    }

    public Double getPerUnitVolume() {
        return perUnitVolume;
    }

    public ShipmentLine perUnitVolume(Double perUnitVolume) {
        this.perUnitVolume = perUnitVolume;
        return this;
    }

    public void setPerUnitVolume(Double perUnitVolume) {
        this.perUnitVolume = perUnitVolume;
    }
    
    public String getVolumeUom() {
        return volumeUom;
    }

    public ShipmentLine volumeUom(String volumeUom) {
        this.volumeUom = volumeUom;
        return this;
    }

    public void setVolumeUom(String volumeUom) {
        this.volumeUom = volumeUom;
    }
    
    
    public String getBillingTypeDescription() {
        return billingTypeDescription;
    }

    public ShipmentLine billingTypeDescription(String billingTypeDescription) {
        this.billingTypeDescription = billingTypeDescription;
        return this;
    }

    public void setBillingTypeDescription(String billingTypeDescription) {
        this.billingTypeDescription = billingTypeDescription;
    }
    
    public String getBillingCode() {
    	return billingCode;
    }
    
    public ShipmentLine billingCode(String billingCode) {
    	this.billingCode = billingCode;
    	return this;
    }
    
    public void setBillingCode(String billingCode) {
    	this.billingCode = billingCode;
    }
    
    public Integer getPerPalletQty() {
        return perPalletQty;
    }

    public ShipmentLine perPalletQty(Integer perPalletQty) {
        this.perPalletQty = perPalletQty;
        return this;
    }

    public void setPerPalletQty(Integer perPalletQty) {
        this.perPalletQty = perPalletQty;
    }
    
    public Boolean getIsPerPallet() {
    	return isPerPallet;
    }
    
    public ShipmentLine isPerPallet(Boolean isPerPallet) {
    	this.isPerPallet = isPerPallet;
    	return this;
    }
    
    public void setIsPerPallet(Boolean isPerPallet) {
    	this.isPerPallet = isPerPallet;
    }

    public Integer getIsDangerousGoods() {
        return isDangerousGoods;
    }

    public ShipmentLine isDangerousGoods(Integer isDangerousGoods) {
        this.isDangerousGoods = isDangerousGoods;
        return this;
    }

    public void setIsDangerousGoods(Integer isDangerousGoods) {
        this.isDangerousGoods = isDangerousGoods;
    }

    public String getStatus() {
        return status;
    }

    public ShipmentLine status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIsVolumeOnly() {
        return isVolumeOnly;
    }

    public ShipmentLine isVolumeOnly(Integer isVolumeOnly) {
        this.isVolumeOnly = isVolumeOnly;
        return this;
    }

    public void setIsVolumeOnly(Integer isVolumeOnly) {
        this.isVolumeOnly = isVolumeOnly;
    }

    public Integer getCreatedByTemplate() {
        return createdByTemplate;
    }

    public ShipmentLine createdByTemplate(Integer createdByTemplate) {
        this.createdByTemplate = createdByTemplate;
        return this;
    }

    public void setCreatedByTemplate(Integer createdByTemplate) {
        this.createdByTemplate = createdByTemplate;
    }
    
    public Integer getVersion() {
        return version;
    }

    public ShipmentLine version(Integer version) {
        this.version = version;
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public ShipmentLine shipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Set<ShipmentLineItem> getShipmentLineItems() {
        return shipmentLineItems;
    }

    public ShipmentLine shipmentLineItems(Set<ShipmentLineItem> shipmentLineItems) {
        this.shipmentLineItems = shipmentLineItems;
        return this;
    }

    public ShipmentLine addShipmentLineItem(ShipmentLineItem shipmentLineItem) {
        shipmentLineItems.add(shipmentLineItem);
        shipmentLineItem.setShipmentLine(this);
        return this;
    }

    public ShipmentLine removeShipmentLineItem(ShipmentLineItem shipmentLineItem) {
        shipmentLineItems.remove(shipmentLineItem);
        shipmentLineItem.setShipmentLine(null);
        return this;
    }

    public void setShipmentLineItems(Set<ShipmentLineItem> shipmentLineItems) {
        this.shipmentLineItems = shipmentLineItems;
    }

    public Set<ShipmentLineDg> getShipmentLineDgs() {
        return shipmentLineDgs;
    }

    public ShipmentLine shipmentLineDgs(Set<ShipmentLineDg> shipmentLineDgs) {
        this.shipmentLineDgs = shipmentLineDgs;
        return this;
    }

    public ShipmentLine addShipmentLineDg(ShipmentLineDg shipmentLineDg) {
        shipmentLineDgs.add(shipmentLineDg);
        shipmentLineDg.setShipmentLine(this);
        return this;
    }

    public ShipmentLine removeShipmentLineDg(ShipmentLineDg shipmentLineDg) {
        shipmentLineDgs.remove(shipmentLineDg);
        shipmentLineDg.setShipmentLine(null);
        return this;
    }

    public void setShipmentLineDgs(Set<ShipmentLineDg> shipmentLineDgs) {
        this.shipmentLineDgs = shipmentLineDgs;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentLine shipmentLine = (ShipmentLine) o;
        if(shipmentLine.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentLine.id);
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hashCode(id);
    }*/

    @Override
    public String toString() {
        return "ShipmentLine{" +
            "id=" + id +
            ", description='" + description + "'" +
            ", seqNo='" + seqNo + "'" +
            ", reference1='" + reference1 + "'" +
            ", reference2='" + reference2 + "'" +
            ", itemCount='" + itemCount + "'" +
            ", miscUnitCount='" + miscUnitCount + "'" +
            ", length='" + length + "'" +
            ", width='" + width + "'" +
            ", height='" + height + "'" +
            ", totalVolume='" + totalVolume + "'" +
            ", totalWeight='" + totalWeight + "'" +
            ", totalQuantity='" + totalQuantity + "'" +
            ", weightUom='" + weightUom + "'" +
            ", volumeUom='" + volumeUom + "'" +
            ", billingTypeDescription='" + billingTypeDescription + "'" +
            ", billingCode='" + billingCode + "'" +
            ", perPalletQty='" + perPalletQty + "'" +
            ", isPerPallet='" + isPerPallet + "'" +
            ", isDangerousGoods='" + isDangerousGoods + "'" +
            ", status='" + status + "'" +
            ", itemType='" + itemType + "'" +
            ", createdByTemplate='" + createdByTemplate + "'" +
            ", version='" + version + "'" +
            '}';
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingCode == null) ? 0 : billingCode.hashCode());
		result = prime * result + ((billingTypeDescription == null) ? 0 : billingTypeDescription.hashCode());
		result = prime * result + ((createdByTemplate == null) ? 0 : createdByTemplate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((isDangerousGoods == null) ? 0 : isDangerousGoods.hashCode());
		result = prime * result + ((isPerPallet == null) ? 0 : isPerPallet.hashCode());
		result = prime * result + ((itemCount == null) ? 0 : itemCount.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((miscUnitCount == null) ? 0 : miscUnitCount.hashCode());
		result = prime * result + ((perPalletQty == null) ? 0 : perPalletQty.hashCode());
		result = prime * result + ((reference1 == null) ? 0 : reference1.hashCode());
		result = prime * result + ((reference2 == null) ? 0 : reference2.hashCode());
		result = prime * result + ((shipment == null) ? 0 : shipment.hashCode());
		result = prime * result + ((shipmentLineDgs == null) ? 0 : shipmentLineDgs.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((totalQuantity == null) ? 0 : totalQuantity.hashCode());
		result = prime * result + ((totalVolume == null) ? 0 : totalVolume.hashCode());
		result = prime * result + ((totalWeight == null) ? 0 : totalWeight.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + ((volumeUom == null) ? 0 : volumeUom.hashCode());
		result = prime * result + ((weightUom == null) ? 0 : weightUom.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
		result = prime * result + ((seqNo == null) ? 0 : seqNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShipmentLine other = (ShipmentLine) obj;
		if (billingCode == null) {
			if (other.billingCode != null)
				return false;
		} else if (!billingCode.equals(other.billingCode))
			return false;
		if (billingTypeDescription == null) {
			if (other.billingTypeDescription != null)
				return false;
		} else if (!billingTypeDescription.equals(other.billingTypeDescription))
			return false;
		if (createdByTemplate == null) {
			if (other.createdByTemplate != null)
				return false;
		} else if (!createdByTemplate.equals(other.createdByTemplate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (isDangerousGoods == null) {
			if (other.isDangerousGoods != null)
				return false;
		} else if (!isDangerousGoods.equals(other.isDangerousGoods))
			return false;
		if (isPerPallet == null) {
			if (other.isPerPallet != null)
				return false;
		} else if (!isPerPallet.equals(other.isPerPallet))
			return false;
		if (itemCount == null) {
			if (other.itemCount != null)
				return false;
		} else if (!itemCount.equals(other.itemCount))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (miscUnitCount == null) {
			if (other.miscUnitCount != null)
				return false;
		} else if (!miscUnitCount.equals(other.miscUnitCount))
			return false;
		if (perPalletQty == null) {
			if (other.perPalletQty != null)
				return false;
		} else if (!perPalletQty.equals(other.perPalletQty))
			return false;
		if (reference1 == null) {
			if (other.reference1 != null)
				return false;
		} else if (!reference1.equals(other.reference1))
			return false;
		if (reference2 == null) {
			if (other.reference2 != null)
				return false;
		} else if (!reference2.equals(other.reference2))
			return false;
		if (shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!shipment.equals(other.shipment))
			return false;
		if (shipmentLineDgs == null) {
			if (other.shipmentLineDgs != null)
				return false;
		} else if (!shipmentLineDgs.equals(other.shipmentLineDgs))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalQuantity == null) {
			if (other.totalQuantity != null)
				return false;
		} else if (!totalQuantity.equals(other.totalQuantity))
			return false;
		if (totalVolume == null) {
			if (other.totalVolume != null)
				return false;
		} else if (!totalVolume.equals(other.totalVolume))
			return false;
		if (totalWeight == null) {
			if (other.totalWeight != null)
				return false;
		} else if (!totalWeight.equals(other.totalWeight))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (volumeUom == null) {
			if (other.volumeUom != null)
				return false;
		} else if (!volumeUom.equals(other.volumeUom))
			return false;
		if (weightUom == null) {
			if (other.weightUom != null)
				return false;
		} else if (!weightUom.equals(other.weightUom))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		if (seqNo == null) {
			if (other.seqNo != null)
				return false;
		} else if (!seqNo.equals(other.seqNo))
			return false;
		return true;
	}
}

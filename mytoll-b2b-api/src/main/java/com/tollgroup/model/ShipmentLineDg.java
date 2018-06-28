package com.tollgroup.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
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
 * A ShipmentLineDg.
 */
@Entity
@Table(name = "shipment_line_dg")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentLineDg extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipment_line_dg_id")
    private Long id;

    @NotNull
    @Size(max = 20)
    @Column(name = "dg_un_number", length = 20, nullable = false)
    private String dgUnNumber;

    @Size(max = 5)
    @Column(name = "dg_class", length = 5)
    private String dgClass;

    @Column(name = "dg_seq")
    private Integer dgSeq;

    @Size(max = 150)
    @Column(name = "dg_package_description", length = 150)
    private String dgPackageDescription;

    @Size(max = 25)
    @Column(name = "pack_group", length = 25)
    private String packGroup;

    @Size(max = 150)
    @Column(name = "shipping_name", length = 150)
    private String shippingName;

    @Column(name = "dg_weight")
    private Double dgWeight;

    @Size(max = 5)
    @Column(name = "line_dg_weight_uom", length = 5)
    private String lineDgWeightUom;

    @Size(max = 50)
    @Column(name = "technical_name", length = 50)
    private String technicalName;

    @Column(name = "package_qty")
    private Integer packageQty;

    @Size(max = 50)
    @Column(name = "sub_risk", length = 50)
    private String subRisk;

    @Size(max = 160)
    @Column(name = "other_dg_info", length = 160)
    private String otherDgInfo;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipment_line_id")
    private ShipmentLine shipmentLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDgUnNumber() {
        return dgUnNumber;
    }

    public ShipmentLineDg dgUnNumber(String dgUnNumber) {
        this.dgUnNumber = dgUnNumber;
        return this;
    }

    public void setDgUnNumber(String dgUnNumber) {
        this.dgUnNumber = dgUnNumber;
    }

    public String getDgClass() {
        return dgClass;
    }

    public ShipmentLineDg dgClass(String dgClass) {
        this.dgClass = dgClass;
        return this;
    }

    public void setDgClass(String dgClass) {
        this.dgClass = dgClass;
    }

    public Integer getDgSeq() {
        return dgSeq;
    }

    public ShipmentLineDg dgSeq(Integer dgSeq) {
        this.dgSeq = dgSeq;
        return this;
    }

    public void setDgSeq(Integer dgSeq) {
        this.dgSeq = dgSeq;
    }

    public String getDgPackageDescription() {
        return dgPackageDescription;
    }

    public ShipmentLineDg dgPackageDescription(String dgPackageDescription) {
        this.dgPackageDescription = dgPackageDescription;
        return this;
    }

    public void setDgPackageDescription(String dgPackageDescription) {
        this.dgPackageDescription = dgPackageDescription;
    }

    public String getPackGroup() {
        return packGroup;
    }

    public ShipmentLineDg packGroup(String packGroup) {
        this.packGroup = packGroup;
        return this;
    }

    public void setPackGroup(String packGroup) {
        this.packGroup = packGroup;
    }

    public String getShippingName() {
        return shippingName;
    }

    public ShipmentLineDg shippingName(String shippingName) {
        this.shippingName = shippingName;
        return this;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public Double getDgWeight() {
        return dgWeight;
    }

    public ShipmentLineDg dgWeight(Double dgWeight) {
        this.dgWeight = dgWeight;
        return this;
    }

    public void setDgWeight(Double dgWeight) {
        this.dgWeight = dgWeight;
    }

    public String getLineDgWeightUom() {
        return lineDgWeightUom;
    }

    public ShipmentLineDg lineDgWeightUom(String lineDgWeightUom) {
        this.lineDgWeightUom = lineDgWeightUom;
        return this;
    }

    public void setLineDgWeightUom(String lineDgWeightUom) {
        this.lineDgWeightUom = lineDgWeightUom;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public ShipmentLineDg technicalName(String technicalName) {
        this.technicalName = technicalName;
        return this;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public Integer getPackageQty() {
        return packageQty;
    }

    public ShipmentLineDg packageQty(Integer packageQty) {
        this.packageQty = packageQty;
        return this;
    }

    public void setPackageQty(Integer packageQty) {
        this.packageQty = packageQty;
    }

    public String getSubRisk() {
        return subRisk;
    }

    public ShipmentLineDg subRisk(String subRisk) {
        this.subRisk = subRisk;
        return this;
    }

    public void setSubRisk(String subRisk) {
        this.subRisk = subRisk;
    }

    public String getOtherDgInfo() {
        return otherDgInfo;
    }

    public ShipmentLineDg otherDgInfo(String otherDgInfo) {
        this.otherDgInfo = otherDgInfo;
        return this;
    }

    public void setOtherDgInfo(String otherDgInfo) {
        this.otherDgInfo = otherDgInfo;
    }

    public ShipmentLine getShipmentLine() {
        return shipmentLine;
    }

    public ShipmentLineDg shipmentLine(ShipmentLine shipmentLine) {
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
        ShipmentLineDg shipmentLineDg = (ShipmentLineDg) o;
        if(shipmentLineDg.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentLineDg.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ShipmentLineDg{" +
            "id=" + id +
            ", dgUnNumber='" + dgUnNumber + "'" +
            ", dgClass='" + dgClass + "'" +
            ", dgSeq='" + dgSeq + "'" +
            ", dgPackageDescription='" + dgPackageDescription + "'" +
            ", packGroup='" + packGroup + "'" +
            ", shippingName='" + shippingName + "'" +
            ", dgWeight='" + dgWeight + "'" +
            ", lineDgWeightUom='" + lineDgWeightUom + "'" +
            ", technicalName='" + technicalName + "'" +
            ", packageQty='" + packageQty + "'" +
            ", subRisk='" + subRisk + "'" +
            ", otherDgInfo='" + otherDgInfo + "'" +
            '}';
    }
}

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
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ShipmentReferences.
 */
@Entity
@Table(name = "shipment_references")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentReferences extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipment_references_id")
    private Long id;

    @Size(max = 100)
    @Column(name = "reference_value", length = 100)
    private String referenceValue;

    @Size(max = 20)
    @Column(name = "reference_type", length = 20)
    private String referenceType;

    @Column(name = "reference_seq")
    private Integer referenceSeq;

	@ManyToOne/*(cascade = CascadeType.ALL)*/
	@JoinColumn(name = "shipment_id", nullable = false)
	private Shipment shipment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceValue() {
        return referenceValue;
    }

    public ShipmentReferences referenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
        return this;
    }

    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public ShipmentReferences referenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getReferenceSeq() {
        return referenceSeq;
    }

    public ShipmentReferences referenceSeq(Integer referenceSeq) {
        this.referenceSeq = referenceSeq;
        return this;
    }

    public void setReferenceSeq(Integer referenceSeq) {
        this.referenceSeq = referenceSeq;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public ShipmentReferences shipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentReferences shipmentReferences = (ShipmentReferences) o;
        if(shipmentReferences.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentReferences.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ShipmentReferences{" +
            "id=" + id +
            ", referenceValue='" + referenceValue + "'" +
            ", referenceType='" + referenceType + "'" +
            ", referenceSeq='" + referenceSeq + "'" +
            '}';
    }
}

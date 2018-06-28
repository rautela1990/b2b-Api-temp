package com.tollgroup.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ShipmentPallet.
 */
@Entity
@Table(name = "shipment_pallet")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentPallet extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pallet_id")
    private Long id;

    @Column(name = "chep_customer_own_qty")
    private Integer chepCustomerOwnQty;

    @Column(name = "chep_exchange_qty")
    private Integer chepExchangeQty;

    @Column(name = "chep_transfer_to_toll_qty")
    private Integer chepTransferToTollQty;

    @Size(max = 30)
    @Column(name = "chep_docket_no", length = 30)
    private String chepDocketNo;

    @Column(name = "loscam_customer_own_qty")
    private Integer loscamCustomerOwnQty;

    @Column(name = "loscam_exchange_qty")
    private Integer loscamExchangeQty;

    @Column(name = "loscam_transfer_to_toll_qty")
    private Integer loscamTransferToTollQty;

    @Size(max = 30)
    @Column(name = "loscam_docket_no", length = 30)
    private String loscamDocketNo;

    @Column(name = "other_customer_own_qty")
    private Integer otherCustomerOwnQty;

    @Column(name = "chep_other_exchange_qty")
    private Integer chepOtherExchangeQty;

    @Column(name = "chep_other_transfer_to_toll_qty")
    private Integer chepOtherTransferToTollQty;

    @Size(max = 30)
    @Column(name = "chep_other_docket_no", length = 30)
    private String chepOtherDocketNo;

    @Column(name = "loscam_other_exchange_qty")
    private Integer loscamOtherExchangeQty;

    @Column(name = "loscam_other_transfer_to_toll_qty")
    private Integer loscamOtherTransferToTollQty;

    @Size(max = 30)
    @Column(name = "loscam_other_docket", length = 30)
    private String loscamOtherDocket;

    @Size(max = 255)
    @Column(name = "pallet_transaction_type", length = 255)
    private String palletTransactionType;

    @Column(name = "version")
    private Integer version;

	@OneToOne/*(cascade = CascadeType.ALL)*/
	@JoinColumn(name = "shipment_id", nullable = false, unique = true)
	private Shipment shipment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getChepCustomerOwnQty() {
        return chepCustomerOwnQty;
    }

    public ShipmentPallet chepCustomerOwnQty(Integer chepCustomerOwnQty) {
        this.chepCustomerOwnQty = chepCustomerOwnQty;
        return this;
    }

    public void setChepCustomerOwnQty(Integer chepCustomerOwnQty) {
        this.chepCustomerOwnQty = chepCustomerOwnQty;
    }

    public Integer getChepExchangeQty() {
        return chepExchangeQty;
    }

    public ShipmentPallet chepExchangeQty(Integer chepExchangeQty) {
        this.chepExchangeQty = chepExchangeQty;
        return this;
    }

    public void setChepExchangeQty(Integer chepExchangeQty) {
        this.chepExchangeQty = chepExchangeQty;
    }

    public Integer getChepTransferToTollQty() {
        return chepTransferToTollQty;
    }

    public ShipmentPallet chepTransferToTollQty(Integer chepTransferToTollQty) {
        this.chepTransferToTollQty = chepTransferToTollQty;
        return this;
    }

    public void setChepTransferToTollQty(Integer chepTransferToTollQty) {
        this.chepTransferToTollQty = chepTransferToTollQty;
    }

    public String getChepDocketNo() {
        return chepDocketNo;
    }

    public ShipmentPallet chepDocketNo(String chepDocketNo) {
        this.chepDocketNo = chepDocketNo;
        return this;
    }

    public void setChepDocketNo(String chepDocketNo) {
        this.chepDocketNo = chepDocketNo;
    }

    public Integer getLoscamCustomerOwnQty() {
        return loscamCustomerOwnQty;
    }

    public ShipmentPallet loscamCustomerOwnQty(Integer loscamCustomerOwnQty) {
        this.loscamCustomerOwnQty = loscamCustomerOwnQty;
        return this;
    }

    public void setLoscamCustomerOwnQty(Integer loscamCustomerOwnQty) {
        this.loscamCustomerOwnQty = loscamCustomerOwnQty;
    }

    public Integer getLoscamExchangeQty() {
        return loscamExchangeQty;
    }

    public ShipmentPallet loscamExchangeQty(Integer loscamExchangeQty) {
        this.loscamExchangeQty = loscamExchangeQty;
        return this;
    }

    public void setLoscamExchangeQty(Integer loscamExchangeQty) {
        this.loscamExchangeQty = loscamExchangeQty;
    }

    public Integer getLoscamTransferToTollQty() {
        return loscamTransferToTollQty;
    }

    public ShipmentPallet loscamTransferToTollQty(Integer loscamTransferToTollQty) {
        this.loscamTransferToTollQty = loscamTransferToTollQty;
        return this;
    }

    public void setLoscamTransferToTollQty(Integer loscamTransferToTollQty) {
        this.loscamTransferToTollQty = loscamTransferToTollQty;
    }

    public String getLoscamDocketNo() {
        return loscamDocketNo;
    }

    public ShipmentPallet loscamDocketNo(String loscamDocketNo) {
        this.loscamDocketNo = loscamDocketNo;
        return this;
    }

    public void setLoscamDocketNo(String loscamDocketNo) {
        this.loscamDocketNo = loscamDocketNo;
    }

    public Integer getOtherCustomerOwnQty() {
        return otherCustomerOwnQty;
    }

    public ShipmentPallet otherCustomerOwnQty(Integer otherCustomerOwnQty) {
        this.otherCustomerOwnQty = otherCustomerOwnQty;
        return this;
    }

    public void setOtherCustomerOwnQty(Integer otherCustomerOwnQty) {
        this.otherCustomerOwnQty = otherCustomerOwnQty;
    }

    public Integer getChepOtherExchangeQty() {
        return chepOtherExchangeQty;
    }

    public ShipmentPallet chepOtherExchangeQty(Integer chepOtherExchangeQty) {
        this.chepOtherExchangeQty = chepOtherExchangeQty;
        return this;
    }

    public void setChepOtherExchangeQty(Integer chepOtherExchangeQty) {
        this.chepOtherExchangeQty = chepOtherExchangeQty;
    }

    public Integer getChepOtherTransferToTollQty() {
        return chepOtherTransferToTollQty;
    }

    public ShipmentPallet chepOtherTransferToTollQty(Integer chepOtherTransferToTollQty) {
        this.chepOtherTransferToTollQty = chepOtherTransferToTollQty;
        return this;
    }

    public void setChepOtherTransferToTollQty(Integer chepOtherTransferToTollQty) {
        this.chepOtherTransferToTollQty = chepOtherTransferToTollQty;
    }

    public String getChepOtherDocketNo() {
        return chepOtherDocketNo;
    }

    public ShipmentPallet chepOtherDocketNo(String chepOtherDocketNo) {
        this.chepOtherDocketNo = chepOtherDocketNo;
        return this;
    }

    public void setChepOtherDocketNo(String chepOtherDocketNo) {
        this.chepOtherDocketNo = chepOtherDocketNo;
    }

    public Integer getLoscamOtherExchangeQty() {
        return loscamOtherExchangeQty;
    }

    public ShipmentPallet loscamOtherExchangeQty(Integer loscamOtherExchangeQty) {
        this.loscamOtherExchangeQty = loscamOtherExchangeQty;
        return this;
    }

    public void setLoscamOtherExchangeQty(Integer loscamOtherExchangeQty) {
        this.loscamOtherExchangeQty = loscamOtherExchangeQty;
    }

    public Integer getLoscamOtherTransferToTollQty() {
        return loscamOtherTransferToTollQty;
    }

    public ShipmentPallet loscamOtherTransferToTollQty(Integer loscamOtherTransferToTollQty) {
        this.loscamOtherTransferToTollQty = loscamOtherTransferToTollQty;
        return this;
    }

    public void setLoscamOtherTransferToTollQty(Integer loscamOtherTransferToTollQty) {
        this.loscamOtherTransferToTollQty = loscamOtherTransferToTollQty;
    }

    public String getLoscamOtherDocket() {
        return loscamOtherDocket;
    }

    public ShipmentPallet loscamOtherDocket(String loscamOtherDocket) {
        this.loscamOtherDocket = loscamOtherDocket;
        return this;
    }

    public void setLoscamOtherDocket(String loscamOtherDocket) {
        this.loscamOtherDocket = loscamOtherDocket;
    }

    public String getPalletTransactionType() {
    	return palletTransactionType;
    }
    
    public ShipmentPallet palletTransactionType(String palletTransactionType) {
    	this.palletTransactionType = palletTransactionType;
    	return this;
    }
    
    public void setPalletTransactionType(String palletTransactionType) {
    	this.palletTransactionType = palletTransactionType;
    }

    public Integer getVersion() {
        return version;
    }

    public ShipmentPallet version(Integer version) {
        this.version = version;
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public ShipmentPallet shipment(Shipment shipment) {
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
        ShipmentPallet shipmentPallet = (ShipmentPallet) o;
        if(shipmentPallet.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentPallet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ShipmentPallet{" +
            "id=" + id +
            ", chepCustomerOwnQty='" + chepCustomerOwnQty + "'" +
            ", chepExchangeQty='" + chepExchangeQty + "'" +
            ", chepTransferToTollQty='" + chepTransferToTollQty + "'" +
            ", chepDocketNo='" + chepDocketNo + "'" +
            ", loscamCustomerOwnQty='" + loscamCustomerOwnQty + "'" +
            ", loscamExchangeQty='" + loscamExchangeQty + "'" +
            ", loscamTransferToTollQty='" + loscamTransferToTollQty + "'" +
            ", loscamDocketNo='" + loscamDocketNo + "'" +
            ", otherCustomerOwnQty='" + otherCustomerOwnQty + "'" +
            ", chepOtherExchangeQty='" + chepOtherExchangeQty + "'" +
            ", chepOtherTransferToTollQty='" + chepOtherTransferToTollQty + "'" +
            ", chepOtherDocketNo='" + chepOtherDocketNo + "'" +
            ", loscamOtherExchangeQty='" + loscamOtherExchangeQty + "'" +
            ", loscamOtherTransferToTollQty='" + loscamOtherTransferToTollQty + "'" +
            ", loscamOtherDocket='" + loscamOtherDocket + "'" +
            ", palletTransactionType='" + palletTransactionType + "'" +
            ", version='" + version + "'" +
            '}';
    }
}

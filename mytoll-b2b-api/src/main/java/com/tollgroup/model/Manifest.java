package com.tollgroup.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Manifest.
 */
@Entity
@Table(name = "manifest")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Manifest extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "manifest_id")
	private Long id;

    @Size(max = 20)
    @Column(name = "site_id", length = 20)
    private String siteId;

    @Size(max = 255)
    @Column(name = "qr_code", length = 255)
    private String qrCode;

    @Size(max = 20)
    @Column(name = "manifest_number", length = 20)
    private String manifestNumber;

    @Size(max = 255)
    @Column(name = "pickup_booking_number", length = 255)
    private String pickupBookingNumber;

    @Column(name = "pickup_count")
    private Integer pickupCount;

    @Column(name = "customer_code", length = 30)
    private String customerCode;

   
    @Size(max = 20)
    @Column(name = "account_code", length = 20)
    private String accountCode;

    @NotNull
    @Size(max = 35)
    @Column(name = "toll_carrier_name", length = 20, nullable = false)
    private String tollCarrierName;

    @NotNull
    @Size(max = 5)
    @Column(name = "toll_carrier_code", length = 5, nullable = false)
    private String tollCarrierCode;

    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private ShipmentParty senderShipmentParty;

    @NotNull
    @Column(name = "dispatch_date", nullable = false)
    private ZonedDateTime dispatchDate;

    @Size(max = 50)
    @Column(name = "contact_name", length = 50)
    private String contactName;

    @Size(max = 20)
    @Column(name = "contact_phone", length = 20)
    private String contactPhone;

    @Size(max = 50)
    @Column(name = "contact_email", length = 50)
    private String contactEmail;

    @Size(max = 1)
    @Column(name = "manifest_status", length = 1)
    private String manifestStatus;

    @Column(name = "item_count")
    private Integer itemCount;

    @Column(name = "total_volume")
    private Double totalVolume;

    @Column(name = "total_weight")
    private Double totalWeight;

    @Size(max = 1)
    @Column(name = "document_type", length = 1)
    private String documentType;

    @Size(max = 1)
    @Column(name = "document_flow_status", length = 1)
    private String documentFlowStatus;

    @Size(max = 20)
    @Column(name = "origin_depot_code", length = 20)
    private String originDepotCode;

    @Size(max = 40)
    @Column(name = "manifest_name", length = 40)
    private String manifestName;
    
    @Column(name = "is_upload_successful")
    private Integer isUploadSuccessful;

    @Column(name = "upload_attempt_count")
    private Integer uploadAttemptCount;
    
    @OneToMany(mappedBy = "manifest", cascade=CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Shipment> shipments = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public Manifest siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Manifest qrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getManifestNumber() {
        return manifestNumber;
    }

    public Manifest manifestNumber(String manifestNumber) {
        this.manifestNumber = manifestNumber;
        return this;
    }

    public void setManifestNumber(String manifestNumber) {
        this.manifestNumber = manifestNumber;
    }

    public String getPickupBookingNumber() {
        return pickupBookingNumber;
    }

    public Manifest pickupBookingNumber(String pickupBookingNumber) {
        this.pickupBookingNumber = pickupBookingNumber;
        return this;
    }

    public void setPickupBookingNumber(String pickupBookingNumber) {
        this.pickupBookingNumber = pickupBookingNumber;
    }

    public Integer getPickupCount() {
        return pickupCount;
    }

    public Manifest pickupCount(Integer pickupCount) {
        this.pickupCount = pickupCount;
        return this;
    }

    public void setPickupCount(Integer pickupCount) {
        this.pickupCount = pickupCount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public Manifest customerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public Manifest accountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getTollCarrierName() {
        return tollCarrierName;
    }

    public Manifest tollCarrierName(String tollCarrierName) {
        this.tollCarrierName = tollCarrierName;
        return this;
    }

    public void setTollCarrierName(String tollCarrierName) {
        this.tollCarrierName = tollCarrierName;
    }

    public String getTollCarrierCode() {
        return tollCarrierCode;
    }

    public Manifest tollCarrierCode(String tollCarrierCode) {
        this.tollCarrierCode = tollCarrierCode;
        return this;
    }

    public void setTollCarrierCode(String tollCarrierCode) {
        this.tollCarrierCode = tollCarrierCode;
    }

    public ZonedDateTime getDispatchDate() {
        return dispatchDate;
    }

    public Manifest dispatchDate(ZonedDateTime dispatchDate) {
        this.dispatchDate = dispatchDate;
        return this;
    }

    public void setDispatchDate(ZonedDateTime dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getContactName() {
        return contactName;
    }

    public Manifest contactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public Manifest contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public Manifest contactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getManifestStatus() {
        return manifestStatus;
    }

    public Manifest manifestStatus(String manifestStatus) {
        this.manifestStatus = manifestStatus;
        return this;
    }

    public void setManifestStatus(String manifestStatus) {
        this.manifestStatus = manifestStatus;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public Manifest itemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public Manifest totalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public Manifest totalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Manifest documentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentFlowStatus() {
        return documentFlowStatus;
    }

    public Manifest documentFlowStatus(String documentFlowStatus) {
        this.documentFlowStatus = documentFlowStatus;
        return this;
    }

    public void setDocumentFlowStatus(String documentFlowStatus) {
        this.documentFlowStatus = documentFlowStatus;
    }

    public String getOriginDepotCode() {
        return originDepotCode;
    }

    public Manifest originDepotCode(String originDepotCode) {
        this.originDepotCode = originDepotCode;
        return this;
    }

    public void setOriginDepotCode(String originDepotCode) {
        this.originDepotCode = originDepotCode;
    }

    public String getManifestName() {
        return manifestName;
    }

    public Manifest manifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    public Set<Shipment> getShipments() {
        return shipments;
    }

    public Manifest shipments(Set<Shipment> shipments) {
        this.shipments = shipments;
        return this;
    }

    public Manifest addShipment(Shipment shipment) {
        shipments.add(shipment);
        shipment.setManifest(this);
        return this;
    }

    public Manifest removeShipment(Shipment shipment) {
        shipments.remove(shipment);
        shipment.setManifest(null);
        return this;
    }

	public void setShipments(Set<Shipment> shipments) {
        this.shipments = shipments;
    }
	
	public ShipmentParty getSenderShipmentParty() {
        return senderShipmentParty;
    }

    public Manifest senderShipmentParty(ShipmentParty shipmentParty) {
        this.senderShipmentParty = shipmentParty;
        return this;
    }

    public void setSenderShipmentParty(ShipmentParty shipmentParty) {
        this.senderShipmentParty = shipmentParty;
    }
    
    public Integer getIsUploadSuccessful() {
        return isUploadSuccessful;
    }

    public Manifest isUploadSuccessful(Integer isUploadSuccessful) {
        this.isUploadSuccessful = isUploadSuccessful;
        return this;
    }

    public void setIsUploadSuccessful(Integer isUploadSuccessful) {
        this.isUploadSuccessful = isUploadSuccessful;
    }

    public Integer getUploadAttemptCount() {
        return uploadAttemptCount;
    }

    public Manifest uploadAttemptCount(Integer uploadAttemptCount) {
        this.uploadAttemptCount = uploadAttemptCount;
        return this;
    }

    public void setUploadAttemptCount(Integer uploadAttemptCount) {
        this.uploadAttemptCount = uploadAttemptCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Manifest manifest = (Manifest) o;
        if(manifest.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, manifest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Manifest{" +
            "id=" + id +
            ", siteId='" + siteId + "'" +
            ", qrCode='" + qrCode + "'" +
            ", manifestNumber='" + manifestNumber + "'" +
            ", pickupBookingNumber='" + pickupBookingNumber + "'" +
            ", pickupCount='" + pickupCount + "'" +
            ", customerCode='" + customerCode + "'" +
            ", accountCode='" + accountCode + "'" +
            ", tollCarrierName='" + tollCarrierName + "'" +
            ", tollCarrierCode='" + tollCarrierCode + "'" +
            ", dispatchDate='" + dispatchDate + "'" +
            ", contactName='" + contactName + "'" +
            ", contactPhone='" + contactPhone + "'" +
            ", contactEmail='" + contactEmail + "'" +
            ", manifestStatus='" + manifestStatus + "'" +
            ", itemCount='" + itemCount + "'" +
            ", totalVolume='" + totalVolume + "'" +
            ", totalWeight='" + totalWeight + "'" +
            ", isUploadSuccessful='" + isUploadSuccessful + "'" +
            ", uploadAttemptCount='" + uploadAttemptCount + "'" +
            ", documentType='" + documentType + "'" +
            ", documentFlowStatus='" + documentFlowStatus + "'" +
            ", originDepotCode='" + originDepotCode + "'" +
            ", manifestName='" + manifestName + "'" +
            '}';
    }
}

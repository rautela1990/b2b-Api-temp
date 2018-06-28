package com.tollgroup.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ShipmentParty.
 */
@Entity
@Table(name = "shipment_party")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShipmentParty extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "address_id")
    private Long id;

    @Size(max = 80)
    @Column(name = "company_name", length = 80)
    private String companyName;

    @Size(max = 50)
    @Column(name = "party_name", length = 50)
    private String partyName;

    @Size(max = 20)
    @Column(name = "work_phone_number", length = 20)
    private String workPhoneNumber;

    @Size(max = 20)
    @Column(name = "mobile_number", length = 20)
    private String mobileNumber;

    @Size(max = 50)
    @Column(name = "email", length = 50)
    private String email;

    @Size(max = 255)
    @Column(name = "address_line_1", length = 255)
    private String addressLine1;

    @Size(max = 255)
    @Column(name = "address_line_2", length = 255)
    private String addressLine2;

    @Size(max = 15)
    @Column(name = "postcode", length = 15)
    private String postcode;

    @Size(max = 50)
    @Column(name = "suburb", length = 50)
    private String suburb;

    @Size(max = 50)
    @Column(name = "state", length = 50)
    private String state;

    @Size(max = 3)
    @Column(name = "country_code", length = 3)
    private String countryCode;

    @Size(max = 160)
    @Column(name = "address_note", length = 160)
    private String addressNote;

    @Size(max = 20)
    @Column(name = "account_code", length = 20)
    private String accountCode;

    @Size(max = 20)
    @Column(name = "lookup_code", length = 20)
    private String lookupCode;

    @Size(max = 25)
    @Column(name = "business_tax_number", length = 25)
    private String businessTaxNumber;

    @Size(max = 20)
    @Column(name = "latitude", length = 20)
    private String latitude;

    @Size(max = 20)
    @Column(name = "longitude", length = 20)
    private String longitude;

    @Size(max = 20)
    @Column(name = "dp_id", length = 20)
    private String dpId;

    @Size(max = 20)
    @Column(name = "gnaf_pid", length = 20)
    private String gnafPid;

    @Size(max = 20)
    @Column(name = "address_type", length = 20)
    private String addressType;

    @Size(max = 20)
    @Column(name = "avs_confidence_level", length = 20)
    private String avsConfidenceLevel;

    @Size(max = 50)
    @Column(name = "dg_contact_name", length = 50)
    private String dgContactName;

    @Size(max = 20)
    @Column(name = "dg_contact_number", length = 20)
    private String dgContactNumber;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ShipmentParty companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPartyName() {
        return partyName;
    }

    public ShipmentParty partyName(String partyName) {
        this.partyName = partyName;
        return this;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public ShipmentParty workPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
        return this;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public ShipmentParty mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public ShipmentParty email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public ShipmentParty addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public ShipmentParty addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public ShipmentParty postcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSuburb() {
        return suburb;
    }

    public ShipmentParty suburb(String suburb) {
        this.suburb = suburb;
        return this;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public ShipmentParty state(String state) {
        this.state = state;
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public ShipmentParty countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddressNote() {
        return addressNote;
    }

    public ShipmentParty addressNote(String addressNote) {
        this.addressNote = addressNote;
        return this;
    }

    public void setAddressNote(String addressNote) {
        this.addressNote = addressNote;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public ShipmentParty accountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public ShipmentParty lookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
        return this;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getBusinessTaxNumber() {
        return businessTaxNumber;
    }

    public ShipmentParty businessTaxNumber(String businessTaxNumber) {
        this.businessTaxNumber = businessTaxNumber;
        return this;
    }

    public void setBusinessTaxNumber(String businessTaxNumber) {
        this.businessTaxNumber = businessTaxNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public ShipmentParty latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public ShipmentParty longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDpId() {
        return dpId;
    }

    public ShipmentParty dpId(String dpId) {
        this.dpId = dpId;
        return this;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getGnafPid() {
        return gnafPid;
    }

    public ShipmentParty gnafPid(String gnafPid) {
        this.gnafPid = gnafPid;
        return this;
    }

    public void setGnafPid(String gnafPid) {
        this.gnafPid = gnafPid;
    }

    public String getAddressType() {
        return addressType;
    }

    public ShipmentParty addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAvsConfidenceLevel() {
        return avsConfidenceLevel;
    }

    public ShipmentParty avsConfidenceLevel(String avsConfidenceLevel) {
        this.avsConfidenceLevel = avsConfidenceLevel;
        return this;
    }

    public void setAvsConfidenceLevel(String avsConfidenceLevel) {
        this.avsConfidenceLevel = avsConfidenceLevel;
    }

    public String getDgContactName() {
        return dgContactName;
    }

    public ShipmentParty dgContactName(String dgContactName) {
        this.dgContactName = dgContactName;
        return this;
    }

    public void setDgContactName(String dgContactName) {
        this.dgContactName = dgContactName;
    }

    public String getDgContactNumber() {
        return dgContactNumber;
    }

    public ShipmentParty dgContactNumber(String dgContactNumber) {
        this.dgContactNumber = dgContactNumber;
        return this;
    }

    public void setDgContactNumber(String dgContactNumber) {
        this.dgContactNumber = dgContactNumber;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentParty shipmentParty = (ShipmentParty) o;
        if(shipmentParty.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipmentParty.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ShipmentParty{" +
            "id=" + id +
            ", companyName='" + companyName + "'" +
            ", partyName='" + partyName + "'" +
            ", workPhoneNumber='" + workPhoneNumber + "'" +
            ", mobileNumber='" + mobileNumber + "'" +
            ", email='" + email + "'" +
            ", addressLine1='" + addressLine1 + "'" +
            ", addressLine2='" + addressLine2 + "'" +
            ", postcode='" + postcode + "'" +
            ", suburb='" + suburb + "'" +
            ", state='" + state + "'" +
            ", countryCode='" + countryCode + "'" +
            ", addressNote='" + addressNote + "'" +
            ", accountCode='" + accountCode + "'" +
            ", lookupCode='" + lookupCode + "'" +
            ", businessTaxNumber='" + businessTaxNumber + "'" +
            ", latitude='" + latitude + "'" +
            ", longitude='" + longitude + "'" +
            ", dpId='" + dpId + "'" +
            ", gnafPid='" + gnafPid + "'" +
            ", addressType='" + addressType + "'" +
            ", avsConfidenceLevel='" + avsConfidenceLevel + "'" +
            ", dgContactName='" + dgContactName + "'" +
            ", dgContactNumber='" + dgContactNumber + "'" +
            '}';
    }
}
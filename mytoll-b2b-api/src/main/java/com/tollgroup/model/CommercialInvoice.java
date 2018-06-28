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
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A CommercialInvoice.
 */
@Entity
@Table(name = "commercial_invoice")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CommercialInvoice extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commercial_invoice_id")
    private Long id;

    @Size(max = 50)
    @Column(name = "permit_type", length = 50)
    private String permitType;

    @Column(name = "total_packages")
    private Integer totalPackages;

    @Size(max = 3)
    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Size(max = 5)
    @Column(name = "terms_of_trade", length = 1)
    private String termsOfTrade;

    @Size(max = 50)
    @Column(name = "terms_of_trade_description", length = 50)
    private String termsOfTradeDescription;

    @Column(name = "is_hazardous_goods")
    private Integer isHazardousGoods;

    @Size(max = 10)
    @Column(name = "total_weight", length = 10)
    private String totalWeight;

    @Size(max = 20)
    @Column(name = "invoice_number", length = 20)
    private String invoiceNumber;

    @Size(max = 20)
    @Column(name = "total_value", length = 20)
    private String totalValue;

    @Size(max = 50)
    @Column(name = "manufacturer_name", length = 50)
    private String manufacturerName;

    @Size(max = 20)
    @Column(name = "freight_charges", length = 20)
    private String freightCharges;

    @Size(max = 200)
    @Column(name = "reason_for_export", length = 50)
    private String reasonForExport;

    @Size(max = 50)
    @Column(name = "contact_person_position", length = 50)
    private String contactPersonPosition;

    @Size(max = 100)
    @Column(name = "address", length = 100)
    private String address;

    @Size(max = 200)
    @Column(name = "special_instruction", length = 200)
    private String specialInstruction;

    @Column(name = "is_duty_draw_back")
    private Integer isDutyDrawBack;

    @Column(name = "date_of_export")
    private ZonedDateTime dateOfExport;

    @Column(name = "declared_value")
    private Double declaredValue;

    @Column(name = "abn")
    private String abn;
      
    /*@Column(name = " manufacturer_address")
    private String manufacturerAddress;*/
    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipment_id", nullable = false)
    private Shipment shipment;
    
    @OneToMany(mappedBy = "commercialInvoice", cascade = CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<CommercialInvoiceItem> commercialInvoiceItems = new HashSet<>();
        
   /* @Column(name = " totalInvoiceWeight")
    private String totalInvoiceWeight;
    
    @Column(name = " totalInvoiceValue")
    private Double totalInvoiceValue;*/
    

   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermitType() {
        return permitType;
    }

    public CommercialInvoice permitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    public void setPermitType(String permitType) {
        this.permitType = permitType;
    }

    public Integer getTotalPackages() {
        return totalPackages;
    }

    public CommercialInvoice totalPackages(Integer totalPackages) {
        this.totalPackages = totalPackages;
        return this;
    }

    public void setTotalPackages(Integer totalPackages) {
        this.totalPackages = totalPackages;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CommercialInvoice currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTermsOfTrade() {
        return termsOfTrade;
    }

    public CommercialInvoice termsOfTrade(String termsOfTrade) {
        this.termsOfTrade = termsOfTrade;
        return this;
    }

    public void setTermsOfTrade(String termsOfTrade) {
        this.termsOfTrade = termsOfTrade;
    }

    public String getTermsOfTradeDescription() {
        return termsOfTradeDescription;
    }

    public CommercialInvoice termsOfTradeDescription(String termsOfTradeDescription) {
        this.termsOfTradeDescription = termsOfTradeDescription;
        return this;
    }

    public void setTermsOfTradeDescription(String termsOfTradeDescription) {
        this.termsOfTradeDescription = termsOfTradeDescription;
    }

    public Integer getIsHazardousGoods() {
        return isHazardousGoods;
    }

    public CommercialInvoice isHazardousGoods(Integer isHazardousGoods) {
        this.isHazardousGoods = isHazardousGoods;
        return this;
    }

    public void setIsHazardousGoods(Integer isHazardousGoods) {
        this.isHazardousGoods = isHazardousGoods;
    }

    public String getTotalWeight() {
        return totalWeight;
    }

    public CommercialInvoice totalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public CommercialInvoice invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public CommercialInvoice totalValue(String totalValue) {
        this.totalValue = totalValue;
        return this;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public CommercialInvoice manufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getFreightCharges() {
        return freightCharges;
    }

    public CommercialInvoice freightCharges(String freightCharges) {
        this.freightCharges = freightCharges;
        return this;
    }

    public void setFreightCharges(String freightCharges) {
        this.freightCharges = freightCharges;
    }

    public String getReasonForExport() {
        return reasonForExport;
    }

    public CommercialInvoice reasonForExport(String reasonForExport) {
        this.reasonForExport = reasonForExport;
        return this;
    }

    public void setReasonForExport(String reasonForExport) {
        this.reasonForExport = reasonForExport;
    }

    public String getContactPersonPosition() {
        return contactPersonPosition;
    }

    public CommercialInvoice contactPersonPosition(String contactPersonPosition) {
        this.contactPersonPosition = contactPersonPosition;
        return this;
    }

    public void setContactPersonPosition(String contactPersonPosition) {
        this.contactPersonPosition = contactPersonPosition;
    }

    public String getAddress() {
        return address;
    }

    public CommercialInvoice address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public CommercialInvoice specialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
        return this;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public Integer getIsDutyDrawBack() {
        return isDutyDrawBack;
    }

    public CommercialInvoice isDutyDrawBack(Integer isDutyDrawBack) {
        this.isDutyDrawBack = isDutyDrawBack;
        return this;
    }

    public void setIsDutyDrawBack(Integer isDutyDrawBack) {
        this.isDutyDrawBack = isDutyDrawBack;
    }

    public ZonedDateTime getDateOfExport() {
        return dateOfExport;
    }

    public CommercialInvoice dateOfExport(ZonedDateTime dateOfExport) {
        this.dateOfExport = dateOfExport;
        return this;
    }

    public void setDateOfExport(ZonedDateTime dateOfExport) {
        this.dateOfExport = dateOfExport;
    }

    public Double getDeclaredValue() {
        return declaredValue;
    }

    public CommercialInvoice declaredValue(Double declaredValue) {
        this.declaredValue = declaredValue;
        return this;
    }

    public void setDeclaredValue(Double declaredValue) {
        this.declaredValue = declaredValue;
    }

    public String getAbn() {
        return abn;
    }

    public CommercialInvoice abn(String abn) {
        this.abn = abn;
        return this;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }
    
    public Shipment getShipment() {
        return shipment;
    }

    public CommercialInvoice shipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    
    public Set<CommercialInvoiceItem> getCommercialInvoiceItems() {
        return commercialInvoiceItems;
    }

    public CommercialInvoice commercialInvoiceItems(Set<CommercialInvoiceItem> commercialInvoiceItems) {
        this.commercialInvoiceItems = commercialInvoiceItems;
        return this;
    }

    public CommercialInvoice addCommercialInvoiceItem(CommercialInvoiceItem commercialInvoiceItem) {
        commercialInvoiceItems.add(commercialInvoiceItem);
        commercialInvoiceItem.setCommercialInvoice(this);
        return this;
    }

    public CommercialInvoice removeCommercialInvoiceItem(CommercialInvoiceItem commercialInvoiceItem) {
        commercialInvoiceItems.remove(commercialInvoiceItem);
        commercialInvoiceItem.setCommercialInvoice(null);
        return this;
    }

    public void setCommercialInvoiceItems(Set<CommercialInvoiceItem> commercialInvoiceItems) {
        this.commercialInvoiceItems = commercialInvoiceItems;
    }
    
  /*  public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public CommercialInvoice manufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
        return this;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
    */
   /* public String getTotalInvoiceWeight() {
        return totalInvoiceWeight;
    }

    public void setTotalInvoiceWeight(String totalInvoiceWeight) {
        this.totalInvoiceWeight = totalInvoiceWeight;
    }

    public Double getTotalInvoiceValue() {
        return totalInvoiceValue;
    }

    public void settotalInvoiceValue(Double totalInvoiceValue) {
        this.totalInvoiceValue = totalInvoiceValue;
    }*/
    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommercialInvoice commercialInvoice = (CommercialInvoice) o;
        if(commercialInvoice.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, commercialInvoice.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CommercialInvoice{" +
            "id=" + id +
            ", permitType='" + permitType + "'" +
            ", totalPackages='" + totalPackages + "'" +
            ", currencyCode='" + currencyCode + "'" +
            ", termsOfTrade='" + termsOfTrade + "'" +
            ", termsOfTradeDescription='" + termsOfTradeDescription + "'" +
            ", isHazardousGoods='" + isHazardousGoods + "'" +
            ", totalWeight='" + totalWeight + "'" +
            ", invoiceNumber='" + invoiceNumber + "'" +
            ", totalValue='" + totalValue + "'" +
            ", manufacturerName='" + manufacturerName + "'" +
            ", freightCharges='" + freightCharges + "'" +
            ", reasonForExport='" + reasonForExport + "'" +
            ", contactPersonPosition='" + contactPersonPosition + "'" +
            ", address='" + address + "'" +
            ", specialInstruction='" + specialInstruction + "'" +
            ", isDutyDrawBack='" + isDutyDrawBack + "'" +
            ", dateOfExport='" + dateOfExport + "'" +
            ", declaredValue='" + declaredValue + "'" +
            ", abn='" + abn + "'" +
            '}';
    }
}

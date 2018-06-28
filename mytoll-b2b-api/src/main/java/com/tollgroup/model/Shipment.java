package com.tollgroup.model;

import java.io.Serializable;
import java.sql.Time;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OrderBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Shipment.
 */
@Entity
@Table(name = "shipment")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Shipment extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipment_id")
    private Long id;
    
    @Column(name = "enquiry_id")
    private Long enquiryId;
    
    @Size(max = 30)
    @Column(name = "shipment_number", length = 30)
    private String shipmentNumber;

    @NotNull
    @Size(max = 1)
    @Column(name = "status", length = 1, nullable = false)
    private String status;

    @NotNull
    @Column(name = "dispatch_date", nullable = false)
    private ZonedDateTime dispatchDate;
    
    @Column(name = "ready_time")
    private Time readyTime;
    
    @Column(name = "location_closing_time")
    private Time locationClosingTime;
    
	@Size(max = 50)
	@Column(name = "initiator_contact_name", length = 50)
	private String initiatorContactName;

	@Size(max = 20)
	@Column(name = "initiator_phone_no", length = 20)
	private String initiatorPhoneNo;

	@Size(max = 50)
	@Column(name = "initiator_email_id", length = 50)
	private String initiatorEmailId;
    
	@Size(max = 50)
    @Column(name = "trading_number", length = 50)
    private String tradingNumber;
    
    @Size(max = 30)
    @Column(name = "customer_code", length = 30)
    private String customerCode;

    @Column(name = "required_by_delivery_date")
    private ZonedDateTime requiredByDeliveryDate;

    @Size(max = 5)
    @Column(name = "toll_carrier_code", length = 5)
    private String tollCarrierCode;

    @Size(max = 35)
    @Column(name = "toll_carrier_name", length = 35)
    private String tollCarrierName;

    @Size(max = 20)
    @Column(name = "site_id", length = 20)
    private String siteId;

    @Size(max = 15)
    @Column(name = "service_code", length = 15)
    private String serviceCode;

    @Size(max = 35)
    @Column(name = "service_name", length = 35)
    private String serviceName;

    @Size(max = 10)
    @Column(name = "declared_value_currency_code", length = 10)
    private String declaredValueCurrencyCode;

    @Column(name = "declared_value")
    private Double declaredValue;

    @Column(name = "total_charge_amount")
    private Double totalChargeAmount;

    @Size(max = 10)
    @Column(name = "harm_comm_code", length = 10)
    private String harmCommCode;

    @Size(max = 1)
    @Column(name = "charge_to_party_type", length = 1)
    private String chargeToPartyType;

    @Size(max = 20)
    @Column(name = "account_code", length = 20)
    private String accountCode;

    @Size(max = 1)
    @Column(name = "tax_payer", length = 1)
    private String taxPayer;

    @Size(max = 160)
    @Column(name = "special_instruction", length = 160)
    private String specialInstruction;

    @Size(max = 6)
    @Column(name = "temp_range_from", length = 6)
    private String tempRangeFrom;

    @Size(max = 6)
    @Column(name = "temp_range_to", length = 6)
    private String tempRangeTo;

    @Size(max = 20)
    @Column(name = "temperature_type", length = 20)
    private String temperatureType;

    @Size(max = 20)
    @Column(name = "temperature_uom", length = 20)
    private String temperatureUom;

    @Size(max = 6)
    @Column(name = "pickup_temp", length = 6)
    private String pickupTemp;

    @Size(max = 1)
    @Column(name = "document_flow_status", length = 1)
    private String documentFlowStatus;

    @Size(max = 1)
    @Column(name = "document_type", length = 1)
    private String documentType;

    @Size(max = 10)
    @Column(name = "mode", length = 10)
    private String mode;

    @Size(max = 20)
    @Column(name = "quote_no", length = 20)
    private String quoteNo;
    
    @Size(max = 50)
    @Column(name = "sender_email", length = 50)
    private String senderEmail;
    
    @Size(max = 50)
    @Column(name = "receiver_email", length = 50)
    private String receiverEmail;
    
    @Size(max = 50)
    @Column(name = "third_Party_email", length = 50)
    private String thirdPartyEmail;

    @Size(max = 2)
    @Column(name = "type_of_export", length = 2)
    private String typeOfExport;

    @Size(max = 255)
    @Column(name = "full_bar_code", length = 255)
    private String fullBarCode;

    @Size(max = 255)
    @Column(name = "semi_bar_code", length = 255)
    private String semiBarCode;

    @Size(max = 25)
    @Column(name = "hazardous_type", length = 25)
    private String hazardousType;

    @Size(max = 20)
    @Column(name = "third_party_contact_number", length = 20)
    private String thirdPartyContactNumber;

    @Size(max = 50)
    @Column(name = "third_party_contact_name", length = 50)
    private String thirdPartyContactName;

    @Size(max = 20)
    @Column(name = "shipment_source", length = 20)
    private String shipmentSource;

    @Column(name = "is_receive_sms")
    private Integer isReceiveSms;
    
    @Column(name = "is_sender_notify")
    private Integer isSenderNotify;
    
    @Column(name = "is_receiver_notify")
    private Integer isReceiverNotify;
    
    @Column(name = "is_thirdparty_notify")
    private Integer isThirdpartyNotify;

    @Size(max = 20)
    @Column(name = "sms_mobile_number", length = 20)
    private String smsMobileNumber;

    @Size(max = 6)
    @Column(name = "delivered_in_depot_code", length = 6)
    private String deliveredInDepotCode;
    
    @Size(max = 50)
    @Column(name = "delivered_in_depot_name", length = 50)
    private String deliveredInDepotName;

    @Size(max = 6)
    @Column(name = "hold_in_depot_code", length = 6)
    private String holdInDepotCode;
    
    @Size(max = 50)
    @Column(name = "hold_in_depot_name", length = 50)
    private String holdInDepotName;

    @Column(name = "is_extra_service")
    private Integer isExtraService;

    @Column(name = "extra_service_value")
    private Double extraServiceValue;

    @Size(max = 5)
    @Column(name = "extra_service_currency", length = 5)
    private String extraServiceCurrency;

    @Column(name = "total_volume")
    private Double totalVolume;

    @Column(name = "total_quantity")
    private Double totalQuantity;

    @Column(name = "total_weight")
    private Double totalWeight;

    @Column(name = "is_food")
    private Integer isFood;

    @Column(name = "is_alternate_delivery")
    private Integer isAlternateDelivery;

    @Column(name = "is_authority_to_leave")
    private Integer isAuthorityToLeave;

    @Column(name = "is_security")
    private Integer isSecurity;

    @Column(name = "is_upload_successful")
    private Integer isUploadSuccessful;

    @Column(name = "upload_attempt_count")
    private Integer uploadAttemptCount;
    
    @Size(max = 10)
    @Column(name = "terminal_code", length = 10)
    private String terminalCode;
    
    @Size(max = 30)
    @Column(name = "dem_shipment_id", length = 30)
    private String demShipmentId;
    
    @Size(max = 5)
    @Column(name = "service_mrtc_code", length = 5)
    private String serviceMrtcCode;
    
    @Column(name = "version")
    private Integer version;
    
    @Size(max = 35)
    @Column(name = "source_system_id", length = 35)
    private String sourceSystemId;

    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "manifest_id")
    private Manifest manifest;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payer_address_id", referencedColumnName = "address_id")
    private ShipmentParty payerShipmentParty;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sender_address_id", referencedColumnName = "address_id")
    private ShipmentParty senderShipmentParty;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiver_address_id", referencedColumnName = "address_id")
    private ShipmentParty receiverShipmentParty;

    @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @OrderBy(clause = "seq_no")
    private Set<ShipmentLine> shipmentLines = new HashSet<>();

    @OneToMany(mappedBy = "shipment", cascade = CascadeType.REMOVE, orphanRemoval=true)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ShipmentReferences> shipmentReferences = new HashSet<>();

	@OneToOne(mappedBy = "shipment", cascade = CascadeType.ALL)
	@JsonIgnore
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	private ShipmentPallet shipmentPallet;
    
    /*@OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ShipmentTransmissionLog> shipmentTransmissionLogs = new HashSet<>();*/
    
    @OneToOne(mappedBy = "shipment", cascade = CascadeType.ALL)
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private CommercialInvoice commercialInvoice = null;
	

	public CommercialInvoice getCommercialInvoice() {
		return commercialInvoice;
	}

	public void setCommercialInvoice(CommercialInvoice commercialInvoice) {
		this.commercialInvoice = commercialInvoice;
	}
	
	public Time getReadyTime() {
		return readyTime;
	}

	public void setReadyTime(Time readyTime) {
		this.readyTime = readyTime;
	}

	public Time getLocationClosingTime() {
		return locationClosingTime;
	}

	public void setLocationClosingTime(Time locationClosingTime) {
		this.locationClosingTime = locationClosingTime;
	}

	public String getInitiatorContactName() {
		return initiatorContactName;
	}

	public void setInitiatorContactName(String initiatorContactName) {
		this.initiatorContactName = initiatorContactName;
	}

	public String getInitiatorPhoneNo() {
		return initiatorPhoneNo;
	}

	public void setInitiatorPhoneNo(String initiatorPhoneNo) {
		this.initiatorPhoneNo = initiatorPhoneNo;
	}

	public String getInitiatorEmailId() {
		return initiatorEmailId;
	}

	public void setInitiatorEmailId(String initiatorEmailId) {
		this.initiatorEmailId = initiatorEmailId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public Shipment shipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
        return this;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getStatus() {
        return status;
    }

    public Shipment status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ZonedDateTime getDispatchDate() {
        return dispatchDate;
    }

    public Shipment dispatchDate(ZonedDateTime dispatchDate) {
        this.dispatchDate = dispatchDate;
        return this;
    }

    public void setDispatchDate(ZonedDateTime dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getTradingNumber() {
        return tradingNumber;
    }

    public Shipment tradingNumber(String tradingNumber) {
        this.tradingNumber = tradingNumber;
        return this;
    }

    public void setTradingNumber(String tradingNumber) {
        this.tradingNumber = tradingNumber;
    }
    
    public String getCustomerCode() {
        return customerCode;
    }

    public Shipment customerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public ZonedDateTime getRequiredByDeliveryDate() {
        return requiredByDeliveryDate;
    }

    public Shipment requiredByDeliveryDate(ZonedDateTime requiredByDeliveryDate) {
        this.requiredByDeliveryDate = requiredByDeliveryDate;
        return this;
    }

    public void setRequiredByDeliveryDate(ZonedDateTime requiredByDeliveryDate) {
        this.requiredByDeliveryDate = requiredByDeliveryDate;
    }

    public String getTollCarrierCode() {
        return tollCarrierCode;
    }

    public Shipment tollCarrierCode(String tollCarrierCode) {
        this.tollCarrierCode = tollCarrierCode;
        return this;
    }

    public void setTollCarrierCode(String tollCarrierCode) {
        this.tollCarrierCode = tollCarrierCode;
    }

    public String getTollCarrierName() {
        return tollCarrierName;
    }

    public Shipment tollCarrierName(String tollCarrierName) {
        this.tollCarrierName = tollCarrierName;
        return this;
    }

    public void setTollCarrierName(String tollCarrierName) {
        this.tollCarrierName = tollCarrierName;
    }

    public String getSiteId() {
        return siteId;
    }

    public Shipment siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public Shipment serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Shipment serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDeclaredValueCurrencyCode() {
        return declaredValueCurrencyCode;
    }

    public Shipment declaredValueCurrencyCode(String declaredValueCurrencyCode) {
        this.declaredValueCurrencyCode = declaredValueCurrencyCode;
        return this;
    }

    public void setDeclaredValueCurrencyCode(String declaredValueCurrencyCode) {
        this.declaredValueCurrencyCode = declaredValueCurrencyCode;
    }

    public Double getDeclaredValue() {
        return declaredValue;
    }

    public Shipment declaredValue(Double declaredValue) {
        this.declaredValue = declaredValue;
        return this;
    }

    public void setDeclaredValue(Double declaredValue) {
        this.declaredValue = declaredValue;
    }

    public Double getTotalChargeAmount() {
        return totalChargeAmount;
    }

    public Shipment totalChargeAmount(Double totalChargeAmount) {
        this.totalChargeAmount = totalChargeAmount;
        return this;
    }

    public void setTotalChargeAmount(Double totalChargeAmount) {
        this.totalChargeAmount = totalChargeAmount;
    }

    public String getHarmCommCode() {
        return harmCommCode;
    }

    public Shipment harmCommCode(String harmCommCode) {
        this.harmCommCode = harmCommCode;
        return this;
    }

    public void setHarmCommCode(String harmCommCode) {
        this.harmCommCode = harmCommCode;
    }

    public String getChargeToPartyType() {
        return chargeToPartyType;
    }

    public Shipment chargeToPartyType(String chargeToPartyType) {
        this.chargeToPartyType = chargeToPartyType;
        return this;
    }

    public void setChargeToPartyType(String chargeToPartyType) {
        this.chargeToPartyType = chargeToPartyType;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public Shipment accountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getTaxPayer() {
        return taxPayer;
    }

    public Shipment taxPayer(String taxPayer) {
        this.taxPayer = taxPayer;
        return this;
    }

    public void setTaxPayer(String taxPayer) {
        this.taxPayer = taxPayer;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public Shipment specialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
        return this;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public String getTempRangeFrom() {
        return tempRangeFrom;
    }

    public Shipment tempRangeFrom(String tempRangeFrom) {
        this.tempRangeFrom = tempRangeFrom;
        return this;
    }

    public void setTempRangeFrom(String tempRangeFrom) {
        this.tempRangeFrom = tempRangeFrom;
    }

    public String getTempRangeTo() {
        return tempRangeTo;
    }

    public Shipment tempRangeTo(String tempRangeTo) {
        this.tempRangeTo = tempRangeTo;
        return this;
    }

    public void setTempRangeTo(String tempRangeTo) {
        this.tempRangeTo = tempRangeTo;
    }

    public String getTemperatureType() {
        return temperatureType;
    }

    public Shipment temperatureType(String temperatureType) {
        this.temperatureType = temperatureType;
        return this;
    }

    public void setTemperatureType(String temperatureType) {
        this.temperatureType = temperatureType;
    }

    public String getTemperatureUom() {
        return temperatureUom;
    }

    public Shipment temperatureUom(String temperatureUom) {
        this.temperatureUom = temperatureUom;
        return this;
    }

    public void setTemperatureUom(String temperatureUom) {
        this.temperatureUom = temperatureUom;
    }

    public String getPickupTemp() {
        return pickupTemp;
    }

    public Shipment pickupTemp(String pickupTemp) {
        this.pickupTemp = pickupTemp;
        return this;
    }

    public void setPickupTemp(String pickupTemp) {
        this.pickupTemp = pickupTemp;
    }

    public String getDocumentFlowStatus() {
        return documentFlowStatus;
    }

    public Shipment documentFlowStatus(String documentFlowStatus) {
        this.documentFlowStatus = documentFlowStatus;
        return this;
    }

    public void setDocumentFlowStatus(String documentFlowStatus) {
        this.documentFlowStatus = documentFlowStatus;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Shipment documentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getMode() {
        return mode;
    }

    public Shipment mode(String mode) {
        this.mode = mode;
        return this;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public Shipment quoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
        return this;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    public String getTypeOfExport() {
        return typeOfExport;
    }

    public Shipment typeOfExport(String typeOfExport) {
        this.typeOfExport = typeOfExport;
        return this;
    }

    public void setTypeOfExport(String typeOfExport) {
        this.typeOfExport = typeOfExport;
    }
    
    public String getThirdPartyEmail() {
    	return thirdPartyEmail;
    }
    
    public Shipment thirdPartyEmail(String thirdPartyEmail) {
    	this.thirdPartyEmail = thirdPartyEmail;
    	return this;
    }
    
    public void setThirdPartyEmail(String thirdPartyEmail) {
    	this.thirdPartyEmail = thirdPartyEmail;
    }
    
    public String getReceiverEmail() {
    	return receiverEmail;
    }
    
    public Shipment receiverEmail(String receiverEmail) {
    	this.receiverEmail = receiverEmail;
    	return this;
    }
    
    public void setReceiverEmail(String receiverEmail) {
    	this.receiverEmail = receiverEmail;
    }
    
    public String getSenderEmail() {
    	return senderEmail;
    }
    
    public Shipment senderEmail(String senderEmail) {
    	this.senderEmail = senderEmail;
    	return this;
    }
    
    public void setSenderEmail(String senderEmail) {
    	this.senderEmail = senderEmail;
    }

    public String getFullBarCode() {
        return fullBarCode;
    }

    public Shipment fullBarCode(String fullBarCode) {
        this.fullBarCode = fullBarCode;
        return this;
    }

    public void setFullBarCode(String fullBarCode) {
        this.fullBarCode = fullBarCode;
    }

    public String getSemiBarCode() {
        return semiBarCode;
    }

    public Shipment semiBarCode(String semiBarCode) {
        this.semiBarCode = semiBarCode;
        return this;
    }

    public void setSemiBarCode(String semiBarCode) {
        this.semiBarCode = semiBarCode;
    }

    public String getHazardousType() {
        return hazardousType;
    }

    public Shipment hazardousType(String hazardousType) {
        this.hazardousType = hazardousType;
        return this;
    }

    public void setHazardousType(String hazardousType) {
        this.hazardousType = hazardousType;
    }

    public String getThirdPartyContactNumber() {
        return thirdPartyContactNumber;
    }

    public Shipment thirdPartyContactNumber(String thirdPartyContactNumber) {
        this.thirdPartyContactNumber = thirdPartyContactNumber;
        return this;
    }

    public void setThirdPartyContactNumber(String thirdPartyContactNumber) {
        this.thirdPartyContactNumber = thirdPartyContactNumber;
    }

    public String getThirdPartyContactName() {
        return thirdPartyContactName;
    }

    public Shipment thirdPartyContactName(String thirdPartyContactName) {
        this.thirdPartyContactName = thirdPartyContactName;
        return this;
    }

    public void setThirdPartyContactName(String thirdPartyContactName) {
        this.thirdPartyContactName = thirdPartyContactName;
    }

    public String getShipmentSource() {
        return shipmentSource;
    }

    public Shipment shipmentSource(String shipmentSource) {
        this.shipmentSource = shipmentSource;
        return this;
    }

    public void setShipmentSource(String shipmentSource) {
        this.shipmentSource = shipmentSource;
    }

    public Integer getIsReceiverNotify() {
        return isReceiverNotify;
    }

    public Shipment isReceiverNotify(Integer isReceiverNotify) {
        this.isReceiverNotify = isReceiverNotify;
        return this;
    }

    public void setIsReceiverNotify(Integer isReceiverNotify) {
        this.isReceiverNotify = isReceiverNotify;
    }
    
    public Integer getIsSenderNotify() {
    	return isSenderNotify;
    }
    
    public Shipment isSenderNotify(Integer isSenderNotify) {
    	this.isSenderNotify = isSenderNotify;
    	return this;
    }
    
    public void setIsSenderNotify(Integer isSenderNotify) {
    	this.isSenderNotify = isSenderNotify;
    }
    
    public Integer getIsThirdpartyNotify() {
    	return isThirdpartyNotify;
    }
    
    public Shipment isThirdpartyNotify(Integer isThirdpartyNotify) {
    	this.isThirdpartyNotify = isThirdpartyNotify;
    	return this;
    }
    
    public void setIsThirdpartyNotify(Integer isThirdpartyNotify) {
    	this.isThirdpartyNotify = isThirdpartyNotify;
    }
    
    public Integer getIsReceiveSms() {
        return isReceiveSms;
    }

    public Shipment isReceiveSms(Integer isReceiveSms) {
        this.isReceiveSms = isReceiveSms;
        return this;
    }

    public void setIsReceiveSms(Integer isReceiveSms) {
        this.isReceiveSms = isReceiveSms;
    }

    public String getSmsMobileNumber() {
        return smsMobileNumber;
    }

    public Shipment smsMobileNumber(String smsMobileNumber) {
        this.smsMobileNumber = smsMobileNumber;
        return this;
    }

    public void setSmsMobileNumber(String smsMobileNumber) {
        this.smsMobileNumber = smsMobileNumber;
    }

    public String getDeliveredInDepotCode() {
        return deliveredInDepotCode;
    }

    public Shipment deliveredInDepotCode(String deliveredInDepotCode) {
        this.deliveredInDepotCode = deliveredInDepotCode;
        return this;
    }

    public void setDeliveredInDepotCode(String deliveredInDepotCode) {
        this.deliveredInDepotCode = deliveredInDepotCode;
    }
    
    public String getDeliveredInDepotName() {
    	return deliveredInDepotName;
    }
    
    public Shipment deliveredInDepotName(String deliveredInDepotName) {
    	this.deliveredInDepotName = deliveredInDepotName;
    	return this;
    }
    
    public void setDeliveredInDepotName(String deliveredInDepotName) {
    	this.deliveredInDepotName = deliveredInDepotName;
    }

    public String getHoldInDepotCode() {
        return holdInDepotCode;
    }

    public Shipment holdInDepotCode(String holdInDepotCode) {
        this.holdInDepotCode = holdInDepotCode;
        return this;
    }

    public void setHoldInDepotCode(String holdInDepotCode) {
        this.holdInDepotCode = holdInDepotCode;
    }
    
    public String getHoldInDepotName() {
    	return holdInDepotName;
    }
    
    public Shipment holdInDepotName(String holdInDepotName) {
    	this.holdInDepotName = holdInDepotName;
    	return this;
    }
    
    public void setHoldInDepotName(String holdInDepotName) {
    	this.holdInDepotName = holdInDepotName;
    }

    public Integer getIsExtraService() {
        return isExtraService;
    }

    public Shipment isExtraService(Integer isExtraService) {
        this.isExtraService = isExtraService;
        return this;
    }

    public void setIsExtraService(Integer isExtraService) {
        this.isExtraService = isExtraService;
    }

    public Double getExtraServiceValue() {
        return extraServiceValue;
    }

    public Shipment extraServiceValue(Double extraServiceValue) {
        this.extraServiceValue = extraServiceValue;
        return this;
    }

    public void setExtraServiceValue(Double extraServiceValue) {
        this.extraServiceValue = extraServiceValue;
    }

    public String getExtraServiceCurrency() {
        return extraServiceCurrency;
    }

    public Shipment extraServiceCurrency(String extraServiceCurrency) {
        this.extraServiceCurrency = extraServiceCurrency;
        return this;
    }

    public void setExtraServiceCurrency(String extraServiceCurrency) {
        this.extraServiceCurrency = extraServiceCurrency;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public Shipment totalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Double getTotalQuantity() {
        return totalQuantity;
    }

    public Shipment totalQuantity(Double totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    public void setTotalQuantity(Double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public Shipment totalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getIsFood() {
        return isFood;
    }

    public Shipment isFood(Integer isFood) {
        this.isFood = isFood;
        return this;
    }

    public void setIsFood(Integer isFood) {
        this.isFood = isFood;
    }

    public Integer getIsAlternateDelivery() {
        return isAlternateDelivery;
    }

    public Shipment isAlternateDelivery(Integer isAlternateDelivery) {
        this.isAlternateDelivery = isAlternateDelivery;
        return this;
    }

    public void setIsAlternateDelivery(Integer isAlternateDelivery) {
        this.isAlternateDelivery = isAlternateDelivery;
    }

    public Integer getIsAuthorityToLeave() {
        return isAuthorityToLeave;
    }

    public Shipment isAuthorityToLeave(Integer isAuthorityToLeave) {
        this.isAuthorityToLeave = isAuthorityToLeave;
        return this;
    }

    public void setIsAuthorityToLeave(Integer isAuthorityToLeave) {
        this.isAuthorityToLeave = isAuthorityToLeave;
    }

    public Integer getIsSecurity() {
        return isSecurity;
    }

    public Shipment isSecurity(Integer isSecurity) {
        this.isSecurity = isSecurity;
        return this;
    }

    public void setIsSecurity(Integer isSecurity) {
        this.isSecurity = isSecurity;
    }

    public Integer getIsUploadSuccessful() {
        return isUploadSuccessful;
    }

    public Shipment isUploadSuccessful(Integer isUploadSuccessful) {
        this.isUploadSuccessful = isUploadSuccessful;
        return this;
    }

    public void setIsUploadSuccessful(Integer isUploadSuccessful) {
        this.isUploadSuccessful = isUploadSuccessful;
    }

    public Integer getUploadAttemptCount() {
        return uploadAttemptCount;
    }

    public Shipment uploadAttemptCount(Integer uploadAttemptCount) {
        this.uploadAttemptCount = uploadAttemptCount;
        return this;
    }

    public void setUploadAttemptCount(Integer uploadAttemptCount) {
        this.uploadAttemptCount = uploadAttemptCount;
    }

    public Integer getVersion() {
        return version;
    }

    public Shipment version(Integer version) {
        this.version = version;
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Manifest getManifest() {
        return manifest;
    }

    public Shipment manifest(Manifest manifest) {
        this.manifest = manifest;
        return this;
    }

    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }

    public ShipmentParty getPayerShipmentParty() {
        return payerShipmentParty;
    }

    public Shipment payerShipmentParty(ShipmentParty shipmentParty) {
        this.payerShipmentParty = shipmentParty;
        return this;
    }

    public void setPayerShipmentParty(ShipmentParty shipmentParty) {
        this.payerShipmentParty = shipmentParty;
    }

    public ShipmentParty getSenderShipmentParty() {
        return senderShipmentParty;
    }

    public Shipment senderShipmentParty(ShipmentParty shipmentParty) {
        this.senderShipmentParty = shipmentParty;
        return this;
    }

    public void setSenderShipmentParty(ShipmentParty shipmentParty) {
        this.senderShipmentParty = shipmentParty;
    }

    public ShipmentParty getReceiverShipmentParty() {
        return receiverShipmentParty;
    }

    public Shipment receiverShipmentParty(ShipmentParty shipmentParty) {
        this.receiverShipmentParty = shipmentParty;
        return this;
    }

    public void setReceiverShipmentParty(ShipmentParty shipmentParty) {
        this.receiverShipmentParty = shipmentParty;
    }

    public Set<ShipmentLine> getShipmentLines() {
        return shipmentLines;
    }

    public Shipment shipmentLines(Set<ShipmentLine> shipmentLines) {
        this.shipmentLines = shipmentLines;
        return this;
    }

    public Shipment addShipmentLine(ShipmentLine shipmentLine) {
        shipmentLines.add(shipmentLine);
        shipmentLine.setShipment(this);
        return this;
    }

    public Shipment removeShipmentLine(ShipmentLine shipmentLine) {
        shipmentLines.remove(shipmentLine);
        shipmentLine.setShipment(null);
        return this;
    }

    public void setShipmentLines(Set<ShipmentLine> shipmentLines) {
        this.shipmentLines = shipmentLines;
    }

    public Set<ShipmentReferences> getShipmentReferences() {
        return shipmentReferences;
    }

    public Shipment shipmentReferences(Set<ShipmentReferences> shipmentReferences) {
        this.shipmentReferences = shipmentReferences;
        return this;
    }

    public void setShipmentReferences(Set<ShipmentReferences> shipmentReferences) {
        this.shipmentReferences = shipmentReferences;
    }

    public ShipmentPallet getShipmentPallet() {
        return shipmentPallet;
    }

    public Shipment shipmentPallet(ShipmentPallet shipmentPallet) {
        this.shipmentPallet = shipmentPallet;
        return this;
    }

    public void setShipmentPallet(ShipmentPallet shipmentPallet) {
        this.shipmentPallet = shipmentPallet;
    }
    
  /*  public Set<ShipmentTransmissionLog> getShipmentTransmissionLogs() {
		return shipmentTransmissionLogs;
	}
    
    public Shipment shipmentTransmissionLogs(Set<ShipmentTransmissionLog> shipmentTransmissionLogs) {
        this.shipmentTransmissionLogs = shipmentTransmissionLogs;
        return this;
    }

	public void setShipmentTransmissionLogs(Set<ShipmentTransmissionLog> shipmentTransmissionLogs) {
		this.shipmentTransmissionLogs = shipmentTransmissionLogs;
	}*/
    
    public String getTerminalCode() {
        return terminalCode;
    }

    public Shipment terminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
        return this;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }
    
    public String getDemShipmentId() {
    	return demShipmentId;
    }
    
    public Shipment demShipmentId(String demShipmentId) {
    	this.demShipmentId = demShipmentId;
    	return this;
    }
    
    public void setDemShipmentId(String demShipmentId) {
    	this.demShipmentId = demShipmentId;
    }
    
    public String getServiceMrtcCode() {
    	return serviceMrtcCode;
    }
    
    public Shipment serviceMrtcCode(String serviceMrtcCode) {
    	this.serviceMrtcCode = serviceMrtcCode;
    	return this;
    }
    
    public void setServiceMrtcCode(String serviceMrtcCode) {
    	this.serviceMrtcCode = serviceMrtcCode;
    }
    
    public String getSourceSystemId() {
    	return sourceSystemId;
    }
    
    public Shipment sourceSystemId(String sourceSystemId) {
    	this.sourceSystemId = sourceSystemId;
    	return this;
    }
    
    public void setSourceSystemId(String sourceSystemId) {
    	this.sourceSystemId = sourceSystemId;
    }
    
    
    public Long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shipment shipment = (Shipment) o;
        if(shipment.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, shipment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Shipment{" +
            "id=" + id +
            ", shipmentNumber='" + shipmentNumber + "'" +
            ", status='" + status + "'" +
            ", dispatchDate='" + dispatchDate + "'" +
            ", tradingNumber='" + tradingNumber + "'" +
            ", requiredByDeliveryDate='" + requiredByDeliveryDate + "'" +
            ", tollCarrierCode='" + tollCarrierCode + "'" +
            ", tollCarrierName='" + tollCarrierName + "'" +
            ", siteId='" + siteId + "'" +
            ", serviceCode='" + serviceCode + "'" +
            ", serviceName='" + serviceName + "'" +
            ", declaredValueCurrencyCode='" + declaredValueCurrencyCode + "'" +
            ", declaredValue='" + declaredValue + "'" +
            ", totalChargeAmount='" + totalChargeAmount + "'" +
            ", enquiryId='" + enquiryId + "'" +
            ", harmCommCode='" + harmCommCode + "'" +
            ", chargeToPartyType='" + chargeToPartyType + "'" +
            ", accountCode='" + accountCode + "'" +
            ", taxPayer='" + taxPayer + "'" +
            ", specialInstruction='" + specialInstruction + "'" +
            ", tempRangeFrom='" + tempRangeFrom + "'" +
            ", tempRangeTo='" + tempRangeTo + "'" +
            ", temperatureType='" + temperatureType + "'" +
            ", temperatureUom='" + temperatureUom + "'" +
            ", pickupTemp='" + pickupTemp + "'" +
            ", documentFlowStatus='" + documentFlowStatus + "'" +
            ", documentType='" + documentType + "'" +
            ", mode='" + mode + "'" +
            ", quoteNo='" + quoteNo + "'" +
            ", typeOfExport='" + typeOfExport + "'" +
            ", fullBarCode='" + fullBarCode + "'" +
            ", semiBarCode='" + semiBarCode + "'" +
            ", hazardousType='" + hazardousType + "'" +
            ", thirdPartyContactNumber='" + thirdPartyContactNumber + "'" +
            ", thirdPartyContactName='" + thirdPartyContactName + "'" +
            ", shipmentSource='" + shipmentSource + "'" +
            ", isReceiveSms='" + isReceiveSms + "'" +
            ", isSenderNotify='" + isSenderNotify + "'" +
            ", isReceiverNotify='" + isReceiverNotify + "'" +
            ", smsMobileNumber='" + smsMobileNumber + "'" +
            ", deliveredInDepotCode='" + deliveredInDepotCode + "'" +
            ", deliveredInDepotName='" + deliveredInDepotName + "'" +
            ", holdInDepotCode='" + holdInDepotCode + "'" +
            ", holdInDepotName='" + holdInDepotName + "'" +
            ", isExtraService='" + isExtraService + "'" +
            ", extraServiceValue='" + extraServiceValue + "'" +
            ", extraServiceCurrency='" + extraServiceCurrency + "'" +
            ", totalVolume='" + totalVolume + "'" +
            ", totalQuantity='" + totalQuantity + "'" +
            ", totalWeight='" + totalWeight + "'" +
            ", isFood='" + isFood + "'" +
            ", isAlternateDelivery='" + isAlternateDelivery + "'" +
            ", isAuthorityToLeave='" + isAuthorityToLeave + "'" +
            ", isSecurity='" + isSecurity + "'" +
            ", isUploadSuccessful='" + isUploadSuccessful + "'" +
            ", uploadAttemptCount='" + uploadAttemptCount + "'" +
            ", demShipmentId='" + demShipmentId + "'" +
            ", serviceMrtcCode='" + serviceMrtcCode + "'" +
            ", sourceSystemId='" + sourceSystemId + "'" +
            ", terminalCode='" + terminalCode + "'" +
            ", version='" + version + "'" +
            ", customerCode='" + customerCode + "'" +
            ", senderEmail='" + senderEmail + "'" +
            ", receiverEmail='" + receiverEmail + "'" +
            ", thirdPartyEmail='" + thirdPartyEmail + "'" +
            ", isThirdpartyNotify='" + isThirdpartyNotify + "'" +
            ", isThirdpartyNotify='" + readyTime + "'" +
            ", isThirdpartyNotify='" + locationClosingTime + "'" +
            ", isThirdpartyNotify='" + initiatorContactName + "'" +
            ", isThirdpartyNotify='" + initiatorPhoneNo + "'" +
            ", isThirdpartyNotify='" + initiatorEmailId + "'" +
            '}';
    }
}

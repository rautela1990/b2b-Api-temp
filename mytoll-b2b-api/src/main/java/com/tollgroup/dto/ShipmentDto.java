package com.tollgroup.dto;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class ShipmentDto {
	@JsonProperty("shipmentId")
	private Long shipmentId = null;

	@JsonProperty("shipmentNumber")
	private String shipmentNumber = null;

	@JsonProperty("enquiryId")
	private long enquiryId;
	
	@JsonProperty("manifestId")
	private Long manifestId = null;
	
	@JsonProperty("manifestStatus")
	private String manifestStatus = null;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("manifestLastModifiedDate")
	private LocalDate manifestLastModifiedDate = null;

	@JsonProperty("customerCode")
	private String customerCode = null;
	
	@JsonProperty("documentFlowStatus")
	private String documentFlowStatus = null;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("dispatchDate")
	private LocalDate dispatchDate = null;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("requiredByDeliveryDate")
	private LocalDate requiredByDeliveryDate = null;

	@NotNull
	@JsonProperty("tollCarrierCode")
	private String tollCarrierCode = null;

	@NotNull
	@JsonProperty("tollCarrierName")
	private String tollCarrierName = null;

	//@NotNull
	@JsonProperty("serviceCode")
	private String serviceCode = null;

	//@NotNull
	@JsonProperty("serviceName")
	private String serviceName = null;

	@JsonProperty("mode")
	private String mode = null;
	
	@JsonProperty("senderEmail")
	private String senderEmail = null;
	
	@JsonProperty("receiverEmail")
	private String receiverEmail = null;
	
	@JsonProperty("thirdPartyEmail")
	private String thirdPartyEmail = null;

	//@NotNull
	//@Length(max = 20)
	@JsonProperty("accountCode")
	//@Pattern(regexp = "^[0-9]*$")
	private String accountCode = null;

	//@NotNull
	@JsonProperty("status")
	private String status = null;

	//@NotNull
	@JsonProperty("chargeTo")
	//@Pattern(regexp = "[rstRST]")
	private String chargeTo = null;

	//@Length(max = 10)
	@JsonProperty("quoteNumber")
	//@Pattern(regexp = "^[a-zA-Z0-9@#$%&*_.,/?:;-]*$")
	private String quoteNumber = null;

	@JsonProperty("siteId")
	private String siteId = null;

	@JsonProperty("senderAddress")
	@NotNull
	@Valid
	private Address senderAddress = null;

	@JsonProperty("receiverAddress")
	@Valid
	private Address receiverAddress = null;

	//@Length(max = 80)
	@JsonProperty("specialInstructions")
	//@Pattern(regexp = "^[a-zA-Z0-9@#$&*%_' .,/?;-]*$")
	private String specialInstructions = null;

	@JsonProperty("temperatureType")
	private String temperatureType = null;

	@JsonProperty("tempRangeFrom")
	private String tempRangeFrom = null;

	@JsonProperty("tempRangeTo")
	private String tempRangeTo = null;

	@JsonProperty("temperatureUom")
	private String temperatureUom = null;

	@JsonProperty("pickupTemp")
	private String pickupTemp = null;

	@JsonProperty("hazardousType")
	private String hazardousType = null;

	@JsonProperty("thirdPartyContact")
	private String thirdPartyContact = null;

	@JsonProperty("thirdPartyContactPhone")
	private String thirdPartyContactPhone = null;

	@JsonProperty("qrCode")
	private String qrCode = null;

	@JsonProperty("barCode")
	private String barCode = null;

	@JsonProperty("fullBarCode")
	private String fullBarCode = null;

	@JsonProperty("typeOfExport")
	private String typeOfExport = null;

	@JsonProperty("declaredValueCurrencyCode")
	private String declaredValueCurrencyCode = null;

	@JsonProperty("declaredValue")
	private Double declaredValue = null;

	@JsonProperty("totalChargeAmount")
	private Double totalChargeAmount = null;

	@JsonProperty("harmonisedCommodityCode")
	private String harmonisedCommodityCode = null;

	@JsonProperty("taxPayer")
	private String taxPayer = null;

	@JsonProperty("smsNotify")
	private Boolean smsNotify = null;

	@JsonProperty("smsNotifyMobile")
	/*@Max(message = "Sms mobile notify number is not more than 10 digits.", value = 10)
	@Min(message = "Sms mobile notify number is not less than 5 digits.", value = 5)*/
	private String smsNotifyMobile = null;

	@JsonProperty("senderNotify")
	private Boolean senderNotify = false;

	@JsonProperty("receiverNotify")
	private Boolean receiverNotify = false;
	
	@JsonProperty("thirdpartyNotify")
	private Boolean thirdpartyNotify = false;

	@JsonProperty("deliveredInDepotCode")
	private String deliveredInDepotCode = null;
	
	@JsonProperty("deliveredInDepotName")
	private String deliveredInDepotName = null;

	@JsonProperty("holdInDepotCode")
	private String holdInDepotCode = null;
	
	@JsonProperty("holdInDepotName")
	private String holdInDepotName = null;

	@JsonProperty("extraServiceRequired")
	private Boolean extraServiceRequired = null;

	@Min(value = 1)
	@JsonProperty("extraServiceValue")
	private Double extraServiceValue = null;

	@JsonProperty("extraServiceCurrency")
	private String extraServiceCurrency = null;

	@JsonProperty("containsFood")
	private Boolean containsFood = null;

	@JsonProperty("alternateDelivery")
	private Boolean alternateDelivery = null;

	@JsonProperty("authorityToLeave")
	private Boolean authorityToLeave = null;

	@JsonProperty("securityCheckRequired")
	private Boolean securityCheckRequired = null;

	@JsonProperty("tradingNumber")
	private String tradingNumber = null;

	@JsonProperty("isPalletsTransactions")
	private Boolean isPalletsTransactions = null;

	@JsonProperty("totalVolume")
	private Double totalVolume = null;

	@JsonProperty("totalQuantity")
	private Double totalQuantity = null;

	@JsonProperty("totalWeight")
	private Double totalWeight = null;

	@JsonProperty("manifestNumber")
	private String manifestNumber = null;

	@JsonProperty("shipmentLines")
	private ShipmentLines shipmentLines = null;

	@JsonProperty("references")
	private References references = null;

	@JsonProperty("palletTransactions")
	private PalletTransaction palletTransactions = null;

	@JsonProperty("shipmentBarcodeStandard")
	private String shipmentBarcodeStandard = null;

	@JsonProperty("receiverAddressBRCode")
	private String receiverAddressBRCode = null;
	
	@JsonProperty("terminalCode")
	private String terminalCode = null;
	
	@JsonProperty("comercialInvoiceId")
	private Long comercialInvoiceId = null;
	
	@JsonProperty("documentType")
	private String documentType = null;
	
	@DateTimeFormat(pattern = "hh:mm")
	@JsonProperty("readyTime")
	private LocalTime readyTime = null;
	
	@DateTimeFormat(pattern = "hh:mm")
	@JsonProperty("locationClosingTime")
	private LocalTime locationClosingTime = null;
	
	@JsonProperty("initiatorContactName")
	private String initiatorContactName = null;
	
	@JsonProperty("initiatorPhoneNo")
	private String initiatorPhoneNo = null;
	
	@JsonProperty("initiatorEmailId")
	private String initiatorEmailId = null;
	
	public LocalTime getReadyTime() {
		return readyTime;
	}

	public void setReadyTime(LocalTime readyTime) {
		this.readyTime = readyTime;
	}

	public LocalTime getLocationClosingTime() {
		return locationClosingTime;
	}

	public void setLocationClosingTime(LocalTime locationClosingTime) {
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

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public LocalDate getManifestLastModifiedDate() {
		return manifestLastModifiedDate;
	}

	public void setManifestLastModifiedDate(LocalDate manifestLastModifiedDate) {
		this.manifestLastModifiedDate = manifestLastModifiedDate;
	}
	
	public Long getComercialInvoiceId() {
		return comercialInvoiceId;
	}

	public void setComercialInvoiceId(Long comercialInvoiceId) {
		this.comercialInvoiceId = comercialInvoiceId;
	}
	
	public ShipmentDto shipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
		return this;
	}

	/**
	 * Get shipmentId
	 * 
	 * @return shipmentId
	 **/
	public Long getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}

	public ShipmentDto shipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
		return this;
	}

	/**
	 * Get shipmentNumber
	 * 
	 * @return shipmentNumber
	 **/
	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	public ShipmentDto manifestId(Long manifestId) {
		this.manifestId = manifestId;
		return this;
	}

	/**
	 * Get manifestId
	 * 
	 * @return manifestId
	 **/
	public Long getManifestId() {
		return manifestId;
	}

	public void setManifestId(Long manifestId) {
		this.manifestId = manifestId;
	}
	
	public ShipmentDto manifestStatus(String manifestStatus) {
		this.manifestStatus = manifestStatus;
		return this;
	}
	
	/**
	 * Get manifestStatus
	 * 
	 * @return manifestStatus
	 **/
	public String getManifestStatus() {
		return manifestStatus;
	}
	
	public void setManifestStatus(String manifestStatus) {
		this.manifestStatus = manifestStatus;
	}

	public ShipmentDto customerCode(String customerCode) {
		this.customerCode = customerCode;
		return this;
	}

	/**
	 * Map this Customer Code of shipment table.
	 * 
	 * @return customerCode
	 **/
	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public ShipmentDto dispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
		return this;
	}

	/**
	 * Get dispatchDate
	 * 
	 * @return dispatchDate
	 **/
	public LocalDate getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public ShipmentDto requiredByDeliveryDate(LocalDate requiredByDeliveryDate) {
		this.requiredByDeliveryDate = requiredByDeliveryDate;
		return this;
	}

	/**
	 * Get requiredByDeliveryDate
	 * 
	 * @return requiredByDeliveryDate
	 **/
	public LocalDate getRequiredByDeliveryDate() {
		return requiredByDeliveryDate;
	}

	public void setRequiredByDeliveryDate(LocalDate requiredByDeliveryDate) {
		this.requiredByDeliveryDate = requiredByDeliveryDate;
	}

	public ShipmentDto tollCarrierCode(String tollCarrierCode) {
		this.tollCarrierCode = tollCarrierCode;
		return this;
	}

	/**
	 * Get tollCarrierCode
	 * 
	 * @return tollCarrierCode
	 **/
	public String getTollCarrierCode() {
		return tollCarrierCode;
	}

	public void setTollCarrierCode(String tollCarrierCode) {
		this.tollCarrierCode = tollCarrierCode;
	}

	public ShipmentDto tollCarrierName(String tollCarrierName) {
		this.tollCarrierName = tollCarrierName;
		return this;
	}

	/**
	 * Get tollCarrierName
	 * 
	 * @return tollCarrierName
	 **/
	public String getTollCarrierName() {
		return tollCarrierName;
	}

	public void setTollCarrierName(String tollCarrierName) {
		this.tollCarrierName = tollCarrierName;
	}

	public ShipmentDto serviceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	/**
	 * Get serviceCode
	 * 
	 * @return serviceCode
	 **/
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public ShipmentDto serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public ShipmentDto mode(String mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * Get mode
	 * 
	 * @return mode
	 **/
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public ShipmentDto accountCode(String accountCode) {
		this.accountCode = accountCode;
		return this;
	}

	/**
	 * Populate with this account number.
	 * 
	 * @return accountCode
	 **/
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	
	public ShipmentDto senderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
		return this;
	}
	
	/**
	 * Populate with this senderEmail.
	 * 
	 * @return senderEmail
	 **/
	public String getSenderEmail() {
		return senderEmail;
	}
	
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	
	public ShipmentDto receiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
		return this;
	}
	
	/**
	 * Populate with this receiverEmail.
	 * 
	 * @return receiverEmail
	 **/
	public String getReceiverEmail() {
		return receiverEmail;
	}
	
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	
	public ShipmentDto thirdPartyEmail(String thirdPartyEmail) {
		this.thirdPartyEmail = thirdPartyEmail;
		return this;
	}
	
	/**
	 * Populate with this thirdPartyEmail.
	 * 
	 * @return thirdPartyEmail
	 **/
	public String getThirdPartyEmail() {
		return thirdPartyEmail;
	}
	
	public void setThirdPartyEmail(String thirdPartyEmail) {
		this.thirdPartyEmail = thirdPartyEmail;
	}

	public ShipmentDto status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ShipmentDto chargeTo(String chargeTo) {
		this.chargeTo = chargeTo;
		return this;
	}

	/**
	 * Get chargeTo
	 * 
	 * @return chargeTo
	 **/
	public String getChargeTo() {
		return chargeTo;
	}

	public void setChargeTo(String chargeTo) {
		this.chargeTo = chargeTo;
	}

	public ShipmentDto quoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
		return this;
	}

	/**
	 * Get quoteNumber
	 * 
	 * @return quoteNumber
	 **/
	public String getQuoteNumber() {
		return quoteNumber;
	}

	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	public ShipmentDto siteId(String siteId) {
		this.siteId = siteId;
		return this;
	}

	/**
	 * Get siteId
	 * 
	 * @return siteId
	 **/
	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public ShipmentDto senderAddress(Address senderAddress) {
		this.senderAddress = senderAddress;
		return this;
	}

	/**
	 * Get senderAddress
	 * 
	 * @return senderAddress
	 **/
	public Address getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(Address senderAddress) {
		this.senderAddress = senderAddress;
	}

	public ShipmentDto receiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
		return this;
	}

	/**
	 * Get receiverAddress
	 * 
	 * @return receiverAddress
	 **/
	public Address getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public ShipmentDto specialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
		return this;
	}

	/**
	 * Get specialInstructions
	 * 
	 * @return specialInstructions
	 **/
	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	public ShipmentDto temperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
		return this;
	}

	/**
	 * Get temperatureType
	 * 
	 * @return temperatureType
	 **/
	public String getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}

	public ShipmentDto tempRangeFrom(String tempRangeFrom) {
		this.tempRangeFrom = tempRangeFrom;
		return this;
	}

	/**
	 * Get tempRangeFrom
	 * 
	 * @return tempRangeFrom
	 **/
	public String getTempRangeFrom() {
		return tempRangeFrom;
	}

	public void setTempRangeFrom(String tempRangeFrom) {
		this.tempRangeFrom = tempRangeFrom;
	}

	public ShipmentDto tempRangeTo(String tempRangeTo) {
		this.tempRangeTo = tempRangeTo;
		return this;
	}

	/**
	 * Get tempRangeTo
	 * 
	 * @return tempRangeTo
	 **/
	public String getTempRangeTo() {
		return tempRangeTo;
	}

	public void setTempRangeTo(String tempRangeTo) {
		this.tempRangeTo = tempRangeTo;
	}

	public ShipmentDto temperatureUom(String temperatureUom) {
		this.temperatureUom = temperatureUom;
		return this;
	}

	/**
	 * Get temperatureUom
	 * 
	 * @return temperatureUom
	 **/
	public String getTemperatureUom() {
		return temperatureUom;
	}

	public void setTemperatureUom(String temperatureUom) {
		this.temperatureUom = temperatureUom;
	}

	public ShipmentDto pickupTemp(String pickupTemp) {
		this.pickupTemp = pickupTemp;
		return this;
	}

	/**
	 * Get pickupTemp
	 * 
	 * @return pickupTemp
	 **/
	public String getPickupTemp() {
		return pickupTemp;
	}

	public void setPickupTemp(String pickupTemp) {
		this.pickupTemp = pickupTemp;
	}

	public ShipmentDto hazardousType(String hazardousType) {
		this.hazardousType = hazardousType;
		return this;
	}

	/**
	 * Get hazardousType
	 * 
	 * @return hazardousType
	 **/
	public String getHazardousType() {
		return hazardousType;
	}

	public void setHazardousType(String hazardousType) {
		this.hazardousType = hazardousType;
	}

	public ShipmentDto thirdPartyContact(String thirdPartyContact) {
		this.thirdPartyContact = thirdPartyContact;
		return this;
	}

	/**
	 * Get thirdPartyContact
	 * 
	 * @return thirdPartyContact
	 **/
	public String getThirdPartyContact() {
		return thirdPartyContact;
	}

	public void setThirdPartyContact(String thirdPartyContact) {
		this.thirdPartyContact = thirdPartyContact;
	}

	public ShipmentDto thirdPartyContactPhone(String thirdPartyContactPhone) {
		this.thirdPartyContactPhone = thirdPartyContactPhone;
		return this;
	}

	/**
	 * Get thirdPartyContactPhone
	 * 
	 * @return thirdPartyContactPhone
	 **/
	public String getThirdPartyContactPhone() {
		return thirdPartyContactPhone;
	}

	public void setThirdPartyContactPhone(String thirdPartyContactPhone) {
		this.thirdPartyContactPhone = thirdPartyContactPhone;
	}

	public ShipmentDto qrCode(String qrCode) {
		this.qrCode = qrCode;
		return this;
	}

	/**
	 * Get qrCode
	 * 
	 * @return qrCode
	 **/
	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public ShipmentDto barCode(String barCode) {
		this.barCode = barCode;
		return this;
	}

	/**
	 * Get barCode
	 * 
	 * @return barCode
	 **/
	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public ShipmentDto fullBarCode(String fullBarCode) {
		this.fullBarCode = fullBarCode;
		return this;
	}

	/**
	 * Get fullBarCode
	 * 
	 * @return fullBarCode
	 **/
	public String getFullBarCode() {
		return fullBarCode;
	}

	public void setFullBarCode(String fullBarCode) {
		this.fullBarCode = fullBarCode;
	}

	public ShipmentDto typeOfExport(String typeOfExport) {
		this.typeOfExport = typeOfExport;
		return this;
	}

	/**
	 * Get typeOfExport
	 * 
	 * @return typeOfExport
	 **/
	public String getTypeOfExport() {
		return typeOfExport;
	}

	public void setTypeOfExport(String typeOfExport) {
		this.typeOfExport = typeOfExport;
	}

	public ShipmentDto declaredValueCurrencyCode(String declaredValueCurrencyCode) {
		this.declaredValueCurrencyCode = declaredValueCurrencyCode;
		return this;
	}

	/**
	 * This will be the currency code like AUD
	 * 
	 * @return declaredValueCurrencyCode
	 **/
	public String getDeclaredValueCurrencyCode() {
		return declaredValueCurrencyCode;
	}

	public void setDeclaredValueCurrencyCode(String declaredValueCurrencyCode) {
		this.declaredValueCurrencyCode = declaredValueCurrencyCode;
	}

	public ShipmentDto declaredValue(Double declaredValue) {
		this.declaredValue = declaredValue;
		return this;
	}

	/**
	 * This will be the currency value
	 * 
	 * @return declaredValue
	 **/
	public Double getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(Double declaredValue) {
		this.declaredValue = declaredValue;
	}

	public ShipmentDto totalChargeAmount(Double totalChargeAmount) {
		this.totalChargeAmount = totalChargeAmount;
		return this;
	}

	/**
	 * This will be the update by Rate and Enquiry
	 * 
	 * @return totalChargeAmount
	 **/
	public Double getTotalChargeAmount() {
		return totalChargeAmount;
	}

	public void setTotalChargeAmount(Double totalChargeAmount) {
		this.totalChargeAmount = totalChargeAmount;
	}

	public ShipmentDto harmonisedCommodityCode(String harmonisedCommodityCode) {
		this.harmonisedCommodityCode = harmonisedCommodityCode;
		return this;
	}

	/**
	 * Get harmonisedCommodityCode
	 * 
	 * @return harmonisedCommodityCode
	 **/
	public String getHarmonisedCommodityCode() {
		return harmonisedCommodityCode;
	}

	public void setHarmonisedCommodityCode(String harmonisedCommodityCode) {
		this.harmonisedCommodityCode = harmonisedCommodityCode;
	}

	public ShipmentDto taxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
		return this;
	}

	/**
	 * Get taxPayer
	 * 
	 * @return taxPayer
	 **/
	public String getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}

	public ShipmentDto smsNotify(Boolean smsNotify) {
		this.smsNotify = smsNotify;
		return this;
	}

	/**
	 * Get smsNotify
	 * 
	 * @return smsNotify
	 **/
	public Boolean getSmsNotify() {
		return smsNotify;
	}

	public void setSmsNotify(Boolean smsNotify) {
		this.smsNotify = smsNotify;
	}

	public ShipmentDto smsNotifyMobile(String smsNotifyMobile) {
		this.smsNotifyMobile = smsNotifyMobile;
		return this;
	}

	/**
	 * Get smsNotifyMobile
	 * 
	 * @return smsNotifyMobile
	 **/
	public String getSmsNotifyMobile() {
		return smsNotifyMobile;
	}

	public void setSmsNotifyMobile(String smsNotifyMobile) {
		this.smsNotifyMobile = smsNotifyMobile;
	}

	public ShipmentDto senderNotify(Boolean senderNotify) {
		this.senderNotify = senderNotify;
		return this;
	}

	/**
	 * Get senderNotify
	 * 
	 * @return senderNotify
	 **/
	public Boolean getSenderNotify() {
		return senderNotify;
	}

	public void setSenderNotify(Boolean senderNotify) {
		this.senderNotify = senderNotify;
	}

	public ShipmentDto receiverNotify(Boolean receiverNotify) {
		this.receiverNotify = receiverNotify;
		return this;
	}

	/**
	 * Get receiverNotify
	 * 
	 * @return receiverNotify
	 **/
	public Boolean getReceiverNotify() {
		return receiverNotify;
	}

	public void setReceiverNotify(Boolean receiverNotify) {
		this.receiverNotify = receiverNotify;
	}
	
	public ShipmentDto thirdpartyNotify(Boolean thirdpartyNotify) {
		this.thirdpartyNotify = thirdpartyNotify;
		return this;
	}
	
	/**
	 * Get receiverNotify
	 * 
	 * @return receiverNotify
	 **/
	public Boolean getThirdpartyNotify() {
		return thirdpartyNotify;
	}
	
	public void setThirdpartyNotify(Boolean thirdpartyNotify) {
		this.thirdpartyNotify = thirdpartyNotify;
	}

	public ShipmentDto deliveredInDepotCode(String deliveredInDepotCode) {
		this.deliveredInDepotCode = deliveredInDepotCode;
		return this;
	}

	/**
	 * Get deliveredInDepotCode
	 * 
	 * @return deliveredInDepotCode
	 **/
	public String getDeliveredInDepotCode() {
		return deliveredInDepotCode;
	}

	public void setDeliveredInDepotCode(String deliveredInDepotCode) {
		this.deliveredInDepotCode = deliveredInDepotCode;
	}
	
	public ShipmentDto deliveredInDepotName(String deliveredInDepotName) {
		this.deliveredInDepotName = deliveredInDepotName;
		return this;
	}

	/**
	 * Get deliveredInDepotName
	 * 
	 * @return deliveredInDepotName
	 **/
	public String getDeliveredInDepotName() {
		return deliveredInDepotName;
	}

	public void setDeliveredInDepotName(String deliveredInDepotName) {
		this.deliveredInDepotName = deliveredInDepotName;
	}

	public ShipmentDto holdInDepotCode(String holdInDepotCode) {
		this.holdInDepotCode = holdInDepotCode;
		return this;
	}

	/**
	 * Get holdInDepotCode
	 * 
	 * @return holdInDepotCode
	 **/
	public String getHoldInDepotCode() {
		return holdInDepotCode;
	}

	public void setHoldInDepotCode(String holdInDepotCode) {
		this.holdInDepotCode = holdInDepotCode;
	}
	
	public ShipmentDto holdInDepotName(String holdInDepotName) {
		this.holdInDepotName = holdInDepotName;
		return this;
	}

	/**
	 * Get holdInDepotName
	 * 
	 * @return holdInDepotName
	 **/
	public String getHoldInDepotName() {
		return holdInDepotName;
	}

	public void setHoldInDepotName(String holdInDepotName) {
		this.holdInDepotName = holdInDepotName;
	}

	public ShipmentDto extraServiceRequired(Boolean extraServiceRequired) {
		this.extraServiceRequired = extraServiceRequired;
		return this;
	}

	/**
	 * Get extraServiceRequired
	 * 
	 * @return extraServiceRequired
	 **/
	public Boolean getExtraServiceRequired() {
		return extraServiceRequired;
	}

	public void setExtraServiceRequired(Boolean extraServiceRequired) {
		this.extraServiceRequired = extraServiceRequired;
	}

	public ShipmentDto extraServiceValue(Double extraServiceValue) {
		this.extraServiceValue = extraServiceValue;
		return this;
	}

	/**
	 * Get extraServiceValue
	 * 
	 * @return extraServiceValue
	 **/
	public Double getExtraServiceValue() {
		return extraServiceValue;
	}

	public void setExtraServiceValue(Double extraServiceValue) {
		this.extraServiceValue = extraServiceValue;
	}

	public ShipmentDto extraServiceCurrency(String extraServiceCurrency) {
		this.extraServiceCurrency = extraServiceCurrency;
		return this;
	}

	/**
	 * Get extraServiceCurrency
	 * 
	 * @return extraServiceCurrency
	 **/
	public String getExtraServiceCurrency() {
		return extraServiceCurrency;
	}

	public void setExtraServiceCurrency(String extraServiceCurrency) {
		this.extraServiceCurrency = extraServiceCurrency;
	}

	public ShipmentDto containsFood(Boolean containsFood) {
		this.containsFood = containsFood;
		return this;
	}

	/**
	 * Get containsFood
	 * 
	 * @return containsFood
	 **/
	public Boolean getContainsFood() {
		return containsFood;
	}

	public void setContainsFood(Boolean containsFood) {
		this.containsFood = containsFood;
	}

	public ShipmentDto alternateDelivery(Boolean alternateDelivery) {
		this.alternateDelivery = alternateDelivery;
		return this;
	}

	/**
	 * Get alternateDelivery
	 * 
	 * @return alternateDelivery
	 **/
	public Boolean getAlternateDelivery() {
		return alternateDelivery;
	}

	public void setAlternateDelivery(Boolean alternateDelivery) {
		this.alternateDelivery = alternateDelivery;
	}

	public ShipmentDto authorityToLeave(Boolean authorityToLeave) {
		this.authorityToLeave = authorityToLeave;
		return this;
	}

	/**
	 * Get authorityToLeave
	 * 
	 * @return authorityToLeave
	 **/
	public Boolean getAuthorityToLeave() {
		return authorityToLeave;
	}

	public void setAuthorityToLeave(Boolean authorityToLeave) {
		this.authorityToLeave = authorityToLeave;
	}

	public ShipmentDto securityCheckRequired(Boolean securityCheckRequired) {
		this.securityCheckRequired = securityCheckRequired;
		return this;
	}

	/**
	 * Get securityCheckRequired
	 * 
	 * @return securityCheckRequired
	 **/
	public Boolean getSecurityCheckRequired() {
		return securityCheckRequired;
	}

	public void setSecurityCheckRequired(Boolean securityCheckRequired) {
		this.securityCheckRequired = securityCheckRequired;
	}

	public ShipmentDto tradingNumber(String tradingNumber) {
		this.tradingNumber = tradingNumber;
		return this;
	}

	/**
	 * Get tradingNumber
	 * 
	 * @return tradingNumber
	 **/
	public String getTradingNumber() {
		return tradingNumber;
	}

	public void setTradingNumber(String tradingNumber) {
		this.tradingNumber = tradingNumber;
	}

	public ShipmentDto isPalletsTransactions(Boolean isPalletsTransactions) {
		this.isPalletsTransactions = isPalletsTransactions;
		return this;
	}

	/**
	 * Get isPalletsTransactions
	 * 
	 * @return isPalletsTransactions
	 **/
	public Boolean getIsPalletsTransactions() {
		return isPalletsTransactions;
	}

	public void setIsPalletsTransactions(Boolean isPalletsTransactions) {
		this.isPalletsTransactions = isPalletsTransactions;
	}

	public ShipmentDto totalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
		return this;
	}

	/**
	 * Get totalVolume
	 * 
	 * @return totalVolume
	 **/
	public Double getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
	}

	public ShipmentDto totalQuantity(Double totalQuantity) {
		this.totalQuantity = totalQuantity;
		return this;
	}

	/**
	 * Get totalQuantity
	 * 
	 * @return totalQuantity
	 **/
	public Double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public ShipmentDto totalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
		return this;
	}

	/**
	 * Get totalWeight
	 * 
	 * @return totalWeight
	 **/
	public Double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public ShipmentDto shipmentLines(ShipmentLines shipmentLines) {
		this.shipmentLines = shipmentLines;
		return this;
	}

	/**
	 * Get shipmentLines
	 * 
	 * @return shipmentLines
	 **/
	public ShipmentLines getShipmentLines() {
		return shipmentLines;
	}

	public void setShipmentLines(ShipmentLines shipmentLines) {
		this.shipmentLines = shipmentLines;
	}

	public ShipmentDto references(References references) {
		this.references = references;
		return this;
	}

	/**
	 * Get references
	 * 
	 * @return references
	 **/
	public References getReferences() {
		return references;
	}

	public void setReferences(References references) {
		this.references = references;
	}

	public ShipmentDto palletTransactions(PalletTransaction palletTransactions) {
		this.palletTransactions = palletTransactions;
		return this;
	}

	/**
	 * Get palletTransactions
	 * 
	 * @return palletTransactions
	 **/
	public PalletTransaction getPalletTransactions() {
		return palletTransactions;
	}

	public void setPalletTransactions(PalletTransaction palletTransactions) {
		this.palletTransactions = palletTransactions;
	}

	public ShipmentDto manifestNumber(String manifestNumber) {
		this.manifestNumber = manifestNumber;
		return this;
	}

	/**
	 * Get palletTransactions
	 * 
	 * @return palletTransactions
	 **/
	public String getManifestNumber() {
		return manifestNumber;
	}

	public void setManifestNumber(String manifestNumber) {
		this.manifestNumber = manifestNumber;
	}

	public ShipmentDto shipmentBarcodeStandard(String shipmentBarcodeStandard) {
		this.shipmentBarcodeStandard = shipmentBarcodeStandard;
		return this;
	}

	public String getShipmentBarcodeStandard() {
		return shipmentBarcodeStandard;
	}

	public void setShipmentBarcodeStandard(String shipmentBarcodeStandard) {
		this.shipmentBarcodeStandard = shipmentBarcodeStandard;
	}

	public ShipmentDto receiverAddressBRCode(String receiverAddressBRCode) {
		this.receiverAddressBRCode = receiverAddressBRCode;
		return this;
	}

	public String getReceiverAddressBRCode() {
		return receiverAddressBRCode;
	}

	public void setReceiverAddressBRCode(String receiverAddressBRCode) {
		this.receiverAddressBRCode = receiverAddressBRCode;
	}

	public ShipmentDto terminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
		return this;
	}

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	
	public long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(long enquiryId) {
		this.enquiryId = enquiryId;
	}
	
	public String getDocumentFlowStatus() {
		return documentFlowStatus;
	}

	public void setDocumentFlowStatus(String documentFlowStatus) {
		this.documentFlowStatus = documentFlowStatus;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShipmentDto shipment = (ShipmentDto) o;
		return Objects.equals(this.shipmentId, shipment.shipmentId)
				&& Objects.equals(this.shipmentNumber, shipment.shipmentNumber)
				&& Objects.equals(this.manifestId, shipment.manifestId)
				&& Objects.equals(this.manifestStatus, shipment.manifestStatus)
				&& Objects.equals(this.customerCode, shipment.customerCode)
				&& Objects.equals(this.dispatchDate, shipment.dispatchDate)
				&& Objects.equals(this.requiredByDeliveryDate, shipment.requiredByDeliveryDate)
				&& Objects.equals(this.tollCarrierCode, shipment.tollCarrierCode)
				&& Objects.equals(this.tollCarrierName, shipment.tollCarrierName)
				&& Objects.equals(this.serviceCode, shipment.serviceCode)
				&& Objects.equals(this.serviceName, shipment.serviceName) && Objects.equals(this.mode, shipment.mode)
				&& Objects.equals(this.accountCode, shipment.accountCode)
				&& Objects.equals(this.status, shipment.status) && Objects.equals(this.chargeTo, shipment.chargeTo)
				&& Objects.equals(this.quoteNumber, shipment.quoteNumber)
				&& Objects.equals(this.siteId, shipment.siteId)
				&& Objects.equals(this.senderAddress, shipment.senderAddress)
				&& Objects.equals(this.receiverAddress, shipment.receiverAddress)
				&& Objects.equals(this.specialInstructions, shipment.specialInstructions)
				&& Objects.equals(this.temperatureType, shipment.temperatureType)
				&& Objects.equals(this.tempRangeFrom, shipment.tempRangeFrom)
				&& Objects.equals(this.tempRangeTo, shipment.tempRangeTo)
				&& Objects.equals(this.temperatureUom, shipment.temperatureUom)
				&& Objects.equals(this.pickupTemp, shipment.pickupTemp)
				&& Objects.equals(this.hazardousType, shipment.hazardousType)
				&& Objects.equals(this.thirdPartyContact, shipment.thirdPartyContact)
				&& Objects.equals(this.thirdPartyContactPhone, shipment.thirdPartyContactPhone)
				&& Objects.equals(this.qrCode, shipment.qrCode) && Objects.equals(this.barCode, shipment.barCode)
				&& Objects.equals(this.fullBarCode, shipment.fullBarCode)
				&& Objects.equals(this.typeOfExport, shipment.typeOfExport)
				&& Objects.equals(this.declaredValueCurrencyCode, shipment.declaredValueCurrencyCode)
				&& Objects.equals(this.declaredValue, shipment.declaredValue)
				&& Objects.equals(this.totalChargeAmount, shipment.totalChargeAmount)
				&& Objects.equals(this.harmonisedCommodityCode, shipment.harmonisedCommodityCode)
				&& Objects.equals(this.taxPayer, shipment.taxPayer)
				&& Objects.equals(this.smsNotify, shipment.smsNotify)
				&& Objects.equals(this.smsNotifyMobile, shipment.smsNotifyMobile)
				&& Objects.equals(this.senderNotify, shipment.senderNotify)
				&& Objects.equals(this.receiverNotify, shipment.receiverNotify)
				&& Objects.equals(this.deliveredInDepotCode, shipment.deliveredInDepotCode)
				&& Objects.equals(this.holdInDepotCode, shipment.holdInDepotCode)
				&& Objects.equals(this.extraServiceRequired, shipment.extraServiceRequired)
				&& Objects.equals(this.extraServiceValue, shipment.extraServiceValue)
				&& Objects.equals(this.extraServiceCurrency, shipment.extraServiceCurrency)
				&& Objects.equals(this.containsFood, shipment.containsFood)
				&& Objects.equals(this.alternateDelivery, shipment.alternateDelivery)
				&& Objects.equals(this.authorityToLeave, shipment.authorityToLeave)
				&& Objects.equals(this.securityCheckRequired, shipment.securityCheckRequired)
				&& Objects.equals(this.tradingNumber, shipment.tradingNumber)
				&& Objects.equals(this.isPalletsTransactions, shipment.isPalletsTransactions)
				&& Objects.equals(this.totalVolume, shipment.totalVolume)
				&& Objects.equals(this.totalQuantity, shipment.totalQuantity)
				&& Objects.equals(this.totalWeight, shipment.totalWeight)
				&& Objects.equals(this.shipmentLines, shipment.shipmentLines)
				&& Objects.equals(this.references, shipment.references)
				&& Objects.equals(this.palletTransactions, shipment.palletTransactions)
				&& Objects.equals(this.manifestNumber, shipment.manifestNumber)
				&& Objects.equals(this.receiverAddressBRCode, shipment.receiverAddressBRCode)
				&& Objects.equals(this.shipmentBarcodeStandard, shipment.shipmentBarcodeStandard)
				&& Objects.equals(this.senderEmail, shipment.senderEmail)
				&& Objects.equals(this.receiverEmail, shipment.receiverEmail)
				&& Objects.equals(this.thirdpartyNotify, shipment.thirdpartyNotify)
				&& Objects.equals(this.enquiryId, shipment.enquiryId)
				&& Objects.equals(this.readyTime, shipment.readyTime)
				&& Objects.equals(this.locationClosingTime, shipment.locationClosingTime)
				&& Objects.equals(this.initiatorContactName, shipment.initiatorContactName)
				&& Objects.equals(this.initiatorPhoneNo, shipment.initiatorPhoneNo)
				&& Objects.equals(this.initiatorEmailId, shipment.initiatorEmailId)
				&& Objects.equals(this.documentFlowStatus, shipment.documentFlowStatus)
				&& Objects.equals(this.documentType, shipment.documentType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shipmentId, shipmentNumber, manifestId, customerCode, dispatchDate, requiredByDeliveryDate,
				tollCarrierCode, tollCarrierName, serviceCode, serviceName, mode, accountCode, status, chargeTo,
				quoteNumber, siteId, senderAddress, receiverAddress, specialInstructions, temperatureType,
				tempRangeFrom, tempRangeTo, temperatureUom, pickupTemp, hazardousType, thirdPartyContact,
				thirdPartyContactPhone, qrCode, barCode, fullBarCode, typeOfExport, declaredValueCurrencyCode,
				declaredValue, totalChargeAmount, harmonisedCommodityCode, taxPayer, smsNotify, smsNotifyMobile,
				senderNotify, receiverNotify, deliveredInDepotCode, holdInDepotCode, extraServiceRequired,
				extraServiceValue, extraServiceCurrency, containsFood, alternateDelivery, authorityToLeave,
				securityCheckRequired, tradingNumber, isPalletsTransactions, totalVolume, totalQuantity, totalWeight,
				shipmentLines, references, palletTransactions, manifestNumber, receiverAddressBRCode,
				shipmentBarcodeStandard, senderEmail, receiverEmail, thirdPartyEmail, thirdpartyNotify, manifestStatus,
				enquiryId, documentType, initiatorEmailId, initiatorPhoneNo, initiatorContactName, locationClosingTime,
				readyTime, documentFlowStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Shipment {\n");

		sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
		sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
		sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
		sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
		sb.append("    dispatchDate: ").append(toIndentedString(dispatchDate)).append("\n");
		sb.append("    requiredByDeliveryDate: ").append(toIndentedString(requiredByDeliveryDate)).append("\n");
		sb.append("    tollCarrierCode: ").append(toIndentedString(tollCarrierCode)).append("\n");
		sb.append("    tollCarrierName: ").append(toIndentedString(tollCarrierName)).append("\n");
		sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    chargeTo: ").append(toIndentedString(chargeTo)).append("\n");
		sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
		sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
		sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
		sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
		sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
		sb.append("    temperatureType: ").append(toIndentedString(temperatureType)).append("\n");
		sb.append("    tempRangeFrom: ").append(toIndentedString(tempRangeFrom)).append("\n");
		sb.append("    tempRangeTo: ").append(toIndentedString(tempRangeTo)).append("\n");
		sb.append("    temperatureUom: ").append(toIndentedString(temperatureUom)).append("\n");
		sb.append("    pickupTemp: ").append(toIndentedString(pickupTemp)).append("\n");
		sb.append("    hazardousType: ").append(toIndentedString(hazardousType)).append("\n");
		sb.append("    thirdPartyContact: ").append(toIndentedString(thirdPartyContact)).append("\n");
		sb.append("    thirdPartyContactPhone: ").append(toIndentedString(thirdPartyContactPhone)).append("\n");
		sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
		sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
		sb.append("    fullBarCode: ").append(toIndentedString(fullBarCode)).append("\n");
		sb.append("    typeOfExport: ").append(toIndentedString(typeOfExport)).append("\n");
		sb.append("    declaredValueCurrencyCode: ").append(toIndentedString(declaredValueCurrencyCode)).append("\n");
		sb.append("    declaredValue: ").append(toIndentedString(declaredValue)).append("\n");
		sb.append("    totalChargeAmount: ").append(toIndentedString(totalChargeAmount)).append("\n");
		sb.append("    harmonisedCommodityCode: ").append(toIndentedString(harmonisedCommodityCode)).append("\n");
		sb.append("    taxPayer: ").append(toIndentedString(taxPayer)).append("\n");
		sb.append("    smsNotify: ").append(toIndentedString(smsNotify)).append("\n");
		sb.append("    smsNotifyMobile: ").append(toIndentedString(smsNotifyMobile)).append("\n");
		sb.append("    senderNotify: ").append(toIndentedString(senderNotify)).append("\n");
		sb.append("    receiverNotify: ").append(toIndentedString(receiverNotify)).append("\n");
		sb.append("    deliveredInDepotCode: ").append(toIndentedString(deliveredInDepotCode)).append("\n");
		sb.append("    holdInDepotCode: ").append(toIndentedString(holdInDepotCode)).append("\n");
		sb.append("    extraServiceRequired: ").append(toIndentedString(extraServiceRequired)).append("\n");
		sb.append("    extraServiceValue: ").append(toIndentedString(extraServiceValue)).append("\n");
		sb.append("    extraServiceCurrency: ").append(toIndentedString(extraServiceCurrency)).append("\n");
		sb.append("    containsFood: ").append(toIndentedString(containsFood)).append("\n");
		sb.append("    alternateDelivery: ").append(toIndentedString(alternateDelivery)).append("\n");
		sb.append("    authorityToLeave: ").append(toIndentedString(authorityToLeave)).append("\n");
		sb.append("    securityCheckRequired: ").append(toIndentedString(securityCheckRequired)).append("\n");
		sb.append("    tradingNumber: ").append(toIndentedString(tradingNumber)).append("\n");
		sb.append("    isPalletsTransactions: ").append(toIndentedString(isPalletsTransactions)).append("\n");
		sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
		sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
		sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
		sb.append("    shipmentLines: ").append(toIndentedString(shipmentLines)).append("\n");
		sb.append("    references: ").append(toIndentedString(references)).append("\n");
		sb.append("    palletTransactions: ").append(toIndentedString(palletTransactions)).append("\n");
		sb.append("    manifestNumber: ").append(toIndentedString(manifestNumber)).append("\n");
		sb.append("    receiverAddressBRCode: ").append(toIndentedString(receiverAddressBRCode)).append("\n");
		sb.append("    shipmentBarcodeStandard: ").append(toIndentedString(shipmentBarcodeStandard)).append("\n");
		sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
		sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
		sb.append("    thirdPartyEmail: ").append(toIndentedString(thirdPartyEmail)).append("\n");
		sb.append("    thirdpartyNotify: ").append(toIndentedString(thirdpartyNotify)).append("\n");
		sb.append("    enquiryId: ").append(toIndentedString(enquiryId)).append("\n");
		sb.append("    manifestStatus: ").append(toIndentedString(manifestStatus)).append("\n");
		sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
		sb.append("    readyTime: ").append(toIndentedString(readyTime)).append("\n");
		sb.append("    locationClosingTime: ").append(toIndentedString(locationClosingTime)).append("\n");
		sb.append("    initiatorContactName: ").append(toIndentedString(initiatorContactName)).append("\n");
		sb.append("    initiatorPhoneNo: ").append(toIndentedString(initiatorPhoneNo)).append("\n");
		sb.append("    initiatorEmailId: ").append(toIndentedString(initiatorEmailId)).append("\n");
		sb.append("    documentFlowStatus: ").append(toIndentedString(documentFlowStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

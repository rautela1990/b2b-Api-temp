package com.tollgroup.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Manifest
 */
public class ManifestDto {

	@NotNull
	@JsonProperty("tollCarrierCode")
	private String tollCarrierCode = null;

	@NotNull
	@JsonProperty("tollCarrierName")
	private String tollCarrierName = null;

	@JsonProperty("senderAddress")
	@Valid
	private Address senderAddress = null;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("dispatchDate")
	private LocalDate dispatchDate = null;

	@JsonProperty("customerCode")
	private String customerCode = null;

	@Length(max = 30)
	@JsonProperty("manifestName")
	@Pattern(regexp = "[-a-zA-Z0-9*@#$%&-_'.,/ ?;]*")
	private String manifestName = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("shipments")
	private List<ShipmentDto> shipments = new ArrayList<ShipmentDto>();

	@JsonProperty("pickUpBookingNumber")
	private String pickUpBookingNumber = null;

	public ManifestDto tollCarrierCode(String tollCarrierCode) {
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

	public ManifestDto tollCarrierName(String tollCarrierName) {
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

	public ManifestDto senderAddress(Address senderAddress) {
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

	public ManifestDto dispatchDate(LocalDate dispatchDate) {
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

	public ManifestDto manifestName(String manifestName) {
		this.manifestName = manifestName;
		return this;
	}

	/**
	 * This is Manifest Name
	 * 
	 * @return manifestName
	 **/
	public String getManifestName() {
		return manifestName;
	}

	public void setManifestName(String manifestName) {
		this.manifestName = manifestName;
	}

	public ManifestDto status(String status) {
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

	public ManifestDto shipments(List<ShipmentDto> shipments) {
		this.shipments = shipments;
		return this;
	}

	public ManifestDto addShipmentsItem(ShipmentDto shipmentsItem) {
		this.shipments.add(shipmentsItem);
		return this;
	}

	/**
	 * List of shipment ids. For Post one.
	 * 
	 * @return shipmentIds
	 **/
	public List<ShipmentDto> getShipments() {
		return shipments;
	}

	public void setShipments(List<ShipmentDto> shipments) {
		this.shipments = shipments;
	}

	public ManifestDto pickUpBookingNumber(String pickUpBookingNumber) {
		this.pickUpBookingNumber = pickUpBookingNumber;
		return this;
	}

	/**
	 * Get pickUpBookingNumber
	 * 
	 * @return pickUpBookingNumber
	 **/
	public String getPickUpBookingNumber() {
		return pickUpBookingNumber;
	}

	public void setPickUpBookingNumber(String pickUpBookingNumber) {
		this.pickUpBookingNumber = pickUpBookingNumber;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ManifestDto manifest = (ManifestDto) o;
		return Objects.equals(this.tollCarrierCode, manifest.tollCarrierCode)
				&& Objects.equals(this.tollCarrierName, manifest.tollCarrierName)
				&& Objects.equals(this.senderAddress, manifest.senderAddress)
				&& Objects.equals(this.dispatchDate, manifest.dispatchDate)
				&& Objects.equals(this.manifestName, manifest.manifestName)
				&& Objects.equals(this.status, manifest.status) && Objects.equals(this.shipments, manifest.shipments)
				&& Objects.equals(this.pickUpBookingNumber, manifest.pickUpBookingNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tollCarrierCode, tollCarrierName, senderAddress, dispatchDate, manifestName, status,
				shipments, pickUpBookingNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Manifest {\n");

		sb.append("    tollCarrierCode: ").append(toIndentedString(tollCarrierCode)).append("\n");
		sb.append("    tollCarrierName: ").append(toIndentedString(tollCarrierName)).append("\n");
		sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
		sb.append("    dispatchDate: ").append(toIndentedString(dispatchDate)).append("\n");
		sb.append("    manifestName: ").append(toIndentedString(manifestName)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    shipmentIds: ").append(toIndentedString(shipments)).append("\n");
		sb.append("    pickUpBookingNumber: ").append(toIndentedString(pickUpBookingNumber)).append("\n");
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

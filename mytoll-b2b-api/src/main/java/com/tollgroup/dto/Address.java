package com.tollgroup.dto;

import java.util.Objects;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address
 */
@JsonInclude(Include.NON_NULL)
public class Address   {
  @JsonProperty("addressId")
  private Long addressId = null;
  
  @JsonProperty("abn")
  private String abn = null;
 
  @Length(min=3, max=50)
  @JsonProperty("companyName")
  private String companyName = null;

  @Length(max=50)
  @JsonProperty("contactName")
  @Pattern(regexp="^[-a-zA-Z0-9*@#$%&_ '.,/;:]*$")
  private String contactName = null;

  @Length(max=20)
  @JsonProperty("workPhoneNumber")
  @Pattern(regexp="^[0-9]*$")
  private String workPhoneNumber = null;

  //@NotBlank
  @Length(min=3, max=20)
  @Pattern(regexp="^[0-9-]*$")
  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @Email
  @Length(max=80)
  @JsonProperty("email")
  @Pattern(regexp = "^[_#A-Za-z0-9-\\+]+(\\.[_#A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
  private String email = null;
  
  @Length(max=80)
  @JsonProperty("addressLine1")
  private String addressLine1 = null;
  
  @Length(max=80)
  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @Length(max=15)
  @JsonProperty("postCode")
  @Pattern(regexp="^[0-9]*$")
  private String postCode = null;
  
  @Length( max=40)
  @JsonProperty("suburb")
  private String suburb = null;

  @Length(max=5)
  @JsonProperty("state")
  private String state = null;

  @Length(max=15)
  @JsonProperty("city")
  private String city = null;

  @Length(min=1, max=3)
  @JsonProperty("countryCode")
  private String countryCode = null;
  
  @JsonProperty("countryName")
  private String countryName = null;

  @Length(min=10, max=160)
  @JsonProperty("addressNote")
  private String addressNote = null;

  //@NotNull
  @Length(min=3, max=20)
  @JsonProperty("accountCode")
  private String accountCode = null;

  @Length(min=3, max=20)
  @JsonProperty("latitude")
  private String latitude = null;

  @Length(min=3, max=20)
  @JsonProperty("longitude")
  private String longitude = null;
  
  @Length(min=3, max=20)
  @JsonProperty("dpId")
  private String dpId = null;

  @Length(min=3, max=20)
  @JsonProperty("gnafPid")
  private String gnafPid = null;

  @Length(min=1, max=20)
  @JsonProperty("addressType")
  private String addressType = null;

  @Length(min=2, max=20)
  @JsonProperty("avsConfidenceLevel")
  private String avsConfidenceLevel = null;


  @Length(min=3, max=50)
  @JsonProperty("dgContactName")
  private String dgContactName = null;
  
  @Length(min=3, max=20)
  @JsonProperty("dgContactNumber")
  private String dgContactNumber = null;

  public Address addressId(Long addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  public Long getAddressId() {
    return addressId;
  }

  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }
  
  public Address abn(String abn) {
	  this.abn = abn;
	  return this;
  }
  
  /**
   * Get abn
   * @return abn
   **/
  public String getAbn() {
	  return abn;
  }
  
  public void setAbn(String abn) {
	  this.abn = abn;
  }
  
 


  public Address companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Address contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Address workPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
    return this;
  }

   /**
   * Get workPhoneNumber
   * @return workPhoneNumber
  **/
  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public void setWorkPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
  }

  public Address mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Address email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address countryName(String countryName) {
	this.countryName = countryName;
	return this;
  }
  
  public String getCountryName() {
	return countryName;
  }

  public void setCountryName(String countryName) {
	this.countryName = countryName;
  }

  public Address addressNote(String addressNote) {
    this.addressNote = addressNote;
    return this;
  }

   /**
   * Get addressNote
   * @return addressNote
  **/
  public String getAddressNote() {
    return addressNote;
  }

  public void setAddressNote(String addressNote) {
    this.addressNote = addressNote;
  }

  public Address accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Populate with this account number.
   * @return accountCode
  **/
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public Address latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Address longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Address dpId(String dpId) {
    this.dpId = dpId;
    return this;
  }

   /**
   * Get dpId
   * @return dpId
  **/
  public String getDpId() {
    return dpId;
  }

  public void setDpId(String dpId) {
    this.dpId = dpId;
  }

  public Address gnafPid(String gnafPid) {
    this.gnafPid = gnafPid;
    return this;
  }

   /**
   * Get gnafPid
   * @return gnafPid
  **/
  public String getGnafPid() {
    return gnafPid;
  }

  public void setGnafPid(String gnafPid) {
    this.gnafPid = gnafPid;
  }

  public Address addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public Address avsConfidenceLevel(String avsConfidenceLevel) {
    this.avsConfidenceLevel = avsConfidenceLevel;
    return this;
  }

   /**
   * Get avsConfidenceLevel
   * @return avsConfidenceLevel
  **/
  public String getAvsConfidenceLevel() {
    return avsConfidenceLevel;
  }

  public void setAvsConfidenceLevel(String avsConfidenceLevel) {
    this.avsConfidenceLevel = avsConfidenceLevel;
  }



  public Address dgContactName(String dgContactName) {
    this.dgContactName = dgContactName;
    return this;
  }

   /**
   * Get dgContactName
   * @return dgContactName
  **/
  public String getDgContactName() {
    return dgContactName;
  }

  public void setDgContactName(String dgContactName) {
    this.dgContactName = dgContactName;
  }

  public Address dgContactNumber(String dgContactNumber) {
    this.dgContactNumber = dgContactNumber;
    return this;
  }

   /**
   * Get dgContactNumber
   * @return dgContactNumber
  **/
  public String getDgContactNumber() {
    return dgContactNumber;
  }

  public void setDgContactNumber(String dgContactNumber) {
    this.dgContactNumber = dgContactNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressId, address.addressId) &&
        Objects.equals(this.abn, address.abn) &&
        Objects.equals(this.companyName, address.companyName) &&
        Objects.equals(this.contactName, address.contactName) &&
        Objects.equals(this.workPhoneNumber, address.workPhoneNumber) &&
        Objects.equals(this.mobileNumber, address.mobileNumber) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.countryName, address.countryName) &&
        Objects.equals(this.addressNote, address.addressNote) &&
        Objects.equals(this.accountCode, address.accountCode) &&
        Objects.equals(this.latitude, address.latitude) &&
        Objects.equals(this.longitude, address.longitude) &&
        Objects.equals(this.dpId, address.dpId) &&
        Objects.equals(this.gnafPid, address.gnafPid) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.avsConfidenceLevel, address.avsConfidenceLevel) &&
        Objects.equals(this.dgContactName, address.dgContactName) &&
        Objects.equals(this.dgContactNumber, address.dgContactNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, abn, companyName, contactName, workPhoneNumber, mobileNumber, email, addressLine1, addressLine2, postCode, suburb, state, city, countryCode, countryName, addressNote, accountCode, latitude, longitude, dpId, gnafPid, addressType, avsConfidenceLevel,  dgContactName, dgContactNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    abn: ").append(toIndentedString(abn)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    workPhoneNumber: ").append(toIndentedString(workPhoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    addressNote: ").append(toIndentedString(addressNote)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    dpId: ").append(toIndentedString(dpId)).append("\n");
    sb.append("    gnafPid: ").append(toIndentedString(gnafPid)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    avsConfidenceLevel: ").append(toIndentedString(avsConfidenceLevel)).append("\n");
    sb.append("    dgContactName: ").append(toIndentedString(dgContactName)).append("\n");
    sb.append("    dgContactNumber: ").append(toIndentedString(dgContactNumber)).append("\n");
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


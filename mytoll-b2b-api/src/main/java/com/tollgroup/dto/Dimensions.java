package com.tollgroup.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dimensions
 */
@JsonInclude(Include.NON_NULL)
public class Dimensions   {
	
	@JsonProperty("length")
	private Integer length = null;
	
	@JsonProperty("width")
	private Integer width = null;
	
	@JsonProperty("height")
	private Integer height = null;

	@JsonProperty("lwhUom")
	private String lwhUom = null;

	@JsonProperty("totalVolume")
	private Double totalVolume = null;

	@JsonProperty("totalVolumeUom")
	private String totalVolumeUom = null;

	@JsonProperty("totalWeight")
	private Double totalWeight = null;

	@JsonProperty("totalWeightUom")
	private String totalWeightUom = null;

	@JsonProperty("totalCubicVolume")
	private Integer totalCubicVolume = null;
	
	@JsonProperty("perUnitVolume")
	private Double perUnitVolume = null;
	
	@JsonProperty("isVolumeOnly")
	private Boolean isVolumeOnly = null;

	public Dimensions length(Integer length) {
		this.length = length;
		return this;
	}

   /**
   * Get length
   * @return length
  **/
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Dimensions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Dimensions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Dimensions lwhUom(String lwhUom) {
    this.lwhUom = lwhUom;
    return this;
  }

   /**
   * Get lwHUom
   * @return lwHUom
  **/
  public String getLwhUom() {
    return lwhUom;
  }

  public void setLwhUom(String lwhUom) {
    this.lwhUom = lwhUom;
  }

  public Dimensions totalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Get totalVolume
   * @return totalVolume
  **/
  public Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Dimensions totalVolumeUom(String totalVolumeUom) {
    this.totalVolumeUom = totalVolumeUom;
    return this;
  }

   /**
   * Get totalVolumeUom
   * @return totalVolumeUom
  **/
  public String getTotalVolumeUom() {
    return totalVolumeUom;
  }

  public void setTotalVolumeUom(String totalVolumeUom) {
    this.totalVolumeUom = totalVolumeUom;
  }

  public Dimensions totalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * Get totalWeight
   * @return totalWeight
  **/
  public Double getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
  }

  public Dimensions totalWeightUom(String totalWeightUom) {
    this.totalWeightUom = totalWeightUom;
    return this;
  }

   /**
   * Get totalWeightUom
   * @return totalWeightUom
  **/
  public String getTotalWeightUom() {
    return totalWeightUom;
  }

  public void setTotalWeightUom(String totalWeightUom) {
    this.totalWeightUom = totalWeightUom;
  }

  public Dimensions totalCubicVolume(Integer totalCubicVolume) {
    this.totalCubicVolume = totalCubicVolume;
    return this;
  }

   /**
   * Get totalCubicVolume
   * @return totalCubicVolume
  **/
  public Integer getTotalCubicVolume() {
    return totalCubicVolume;
  }

  public void setTotalCubicVolume(Integer totalCubicVolume) {
    this.totalCubicVolume = totalCubicVolume;
  }

	public Dimensions perUnitVolume(Double perUnitVolume) {
		this.perUnitVolume = perUnitVolume;
		return this;
	}

	/**
	 * Get perUnitVolume
	 * 
	 * @return perUnitVolume
	 **/
	public Double getPerUnitVolume() {
		return perUnitVolume;
	}

	public void setPerUnitVolume(Double perUnitVolume) {
		this.perUnitVolume = perUnitVolume;
	}

	public Dimensions isVolumeOnly(Boolean isVolumeOnly) {
		this.isVolumeOnly = isVolumeOnly;
		return this;
	}

	/**
	 * Get isVolumeOnly
	 * 
	 * @return isVolumeOnly
	 **/
	public Boolean getIsVolumeOnly() {
		return isVolumeOnly;
	}

	public void setIsVolumeOnly(Boolean isVolumeOnly) {
		this.isVolumeOnly = isVolumeOnly;
	}

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.width, dimensions.width) &&
        Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.lwhUom, dimensions.lwhUom) &&
        Objects.equals(this.totalVolume, dimensions.totalVolume) &&
        Objects.equals(this.totalVolumeUom, dimensions.totalVolumeUom) &&
        Objects.equals(this.totalWeight, dimensions.totalWeight) &&
        Objects.equals(this.totalWeightUom, dimensions.totalWeightUom) &&
        Objects.equals(this.totalCubicVolume, dimensions.totalCubicVolume) &&
    	Objects.equals(this.perUnitVolume, dimensions.perUnitVolume) &&
    	Objects.equals(this.isVolumeOnly, dimensions.isVolumeOnly) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, lwhUom, totalVolume, totalVolumeUom, totalWeight, totalWeightUom, totalCubicVolume,perUnitVolume,isVolumeOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    lwHUom: ").append(toIndentedString(lwhUom)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    totalVolumeUom: ").append(toIndentedString(totalVolumeUom)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    totalWeightUom: ").append(toIndentedString(totalWeightUom)).append("\n");
    sb.append("    totalCubicVolume: ").append(toIndentedString(totalCubicVolume)).append("\n");
    sb.append("    perUnitVolume: ").append(toIndentedString(perUnitVolume)).append("\n");
    sb.append("    isVolumeOnly: ").append(toIndentedString(isVolumeOnly)).append("\n");
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


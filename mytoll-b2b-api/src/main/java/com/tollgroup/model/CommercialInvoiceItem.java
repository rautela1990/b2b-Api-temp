package com.tollgroup.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
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
 * A CommercialInvoiceItem.
 */
@Entity
@Table(name = "commercial_invoice_item")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CommercialInvoiceItem extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="commercial_invoice_item_id")
    private Long id;

    @Size(max = 4)
    @Column(name = "country_of_origin", length = 4)
    private String countryOfOrigin;

    @Size(max = 255)
    @Column(name = "item_description", length = 255)
    private String itemDescription;

    @Size(max = 4)
    @Column(name = "country_of_manufacture", length = 4)
    private String countryOfManufacture;

    @Size(max = 30)
    @Column(name = "part_number", length = 30)
    private String partNumber;

    @Size(max = 30)
    @Column(name = "harmonisation_code", length = 30)
    private String harmonisationCode;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "weight")
    private Double weight;

    @Size(max = 20)
    @Column(name = "weight_uom", length = 20)
    private String weightUom;

    @Column(name = "unit_value")
    private Double unitValue;

    @Column(name = "total_value")
    private Double totalValue;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "commercial_invoice_id", nullable = false)
	private CommercialInvoice commercialInvoice;
	
	

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public CommercialInvoiceItem countryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public CommercialInvoiceItem itemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public CommercialInvoiceItem countryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
        return this;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public CommercialInvoiceItem partNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getHarmonisationCode() {
        return harmonisationCode;
    }

    public CommercialInvoiceItem harmonisationCode(String harmonisationCode) {
        this.harmonisationCode = harmonisationCode;
        return this;
    }

    public void setHarmonisationCode(String harmonisationCode) {
        this.harmonisationCode = harmonisationCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public CommercialInvoiceItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getWeight() {
        return weight;
    }

    public CommercialInvoiceItem weight(Double weight) {
        this.weight = weight;
        return this;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public CommercialInvoiceItem weightUom(String weightUom) {
        this.weightUom = weightUom;
        return this;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom;
    }

    public Double getUnitValue() {
        return unitValue;
    }

    public CommercialInvoiceItem unitValue(Double unitValue) {
        this.unitValue = unitValue;
        return this;
    }

    public void setUnitValue(Double unitValue) {
        this.unitValue = unitValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public CommercialInvoiceItem totalValue(Double totalValue) {
        this.totalValue = totalValue;
        return this;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    
    public CommercialInvoice getCommercialInvoice() {
        return commercialInvoice;
    }

    public CommercialInvoiceItem commercialInvoice(CommercialInvoice commercialInvoice) {
        this.commercialInvoice = commercialInvoice;
        return this;
    }

    public void setCommercialInvoice(CommercialInvoice commercialInvoice) {
        this.commercialInvoice = commercialInvoice;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommercialInvoiceItem commercialInvoiceItem = (CommercialInvoiceItem) o;
        if(commercialInvoiceItem.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, commercialInvoiceItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CommercialInvoiceItem{" +
            "id=" + id +
            ", countryOfOrigin='" + countryOfOrigin + "'" +
            ", itemDescription='" + itemDescription + "'" +
            ", countryOfManufacture='" + countryOfManufacture + "'" +
            ", partNumber='" + partNumber + "'" +
            ", harmonisationCode='" + harmonisationCode + "'" +
            ", quantity='" + quantity + "'" +
            ", weight='" + weight + "'" +
            ", weightUom='" + weightUom + "'" +
            ", unitValue='" + unitValue + "'" +
            ", totalValue='" + totalValue + "'" +
            '}';
    }
}

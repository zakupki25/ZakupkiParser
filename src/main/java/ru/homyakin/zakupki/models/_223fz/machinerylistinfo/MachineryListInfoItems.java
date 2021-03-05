//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:30 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.machinerylistinfo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.CurrencyType;


/**
 * Строка перечня
 * 
 * <p>Java class for machineryListInfoItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="machineryListInfoItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="performance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://zakupki.gov.ru/223fz/machineryListInfo/1}machineryQtyType"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *         &lt;element name="conclusionDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suppliers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recommendedForeignGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedProductTypesInRf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planToUseSingleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needAdditionalRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="additionalRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "machineryListInfoItems", propOrder = {
    "orderNumber",
    "name",
    "performance",
    "quantity",
    "price",
    "currency",
    "conclusionDate",
    "deliveryDate",
    "suppliers",
    "recommendedForeignGoods",
    "recommendedProductTypesInRf",
    "planToUseSingleSupplier",
    "needAdditionalRequirements",
    "additionalRequirements"
})
public class MachineryListInfoItems {

    protected int orderNumber;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String performance;
    @XmlElement(required = true)
    protected BigDecimal quantity;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected CurrencyType currency;
    protected int conclusionDate;
    protected int deliveryDate;
    protected String suppliers;
    protected boolean recommendedForeignGoods;
    protected String recommendedProductTypesInRf;
    protected boolean planToUseSingleSupplier;
    protected boolean needAdditionalRequirements;
    protected String additionalRequirements;

    /**
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * Sets the value of the performance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformance(String value) {
        this.performance = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the conclusionDate property.
     * 
     */
    public int getConclusionDate() {
        return conclusionDate;
    }

    /**
     * Sets the value of the conclusionDate property.
     * 
     */
    public void setConclusionDate(int value) {
        this.conclusionDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     */
    public int getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     */
    public void setDeliveryDate(int value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliers(String value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the recommendedForeignGoods property.
     * 
     */
    public boolean isRecommendedForeignGoods() {
        return recommendedForeignGoods;
    }

    /**
     * Sets the value of the recommendedForeignGoods property.
     * 
     */
    public void setRecommendedForeignGoods(boolean value) {
        this.recommendedForeignGoods = value;
    }

    /**
     * Gets the value of the recommendedProductTypesInRf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedProductTypesInRf() {
        return recommendedProductTypesInRf;
    }

    /**
     * Sets the value of the recommendedProductTypesInRf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedProductTypesInRf(String value) {
        this.recommendedProductTypesInRf = value;
    }

    /**
     * Gets the value of the planToUseSingleSupplier property.
     * 
     */
    public boolean isPlanToUseSingleSupplier() {
        return planToUseSingleSupplier;
    }

    /**
     * Sets the value of the planToUseSingleSupplier property.
     * 
     */
    public void setPlanToUseSingleSupplier(boolean value) {
        this.planToUseSingleSupplier = value;
    }

    /**
     * Gets the value of the needAdditionalRequirements property.
     * 
     */
    public boolean isNeedAdditionalRequirements() {
        return needAdditionalRequirements;
    }

    /**
     * Sets the value of the needAdditionalRequirements property.
     * 
     */
    public void setNeedAdditionalRequirements(boolean value) {
        this.needAdditionalRequirements = value;
    }

    /**
     * Gets the value of the additionalRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRequirements() {
        return additionalRequirements;
    }

    /**
     * Sets the value of the additionalRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRequirements(String value) {
        this.additionalRequirements = value;
    }

}

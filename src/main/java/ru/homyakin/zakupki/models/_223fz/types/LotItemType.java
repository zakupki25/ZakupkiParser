//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:44 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Позиция лота
 * 
 * <p>Java class for lotItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType" minOccurs="0"/>
 *           &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType" minOccurs="0"/>
 *           &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *           &lt;element name="qty" type="{http://zakupki.gov.ru/223fz/types/1}lotItemQtyType"/>
 *         &lt;/sequence>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
 *         &lt;element name="commodityItemPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="commodityItemPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotItemType", propOrder = {
    "guid",
    "ordinalNumber",
    "okdp",
    "okpd2",
    "okved",
    "okved2",
    "okei",
    "qty",
    "additionalInfo",
    "deliveryPlace",
    "commodityItemPrice",
    "commodityItemPriceRub"
})
public class LotItemType {

    @XmlElement(required = true)
    protected String guid;
    protected int ordinalNumber;
    protected OkdpProductType okdp;
    protected Okpd2ProductType okpd2;
    protected OkvedProductType okved;
    protected Okved2ProductType okved2;
    protected OkeiProductType okei;
    protected BigDecimal qty;
    protected String additionalInfo;
    protected DeliveryPlaceType deliveryPlace;
    protected BigDecimal commodityItemPrice;
    protected BigDecimal commodityItemPriceRub;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the okdp property.
     * 
     * @return
     *     possible object is
     *     {@link OkdpProductType }
     *     
     */
    public OkdpProductType getOkdp() {
        return okdp;
    }

    /**
     * Sets the value of the okdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkdpProductType }
     *     
     */
    public void setOkdp(OkdpProductType value) {
        this.okdp = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okpd2ProductType }
     *     
     */
    public Okpd2ProductType getOkpd2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okpd2ProductType }
     *     
     */
    public void setOkpd2(Okpd2ProductType value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link OkvedProductType }
     *     
     */
    public OkvedProductType getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkvedProductType }
     *     
     */
    public void setOkved(OkvedProductType value) {
        this.okved = value;
    }

    /**
     * Gets the value of the okved2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okved2ProductType }
     *     
     */
    public Okved2ProductType getOkved2() {
        return okved2;
    }

    /**
     * Sets the value of the okved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okved2ProductType }
     *     
     */
    public void setOkved2(Okved2ProductType value) {
        this.okved2 = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link OkeiProductType }
     *     
     */
    public OkeiProductType getOkei() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkeiProductType }
     *     
     */
    public void setOkei(OkeiProductType value) {
        this.okei = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the deliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public DeliveryPlaceType getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * Sets the value of the deliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public void setDeliveryPlace(DeliveryPlaceType value) {
        this.deliveryPlace = value;
    }

    /**
     * Gets the value of the commodityItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommodityItemPrice() {
        return commodityItemPrice;
    }

    /**
     * Sets the value of the commodityItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommodityItemPrice(BigDecimal value) {
        this.commodityItemPrice = value;
    }

    /**
     * Gets the value of the commodityItemPriceRub property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommodityItemPriceRub() {
        return commodityItemPriceRub;
    }

    /**
     * Sets the value of the commodityItemPriceRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommodityItemPriceRub(BigDecimal value) {
        this.commodityItemPriceRub = value;
    }

}

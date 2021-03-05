//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:38 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchaseplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.OkdpProductType;
import ru.homyakin.zakupki.models._223fz.types.Okpd2ProductType;
import ru.homyakin.zakupki.models._223fz.types.Okved2ProductType;
import ru.homyakin.zakupki.models._223fz.types.OkvedProductType;


/**
 * Строка позиции плана инновационной закупки
 * 
 * <p>Java class for innovationPlanDataItemRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="innovationPlanDataItemRowType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemRowType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType" minOccurs="0"/>
 *           &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType" minOccurs="0"/>
 *           &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "innovationPlanDataItemRowType", propOrder = {
    "okdp",
    "okpd2",
    "okved",
    "okved2"
})
public class InnovationPlanDataItemRowType
    extends BasePlanDataItemRowType
{

    protected OkdpProductType okdp;
    protected Okpd2ProductType okpd2;
    protected OkvedProductType okved;
    protected Okved2ProductType okved2;

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

}

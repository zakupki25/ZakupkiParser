//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:32 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.reference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for nsiOkvedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiOkvedItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="nsiOkvedData" type="{http://zakupki.gov.ru/223fz/reference/1}nsiOkvedDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiOkvedItemType", propOrder = {
    "nsiOkvedData"
})
public class NsiOkvedItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NsiOkvedDataType nsiOkvedData;

    /**
     * Gets the value of the nsiOkvedData property.
     * 
     * @return
     *     possible object is
     *     {@link NsiOkvedDataType }
     *     
     */
    public NsiOkvedDataType getNsiOkvedData() {
        return nsiOkvedData;
    }

    /**
     * Sets the value of the nsiOkvedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiOkvedDataType }
     *     
     */
    public void setNsiOkvedData(NsiOkvedDataType value) {
        this.nsiOkvedData = value;
    }

}

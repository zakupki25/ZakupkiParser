//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:34 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchaseProtocolCCZKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolCCZKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolCCZKESMBOData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCCDataType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolCCZKESMBOItemType", propOrder = {
    "purchaseProtocolCCZKESMBOData"
})
public class PurchaseProtocolCCZKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData purchaseProtocolCCZKESMBOData;

    /**
     * Gets the value of the purchaseProtocolCCZKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData }
     *     
     */
    public PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData getPurchaseProtocolCCZKESMBOData() {
        return purchaseProtocolCCZKESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolCCZKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData }
     *     
     */
    public void setPurchaseProtocolCCZKESMBOData(PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData value) {
        this.purchaseProtocolCCZKESMBOData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCCDataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseProtocolCCZKESMBOData
        extends PurchaseProtocolCCDataType
    {


    }

}

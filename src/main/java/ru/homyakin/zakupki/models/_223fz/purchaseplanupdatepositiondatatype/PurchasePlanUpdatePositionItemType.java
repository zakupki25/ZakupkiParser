//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:22 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchaseplanupdatepositiondatatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchasePlanUpdatePositionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanUpdatePositionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanUpdatePositionData" type="{http://zakupki.gov.ru/223fz/purchasePlanUpdatePositionDataType/1}purchasePlanUpdatePositionDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanUpdatePositionItemType", propOrder = {
    "purchasePlanUpdatePositionData"
})
public class PurchasePlanUpdatePositionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchasePlanUpdatePositionDataType purchasePlanUpdatePositionData;

    /**
     * Gets the value of the purchasePlanUpdatePositionData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanUpdatePositionDataType }
     *     
     */
    public PurchasePlanUpdatePositionDataType getPurchasePlanUpdatePositionData() {
        return purchasePlanUpdatePositionData;
    }

    /**
     * Sets the value of the purchasePlanUpdatePositionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanUpdatePositionDataType }
     *     
     */
    public void setPurchasePlanUpdatePositionData(PurchasePlanUpdatePositionDataType value) {
        this.purchasePlanUpdatePositionData = value;
    }

}

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
 * <p>Java class for biddingTimeInfoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biddingTimeInfoItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="biddingTimeInfoData" type="{http://zakupki.gov.ru/223fz/purchase/1}biddingTimeInfoDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biddingTimeInfoItemType", propOrder = {
    "biddingTimeInfoData"
})
public class BiddingTimeInfoItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected BiddingTimeInfoDataType biddingTimeInfoData;

    /**
     * Gets the value of the biddingTimeInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingTimeInfoDataType }
     *     
     */
    public BiddingTimeInfoDataType getBiddingTimeInfoData() {
        return biddingTimeInfoData;
    }

    /**
     * Sets the value of the biddingTimeInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingTimeInfoDataType }
     *     
     */
    public void setBiddingTimeInfoData(BiddingTimeInfoDataType value) {
        this.biddingTimeInfoData = value;
    }

}

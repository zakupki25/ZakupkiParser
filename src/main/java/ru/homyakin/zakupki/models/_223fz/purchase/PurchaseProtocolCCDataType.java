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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол изменений условий договора (для конкурса, аукциона, запроса котировок и предложений в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства)
 * 
 * <p>Java class for purchaseProtocolCCDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolCCDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolSummingupInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolSummingupRefferenceDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolCCDataType", propOrder = {
    "protocolSummingupInfo"
})
@XmlSeeAlso({
    ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCZPESMBOItemType.PurchaseProtocolCCZPESMBOData.class,
    ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCAESMBOItemType.PurchaseProtocolCCAESMBOData.class,
    ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOData.class,
    ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCZKESMBOItemType.PurchaseProtocolCCZKESMBOData.class
})
public class PurchaseProtocolCCDataType
    extends PurchaseProtocolDataType
{

    @XmlElement(required = true)
    protected ProtocolSummingupRefferenceDataType protocolSummingupInfo;

    /**
     * Gets the value of the protocolSummingupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolSummingupRefferenceDataType }
     *     
     */
    public ProtocolSummingupRefferenceDataType getProtocolSummingupInfo() {
        return protocolSummingupInfo;
    }

    /**
     * Sets the value of the protocolSummingupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolSummingupRefferenceDataType }
     *     
     */
    public void setProtocolSummingupInfo(ProtocolSummingupRefferenceDataType value) {
        this.protocolSummingupInfo = value;
    }

}

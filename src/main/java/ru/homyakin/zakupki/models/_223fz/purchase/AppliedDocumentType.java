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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о предоставленных документах
 * 
 * <p>Java class for appliedDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appliedDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentRequirement" type="{http://zakupki.gov.ru/223fz/purchase/1}documentRequirementType"/>
 *         &lt;element name="presence" type="{http://zakupki.gov.ru/223fz/purchase/1}documentPresenceType"/>
 *         &lt;element name="comment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appliedDocumentType", propOrder = {
    "documentRequirement",
    "presence",
    "comment"
})
public class AppliedDocumentType {

    @XmlElement(required = true)
    protected DocumentRequirementType documentRequirement;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentPresenceType presence;
    protected String comment;

    /**
     * Gets the value of the documentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRequirementType }
     *     
     */
    public DocumentRequirementType getDocumentRequirement() {
        return documentRequirement;
    }

    /**
     * Sets the value of the documentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRequirementType }
     *     
     */
    public void setDocumentRequirement(DocumentRequirementType value) {
        this.documentRequirement = value;
    }

    /**
     * Gets the value of the presence property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPresenceType }
     *     
     */
    public DocumentPresenceType getPresence() {
        return presence;
    }

    /**
     * Sets the value of the presence property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPresenceType }
     *     
     */
    public void setPresence(DocumentPresenceType value) {
        this.presence = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}

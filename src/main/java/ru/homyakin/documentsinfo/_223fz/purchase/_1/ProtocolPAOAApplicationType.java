//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.purchase._1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.homyakin.documentsinfo._223fz.types._1.ApplicationLotCriteriaListType;
import ru.homyakin.documentsinfo._223fz.types._1.NonResidentInfoType;
import ru.homyakin.documentsinfo._223fz.types._1.SupplierMainInfoType;
import ru.homyakin.documentsinfo._223fz.types._1.WinnerIndication;


/**
 * Заявка в протоколе аукциона
 * 
 * <p>Java class for protocolPAOAApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPAOAApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notDishonest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/223fz/types/1}supplierMainInfoType"/>
 *           &lt;element name="nonResidentInfo" type="{http://zakupki.gov.ru/223fz/types/1}nonResidentInfoType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="lastPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;element name="lastPriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="lastButOnePrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;element name="lastButOnePriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="applicationRate" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="applicationPlace" type="{http://zakupki.gov.ru/223fz/types/1}winnerIndication" minOccurs="0"/>
 *         &lt;element name="assessmentResult" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://zakupki.gov.ru/223fz/types/1}applicationLotCriteriaListType" minOccurs="0"/>
 *         &lt;element name="appliedDocumentsList" type="{http://zakupki.gov.ru/223fz/purchase/1}appliedDocumentsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPAOAApplicationType", propOrder = {
    "applicationNumber",
    "applicationDate",
    "notDishonest",
    "provider",
    "supplierInfo",
    "nonResidentInfo",
    "lastPrice",
    "lastPriceInfo",
    "lastButOnePrice",
    "lastButOnePriceInfo",
    "applicationRate",
    "applicationPlace",
    "assessmentResult",
    "contractSigned",
    "criteria",
    "appliedDocumentsList"
})
public class ProtocolPAOAApplicationType {

    @XmlElement(required = true)
    protected String applicationNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    protected Boolean notDishonest;
    protected Boolean provider;
    protected SupplierMainInfoType supplierInfo;
    protected NonResidentInfoType nonResidentInfo;
    protected BigDecimal lastPrice;
    protected String lastPriceInfo;
    protected BigDecimal lastButOnePrice;
    protected String lastButOnePriceInfo;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger applicationRate;
    @XmlSchemaType(name = "string")
    protected WinnerIndication applicationPlace;
    protected BigDecimal assessmentResult;
    protected Boolean contractSigned;
    protected ApplicationLotCriteriaListType criteria;
    protected AppliedDocumentsListType appliedDocumentsList;

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the notDishonest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDishonest() {
        return notDishonest;
    }

    /**
     * Sets the value of the notDishonest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDishonest(Boolean value) {
        this.notDishonest = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvider(Boolean value) {
        this.provider = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public SupplierMainInfoType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public void setSupplierInfo(SupplierMainInfoType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NonResidentInfoType }
     *     
     */
    public NonResidentInfoType getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonResidentInfoType }
     *     
     */
    public void setNonResidentInfo(NonResidentInfoType value) {
        this.nonResidentInfo = value;
    }

    /**
     * Gets the value of the lastPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * Sets the value of the lastPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPrice(BigDecimal value) {
        this.lastPrice = value;
    }

    /**
     * Gets the value of the lastPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPriceInfo() {
        return lastPriceInfo;
    }

    /**
     * Sets the value of the lastPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPriceInfo(String value) {
        this.lastPriceInfo = value;
    }

    /**
     * Gets the value of the lastButOnePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastButOnePrice() {
        return lastButOnePrice;
    }

    /**
     * Sets the value of the lastButOnePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastButOnePrice(BigDecimal value) {
        this.lastButOnePrice = value;
    }

    /**
     * Gets the value of the lastButOnePriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastButOnePriceInfo() {
        return lastButOnePriceInfo;
    }

    /**
     * Sets the value of the lastButOnePriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastButOnePriceInfo(String value) {
        this.lastButOnePriceInfo = value;
    }

    /**
     * Gets the value of the applicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationRate(BigInteger value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the applicationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link WinnerIndication }
     *     
     */
    public WinnerIndication getApplicationPlace() {
        return applicationPlace;
    }

    /**
     * Sets the value of the applicationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinnerIndication }
     *     
     */
    public void setApplicationPlace(WinnerIndication value) {
        this.applicationPlace = value;
    }

    /**
     * Gets the value of the assessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssessmentResult() {
        return assessmentResult;
    }

    /**
     * Sets the value of the assessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssessmentResult(BigDecimal value) {
        this.assessmentResult = value;
    }

    /**
     * Gets the value of the contractSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractSigned() {
        return contractSigned;
    }

    /**
     * Sets the value of the contractSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractSigned(Boolean value) {
        this.contractSigned = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLotCriteriaListType }
     *     
     */
    public ApplicationLotCriteriaListType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLotCriteriaListType }
     *     
     */
    public void setCriteria(ApplicationLotCriteriaListType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the appliedDocumentsList property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public AppliedDocumentsListType getAppliedDocumentsList() {
        return appliedDocumentsList;
    }

    /**
     * Sets the value of the appliedDocumentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public void setAppliedDocumentsList(AppliedDocumentsListType value) {
        this.appliedDocumentsList = value;
    }

}
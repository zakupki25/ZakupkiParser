//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:28 PM MSK 
//


package ru.homyakin.zakupki.models.oos.polls.rest.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceCallResultStatus" type="{http://zakupki.gov.ru/oos/polls/rest/api/1}serviceCallResultStatusType"/>
 *         &lt;element name="polls" type="{http://zakupki.gov.ru/oos/polls/rest/api/1}pollListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceCallResultStatus",
    "polls"
})
@XmlRootElement(name = "getPollInfoListResponse")
public class GetPollInfoListResponse {

    @XmlElement(required = true)
    protected ServiceCallResultStatusType serviceCallResultStatus;
    protected PollListType polls;

    /**
     * Gets the value of the serviceCallResultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCallResultStatusType }
     *     
     */
    public ServiceCallResultStatusType getServiceCallResultStatus() {
        return serviceCallResultStatus;
    }

    /**
     * Sets the value of the serviceCallResultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCallResultStatusType }
     *     
     */
    public void setServiceCallResultStatus(ServiceCallResultStatusType value) {
        this.serviceCallResultStatus = value;
    }

    /**
     * Gets the value of the polls property.
     * 
     * @return
     *     possible object is
     *     {@link PollListType }
     *     
     */
    public PollListType getPolls() {
        return polls;
    }

    /**
     * Sets the value of the polls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollListType }
     *     
     */
    public void setPolls(PollListType value) {
        this.polls = value;
    }

}

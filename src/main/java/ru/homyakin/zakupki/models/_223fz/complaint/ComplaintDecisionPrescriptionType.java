//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:42 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.complaint;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complaintDecisionPrescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="complaintDecisionPrescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "complaintDecisionPrescriptionType")
@XmlEnum
public enum ComplaintDecisionPrescriptionType {


    /**
     * Выдать
     * 
     */
    I,

    /**
     * Не выдавать
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static ComplaintDecisionPrescriptionType fromValue(String v) {
        return valueOf(v);
    }

}

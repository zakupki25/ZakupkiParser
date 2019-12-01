//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseCancellationReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchaseCancellationReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_APPLICATIONS"/>
 *     &lt;enumeration value="ONE_APPLICATION"/>
 *     &lt;enumeration value="ACCESS_DENIED_ALL"/>
 *     &lt;enumeration value="ACCESS_GRANTED_ONE"/>
 *     &lt;enumeration value="NO_PRICE_OFFERS"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchaseCancellationReasonType")
@XmlEnum
public enum PurchaseCancellationReasonType {


    /**
     * На участие в закупке не подано ни одной заявки
     * 
     */
    NO_APPLICATIONS,

    /**
     * На участие в закупке была подана только одна заявка
     * 
     */
    ONE_APPLICATION,

    /**
     * По итогам рассмотрения отказано в допуске всем участникам закупки
     * 
     */
    ACCESS_DENIED_ALL,

    /**
     * По итогам рассмотрения допущен только один участник закупки
     * 
     */
    ACCESS_GRANTED_ONE,

    /**
     * Не подано ни одного ценового предложения
     * 
     */
    NO_PRICE_OFFERS,

    /**
     * Иная
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static PurchaseCancellationReasonType fromValue(String v) {
        return valueOf(v);
    }

}
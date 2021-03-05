//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.05 at 11:35:44 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planInformationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="planInformationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PLAN_PROJECT"/>
 *     &lt;enumeration value="PLAN_PROJECT_MODIFICATION"/>
 *     &lt;enumeration value="PLAN"/>
 *     &lt;enumeration value="PLAN_MODIFICATION"/>
 *     &lt;enumeration value="SMB"/>
 *     &lt;enumeration value="SMB_MODIFICATION"/>
 *     &lt;enumeration value="HIGH_TECH"/>
 *     &lt;enumeration value="HIGH_TECH_MODIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "planInformationType")
@XmlEnum
public enum PlanInformationType {


    /**
     * Проект плана закупки
     * 
     */
    PLAN_PROJECT,

    /**
     * Проект изменений плана закупки
     * 
     */
    PLAN_PROJECT_MODIFICATION,

    /**
     * План закупки
     * 
     */
    PLAN,

    /**
     * Изменение плана закупки
     * 
     */
    PLAN_MODIFICATION,

    /**
     * Отчет МСП
     * 
     */
    SMB,

    /**
     * Изменение отчета МСП
     * 
     */
    SMB_MODIFICATION,

    /**
     * Отчет ИПВП
     * 
     */
    HIGH_TECH,

    /**
     * Изменение отчета ИПВП
     * 
     */
    HIGH_TECH_MODIFICATION;

    public String value() {
        return name();
    }

    public static PlanInformationType fromValue(String v) {
        return valueOf(v);
    }

}

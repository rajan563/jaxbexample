//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.31 at 12:54:31 AM GMT+05:30 
//


package com.rajantech.camel.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


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
 *         &lt;element name="AcCnyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "acCnyCd",
    "acNr"
})
@XmlRootElement(name = "Id")
@JsonInclude(Include.NON_NULL)
public class Id {

    @XmlElement(name = "AcCnyCd")
    protected String acCnyCd;
    @XmlElement(name = "AcNr")
    protected String acNr;

    /**
     * Gets the value of the acCnyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcCnyCd() {
        return acCnyCd;
    }

    /**
     * Sets the value of the acCnyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcCnyCd(String value) {
        this.acCnyCd = value;
    }

    /**
     * Gets the value of the acNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcNr() {
        return acNr;
    }

    /**
     * Sets the value of the acNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcNr(String value) {
        this.acNr = value;
    }

}
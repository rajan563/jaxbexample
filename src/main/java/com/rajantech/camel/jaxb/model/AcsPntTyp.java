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
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * <p>Java class for AcsPntTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcsPntTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcsPntTyp", propOrder = {
    "typCd",
    "idNr"
})
@JsonInclude(Include.NON_NULL)
public class AcsPntTyp {

    @XmlElement(name = "TypCd")
    protected String typCd;
    @XmlElement(name = "IdNr")
    protected String idNr;

    /**
     * Gets the value of the typCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypCd() {
        return typCd;
    }

    /**
     * Sets the value of the typCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypCd(String value) {
        this.typCd = value;
    }

    /**
     * Gets the value of the idNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNr() {
        return idNr;
    }

    /**
     * Sets the value of the idNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNr(String value) {
        this.idNr = value;
    }

}

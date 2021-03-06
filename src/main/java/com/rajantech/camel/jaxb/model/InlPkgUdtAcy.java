//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.31 at 12:54:31 AM GMT+05:30 
//


package com.rajantech.camel.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 *         &lt;element name="InlPkgUdtStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InlPkgUdtSraCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SraDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{upscm}AcyTypCd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{upscm}DatCpMthCgyCd"/>
 *       &lt;attribute ref="{upscm}DatCpInfSrcCd"/>
 *       &lt;attribute ref="{upscm}InfSrcCd"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inlPkgUdtStsCd",
    "inlPkgUdtSraCd",
    "sraDtTm",
    "acyTypCd"
})
@XmlRootElement(name = "InlPkgUdtAcy")
@JsonInclude(Include.NON_NULL)
public class InlPkgUdtAcy {

    @XmlElement(name = "InlPkgUdtStsCd")
    protected String inlPkgUdtStsCd;
    @XmlElement(name = "InlPkgUdtSraCd")
    protected String inlPkgUdtSraCd;
    @XmlElement(name = "SraDtTm")
    @XmlSchemaType(name = "dateTime")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    protected String sraDtTm;
    @XmlElement(name = "AcyTypCd", namespace = "upscm")
    protected String acyTypCd;
    @XmlAttribute(name = "DatCpMthCgyCd", namespace = "upscm")
    @XmlSchemaType(name = "anySimpleType")
    protected String datCpMthCgyCd;
    @XmlAttribute(name = "DatCpInfSrcCd", namespace = "upscm")
    @XmlSchemaType(name = "anySimpleType")
    protected String datCpInfSrcCd;
    @XmlAttribute(name = "InfSrcCd", namespace = "upscm")
    @XmlSchemaType(name = "anySimpleType")
    protected String infSrcCd;

    /**
     * Gets the value of the inlPkgUdtStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlPkgUdtStsCd() {
        return inlPkgUdtStsCd;
    }

    /**
     * Sets the value of the inlPkgUdtStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlPkgUdtStsCd(String value) {
        this.inlPkgUdtStsCd = value;
    }

    /**
     * Gets the value of the inlPkgUdtSraCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlPkgUdtSraCd() {
        return inlPkgUdtSraCd;
    }

    /**
     * Sets the value of the inlPkgUdtSraCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlPkgUdtSraCd(String value) {
        this.inlPkgUdtSraCd = value;
    }

    /**
     * Gets the value of the sraDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getSraDtTm() {
        return sraDtTm;
    }

    /**
     * Sets the value of the sraDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSraDtTm(String value) {
        this.sraDtTm = value;
    }

    /**
     * Gets the value of the acyTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcyTypCd() {
        return acyTypCd;
    }

    /**
     * Sets the value of the acyTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcyTypCd(String value) {
        this.acyTypCd = value;
    }

    /**
     * Gets the value of the datCpMthCgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatCpMthCgyCd() {
        return datCpMthCgyCd;
    }

    /**
     * Sets the value of the datCpMthCgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatCpMthCgyCd(String value) {
        this.datCpMthCgyCd = value;
    }

    /**
     * Gets the value of the datCpInfSrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatCpInfSrcCd() {
        return datCpInfSrcCd;
    }

    /**
     * Sets the value of the datCpInfSrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatCpInfSrcCd(String value) {
        this.datCpInfSrcCd = value;
    }

    /**
     * Gets the value of the infSrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfSrcCd() {
        return infSrcCd;
    }

    /**
     * Sets the value of the infSrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfSrcCd(String value) {
        this.infSrcCd = value;
    }

}

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
 *         &lt;element ref="{upscm}MsgHdr"/>
 *         &lt;element ref="{upscm}Smt" minOccurs="0"/>
 *         &lt;element ref="{upscm}Shu"/>
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
    "msgHdr",
    "smt",
    "shu"
})
@XmlRootElement(name = "PkgSt")
@JsonInclude(Include.NON_NULL)
public class PkgSt {

    @XmlElement(name = "MsgHdr", namespace = "upscm", required = true)
    protected MsgHdr msgHdr;
    @XmlElement(name = "Smt", namespace = "upscm")
    protected Smt smt;
    @XmlElement(name = "Shu", namespace = "upscm", required = true)
    protected Shu shu;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgHdr }
     *     
     */
    public MsgHdr getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgHdr }
     *     
     */
    public void setMsgHdr(MsgHdr value) {
        this.msgHdr = value;
    }

    /**
     * Gets the value of the smt property.
     * 
     * @return
     *     possible object is
     *     {@link Smt }
     *     
     */
    public Smt getSmt() {
        return smt;
    }

    /**
     * Sets the value of the smt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Smt }
     *     
     */
    public void setSmt(Smt value) {
        this.smt = value;
    }

    /**
     * Gets the value of the shu property.
     * 
     * @return
     *     possible object is
     *     {@link Shu }
     *     
     */
    public Shu getShu() {
        return shu;
    }

    /**
     * Sets the value of the shu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shu }
     *     
     */
    public void setShu(Shu value) {
        this.shu = value;
    }

}

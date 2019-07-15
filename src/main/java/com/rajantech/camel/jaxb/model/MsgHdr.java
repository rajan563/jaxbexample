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
 *         &lt;element name="MsgFmtNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MsgFmtVerNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MsgInfSrcCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MsgOidNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MsgTs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MsgEvtTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FcsRulTe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubRecTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShuDveNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExlStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfMgtSysInsTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShuLocRlCgyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgUplCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgTgrInfSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MnfOrlInfSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LtMsgIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{upscm}RefDatDxnCd"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgFmtNr",
    "msgFmtVerNr",
    "msgInfSrcCd",
    "msgOidNr",
    "msgTs",
    "msgEvtTs",
    "fcsRulTe",
    "recTypCd",
    "subRecTypCd",
    "shuDveNr",
    "exlStsCd",
    "infMgtSysInsTs",
    "shuLocRlCgyCd",
    "msgUplCd",
    "msgTgrInfSrcCd",
    "mnfOrlInfSrcCd",
    "ltMsgIr"
})
@XmlRootElement(name = "MsgHdr")
@JsonInclude(Include.NON_NULL)
public class MsgHdr {

    @XmlElement(name = "MsgFmtNr", required = true)
    protected String msgFmtNr;
    @XmlElement(name = "MsgFmtVerNr", required = true)
    protected String msgFmtVerNr;
    @XmlElement(name = "MsgInfSrcCd", required = true)
    protected String msgInfSrcCd;
    @XmlElement(name = "MsgOidNr", required = true)
    protected String msgOidNr;
    @XmlElement(name = "MsgTs", required = true)
    @XmlSchemaType(name = "dateTime")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    protected String msgTs;
    @XmlElement(name = "MsgEvtTs")
    @XmlSchemaType(name = "dateTime")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    protected String msgEvtTs;
    @XmlElement(name = "FcsRulTe")
    protected String fcsRulTe;
    @XmlElement(name = "RecTypCd")
    protected String recTypCd;
    @XmlElement(name = "SubRecTypCd")
    protected String subRecTypCd;
    @XmlElement(name = "ShuDveNr")
    protected String shuDveNr;
    @XmlElement(name = "ExlStsCd")
    protected String exlStsCd;
    @XmlElement(name = "InfMgtSysInsTs")
    @XmlSchemaType(name = "dateTime")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    protected String infMgtSysInsTs;
    @XmlElement(name = "ShuLocRlCgyCd")
    protected String shuLocRlCgyCd;
    @XmlElement(name = "MsgUplCd")
    protected String msgUplCd;
    @XmlElement(name = "MsgTgrInfSrcCd")
    protected String msgTgrInfSrcCd;
    @XmlElement(name = "MnfOrlInfSrcCd")
    protected String mnfOrlInfSrcCd;
    @XmlElement(name = "LtMsgIr")
    protected Boolean ltMsgIr;
    @XmlAttribute(name = "RefDatDxnCd", namespace = "upscm")
    @XmlSchemaType(name = "anySimpleType")
    protected String refDatDxnCd;

    /**
     * Gets the value of the msgFmtNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFmtNr() {
        return msgFmtNr;
    }

    /**
     * Sets the value of the msgFmtNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFmtNr(String value) {
        this.msgFmtNr = value;
    }

    /**
     * Gets the value of the msgFmtVerNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFmtVerNr() {
        return msgFmtVerNr;
    }

    /**
     * Sets the value of the msgFmtVerNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFmtVerNr(String value) {
        this.msgFmtVerNr = value;
    }

    /**
     * Gets the value of the msgInfSrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgInfSrcCd() {
        return msgInfSrcCd;
    }

    /**
     * Sets the value of the msgInfSrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgInfSrcCd(String value) {
        this.msgInfSrcCd = value;
    }

    /**
     * Gets the value of the msgOidNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgOidNr() {
        return msgOidNr;
    }

    /**
     * Sets the value of the msgOidNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgOidNr(String value) {
        this.msgOidNr = value;
    }

    /**
     * Gets the value of the msgTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getMsgTs() {
        return msgTs;
    }

    /**
     * Sets the value of the msgTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgTs(String value) {
        this.msgTs = value;
    }

    /**
     * Gets the value of the msgEvtTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getMsgEvtTs() {
        return msgEvtTs;
    }

    /**
     * Sets the value of the msgEvtTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgEvtTs(String value) {
        this.msgEvtTs = value;
    }

    /**
     * Gets the value of the fcsRulTe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcsRulTe() {
        return fcsRulTe;
    }

    /**
     * Sets the value of the fcsRulTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcsRulTe(String value) {
        this.fcsRulTe = value;
    }

    /**
     * Gets the value of the recTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecTypCd() {
        return recTypCd;
    }

    /**
     * Sets the value of the recTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecTypCd(String value) {
        this.recTypCd = value;
    }

    /**
     * Gets the value of the subRecTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRecTypCd() {
        return subRecTypCd;
    }

    /**
     * Sets the value of the subRecTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRecTypCd(String value) {
        this.subRecTypCd = value;
    }

    /**
     * Gets the value of the shuDveNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShuDveNr() {
        return shuDveNr;
    }

    /**
     * Sets the value of the shuDveNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShuDveNr(String value) {
        this.shuDveNr = value;
    }

    /**
     * Gets the value of the exlStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExlStsCd() {
        return exlStsCd;
    }

    /**
     * Sets the value of the exlStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExlStsCd(String value) {
        this.exlStsCd = value;
    }

    /**
     * Gets the value of the infMgtSysInsTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getInfMgtSysInsTs() {
        return infMgtSysInsTs;
    }

    /**
     * Sets the value of the infMgtSysInsTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInfMgtSysInsTs(String value) {
        this.infMgtSysInsTs = value;
    }

    /**
     * Gets the value of the shuLocRlCgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShuLocRlCgyCd() {
        return shuLocRlCgyCd;
    }

    /**
     * Sets the value of the shuLocRlCgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShuLocRlCgyCd(String value) {
        this.shuLocRlCgyCd = value;
    }

    /**
     * Gets the value of the msgUplCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgUplCd() {
        return msgUplCd;
    }

    /**
     * Sets the value of the msgUplCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUplCd(String value) {
        this.msgUplCd = value;
    }

    /**
     * Gets the value of the msgTgrInfSrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgTgrInfSrcCd() {
        return msgTgrInfSrcCd;
    }

    /**
     * Sets the value of the msgTgrInfSrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgTgrInfSrcCd(String value) {
        this.msgTgrInfSrcCd = value;
    }

    /**
     * Gets the value of the mnfOrlInfSrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnfOrlInfSrcCd() {
        return mnfOrlInfSrcCd;
    }

    /**
     * Sets the value of the mnfOrlInfSrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnfOrlInfSrcCd(String value) {
        this.mnfOrlInfSrcCd = value;
    }

    /**
     * Gets the value of the ltMsgIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLtMsgIr() {
        return ltMsgIr;
    }

    /**
     * Sets the value of the ltMsgIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLtMsgIr(Boolean value) {
        this.ltMsgIr = value;
    }

    /**
     * Gets the value of the refDatDxnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDatDxnCd() {
        return refDatDxnCd;
    }

    /**
     * Sets the value of the refDatDxnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDatDxnCd(String value) {
        this.refDatDxnCd = value;
    }

}
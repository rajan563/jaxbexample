//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.31 at 12:54:31 AM GMT+05:30 
//


package com.rajantech.camel.jaxb.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * <p>Java class for AdTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtnOfNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BdgNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BdgNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChnIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorRsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorRlvCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CsfValSghCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{upscm}CnyCd" minOccurs="0"/>
 *         &lt;element ref="{upscm}CnySdvCd" minOccurs="0"/>
 *         &lt;element name="EnrIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Al1Te" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Al2Te" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Al3Te" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunSdvNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonFmtPslCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriPslCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecPslCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrCgyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrCgyTe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrPfxNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrSufNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StsDscTe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{upscm}SecUnt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecUntMnmTe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecUntNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CtcPhnNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CtcEmlTe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UdtIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DpaPlnMtcIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValAtpIr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VrsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdRtgCsfCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SvcPntDelLocNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocStpNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{upscm}InfSrcCd"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdTyp", propOrder = {
    "adNa",
    "adTypCd",
    "atnOfNa",
    "bdgNr",
    "bdgNa",
    "chnIr",
    "corRsnCd",
    "corRlvCd",
    "csfValSghCd",
    "cnyCd",
    "cnySdvCd",
    "enrIr",
    "al1Te",
    "al2Te",
    "al3Te",
    "munNa",
    "munSdvNa",
    "nonFmtPslCd",
    "priPslCd",
    "secPslCd",
    "strCgyCd",
    "strCgyTe",
    "strNa",
    "strPfxNa",
    "strSufNa",
    "stsDscTe",
    "secUnt",
    "secUntMnmTe",
    "secUntNr",
    "ctcPhnNr",
    "ctcEmlTe",
    "udtIr",
    "dpaPlnMtcIr",
    "valAtpIr",
    "vrsCd",
    "adRtgCsfCd",
    "svcPntDelLocNr",
    "locStpNr"
})
@XmlSeeAlso({
    com.rajantech.camel.jaxb.model.Shu.CnsAd.class
})
@JsonInclude(Include.NON_NULL)
public class AdTyp {

    @XmlElement(name = "AdNa")
    protected String adNa;
    @XmlElement(name = "AdTypCd")
    protected String adTypCd;
    @XmlElement(name = "AtnOfNa")
    protected String atnOfNa;
    @XmlElement(name = "BdgNr")
    protected String bdgNr;
    @XmlElement(name = "BdgNa")
    protected String bdgNa;
    @XmlElement(name = "ChnIr")
    protected Boolean chnIr;
    @XmlElement(name = "CorRsnCd")
    protected String corRsnCd;
    @XmlElement(name = "CorRlvCd")
    protected String corRlvCd;
    @XmlElement(name = "CsfValSghCd")
    protected String csfValSghCd;
    @XmlElement(name = "CnyCd", namespace = "upscm")
    protected String cnyCd;
    @XmlElement(name = "CnySdvCd", namespace = "upscm")
    protected String cnySdvCd;
    @XmlElement(name = "EnrIr")
    protected Boolean enrIr;
    @XmlElement(name = "Al1Te")
    protected String al1Te;
    @XmlElement(name = "Al2Te")
    protected String al2Te;
    @XmlElement(name = "Al3Te")
    protected String al3Te;
    @XmlElement(name = "MunNa")
    protected String munNa;
    @XmlElement(name = "MunSdvNa")
    protected String munSdvNa;
    @XmlElement(name = "NonFmtPslCd")
    protected String nonFmtPslCd;
    @XmlElement(name = "PriPslCd")
    protected String priPslCd;
    @XmlElement(name = "SecPslCd")
    protected String secPslCd;
    @XmlElement(name = "StrCgyCd")
    protected String strCgyCd;
    @XmlElement(name = "StrCgyTe")
    protected String strCgyTe;
    @XmlElement(name = "StrNa")
    protected String strNa;
    @XmlElement(name = "StrPfxNa")
    protected String strPfxNa;
    @XmlElement(name = "StrSufNa")
    protected String strSufNa;
    @XmlElement(name = "StsDscTe")
    protected String stsDscTe;
    @XmlElement(name = "SecUnt", namespace = "upscm")
    protected List<SecUnt> secUnt;
    @XmlElement(name = "SecUntMnmTe")
    protected String secUntMnmTe;
    @XmlElement(name = "SecUntNr")
    protected String secUntNr;
    @XmlElement(name = "CtcPhnNr")
    protected String ctcPhnNr;
    @XmlElement(name = "CtcEmlTe")
    protected String ctcEmlTe;
    @XmlElement(name = "UdtIr")
    protected Boolean udtIr;
    @XmlElement(name = "DpaPlnMtcIr")
    protected Boolean dpaPlnMtcIr;
    @XmlElement(name = "ValAtpIr")
    protected Boolean valAtpIr;
    @XmlElement(name = "VrsCd")
    protected String vrsCd;
    @XmlElement(name = "AdRtgCsfCd")
    protected String adRtgCsfCd;
    @XmlElement(name = "SvcPntDelLocNr")
    protected String svcPntDelLocNr;
    @XmlElement(name = "LocStpNr")
    protected String locStpNr;
    @XmlAttribute(name = "InfSrcCd", namespace = "upscm")
    @XmlSchemaType(name = "anySimpleType")
    protected String infSrcCd;

    /**
     * Gets the value of the adNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdNa() {
        return adNa;
    }

    /**
     * Sets the value of the adNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdNa(String value) {
        this.adNa = value;
    }

    /**
     * Gets the value of the adTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdTypCd() {
        return adTypCd;
    }

    /**
     * Sets the value of the adTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdTypCd(String value) {
        this.adTypCd = value;
    }

    /**
     * Gets the value of the atnOfNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtnOfNa() {
        return atnOfNa;
    }

    /**
     * Sets the value of the atnOfNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtnOfNa(String value) {
        this.atnOfNa = value;
    }

    /**
     * Gets the value of the bdgNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdgNr() {
        return bdgNr;
    }

    /**
     * Sets the value of the bdgNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdgNr(String value) {
        this.bdgNr = value;
    }

    /**
     * Gets the value of the bdgNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdgNa() {
        return bdgNa;
    }

    /**
     * Sets the value of the bdgNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdgNa(String value) {
        this.bdgNa = value;
    }

    /**
     * Gets the value of the chnIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChnIr() {
        return chnIr;
    }

    /**
     * Sets the value of the chnIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChnIr(Boolean value) {
        this.chnIr = value;
    }

    /**
     * Gets the value of the corRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorRsnCd() {
        return corRsnCd;
    }

    /**
     * Sets the value of the corRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorRsnCd(String value) {
        this.corRsnCd = value;
    }

    /**
     * Gets the value of the corRlvCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorRlvCd() {
        return corRlvCd;
    }

    /**
     * Sets the value of the corRlvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorRlvCd(String value) {
        this.corRlvCd = value;
    }

    /**
     * Gets the value of the csfValSghCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsfValSghCd() {
        return csfValSghCd;
    }

    /**
     * Sets the value of the csfValSghCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsfValSghCd(String value) {
        this.csfValSghCd = value;
    }

    /**
     * Gets the value of the cnyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnyCd() {
        return cnyCd;
    }

    /**
     * Sets the value of the cnyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnyCd(String value) {
        this.cnyCd = value;
    }

    /**
     * Gets the value of the cnySdvCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnySdvCd() {
        return cnySdvCd;
    }

    /**
     * Sets the value of the cnySdvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnySdvCd(String value) {
        this.cnySdvCd = value;
    }

    /**
     * Gets the value of the enrIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnrIr() {
        return enrIr;
    }

    /**
     * Sets the value of the enrIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnrIr(Boolean value) {
        this.enrIr = value;
    }

    /**
     * Gets the value of the al1Te property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAl1Te() {
        return al1Te;
    }

    /**
     * Sets the value of the al1Te property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAl1Te(String value) {
        this.al1Te = value;
    }

    /**
     * Gets the value of the al2Te property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAl2Te() {
        return al2Te;
    }

    /**
     * Sets the value of the al2Te property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAl2Te(String value) {
        this.al2Te = value;
    }

    /**
     * Gets the value of the al3Te property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAl3Te() {
        return al3Te;
    }

    /**
     * Sets the value of the al3Te property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAl3Te(String value) {
        this.al3Te = value;
    }

    /**
     * Gets the value of the munNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunNa() {
        return munNa;
    }

    /**
     * Sets the value of the munNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunNa(String value) {
        this.munNa = value;
    }

    /**
     * Gets the value of the munSdvNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunSdvNa() {
        return munSdvNa;
    }

    /**
     * Sets the value of the munSdvNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunSdvNa(String value) {
        this.munSdvNa = value;
    }

    /**
     * Gets the value of the nonFmtPslCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonFmtPslCd() {
        return nonFmtPslCd;
    }

    /**
     * Sets the value of the nonFmtPslCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonFmtPslCd(String value) {
        this.nonFmtPslCd = value;
    }

    /**
     * Gets the value of the priPslCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriPslCd() {
        return priPslCd;
    }

    /**
     * Sets the value of the priPslCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriPslCd(String value) {
        this.priPslCd = value;
    }

    /**
     * Gets the value of the secPslCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecPslCd() {
        return secPslCd;
    }

    /**
     * Sets the value of the secPslCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecPslCd(String value) {
        this.secPslCd = value;
    }

    /**
     * Gets the value of the strCgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCgyCd() {
        return strCgyCd;
    }

    /**
     * Sets the value of the strCgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCgyCd(String value) {
        this.strCgyCd = value;
    }

    /**
     * Gets the value of the strCgyTe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCgyTe() {
        return strCgyTe;
    }

    /**
     * Sets the value of the strCgyTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCgyTe(String value) {
        this.strCgyTe = value;
    }

    /**
     * Gets the value of the strNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNa() {
        return strNa;
    }

    /**
     * Sets the value of the strNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNa(String value) {
        this.strNa = value;
    }

    /**
     * Gets the value of the strPfxNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPfxNa() {
        return strPfxNa;
    }

    /**
     * Sets the value of the strPfxNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPfxNa(String value) {
        this.strPfxNa = value;
    }

    /**
     * Gets the value of the strSufNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSufNa() {
        return strSufNa;
    }

    /**
     * Sets the value of the strSufNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSufNa(String value) {
        this.strSufNa = value;
    }

    /**
     * Gets the value of the stsDscTe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsDscTe() {
        return stsDscTe;
    }

    /**
     * Sets the value of the stsDscTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsDscTe(String value) {
        this.stsDscTe = value;
    }

    /**
     * Gets the value of the secUnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secUnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecUnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecUnt }
     * 
     * 
     */
    public List<SecUnt> getSecUnt() {
        if (secUnt == null) {
            secUnt = new ArrayList<SecUnt>();
        }
        return this.secUnt;
    }

    /**
     * Gets the value of the secUntMnmTe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecUntMnmTe() {
        return secUntMnmTe;
    }

    /**
     * Sets the value of the secUntMnmTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecUntMnmTe(String value) {
        this.secUntMnmTe = value;
    }

    /**
     * Gets the value of the secUntNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecUntNr() {
        return secUntNr;
    }

    /**
     * Sets the value of the secUntNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecUntNr(String value) {
        this.secUntNr = value;
    }

    /**
     * Gets the value of the ctcPhnNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcPhnNr() {
        return ctcPhnNr;
    }

    /**
     * Sets the value of the ctcPhnNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcPhnNr(String value) {
        this.ctcPhnNr = value;
    }

    /**
     * Gets the value of the ctcEmlTe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcEmlTe() {
        return ctcEmlTe;
    }

    /**
     * Sets the value of the ctcEmlTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcEmlTe(String value) {
        this.ctcEmlTe = value;
    }

    /**
     * Gets the value of the udtIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUdtIr() {
        return udtIr;
    }

    /**
     * Sets the value of the udtIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUdtIr(Boolean value) {
        this.udtIr = value;
    }

    /**
     * Gets the value of the dpaPlnMtcIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDpaPlnMtcIr() {
        return dpaPlnMtcIr;
    }

    /**
     * Sets the value of the dpaPlnMtcIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDpaPlnMtcIr(Boolean value) {
        this.dpaPlnMtcIr = value;
    }

    /**
     * Gets the value of the valAtpIr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValAtpIr() {
        return valAtpIr;
    }

    /**
     * Sets the value of the valAtpIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValAtpIr(Boolean value) {
        this.valAtpIr = value;
    }

    /**
     * Gets the value of the vrsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsCd() {
        return vrsCd;
    }

    /**
     * Sets the value of the vrsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsCd(String value) {
        this.vrsCd = value;
    }

    /**
     * Gets the value of the adRtgCsfCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdRtgCsfCd() {
        return adRtgCsfCd;
    }

    /**
     * Sets the value of the adRtgCsfCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdRtgCsfCd(String value) {
        this.adRtgCsfCd = value;
    }

    /**
     * Gets the value of the svcPntDelLocNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPntDelLocNr() {
        return svcPntDelLocNr;
    }

    /**
     * Sets the value of the svcPntDelLocNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcPntDelLocNr(String value) {
        this.svcPntDelLocNr = value;
    }

    /**
     * Gets the value of the locStpNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocStpNr() {
        return locStpNr;
    }

    /**
     * Sets the value of the locStpNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocStpNr(String value) {
        this.locStpNr = value;
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

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * <p>Java class for DelDtTmTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelDtTmTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SddDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SddTm" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="RddDt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute ref="{upscm}ErrCd"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RddTm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
 *                 &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RddCclMthCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RcdDt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute ref="{upscm}ErrCd"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RcdTm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
 *                 &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RcdCclMthCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelDtTmTyp", propOrder = {
    "sddDt",
    "sddTm",
    "rddDt",
    "rddTm",
    "rddCclMthCd",
    "rcdDt",
    "rcdTm",
    "rcdCclMthCd"
})
@JsonInclude(Include.NON_NULL)
public class DelDtTmTyp {

    @XmlElement(name = "SddDt")
    @XmlSchemaType(name = "date")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    protected String sddDt;
    @XmlElement(name = "SddTm")
    @XmlSchemaType(name = "time")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    protected String sddTm;
    @XmlElement(name = "RddDt")
    protected DelDtTmTyp.RddDt rddDt;
    @XmlElement(name = "RddTm")
    protected DelDtTmTyp.RddTm rddTm;
    @XmlElement(name = "RddCclMthCd")
    protected String rddCclMthCd;
    @XmlElement(name = "RcdDt")
    protected DelDtTmTyp.RcdDt rcdDt;
    @XmlElement(name = "RcdTm")
    protected DelDtTmTyp.RcdTm rcdTm;
    @XmlElement(name = "RcdCclMthCd")
    protected String rcdCclMthCd;

    /**
     * Gets the value of the sddDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getSddDt() {
        return sddDt;
    }

    /**
     * Sets the value of the sddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSddDt(String value) {
        this.sddDt = value;
    }

    /**
     * Gets the value of the sddTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getSddTm() {
        return sddTm;
    }

    /**
     * Sets the value of the sddTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSddTm(String value) {
        this.sddTm = value;
    }

    /**
     * Gets the value of the rddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DelDtTmTyp.RddDt }
     *     
     */
    public DelDtTmTyp.RddDt getRddDt() {
        return rddDt;
    }

    /**
     * Sets the value of the rddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelDtTmTyp.RddDt }
     *     
     */
    public void setRddDt(DelDtTmTyp.RddDt value) {
        this.rddDt = value;
    }

    /**
     * Gets the value of the rddTm property.
     * 
     * @return
     *     possible object is
     *     {@link DelDtTmTyp.RddTm }
     *     
     */
    public DelDtTmTyp.RddTm getRddTm() {
        return rddTm;
    }

    /**
     * Sets the value of the rddTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelDtTmTyp.RddTm }
     *     
     */
    public void setRddTm(DelDtTmTyp.RddTm value) {
        this.rddTm = value;
    }

    /**
     * Gets the value of the rddCclMthCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRddCclMthCd() {
        return rddCclMthCd;
    }

    /**
     * Sets the value of the rddCclMthCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRddCclMthCd(String value) {
        this.rddCclMthCd = value;
    }

    /**
     * Gets the value of the rcdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DelDtTmTyp.RcdDt }
     *     
     */
    public DelDtTmTyp.RcdDt getRcdDt() {
        return rcdDt;
    }

    /**
     * Sets the value of the rcdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelDtTmTyp.RcdDt }
     *     
     */
    public void setRcdDt(DelDtTmTyp.RcdDt value) {
        this.rcdDt = value;
    }

    /**
     * Gets the value of the rcdTm property.
     * 
     * @return
     *     possible object is
     *     {@link DelDtTmTyp.RcdTm }
     *     
     */
    public DelDtTmTyp.RcdTm getRcdTm() {
        return rcdTm;
    }

    /**
     * Sets the value of the rcdTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelDtTmTyp.RcdTm }
     *     
     */
    public void setRcdTm(DelDtTmTyp.RcdTm value) {
        this.rcdTm = value;
    }

    /**
     * Gets the value of the rcdCclMthCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcdCclMthCd() {
        return rcdCclMthCd;
    }

    /**
     * Sets the value of the rcdCclMthCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcdCclMthCd(String value) {
        this.rcdCclMthCd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute ref="{upscm}ErrCd"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @JsonInclude(Include.NON_NULL)
    public static class RcdDt {

        @XmlValue
        @XmlSchemaType(name = "date")
        //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
        protected String value;
        @XmlAttribute(name = "RliIdxPr")
        @XmlSchemaType(name = "anySimpleType")
        protected String rliIdxPr;
        @XmlAttribute(name = "ErrCd", namespace = "upscm")
        @XmlSchemaType(name = "anySimpleType")
        protected String errCd;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the rliIdxPr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRliIdxPr() {
            return rliIdxPr;
        }

        /**
         * Sets the value of the rliIdxPr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRliIdxPr(String value) {
            this.rliIdxPr = value;
        }

        /**
         * Gets the value of the errCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrCd() {
            return errCd;
        }

        /**
         * Sets the value of the errCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrCd(String value) {
            this.errCd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
     *       &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @JsonInclude(Include.NON_NULL)
    public static class RcdTm {

        @XmlValue
        @XmlSchemaType(name = "time")
        //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
        protected String value;
        @XmlAttribute(name = "RliIdxPr")
        @XmlSchemaType(name = "anySimpleType")
        protected String rliIdxPr;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the rliIdxPr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRliIdxPr() {
            return rliIdxPr;
        }

        /**
         * Sets the value of the rliIdxPr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRliIdxPr(String value) {
            this.rliIdxPr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute ref="{upscm}ErrCd"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @JsonInclude(Include.NON_NULL)
    public static class RddDt {

        @XmlValue
        @XmlSchemaType(name = "date")
        //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
        protected String value;
        @XmlAttribute(name = "RliIdxPr")
        @XmlSchemaType(name = "anySimpleType")
        protected String rliIdxPr;
        @XmlAttribute(name = "ErrCd", namespace = "upscm")
        @XmlSchemaType(name = "anySimpleType")
        protected String errCd;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the rliIdxPr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRliIdxPr() {
            return rliIdxPr;
        }

        /**
         * Sets the value of the rliIdxPr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRliIdxPr(String value) {
            this.rliIdxPr = value;
        }

        /**
         * Gets the value of the errCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrCd() {
            return errCd;
        }

        /**
         * Sets the value of the errCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrCd(String value) {
            this.errCd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
     *       &lt;attribute name="RliIdxPr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @JsonInclude(Include.NON_NULL)
    public static class RddTm {

        @XmlValue
        @XmlSchemaType(name = "time")
        //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
        protected String value;
        @XmlAttribute(name = "RliIdxPr")
        @XmlSchemaType(name = "anySimpleType")
        protected String rliIdxPr;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the rliIdxPr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRliIdxPr() {
            return rliIdxPr;
        }

        /**
         * Sets the value of the rliIdxPr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRliIdxPr(String value) {
            this.rliIdxPr = value;
        }

    }

}
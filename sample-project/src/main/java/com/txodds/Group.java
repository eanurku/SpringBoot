//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:54:32 AM IST 
//


package com.txodds;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="group">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" use="required" type="{}id" />
 *       &lt;attribute name="cgid" use="required" type="{}id" />
 *       &lt;attribute name="spid" use="required" type="{}id" />
 *       &lt;attribute name="cnid" use="required" type="{}id" />
 *       &lt;attribute name="mgid" use="required" type="{}id" />
 *       &lt;attribute name="cname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group", propOrder = {
    "value"
})
public class Group {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "cgid", required = true)
    protected BigInteger cgid;
    @XmlAttribute(name = "spid", required = true)
    protected BigInteger spid;
    @XmlAttribute(name = "cnid", required = true)
    protected BigInteger cnid;
    @XmlAttribute(name = "mgid", required = true)
    protected BigInteger mgid;
    @XmlAttribute(name = "cname", required = true)
    protected String cname;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the cgid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCgid() {
        return cgid;
    }

    /**
     * Sets the value of the cgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCgid(BigInteger value) {
        this.cgid = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpid() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpid(BigInteger value) {
        this.spid = value;
    }

    /**
     * Gets the value of the cnid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnid() {
        return cnid;
    }

    /**
     * Sets the value of the cnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnid(BigInteger value) {
        this.cnid = value;
    }

    /**
     * Gets the value of the mgid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMgid() {
        return mgid;
    }

    /**
     * Sets the value of the mgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMgid(BigInteger value) {
        this.mgid = value;
    }

    /**
     * Gets the value of the cname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCname() {
        return cname;
    }

    /**
     * Sets the value of the cname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCname(String value) {
        this.cname = value;
    }

}
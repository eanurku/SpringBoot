//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:54:32 AM IST 
//


package com.txodds;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for offer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odds" type="{}odds" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{}id" />
 *       &lt;attribute name="n" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ot" use="required" type="{}offertype" />
 *       &lt;attribute name="otname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last_updated" use="required" type="{}datetime" />
 *       &lt;attribute name="flags" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="bmoid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offer", propOrder = {
    "odds"
})
public class Offer {

    @XmlElement(required = true)
    protected List<Odds> odds;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "n", required = true)
    protected BigInteger n;
    @XmlAttribute(name = "ot", required = true)
    protected BigInteger ot;
    @XmlAttribute(name = "otname", required = true)
    protected String otname;
    @XmlAttribute(name = "last_updated", required = true)
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "flags", required = true)
    protected BigInteger flags;
    @XmlAttribute(name = "bmoid", required = true)
    protected String bmoid;

    /**
     * Gets the value of the odds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Odds }
     * 
     * 
     */
    public List<Odds> getOdds() {
        if (odds == null) {
            odds = new ArrayList<Odds>();
        }
        return this.odds;
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
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setN(BigInteger value) {
        this.n = value;
    }

    /**
     * Gets the value of the ot property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOt() {
        return ot;
    }

    /**
     * Sets the value of the ot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOt(BigInteger value) {
        this.ot = value;
    }

    /**
     * Gets the value of the otname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtname() {
        return otname;
    }

    /**
     * Sets the value of the otname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtname(String value) {
        this.otname = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlags(BigInteger value) {
        this.flags = value;
    }

    /**
     * Gets the value of the bmoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmoid() {
        return bmoid;
    }

    /**
     * Sets the value of the bmoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmoid(String value) {
        this.bmoid = value;
    }

}

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for match complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="match">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{}datetime"/>
 *         &lt;element name="group" type="{}group"/>
 *         &lt;element name="hteam" type="{}team"/>
 *         &lt;element name="ateam" type="{}team"/>
 *         &lt;element name="results" type="{}results" minOccurs="0"/>
 *         &lt;element name="bookmaker" type="{}bookmaker" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{}id" />
 *       &lt;attribute name="xsid" use="required" type="{}id" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = {
    "time",
    "group",
    "hteam",
    "ateam",
    "results",
    "bookmaker"
})
public class Match {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true)
    protected Group group;
    @XmlElement(required = true)
    protected Team hteam;
    @XmlElement(required = true)
    protected Team ateam;
    protected Results results;
    @XmlElement(required = true)
    protected List<Bookmaker> bookmaker;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "xsid", required = true)
    protected BigInteger xsid;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the hteam property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getHteam() {
        return hteam;
    }

    /**
     * Sets the value of the hteam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setHteam(Team value) {
        this.hteam = value;
    }

    /**
     * Gets the value of the ateam property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getAteam() {
        return ateam;
    }

    /**
     * Sets the value of the ateam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setAteam(Team value) {
        this.ateam = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link Results }
     *     
     */
    public Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link Results }
     *     
     */
    public void setResults(Results value) {
        this.results = value;
    }

    /**
     * Gets the value of the bookmaker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookmaker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookmaker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bookmaker }
     * 
     * 
     */
    public List<Bookmaker> getBookmaker() {
        if (bookmaker == null) {
            bookmaker = new ArrayList<Bookmaker>();
        }
        return this.bookmaker;
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
     * Gets the value of the xsid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXsid() {
        return xsid;
    }

    /**
     * Sets the value of the xsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXsid(BigInteger value) {
        this.xsid = value;
    }

}

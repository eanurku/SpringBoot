package com.anurag.xml.groups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "group")
public class Group {

    @XmlElement(name = "id")
    private BigInteger id;
    @XmlElement(name = "mgroup")
    private Mgroup     mgroup;
    @XmlElement(name = "name")
    private String     name;
    @XmlElement(name = "sid")
    private BigInteger sid;
    @XmlElement(name = "fullname")
    private String     fullname;
    @XmlElement(name = "date1")
    private String     date1;
    @XmlElement(name = "date2")
    private String     date2;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Mgroup getMgroup() {
        return mgroup;
    }

    public void setMgroup(Mgroup mgroup) {
        this.mgroup = mgroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSid() {
        return sid;
    }

    public void setSid(BigInteger sid) {
        this.sid = sid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }
}

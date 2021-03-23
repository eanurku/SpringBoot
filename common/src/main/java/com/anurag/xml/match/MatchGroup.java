package com.anurag.xml.match;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "group")
public class MatchGroup {

    @XmlAttribute(name = "id")
    private BigInteger id;

    @XmlAttribute(name = "cgid")
    private BigInteger cgid;

    @XmlAttribute(name = "spid")
    private BigInteger spid;

    @XmlAttribute(name = "cnid")
    private BigInteger cnid;

    @XmlAttribute(name = "mgid")
    private BigInteger mgid;

    @XmlAttribute(name = "cname")
    private String cname;

    @XmlValue
    String value;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getCgid() {
        return cgid;
    }

    public void setCgid(BigInteger cgid) {
        this.cgid = cgid;
    }

    public BigInteger getSpid() {
        return spid;
    }

    public void setSpid(BigInteger spid) {
        this.spid = spid;
    }

    public BigInteger getCnid() {
        return cnid;
    }

    public void setCnid(BigInteger cnid) {
        this.cnid = cnid;
    }

    public BigInteger getMgid() {
        return mgid;
    }

    public void setMgid(BigInteger mgid) {
        this.mgid = mgid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MatchGroup that = (MatchGroup) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(cgid, that.cgid) &&
                Objects.equals(spid, that.spid) &&
                Objects.equals(cnid, that.cnid) &&
                Objects.equals(mgid, that.mgid) &&
                Objects.equals(cname, that.cname) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cgid, spid, cnid, mgid, cname, value);
    }

    @Override
    public String toString() {
        return "MatchGroup{" +
                "id=" + id +
                ", cgid=" + cgid +
                ", spid=" + spid +
                ", cnid=" + cnid +
                ", mgid=" + mgid +
                ", cname='" + cname + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

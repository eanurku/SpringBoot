package com.anurag.xml.match;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "match")
public class Match {

    @XmlAttribute(name = "id")
    private BigInteger id;

    @XmlAttribute(name = "xsid")
    private BigInteger xsid;

    @XmlAttribute(name = "gsmid")
    private BigInteger gsmid;

    @XmlAttribute(name = "last_updated")
    private XMLGregorianCalendar last_updated;//Todo  Date format

    @XmlElement(name = "time")
    private XMLGregorianCalendar time;

    @XmlElement(name = "group")
    private MatchGroup group;

    @XmlElement(name = "hteam")
    private Team hteam;

    @XmlElement(name = "ateam")
    private Team ateam;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getXsid() {
        return xsid;
    }

    public void setXsid(BigInteger xsid) {
        this.xsid = xsid;
    }

    public BigInteger getGsmid() {
        return gsmid;
    }

    public void setGsmid(BigInteger gsmid) {
        this.gsmid = gsmid;
    }

    public XMLGregorianCalendar getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(XMLGregorianCalendar last_updated) {
        this.last_updated = last_updated;
    }

    public XMLGregorianCalendar getTime() {
        return time;
    }

    public void setTime(XMLGregorianCalendar time) {
        this.time = time;
    }

    public MatchGroup getGroup() {
        return group;
    }

    public void setGroup(MatchGroup group) {
        this.group = group;
    }

    public Team getHteam() {
        return hteam;
    }

    public void setHteam(Team hteam) {
        this.hteam = hteam;
    }

    public Team getAteam() {
        return ateam;
    }

    public void setAteam(Team ateam) {
        this.ateam = ateam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Match match = (Match) o;
        return Objects.equals(id, match.id) &&
                Objects.equals(xsid, match.xsid) &&
                Objects.equals(gsmid, match.gsmid) &&
                Objects.equals(last_updated, match.last_updated) &&
                Objects.equals(time, match.time) &&
                Objects.equals(group, match.group) &&
                Objects.equals(hteam, match.hteam) &&
                Objects.equals(ateam, match.ateam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xsid, gsmid, last_updated, time, group, hteam, ateam);
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", xsid=" + xsid +
                ", gsmid=" + gsmid +
                ", last_updated=" + last_updated +
                ", time=" + time +
                ", group=" + group +
                ", hteam=" + hteam +
                ", ateam=" + ateam +
                '}';
    }
}

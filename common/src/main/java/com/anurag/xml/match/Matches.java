package com.anurag.xml.match;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "matches")
public class Matches {

    @XmlAttribute(name = "time")
    private XMLGregorianCalendar time;

    @XmlAttribute(name = "timestamp")
    private BigInteger timestamp;

    @XmlElement(name = "match")
    private List<Match> match;

    public XMLGregorianCalendar getTime() {
        return time;
    }

    public void setTime(XMLGregorianCalendar time) {
        this.time = time;
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

    public List<Match> getMatch() {
        if (match == null) {
            match = new ArrayList<Match>();
        }
        return match;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Matches matches = (Matches) o;
        return Objects.equals(time, matches.time) &&
                Objects.equals(timestamp, matches.timestamp) &&
                Objects.equals(match, matches.match);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, timestamp, match);
    }

    @Override
    public String toString() {
        return "Matches{" +
                "time=" + time +
                ", timestamp=" + timestamp +
                ", match=" + match +
                '}';
    }
}

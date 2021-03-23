package com.anurag.xml.match;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "team")
public class Team {

    @XmlAttribute(name = "id")
    BigInteger id;

    @XmlValue
    String value;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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
        Team team = (Team) o;
        return Objects.equals(id, team.id) &&
                Objects.equals(value, team.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}

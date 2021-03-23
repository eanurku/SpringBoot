package com.anurag.xml.groups;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mgroup")
public class Mgroup {

    @XmlAttribute(name = "id")
    private BigInteger id;
    @XmlValue
    private String     value;

}

package com.anurag.xml.groups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "groups")
public class Groups {

    @XmlElement(name = "group")
    private List<Group> group;

    public List<Group> getGroup() {
        if (group == null)
            group = new ArrayList<>();
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}

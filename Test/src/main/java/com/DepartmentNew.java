package com;

import java.util.Map;
import java.util.Set;

public class DepartmentNew {

    Set<Employee>        employees;
    String               name;
    Map<Integer, Period> mymap;

    public Map<Integer, Period> getMymap() {
        return mymap;
    }

    public void setMymap(Map<Integer, Period> mymap) {
        this.mymap = mymap;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

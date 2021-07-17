package com;


public enum SortOrder {

    ASC("asc"),
    DESC("desc"),
    NONE("");

    String code;

    SortOrder(String code) {
        this.code = code;
    }

    public static SortOrder of(String order){
        for(SortOrder sortOrder:SortOrder.values()){
            if(sortOrder.getCode().equalsIgnoreCase(order)){
                return sortOrder;
            }
        }
        return SortOrder.NONE;
    }

    public String getCode() {
        return code;
    }
}
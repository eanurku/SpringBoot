package com.anurag.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MDLeague {

    @JsonAlias({ "id" })
    private Long id;

    @JsonAlias({ "name" })
    private String name;

    @JsonAlias({ "isActive" })
    private boolean isActive;

    @JsonAlias({ "sportId" })
    private Integer sportId;













//    {
//        "id": 100415,
//            "name": " Cup Women",
//            "stringId": 8224382,
//            "isActive": true,
//            "sportId": 7,
//            "regionid": 35,
//            "regionname": "Belgium",
//            "gender": "",
//            "ageGroup": ""
//    },

}

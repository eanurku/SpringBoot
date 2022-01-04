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
public class MDTeam {

    @JsonAlias({ "id" })
    private Long id;

    @JsonAlias({ "name" })
    private String name;

    @JsonAlias({ "isActive" })
    private Boolean isActive;

    @JsonAlias({ "sportId" })
    private Integer sportId;

}

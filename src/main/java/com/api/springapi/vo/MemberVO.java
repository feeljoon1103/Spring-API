package com.api.springapi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MemberVO {

    // JsonProperty : 직렬화
    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String job;

    @JsonProperty
    private String home;
}


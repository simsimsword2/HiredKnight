package com.HN.HiredKnight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response_createSoldier {
    @JsonProperty("soldier_description")
    public String soldier_description;
    @JsonProperty("soldier_quantity")
    public int sodier_quantity;
    @JsonProperty("soldier_cost")
    public int soldier_cost;
}

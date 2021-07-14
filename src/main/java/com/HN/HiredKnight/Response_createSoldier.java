package com.HN.HiredKnight;

import com.fasterxml.jackson.annotation.JsonProperty;

// this is the structure of the Json used in this application
public class Response_createSoldier {
    @JsonProperty("soldier_description")
    public String soldier_description;
    @JsonProperty("soldier_quantity")
    public int soldier_quantity;
    @JsonProperty("soldier_cost")
    public int soldier_cost;
}

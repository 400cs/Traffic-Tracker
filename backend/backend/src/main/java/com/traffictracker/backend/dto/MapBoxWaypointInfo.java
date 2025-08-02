package com.traffictracker.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record MapBoxWaypointInfo(
    @JsonProperty("distance") double distanceInMiles,
    @JsonProperty("name") String streetName,
    List<Double> location // 0:longitude,1:latitude

) {}
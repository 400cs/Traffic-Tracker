package com.traffictracker.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MapBoxRouteInfo(
    @JsonProperty("duration_typical") double durationTypicalInSeconds,
    @JsonProperty("duration") double durationInSeconds,
    @JsonProperty("distance") double distanceInKilometers,
    MapBoxGeometry geometry
) {}

package com.traffictracker.backend.dto;

import java.util.List;

public record MapBoxGeometry(
    List<List<Double>> coordinates, // Array of [longitude, latitude] pairs
    String type
) {}

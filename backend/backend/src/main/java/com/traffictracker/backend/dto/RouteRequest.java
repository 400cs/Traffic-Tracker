package com.traffictracker.backend.dto;

public record RouteRequest(
    String originAddress,
    double[] originCoordinates,
    String destinationAddress, 
    double[] destinationCoordinates
) {}

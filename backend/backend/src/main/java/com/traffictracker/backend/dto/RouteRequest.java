package com.traffictracker.backend.dto;

public record RouteRequest(
    double[] originCoordinates, 
    double[] destinationCoordinates
) {}

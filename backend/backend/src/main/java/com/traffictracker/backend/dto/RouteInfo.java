package com.traffictracker.backend.dto;
import java.util.List;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RouteInfo(
    @NotBlank String eta, 
    String distance, 
    @NotNull List<List<Double>> coordinates,
    int durationInSeconds
) {}
package com.traffictracker.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.traffictracker.backend.dto.MapBoxDirectionResponse;

@Service
public class MapBoxDirectionService {
    
    private final RestTemplate restTemplate;
    private final String mapboxAccessToken;

    public MapBoxDirectionService(RestTemplateBuilder builder,
                                @Value("${mapbox.access.token}") String mapboxAccessToken) {
        this.restTemplate = builder.build();
        this.mapboxAccessToken = mapboxAccessToken;
    }

    public MapBoxDirectionResponse getDirectionResponse() {
        try {
            String url = String.format(
        "https://api.mapbox.com/directions/v5/mapbox/driving-traffic/%s?geometries=geojson&language=en&access_token=%s",
        "-117.958249,33.666951;-117.823127,34.05703",
                mapboxAccessToken
            );
            
            MapBoxDirectionResponse directions = restTemplate.getForObject(url, MapBoxDirectionResponse.class);
            return directions;
        }
        catch (Exception e) {
            System.err.println("Error calling MapBox API: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

}

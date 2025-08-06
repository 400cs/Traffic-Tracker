package com.traffictracker.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.traffictracker.backend.dto.MapBoxDirectionResponse;

@RestController
public class MapBoxTestController {
    
    private final MapBoxDirectionService mapBoxDirectionService;
    
    public MapBoxTestController(MapBoxDirectionService mapBoxDirectionService) {
        this.mapBoxDirectionService = mapBoxDirectionService;
    }
    
    @GetMapping("/test-mapbox")
    public MapBoxDirectionResponse testMapBox() {
        return mapBoxDirectionService.getDirectionResponse();
    }
}

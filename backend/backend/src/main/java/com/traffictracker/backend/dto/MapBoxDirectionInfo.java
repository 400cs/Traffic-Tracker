package com.traffictracker.backend.dto;

import java.util.List;

public record MapBoxDirectionInfo(
    List<MapBoxRouteInfo> routes, 
    List<MapBoxWaypointInfo> waypoints, 
    String code, 
    String uuid
) {}

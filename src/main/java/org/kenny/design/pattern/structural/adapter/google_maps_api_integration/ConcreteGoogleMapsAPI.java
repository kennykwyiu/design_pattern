package org.kenny.design.pattern.structural.adapter.google_maps_api_integration;

public class ConcreteGoogleMapsAPI implements GoogleMapsAPI {
    public void showMap(String location) {
        System.out.println("Displaying map for location: " + location + " using Google Maps API.");
    }
}


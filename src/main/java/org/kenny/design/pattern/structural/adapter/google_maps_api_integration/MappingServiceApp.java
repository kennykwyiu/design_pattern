package org.kenny.design.pattern.structural.adapter.google_maps_api_integration;

public class MappingServiceApp {
    public static void main(String[] args) {
        GoogleMapsAPI googleMapsAPI = new ConcreteGoogleMapsAPI();
        MappingService mappingService = new GoogleMapsAdapter(googleMapsAPI);

        // Using the mapping service to display a location on the map
        mappingService.displayLocation("New York City");
    }
}

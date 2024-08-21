package org.kenny.design.pattern.structural.adapter.google_maps_api_integration;

public class GoogleMapsAdapter implements MappingService {
    private GoogleMapsAPI googleMapsAPI;

    public GoogleMapsAdapter(GoogleMapsAPI googleMapsAPI) {
        this.googleMapsAPI = googleMapsAPI;
    }

    public void displayLocation(String location) {
        googleMapsAPI.showMap(location);
    }
}

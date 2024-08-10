package org.kenny.design.pattern.creational.prototype.configurable_systems;

public class CacheServerConfiguration implements ServerConfiguration {
    private String cacheType;
    private int cacheSize;

    public CacheServerConfiguration(String cacheType, int cacheSize) {
        this.cacheType = cacheType;
        this.cacheSize = cacheSize;
    }

    @Override
    public ServerConfiguration clone() {
        return new CacheServerConfiguration(this.cacheType, this.cacheSize);
    }

    @Override
    public void setup() {
        System.out.println("Setting up Cache Server Configuration:");
        System.out.println("Cache Type: " + cacheType);
        System.out.println("Cache Size: " + cacheSize + " MB");
        // Additional setup logic specific to cache servers
    }
}

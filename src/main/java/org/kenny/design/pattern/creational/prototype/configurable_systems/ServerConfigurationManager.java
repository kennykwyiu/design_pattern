package org.kenny.design.pattern.creational.prototype.configurable_systems;

import java.util.HashMap;
import java.util.Map;

public // Server configuration manager
class ServerConfigurationManager {
    private Map<String, ServerConfiguration> prototypes = new HashMap<>();

    public ServerConfigurationManager() {
        prototypes.put("web", new WebServerConfiguration("MyWebServer", 8080, "/var/www/html"));
        prototypes.put("database", new DatabaseServerConfiguration("MyDatabase", "admin", "password"));
        prototypes.put("cache", new CacheServerConfiguration("Redis", 512));
    }

    public ServerConfiguration createServerConfiguration(String type) {
        return prototypes.get(type).clone();
    }
}

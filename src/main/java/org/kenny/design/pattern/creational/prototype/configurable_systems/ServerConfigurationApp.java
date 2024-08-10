package org.kenny.design.pattern.creational.prototype.configurable_systems;

public class ServerConfigurationApp {
    public static void main(String[] args) {
        ServerConfigurationManager configurationManager = new ServerConfigurationManager();

        ServerConfiguration webServerConfig = configurationManager.createServerConfiguration("web");
        webServerConfig.setup();
        System.out.println();

        ServerConfiguration databaseServerConfig = configurationManager.createServerConfiguration("database");
        databaseServerConfig.setup();
        System.out.println();

        ServerConfiguration cacheServerConfig = configurationManager.createServerConfiguration("cache");
        cacheServerConfig.setup();
    }
}

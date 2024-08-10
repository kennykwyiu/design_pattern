package org.kenny.design.pattern.creational.prototype.configurable_systems;

public class WebServerConfiguration implements ServerConfiguration {
    private String serverName;
    private int port;
    private String documentRoot;

    public WebServerConfiguration(String serverName, int port, String documentRoot) {
        this.serverName = serverName;
        this.port = port;
        this.documentRoot = documentRoot;
    }

    @Override
    public ServerConfiguration clone() {
        return new WebServerConfiguration(this.serverName, this.port, this.documentRoot);
    }

    @Override
    public void setup() {
        System.out.println("Setting up Web Server Configuration:");
        System.out.println("Server Name: " + serverName);
        System.out.println("Port: " + port);
        System.out.println("Document Root: " + documentRoot);
        // Additional setup logic specific to web servers
    }
}

package org.kenny.design.pattern.creational.prototype.configurable_systems;

public class DatabaseServerConfiguration implements ServerConfiguration {
    private String dbName;
    private String dbUser;
    private String dbPassword;

    public DatabaseServerConfiguration(String dbName, String dbUser, String dbPassword) {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    @Override
    public ServerConfiguration clone() {
        return new DatabaseServerConfiguration(this.dbName, this.dbUser, this.dbPassword);
    }

    @Override
    public void setup() {
        System.out.println("Setting up Database Server Configuration:");
        System.out.println("Database Name: " + dbName);
        System.out.println("Database User: " + dbUser);
        // Additional setup logic specific to database servers
    }
}

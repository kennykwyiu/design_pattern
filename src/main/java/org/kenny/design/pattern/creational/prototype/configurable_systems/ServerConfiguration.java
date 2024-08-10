package org.kenny.design.pattern.creational.prototype.configurable_systems;

// Prototype interface for server configurations
public interface ServerConfiguration extends Cloneable {
    ServerConfiguration clone();
    void setup();
}

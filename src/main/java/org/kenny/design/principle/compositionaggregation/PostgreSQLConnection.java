package org.kenny.design.principle.compositionaggregation;

public class PostgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "PostgreSQL DB connection";
    }
}

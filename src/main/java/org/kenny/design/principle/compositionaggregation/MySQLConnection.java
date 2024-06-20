package org.kenny.design.principle.compositionaggregation;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL DB connection";
    }
}

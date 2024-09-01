package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public class Role  {
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

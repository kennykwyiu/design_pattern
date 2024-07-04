package org.kenny.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.print("created department manager: " + department);
            String reportContent = department + " department report: the report content is ...";
            manager.setReportContent(reportContent);
            System.out.println("created report content: " + reportContent);

            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}

package fr.vls.builder;

import fr.vls.model.Employee;

public class EmployeeBuilder {

    private String employeeId;
    private String name;
    private String practiceArea;
    private String designation;
    private String companyInfo;

    private EmployeeBuilder() {

    }

    public EmployeeBuilder id(String id) {
        this.employeeId = id;
        return this;
    }

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder practiceArea(String practiceArea) {
        this.practiceArea = practiceArea;
        return this;
    }

    public EmployeeBuilder designation(String designation) {
        this.designation = designation;
        return this;
    }

    public EmployeeBuilder companyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public Employee build() {
        Employee employee = new Employee();
        employee.setEmployeeId(this.employeeId);
        employee.setCompanyInfo(this.companyInfo);
        employee.setDesignation(this.designation);
        employee.setName(this.name);
        employee.setPracticeArea(this.practiceArea);
        return employee;
    }
}

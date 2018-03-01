package fr.vls.controller;

import fr.vls.model.Employee;
import fr.vls.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RefreshScope
@RestController
@ConfigurationProperties
public class EmployeeSearchController {
    @Autowired
    EmployeeSearchService employeeSearchService;

    @Value("${welcome.message}")
    private String message;

    @RequestMapping("/employee/find/{id}")
    public Employee findById(@PathVariable Long id) {
        System.out.println(message);
        return employeeSearchService.findById(id);
    }

    @RequestMapping("/employee/findall")
    public Collection<Employee> findAll() {
        return employeeSearchService.findAll();
    }
}

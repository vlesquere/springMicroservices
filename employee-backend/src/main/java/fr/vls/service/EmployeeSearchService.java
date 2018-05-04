package fr.vls.service;

import fr.vls.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeSearchService {
    private static Map<String, Employee> employeeRepository = null;

    static {
        Stream<String> employeeStream = Stream.of("1,LE SQUERE Vincent,Developer, DQ",
                                                  "2,PROT Damien,Scrum master, DQ",
                                                  "3,CORREIA Sebastiao,Big boss, DQ");
        employeeRepository = employeeStream.map(employeeStr -> {
            String[] info = employeeStr.split(",");
            return createEmployee(info[0], info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Employee::getEmployeeId, emp -> emp));
    }

    private static Employee createEmployee(String id, String name, String practiceArea, String designation) {
        Employee emp = new Employee();
        emp.setEmployeeId(id);
        emp.setName(name);
        emp.setPracticeArea(practiceArea);
        emp.setDesignation(designation);
        emp.setCompanyInfo("Talend");
        return emp;
    }

    public Employee findById(String id) {
        return employeeRepository.get(id);
    }

    public Collection<Employee> findAll() {
        return employeeRepository.values();
    }
}

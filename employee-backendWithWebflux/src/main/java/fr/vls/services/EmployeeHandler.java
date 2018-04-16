package fr.vls.services;

import fr.vls.model.Employee;
import fr.vls.repository.ReactiveEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeeHandler {

    @Autowired
    private final ReactiveEmployeeRepository employeeRepository;

    public EmployeeHandler(ReactiveEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Mono<ServerResponse> save(Mono<Employee> employee) {
        return ServerResponse.ok().body(employeeRepository.insert(employee), Employee.class);
    }

    public Mono<ServerResponse> all(ServerRequest serverRequest) {
        Flux<Employee> employees = this.employeeRepository.findAll();
        return ServerResponse.ok().body(employees, Employee.class);
    }

    public Mono<ServerResponse> byId(ServerRequest serverRequest) {
        String id = serverRequest.pathVariable("id");
        Mono<Employee> show = this.employeeRepository.findById(id);
        return ServerResponse.ok().body(show, Employee.class);
    }
}

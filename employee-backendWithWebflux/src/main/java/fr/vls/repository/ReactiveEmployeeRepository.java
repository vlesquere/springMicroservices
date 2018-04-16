package fr.vls.repository;

import fr.vls.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveEmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}

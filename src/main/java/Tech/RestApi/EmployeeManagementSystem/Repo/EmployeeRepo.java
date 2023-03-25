package Tech.RestApi.EmployeeManagementSystem.Repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Tech.RestApi.EmployeeManagementSystem.Model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    static void deleteEmployeeById(Long id) {}

    Optional<Employee> findEmployeeById(Long id);

}
package dao;

import java.util.List;
import model.Employee;

public interface EmployeeDAO {
    void addEmployee(Employee e);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void updateEmployee(Employee e);
    void deleteEmployee(int id);
}

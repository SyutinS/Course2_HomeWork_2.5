package pro.sky.skyprospringhomework25.service;
import pro.sky.skyprospringhomework25.list.Employee;
import java.util.List;

public interface Service {
    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    List<Employee> getEmployeeList();
}

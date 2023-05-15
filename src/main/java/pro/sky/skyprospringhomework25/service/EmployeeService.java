package pro.sky.skyprospringhomework25.service;

import pro.sky.skyprospringhomework25.exception.EmployeeNotFoundException;
import pro.sky.skyprospringhomework25.exception.EmployeeStorageIsFullException;
import pro.sky.skyprospringhomework25.list.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeService implements Service {
    public final Integer maxSize = 5;
    public List<Employee> employee = new ArrayList<>(List.of(
            new Employee("Ivan", "Ivanov"),
            new Employee("Имя2", "Фамилия2"),
            new Employee("Имя3", "Фамилия3"),
            new Employee("Имя4", "Фамилия4")
    ));

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (getEmployeeList().size() >= maxSize) {
            throw new EmployeeStorageIsFullException(" В хранилище не может быть больше " +
                    maxSize + " сотрудников ");
        }
        if (employee.contains(employee)) {
            throw new EmployeeNotFoundException(" Сотрудник с таким именем уже существует ");
        }
        employee.add(new Employee(firstName, lastName));
        return employee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employee.contains(employee)) {
            employee.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException(" Сотрудник не найден ");
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employee.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException(" Сотрудник не найден ");
    }

    @Override
    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(employee);
    }

}

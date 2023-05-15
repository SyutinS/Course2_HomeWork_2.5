package pro.sky.skyprospringhomework25.service;

import pro.sky.skyprospringhomework25.exception.BadEmployeeNumberException;
import pro.sky.skyprospringhomework25.list.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeServ {
    Employee add(String name, String surname);

    Employee delete(String name, String surname);

    Employee search(String name, String surname);

//    Collection<Employee> findAll();
//    public String infoNumber(Integer number) throws BadEmployeeNumberException;

//    public String addEmployee(Employee employee) throws BadEmployeeNumberException;

    Collection<Employee> searchAll();
}

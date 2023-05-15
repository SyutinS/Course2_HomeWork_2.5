package pro.sky.skyprospringhomework25.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringhomework25.exception.EmployeeNotFoundException;
import pro.sky.skyprospringhomework25.list.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServ {
    Integer maxSize = 13;
//    List<Employee> employee = new ArrayList<>();
//    Collection<String> employee = new ArrayList<>();
//    List<Employee> employee = new ArrayList<>(List.of(
//
//            new Employee("Имя1", "Фамилия1"),
//            new Employee("Имя2", "Фамилия2"),
//            new Employee("Имя3", "Фамилия3"),
//            new Employee("Имя4", "Фамилия4"),
//            new Employee("Имя5", "Фамилия5"),
//            new Employee("Имя6", "Фамилия6"),
//            new Employee("Имя7", "Фамилия7"),
//            new Employee("Имя8", "Фамилия8"),
//            new Employee("Имя9", "Фамилия9"),
//            new Employee("Имя10", "Фамилия10")
//    ));

//    List<Employee> employee = new ArrayList<>();
    private final List<Employee> employee;
    public EmployeeService() {
        this.employee = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employee.contains(employee)) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        employee.add(employee);
        return employee;
    }

    @Override
    public Employee delete(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employee.contains(employee)) {
            employee.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee search(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employee.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Collection<Employee> searchAll() {
        return List.unmodifiableList(employee);
    }


//    public void employeeList() {
//        employee.add(0, "Имя1", "Фамилия1");
//    }
//            new Employee("Имя1", "Фамилия1"),
//            new Employee("Имя2", "Фамилия2"),
//            new Employee("Имя3", "Фамилия3"),
//            new Employee("Имя4", "Фамилия4"),
//            new Employee("Имя5", "Фамилия5"),
//            new Employee("Имя6", "Фамилия6"),
//            new Employee("Имя7", "Фамилия7"),
//            new Employee("Имя8", "Фамилия8"),
//            new Employee("Имя9", "Фамилия9"),
//            new Employee("Имя10", "Фамилия10")
//    );

//    Integer maxSize = 13;

    //    @Override
//    public String infoNumber(Integer number) throws BadEmployeeNumberException {
//
//        if (number >= employee.size()) {
//            throw new BadEmployeeNumberException(" номер больше количества в списке ");
//        }
//        return " количество сотрудников - " + employee.size() +
//                " из максимально возможных в количестве " + maxSize + "\n" +
//                "\n Сотрудник № " + (number + 1) +
//                " - " + employee.get(number);
//    }

//    public String printEmployee(Employee employee) {
//        for (int i = 0; i < this.employee.size(); i++) {
//            System.out.println(this.employee.get(i));
//        }
//        return " количество " + this.employee.size();
//    }
//
//    //    @Override
//    public String addEmployee(String firstName, String lastName) { // throws BadEmployeeNumberException {
////        if (this.employee.size() >= maxSize) {
////            throw new BadEmployeeNumberException(" превышен лимит сотрудников ");
//////            return " добавление сотрудника не возможно превышен лимит ";
////        }
//        employee.add((Employee) employee);
////        int n = employeeList.size() + 1;
////        this.employee.add(this.employee);
//        return " 38 ";// + employee.add((Employee) employee);
//    }
//
//    public deleteEmployee(String firsName, String lastName) { //String firsName, String lastName) {
////        employee.remove(deleteNumber);
////       return " "+  System.out.println(employee);
////        printEmployee(Employee employee);
//    }
//
//    public void searchEmployee(Employee employee) { //(String firsName, String lastName) {
//
//    }


//    @Override
//    public Employee findPerson(String firstName, String lastName) {
//        Employee employee = new Employee(firstName, lastName);
//
//        if (!employees.contains(employee)) {
//            throw new EmployeeNotFoundException("Сотрудник не найден");
//        }
//
//        return employee;
//    }
}

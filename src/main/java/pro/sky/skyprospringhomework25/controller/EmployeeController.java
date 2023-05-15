package pro.sky.skyprospringhomework25.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringhomework25.exception.BadEmployeeNumberException;
import pro.sky.skyprospringhomework25.list.Employee;
import pro.sky.skyprospringhomework25.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collection;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private final EmployeeService service;
//    private Integer number;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

//    @GetMapping("/number")
//    public String infoNumber(@RequestParam("number") Integer number) throws BadEmployeeNumberException {
//        return employeeService.infoNumber(number);
//    }

//    @GetMapping("/print")
//    public String printEmployee(Employee employee) {
//        employeeService.printEmployee(employee);
//        return employee.toString();
//    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstname") String firstName,
                              @RequestParam("lastname") String lastName) {
//        Employee employee = new Employee(firstName, lastName);
        return service.add(firstName, lastName);
//        return " новый сотрудник успешно добавлен ";// + printEmployee(employee);
    }

    @GetMapping("/delete")
    public Employee deleteEmployee(@RequestParam("firstname") String firstName,
                                 @RequestParam("lastname") String lastName){
//            @RequestParam("number") Integer deleteNumber)){
       return service.delete(firstName, lastName);
//        return " сотрудник успешно удален ";
    }

    public Employee searchEmployee(@RequestParam("firstname") String firstName,
                                 @RequestParam("lastname") String lastName) {
        return service.search(firstName, lastName);
//        return " сотрудник найден ";
    }

    @GetMapping
    public Collection<Employee> searchAll() {
        return service.searchAll();
    }
}

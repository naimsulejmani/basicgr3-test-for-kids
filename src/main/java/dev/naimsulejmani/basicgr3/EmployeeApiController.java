package dev.naimsulejmani.basicgr3;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeApiController {
    List<Employee> employees = List.of(
            new Employee(1, "Naim", "Sulejmani", 250),
            new Employee(2, "Adnan", "Smajli", 800)
    );

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employees;
    }


    @RequestMapping(value = "/api/employees/1", method = RequestMethod.GET)
    public Employee getEmployee() {
        return employees.get(0);
    }
}











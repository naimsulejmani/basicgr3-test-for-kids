package dev.naimsulejmani.basicgr3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    /*
    Kur dikush hin ne browers edhe e shtyp ne url: http://localhost:8080/employees
    ka me u thirre metoda ne java getEmployees dhe ka me kthy employees.html te cilen
    e kerkon ne resources/templates/employees.html


     */

    @GetMapping("/employees")
    public String getEmployees() {
        return "employees";
    }

    @GetMapping("/departments")
    public String getDepartments() {
        return "departments";
    }

    @GetMapping("/projects")
    public String getProjects() {
        return "projects";
    }

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @RequestMapping(value = "/hasan", method = RequestMethod.GET)
    public String getHasan() {
        return "hysen";
    }


    @GetMapping("/**")
    public String pageNotFound() {
        return "page-not-found.html";
    }


}










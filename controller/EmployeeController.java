package controller;

import model.Employee;
import service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String listEmployees(Model model) {
        model.addAttribute("list", service.getAllEmployees());
        return "employee_list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee_form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee e) {
        if (e.getId() == 0) service.addEmployee(e);
        else service.updateEmployee(e);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        model.addAttribute("employee", service.getEmployeeById(id));
        return "employee_form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteEmployee(id);
        return "redirect:/";
    }
}

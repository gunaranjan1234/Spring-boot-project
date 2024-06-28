package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class AController {

    private Repository repository;
    public AController(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/get")
    public String showHomePage(Model model)
    {
        var s = repository.getAllStudents();
        model.addAttribute("students", s);
        return "index";
    }
//    private Repository repository;
//    public Controller(Repository repo) {
//        this.repository = repo;
//    }
//
//    @GetMapping("/")
//    public int GetDaa()
//    {
//        return 1;
//    }
//
//    @GetMapping( "api/v1/college")
//    public List<Student> getStudent() {
//        return this.repository.getAllStudents();
//    }

}

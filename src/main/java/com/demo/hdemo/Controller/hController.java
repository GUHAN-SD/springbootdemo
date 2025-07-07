package com.demo.hdemo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.hdemo.Model.hModel;
import com.demo.hdemo.Repository.hRepository;

@Controller
public class hController {

    @Autowired
    private hRepository repo;

    @GetMapping("/")
    public String home() {
        return "Login";
    }

    @GetMapping("/index")
    public String showLoginForm() {
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute hModel user, ModelMap model) {
        repo.save(user);
        model.addAttribute("student1", repo.findAll());
        return "viewStudents";
    }

 
    @GetMapping("/updateStudent")
    public String showUpdateForm(@RequestParam("id") int id, ModelMap model) {
        hModel student = repo.findById(id).orElse(null);
        if (student != null) {
            model.addAttribute("student", student);
            return "updateStudent"; // JSP form for editing
        }
        return "redirect:/";
    }

 
    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute hModel student, ModelMap model) {
        repo.save(student);
        model.addAttribute("student1", repo.findAll());
        return "viewStudents";
    }

    @PostMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id") int id, ModelMap model) {
        repo.deleteById(id);
        model.addAttribute("student1", repo.findAll());
        return "viewStudents";
    }
    @GetMapping("/addStudentForm")
    public String showAddStudentForm() {
        return "index"; 
    }
    @GetMapping("/searchStudent")
    public String searchStudent(@RequestParam("keyword") String keyword, ModelMap model) {
        List<hModel> matched = repo.findByNameContainingIgnoreCase(keyword);
        model.addAttribute("student1", matched);
        return "viewStudents";
    }


}

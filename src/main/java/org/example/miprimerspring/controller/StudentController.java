package org.example.miprimerspring.controller;

import org.example.miprimerspring.entity.Student;
import org.example.miprimerspring.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/getAll")
    public String getAllStudents(Model model){
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students",students);
        return "student";
    }
    public String getStudentsById(Model model,Long id){
        Student student = studentService.getStudent(id);
        model.addAttribute("student",student);
        return "student/student";
    }
}

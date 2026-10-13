package com.lucifer.SpringSecurityExample;

/*
* In this module we are learning CSRF means CSRF stands for Cross-Site Request Forgery.
*  It is a web security vulnerability that tricks a user's browser into performing an unwanted, unauthorized action on a trusted website where they are currently logged in
*  If you visit a malicious site while logged into a vulnerable app (like your bank or email), the malicious site can send a hidden command using your active session credentials without your knowledge
*  If we are generating different session id time and again then we can disable the CSRF features
* */

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //    though it is not a good practice but for the learning purposes I am creating this dummy repo in the same class
    private List<Student> students = new ArrayList<>(List.of(
            new Student(101, "Aditya", 97),
            new Student(102, "Milky", 99),
            new Student(103, "Ashish", 96),
            new Student(104, "John", 78)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}

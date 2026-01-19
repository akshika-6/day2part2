package com.example.day2part2.controller;

import java.util.*;
import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        ArrayList<StudentModel> list=new ArrayList<>();
        StudentModel student1 = new StudentModel(1,"Akshika","akshika27ak@gmail.com");
        StudentModel student2 = new StudentModel(2,"Rahul","akshika27ak@gmail.com");
        StudentModel student3 = new StudentModel(3,"Aditya","akshika27ak@gmail.com");
        StudentModel student4 = new StudentModel(4,"Aviral","akshika27ak@gmail.com");
        StudentModel student5 = new StudentModel(5,"Aaradhya","akshika27ak@gmail.com");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        return list;
    }
}

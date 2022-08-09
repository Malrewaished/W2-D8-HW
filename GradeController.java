package com.example.w2hw3.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {

    private ArrayList<String> grades = new ArrayList<>();


    @GetMapping("/grade")
    public ArrayList<String> getGrade(){
        return grades;
    }

    @PostMapping("/grade")
    public String inputName(@RequestBody String grade){
        grades.add(grade);
        return "Grades added successfully";
    }

    @PutMapping("/grade/{index}")
    public String updateGrade(@RequestBody String grade, @PathVariable Integer index){
        grades.set(index, grade);
        return "Grades updated successfully";

    }

    @DeleteMapping("/grade/{index}")
    public String removeName(@PathVariable int index){
        grades.remove(index);
        return "Grades removed successfully";
    }

}

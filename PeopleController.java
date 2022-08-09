package com.example.w2hw2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {

    private ArrayList<String> names = new ArrayList<>();

    @GetMapping("/name")
    public ArrayList<String> getNames(){
        return names;
    }

    @PostMapping("/name")
    public String inputName(@RequestBody String name){
        names.add(name);
        return "Names added successfully";
    }

    @PutMapping("/name/{index}")
    public String updateNames(@RequestBody String name, @PathVariable int index){
        names.set(index,name);
        return "Names updated successfully";
    }

    @DeleteMapping("/name/{index}")
    public String removeName(@PathVariable int index){
        names.remove(index);
        return "Names removed successfully";
    }

}

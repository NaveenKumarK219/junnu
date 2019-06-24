package com.navin.junnu.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JunnuRestApi {


    @GetMapping("/get-names")
    public List<String> getAllNames(){
        List<String> namesList = new ArrayList<>();
        for(int i=0;i<10;i++){
            namesList.add("Name--"+i);
        }
        return namesList;
    }
}

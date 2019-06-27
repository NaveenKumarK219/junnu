package com.navin.junnu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navin.junnu.models.JunnuInfo;
import com.navin.junnu.services.JunnuService;

@RestController("/junnu")
@CrossOrigin
public class JunnuRestApi {


	@Autowired
	private JunnuService junnuService;
	
    @GetMapping("/get-names")
    public List<JunnuInfo> getAllNames(){
    	return junnuService.getJunnuNames();
    }
    
    @PutMapping("/add-name")
    public JunnuInfo addName(@RequestBody JunnuInfo junnuInfo) {
    	return junnuService.saveJunnuName(junnuInfo);
    }
    
    @DeleteMapping("/remove-name/{id}")
    public void removeJunnuName(@PathVariable long id) {
    	junnuService.removeJunnuName(id);
    }
}

package edu.ayush.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ayush.learn.model.EmployeesEntity;
import edu.ayush.learn.services.WebSpringService;

@Controller
@RequestMapping("/")
public class WebSpringController {
	
	@Autowired
	WebSpringService webService;
	
	@GetMapping("employees")
    public ResponseEntity<List<EmployeesEntity>> getAllEmployees() {
        List<EmployeesEntity> list = webService.getAllEmployees();
 
        return new ResponseEntity<List<EmployeesEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}

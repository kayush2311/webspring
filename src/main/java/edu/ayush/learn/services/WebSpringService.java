package edu.ayush.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ayush.learn.model.EmployeesEntity;
import edu.ayush.learn.repositories.WebSpringRepository;

@Service
public class WebSpringService {
	
	@Autowired
	WebSpringRepository repository;

	public List<EmployeesEntity> getAllEmployees() {
		List<EmployeesEntity> employeeList = repository.findAll();
        
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<EmployeesEntity>();
        }
	}

}

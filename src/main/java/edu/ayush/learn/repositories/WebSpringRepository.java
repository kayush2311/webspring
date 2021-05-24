package edu.ayush.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ayush.learn.model.EmployeesEntity;

@Repository
public interface WebSpringRepository extends JpaRepository<EmployeesEntity, Long>{

}

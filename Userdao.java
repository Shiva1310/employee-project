package com.employee.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.Employee;


public interface Userdao extends CrudRepository<Employee,Integer> {

	

}

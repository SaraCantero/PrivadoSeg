package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.entity.Patient;

public interface PatientCRUD extends CrudRepository<Patient, Long>{

}

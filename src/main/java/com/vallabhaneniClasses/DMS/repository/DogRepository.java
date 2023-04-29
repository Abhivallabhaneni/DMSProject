package com.vallabhaneniClasses.DMS.repository;

import java.util.List;

/**
 * 
 * @author S556511 Abhilash Vallabhaneni
 *
 */

import org.springframework.data.repository.CrudRepository;

import com.vallabhaneniClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String Name);

}

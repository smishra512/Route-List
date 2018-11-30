/**
 * 
 */
package com.adidas.city.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adidas.city.entity.City;



/**
 * @author saurabh.mishra05
 *
 */

@Repository
public interface CityRepository<E> extends JpaRepository<City, Long> {
	
	List<City> findBySourceAndDestination(String source, String destination);
}

/**
 * 
 */
package com.adidas.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adidas.city.entity.City;
import com.adidas.city.repository.CityRepository;

/**
 * @author saurabh.mishra05
 *
 */

@Service
public class CityServiceImpl implements CityService<City> {

	@Autowired
	CityRepository<City> service;

	@Override
	public List<City> getCityDetails(String source,String destination) {
		return service.findBySourceAndDestination(source, destination); 
	}

}

/**
 * 
 */
package com.adidas.city.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.city.entity.City;
import com.adidas.city.service.CityService;

/**
 * @author saurabh.mishra05
 *
 */

@RestController
public class CityController {

	@Autowired
	CityService<City> cityService;

	@GetMapping(path = "/city-details/{source}/{destination}" , produces=MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<List<City>> getCityDetails(Map<String, Object> map,
			@PathVariable String source,@PathVariable String destination) {
		List<City> resp = cityService.getCityDetails(source,destination);
		return new ResponseEntity<>(resp, null, HttpStatus.OK);
	}

}

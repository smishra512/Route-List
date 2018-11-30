package com.adidas.city.service;

import java.util.List;

public interface CityService<E> {

	public List<E> getCityDetails(String cityName, String destination);
}

package com.dev.desigRest.SPRINGrestf.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {

	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean() {
		SomeBean obj = new SomeBean("v1", "v2", "v3");

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("v1", "v2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mjv = new MappingJacksonValue(obj);
		mjv.setFilters(filters);
		return mjv;

	}

	@GetMapping("/filtering-all")
	public MappingJacksonValue getListSome() {

		List<SomeBean> objLstSomeBean = Arrays.asList(new SomeBean("v1", "v2", "v3"), new SomeBean("v11", "v12", "v13"),
				new SomeBean("v21", "v22", "v23"));

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("v1", "v2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mjv = new MappingJacksonValue(objLstSomeBean);
		mjv.setFilters(filters);

		return mjv;
	}
}

package com.cnwr.justin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/**")
public class Controller {

	@RequestMapping(value = "/batting")
	public List<Batting> batting() {
		List<Batting> battings = new ArrayList<Batting>();
		battings.add(new Batting("Hank", "Aaron", 3298));
		battings.add(new Batting("Pete", "Alexander", 703));
		battings.add(new Batting("Ernie", "Banks", 2528));
		return battings;
	}
	/*public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}*/

} 

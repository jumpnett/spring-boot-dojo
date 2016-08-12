package com.cnwr.justin;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/**")
public class Controller {

	private final List<Batting> battings;

	public Controller() {
		this.battings = new ArrayList<Batting>();
	/*	battings.add(new Batting("Hank", "Aaron", 3298));
		battings.add(new Batting("Pete", "Alexander", 703));
		battings.add(new Batting("Ernie", "Banks", 2528));
*/
		for (int i=0; i<1000; i++) {
			battings.add(new Batting("First"+i, "Last"+i, i));
		}
	}

	@RequestMapping(value = "/batting")
	public List<Batting> batting(HttpServletRequest request, HttpServletResponse response) {
		String range = request.getHeader("range");
		int start, end;
		String[] split = range.split("=");
		split = split[1].split("-");
		start = Integer.parseInt(split[0]);
		end = Integer.parseInt(split[1]);

		List<Batting> page = new ArrayList<Batting>();
		for (int i=start; i<=end; i++) {
			page.add(battings.get(i));
		}

		response.setHeader("Content-Range", "items " + start + "-" + end + "/" + battings.size());
		return page;
	}

} 

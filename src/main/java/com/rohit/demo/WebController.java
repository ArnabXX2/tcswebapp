package com.rohit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	@RequestMapping("/welcome")
	public String Home1()
	{
		return "Home1";
	}

}

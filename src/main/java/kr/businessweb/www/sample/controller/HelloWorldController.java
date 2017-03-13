package kr.businessweb.www.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

		private static String template = "Hello";
		
		@RequestMapping("/greeting")
		public String greeting(@RequestParam(value="name", defaultValue="World") String name){
			return template + ". " + name;
		}
}

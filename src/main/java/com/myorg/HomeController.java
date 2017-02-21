package com.myorg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController for home
 **/
@RestController
public class HomeController {

	/**
	* Request home path
	**/
    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
}

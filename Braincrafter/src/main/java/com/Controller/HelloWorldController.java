/**
 * 
 */
package com.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author n0j00am
 *
 */
public class HelloWorldController {

	 @RequestMapping("/")
	    @ResponseBody
	    public String helloHandler () {
	        return "<h1>Hello World!</h1>";
	    }

}

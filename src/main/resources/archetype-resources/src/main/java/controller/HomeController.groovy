#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller

import groovy.util.logging.Slf4j;

import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView

@Controller
@Slf4j
class HomeController {
	@RequestMapping("/")
	ModelAndView index() {
		log.debug "Processing home page..."
		def result = new ModelAndView("home/index")
		result.model.message = "Hello, world! from controller..."
		return result
	}
	
	@RequestMapping("/test")
	@ResponseBody String data() {
		"Hello, world! from some other place"
	}
}

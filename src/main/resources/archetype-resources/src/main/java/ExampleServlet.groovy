#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import groovy.util.logging.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler

@Slf4j
class ExampleServlet implements HttpRequestHandler {

	String name = "Example handler"
	
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug "Processing servlet request..."

		def out = response.writer
		out.println(name)
	}

}

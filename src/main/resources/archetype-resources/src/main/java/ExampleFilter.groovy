#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import groovy.util.logging.Slf4j;

import java.io.IOException;

import javax.servlet.Filter
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Slf4j
class ExampleFilter implements Filter  {
	String name = "Example filter"

	@Override
	public void init(FilterConfig config) throws ServletException {
		log.debug "ExampleFilter.init(${config}"
	}
	
	@Override
	public void destroy() {
		log.debug "ExampleFilter.destroy()"
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.debug "ExampleFilter.doFilter(${request}, ${response}, ${chain})"
		log.debug name
		chain.doFilter(request, response);
	}
}

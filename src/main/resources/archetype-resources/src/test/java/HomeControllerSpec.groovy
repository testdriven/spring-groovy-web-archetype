#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import spock.lang.*

class HomeControllerSpec extends Specification {
	def controller = new HomeController()

	def "Test index response"() {
		when:
		def response = controller.index()

		then:
		response.viewName == "home/index"
		// test single model value
		response.model.message == "Hello, world! from controller..."
		// or the whole model at once
		response.model == [ message: "Hello, world! from controller..." ]
	}

	def "Test data response is as expected"() {
		when:
		def response = controller.data()

		then:
		response == "Hello, world! from some other place"
	}
}

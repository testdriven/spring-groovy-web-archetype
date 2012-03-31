#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import org.junit.Test

class HomeControllerTest {
	def controller = new HomeController()

	@Test
	void "Test index response"() {
		// given
		def response = controller.index()

		// then
		assert response.viewName == "home/index"
		// test single model value
		assert response.model.message == "Hello, world! from controller..."
		// or the whole model at once
		assert response.model == [ message: "Hello, world! from controller..." ]
	}

	@Test
	void "Test data response is as expected"() {
		// when
		def response = controller.data()

		// then
		assert response == "Hello, world! from some other place"
	}
}

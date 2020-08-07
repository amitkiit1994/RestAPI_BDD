package com.qa.rest.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetTest {

	@Test
	public void testNumberOfCircuitsFor2017Season() {
		given().
		when().
			get("http://ergast.com/api/f1/2017/Circuits.json").
		then().
		assertThat().
		statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
		and().header("Content-Length", equalTo("4551"));
		
	}
	
}

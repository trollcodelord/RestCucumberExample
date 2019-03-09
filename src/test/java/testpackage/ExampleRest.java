package testpackage;

import java.util.List;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTableType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import serializeJSONintoList.OpenResponse;

public class ExampleRest {
	
	
	
	@Then("^users enters cityID and code$")
	
		public void test()
		{
		RestAssured.baseURI = "https://api.openweathermap.org";
		RequestSpecification httpRequest = RestAssured.given();
		
		//httpRequest.param("zip", "94040,us ");
		//httpRequest.param("appid", "b80b1f49981e23b2c1a5187cb02e80d3");
		
		//	List<List<String>> data = values.raw();
		
		//httpRequest.param("zip", data.get(0).get(0));
		//httpRequest.param("appid", data.get(0).get(1));
		
		httpRequest.param("zip", "(*\")");
		httpRequest.param("appid", "(*\")");
		
		
		Response response = httpRequest.get("/data/2.5/forecast");
		
		ResponseBody body= response.getBody();
		String bodyValue = body.asString();
		
		
		OpenResponse[] openresponse = 	response.jsonPath().getObject("cod", OpenResponse[].class);
		
		for(OpenResponse open : openresponse ) {
			
		System.out.println(open.cod);
		}
		
	}
	}



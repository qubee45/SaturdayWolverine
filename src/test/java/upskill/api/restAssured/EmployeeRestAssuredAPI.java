package upskill.api.restAssured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class EmployeeRestAssuredAPI {
	

@Given("^Create new employee record$")
public void create_new_employee_record() throws Throwable {
	
given().

	body(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/CreateEmployeePayload.json")).
	
	when().
	 header("Content-Type", "application/json").
	 
	 
	 
	 post("https://dummy.restapiexample.com/api/v1/create").
	  
	 then().
	  assertThat().statusCode(200).
	  
	  and().
	  body(matchesJsonSchema(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/CreateEmployeeSchema.json"))).
	  
			  and().
	  contentType(ContentType.JSON);
	
	



}

@Given("^Update employee record$")
public void update_employee_record() throws Throwable {
	
	
given().
		pathParam("id", "3017").
	body(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/UpdateEmployeePayload.json")).
	
	when().
	 header("Content-Type", "application/json").
	 
	 
	 
	 post("https://dummy.restapiexample.com/api/v1/create").
	  
	 then().
	  assertThat().statusCode(200).
	  
	  and().
	  body(matchesJsonSchema(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/UpdateEmployeeSchema.json"))).
	  
			  and().
	  contentType(ContentType.JSON);
	
	

}

@When("^Get all employee data$")
public void get_all_employee_data() throws Throwable {
	
	
	given().
	
	when().
	 header("Content-Type", "application/json").
	 
	 get("https://dummy.restapiexample.com/api/v1/employees").
	  
	 then().
	  assertThat().statusCode(200).
	  
	  and().
	  body(matchesJsonSchema(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/GetAllEmployeeSchema.json"))).
	  
			  and().
	  contentType(ContentType.JSON);
	
	
	
 
}

@Then("^Get single employee data by id$")
public void get_single_employee_data_by_id() throws Throwable {
	
	
	  given(). pathParam("id" , "4"). 
	  
	  when(). 
	  header("Content-Type", "application/json").
	  
	  get("https://dummy.restapiexample.com/api/v1/employee/{id}").
	  
	  then(). assertThat().statusCode(200).
	  
	  and().
	  body(matchesJsonSchema(new File(System.getProperty("user.dir") +
	  "/src/test/resource/ApiResponseSchemas/GetEmployeeSchema.json"))).
	  
	  and(). contentType(ContentType.JSON);
	  
	 
    
}

@Then("^Delete employee record$")
public void delete_employee_record() throws Throwable {
	

	given().
	 pathParam ("id", "5013").
	when().
	 header("Content-Type", "application/json").
	 
	 delete("https://dummy.restapiexample.com/api/v1/delete/{id}").
	  
	 then().
	  assertThat().statusCode(200).
	  
	  and().
	  body(matchesJsonSchema(new File(System.getProperty("user.dir")
			  + "/src/test/resource/ApiResponseSchemas/DeleteEmployeeSchema.json"))).
	  
			  and().
	  contentType(ContentType.JSON);
   
}



}

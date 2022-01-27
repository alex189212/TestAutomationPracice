package automation.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RestTests extends TestBase{
  @Test
  public void canGetAccountData() {
	  JSONObject loginDetails = new JSONObject();
	  loginDetails.put("email", "helloThere245@att.net");
	  loginDetails.put("password", "theHighGround");
	  
	  RequestSpecification httpRequest = RestAssured
			  .given()
			  .header("Content-Type", "application/json")
			  .body(loginDetails.toJSONString());
	  
	  Response user = httpRequest.post("index.php?controller=authentication&back=my-account");
	  System.out.print(user.jsonPath().toString());
	  Assert.fail();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  super.setup();
	  RestAssured.baseURI = "http://invenauto.tech/";
  }

  @AfterMethod
  public void afterMethod() {
	  super.cleanup();
  }

}

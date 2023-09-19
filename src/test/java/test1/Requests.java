package test1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Requests {
	
	
	String url = "https://developer.apple.com/library/archive/"+
		"documentation/AudioVideo/Conceptual/iTuneSearchAPI/index.html#//apple_ref/doc/uid/"+
		"TP40017632-CH3-SW1";
	@Test
	void apple1() {
			
	given()
	.when()
	 .get(url)
	.then()
	.statusCode(200)
	.log().all();
	
	System.out.print(url);
	
	
}
	
	@Test
	void applepost() {
			
	given()
	.contentType("application.json")
	.body("")
	.when()
	 .post("https://reqres.in/api/users")
	 .then()
	.statusCode(201)
	.log().all();
	
	
	
}
	
	@Test
	void appleput() {
			
		given()
		.contentType("application.json")
		.body("")
		.when()
		 .put("https://reqres.in/api/users/id")
		 .then()
		.statusCode(200)
		.log().all();
		
	
	
}
	
	@Test
	void appledelete() {
			
	given()
	.when()
	 .delete(url)
	.then()
	.statusCode(204)
	.log().all();
	
	System.out.print(url);
	
	
}
	
}

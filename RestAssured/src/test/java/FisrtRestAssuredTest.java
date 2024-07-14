import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class FisrtRestAssuredTest {
	@Test
	void getUser()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
		.body("page", equalTo(2))
		.body("data[0].id",equalTo(7))
		.statusCode(200);
		//.log().all();
		
	}
	@Test
	void createUser()
	{
		HashMap data=new HashMap();
		data.put("name", "vikas");
		data.put("job", "nothings");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.body("name", equalTo("vikas"))
			.log().all();
		
	}

}

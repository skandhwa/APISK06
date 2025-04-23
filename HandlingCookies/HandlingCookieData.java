package HandlingCookies;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

public class HandlingCookieData {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://httpbin.org";
		
	 Response res=	given().log().all().cookies(CookieData.SetCookieData())
		.when().get("post")
		.then().extract().response();
	
	System.out.println(res);
	
	 Cookies cookies = res.getDetailedCookies();
	 
	 System.out.println(cookies.toString());
	 
	 for (Cookie c : cookies.asList()) {
         System.out.println("Name: " + c.getName());
         System.out.println("Value: " + c.getValue());

}
	
}
}

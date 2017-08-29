package io.restassured.itest.java;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class ExampleForDoubanAPI_HTTPS {

    @Test
    public void test1() {
    	given().relaxedHTTPSValidation().when().get("https://api.douban.com/v2/book/1220562").then().body("price", equalTo("15.00元"));
    }

}
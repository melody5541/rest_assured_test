package io.restassured.itest.java;

import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;;

public class ExampleForDoubanAPI {

    @Before
    public void before() {
        RestAssured.baseURI = "http://api.douban.com/v2/book";
        RestAssured.port = 80;
    }

    //使用Json Schema验证返回数据
    @Test
    public void testJsonScheme() {
        get("/1220562").then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("douban.json"));
    }
    
  //使用Json Schema验证返回数据
    @Test
    public void test1() {
        get("/1220562").then().body("rating.max",equalTo("10"));
    }

}
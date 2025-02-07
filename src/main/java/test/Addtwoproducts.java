package test;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Addtwoproducts  {


    @Test
    public void testAddTwoProducts() throws Exception {

        System.out.println("Hello, I am testing here");

        String name = "Dodge";
        String status = "available";
        int id = 001;

        given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": " + id + ",\n" +
                        "  \"name\": \"" + name + "\",\n" +
                        "  \"status\": \"" + status + "\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200);

    }

}
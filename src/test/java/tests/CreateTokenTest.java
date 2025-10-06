package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.AuthRequest;
import static io.restassured.RestAssured.given;

public class CreateTokenTest extends BaseTest {

    public static String token;

    @Test
    public void createToken() {
        AuthRequest auth = new AuthRequest("admin", "password123");

        Response res = given()
                .body(auth)
                .when()
                .post("/auth")
                .then()
                .extract().response();

        token = res.jsonPath().getString("token");
        System.out.println("Generated Token: " + token);
    }
}
package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetBookingTest extends BaseTest {

    @Test(dependsOnMethods = "tests.CreateTokenTest.createToken")
    public void getBookingDetails() {
        given()
                .header("Cookie", "token=" + CreateTokenTest.token)
                .when()
                .get("/booking/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("firstname", equalTo("Sally"));
    }
}
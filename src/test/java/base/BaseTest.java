package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.SpecBuilder;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.requestSpecification = SpecBuilder.requestSpec();
        RestAssured.responseSpecification = SpecBuilder.responseSpec();
    }
}
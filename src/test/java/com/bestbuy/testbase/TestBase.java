package com.bestbuy.testbase;

import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by Beena Rani
 */
public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
    }
}
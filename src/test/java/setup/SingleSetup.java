package setup;

import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;
import util.log4jValues;

import static util.log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class SingleSetup {
    private static final String BASE_URI = "https://reqres.in";
    private static final String BASE_PATH = "/api";
    protected static final String LOGIN_RESOURCE = "/user/2";



    protected void generalSetUp(){
        setUpLog4j2();
        setUpBases();
    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(System.getProperty("user.dir")  + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    private void setUpBases(){
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;

    }
}

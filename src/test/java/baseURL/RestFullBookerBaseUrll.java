package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static automodweb.utilities.Authentication.getToken;

public class RestFullBookerBaseUrll {

    public static RequestSpecification spec;

    public static void restFullBookerSetUp(){
        spec = new RequestSpecBuilder().
        setContentType(ContentType.JSON).
                addHeader("Cookie", getToken()).
                setBaseUri("https://restful-booker.herokuapp.com").
                build();
        ;
    }
}

package automodweb.utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Authentication {

    public static Response response;

    public static String getToken() {
        String jsonBody = """
                  {
                  "username" : "admin",
                  "password" : "password123"
                }
                              """;

        response = given().
                contentType(ContentType.JSON).
                body(jsonBody).when().post("https://restful-booker.herokuapp.com/auth");

        JsonPath jsonPath = response.jsonPath();
        String token = "token="+jsonPath.getString("token");

        return token;
    }
}

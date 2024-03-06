package restFullStepDefs;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;


import java.io.*;

import static baseURL.RestFullBookerBaseUrll.spec;
import static io.restassured.RestAssured.given;
import static automodweb.utilities.Authentication.response;
public class restFullStepDefs {

    String bookingId;


    @Given("assert status code {int}")
    public void assert_status_code(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Given("create Booking {string}")
    public void create_booking(String endPoint) throws IOException {
        String body = """
                {
                    "firstname" : "Jim",
                    "lastname" : "Brown",
                    "totalprice" : 111,
                    "depositpaid" : true,
                    "bookingdates" : {
                        "checkin" : "2018-01-01",
                        "checkout" : "2019-01-01"
                    },
                    "additionalneeds" : "Breakfast"
                }
                """;

      response = given().body(body).contentType(ContentType.JSON).when().post(endPoint);
        JsonPath jsonPath = response.jsonPath();
        bookingId = jsonPath.getString("bookingid");
        //Postmanda yaptigimiz environnement atama gibi, asagida kalan uc satir
        FileWriter file = new FileWriter("/Users/kubra/IdeaProjects/Team10_Proje8/AtoumoudProject/src/test/java/restfullId.txt");
        file.write(bookingId);
        file.close();
    }

    @Given("update Booking {string}")
    public void update_booking(String endPoint) throws IOException {
        String body = """
                {
                    "firstname" : "Emine",
                    "lastname" : "Brown",
                    "totalprice" : 111,
                    "depositpaid" : true,
                    "bookingdates" : {
                        "checkin" : "2018-01-01",
                        "checkout" : "2019-01-01"
                    },
                    "additionalneeds" : "Breakfast"
                }""";
        FileReader fileReader = new FileReader("restfullId.txt");
        BufferedReader file2 = new BufferedReader(fileReader);
        bookingId = file2.readLine();
        file2.close();
        response = given().spec(spec).body(body).when().put(endPoint+"/"+bookingId);


    }

    @Given("partial update Booking {string}")
    public void partial_update_booking(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("getAuthentication {string}")
    public void get_authentication(String string) {
        String jsonBody = """
                  {
                  "username" : "admin",
                  "password" : "password123"
                }
                              """;

        response = given().
                contentType(ContentType.JSON).
                body(jsonBody).when().post(string);
    }


}

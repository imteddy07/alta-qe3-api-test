package starter;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

    public class reqresin {
        private static final String url = "https://reqres.in";

        public void GetUser () {

            SerenityRest.get("url + /api/users?page=2");
        }
        public void PostCreate () {
            JSONObject bodyJson = new JSONObject();
            bodyJson.put("name","morpheus");
            bodyJson.put("job","leader");
            SerenityRest.given()
                    .header("Content-type","application/json")
                    .body(bodyJson.toString());
            SerenityRest.post(url + "api/users");
        }
        public void PostRegister () {
            JSONObject bodyJson = new JSONObject();
            bodyJson.put("email","eve.holt@reqres.in");
            bodyJson.put("password","pistol");
            SerenityRest.given()
                    .header("Content-type","application/json")
                    .body(bodyJson.toString());
            SerenityRest.post(url + "api/register");

        }
    }

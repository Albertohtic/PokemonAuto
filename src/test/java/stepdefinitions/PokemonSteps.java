package stepdefinitions;

import api.PokemonService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.response.Response;
import java.util.List;
import static org.junit.Assert.*;

public class PokemonSteps {
    private PokemonService service;
    private Response response;

    @Given("I look for a flying type pokemon named {string}")
    public void i_look_for_a_flying_type_pokemon_named(String name) {
        service = new PokemonService();
        response = service.getPokemonInfo(name);
    }

    @Then("The search should return pokemon info")
    public void the_search_should_return_pokemon_info() {
        assertNotNull("Response is null", response);
        String body = response.getBody().asString();
        assertTrue("Response does not contain expected info", body.contains("name"));
    }

    @And("Status Code should return {int}")
    public void status_code_should_return(int statusCode) {
        assertEquals("Status code is incorrect", statusCode, response.getStatusCode());
    }

    @And("The pokemon type is {string}")
    public void the_pokemon_type_is(String expectedType) {
        List<String> types = response.jsonPath().getList("types.type.name");
        assertTrue("The expected type was not found in the pokemon info",
                types.contains(expectedType.toLowerCase()));
    }
}

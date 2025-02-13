package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PokemonService {
    private static final String BASE_URI = "https://pokeapi.co";

    static {
        RestAssured.baseURI = BASE_URI;
    }

    public Response getAllPokemon() {
        return RestAssured.given().when().get("/api/v2/pokemon/");
    }

    public Response getPokemonInfo(String idOrName) {
        return RestAssured.given().when().get("/api/v2/pokemon/" + idOrName);
    }

    public Response getPokemonAbility(String idOrName) {
        return RestAssured.given().when().get("/api/v2/ability/" + idOrName);
    }
}

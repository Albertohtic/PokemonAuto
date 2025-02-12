package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PokemonService {
    // Base URI del API
    private static final String BASE_URI = "https://pokeapi.co";

    static {
        RestAssured.baseURI = BASE_URI;
    }

    // Endpoint: All Pokemon
    public Response getAllPokemon() {
        return RestAssured.given().when().get("/api/v2/pokemon/");
    }

    // Endpoint: Pokemon Info (por id o nombre)
    public Response getPokemonInfo(String idOrName) {
        return RestAssured.given().when().get("/api/v2/pokemon/" + idOrName);
    }

    // Endpoint: Pokemon Abilities (por id o nombre)
    public Response getPokemonAbility(String idOrName) {
        return RestAssured.given().when().get("/api/v2/ability/" + idOrName);
    }
}

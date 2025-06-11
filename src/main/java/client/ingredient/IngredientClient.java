package client.ingredient;

import io.restassured.response.Response;
import client.Client;

public class IngredientClient extends Client {
    private static final String ROOT = "/ingredients";

    public Response getAllIngredients() {
        return specification()
                .get(ROOT);
    }
}
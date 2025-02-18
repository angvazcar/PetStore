import org.json.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PetStore {

    public static void main(String[] args) {
        String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=sold";

        try {
            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            // Enviar la solicitud
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Analizar la respuesta JSON
            JSONArray petsArray = new JSONArray(response.body());

            // Recorrer y mostrar {id, name}
            for (int i = 0; i < petsArray.length(); i++) {
                JSONObject pet = petsArray.getJSONObject(i);
                int id = pet.getInt("id");
                String name = pet.optString("name", "Sin nombre"); // Maneja el caso si no tiene nombre
                System.out.println("{" + id + ", " + name + "}");
            }

        } catch (IOException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
    }
}


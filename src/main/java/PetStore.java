import org.json.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.ArrayList;

public class PetStore {

    //public static void main(String[] args) {
        private static final String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=sold";
        public static List<Pet> getSoldPets() {
            List<Pet> petsList = new ArrayList<>();

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
                String name = pet.optString("name", "Sin nombre"); // En caso de no tener nombre nombre
                //System.out.println("{" + id + ", " + name + "}");
                if (id != -1)
                    petsList.add(new Pet(id, name));

            }

        } catch (IOException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
            return petsList;
    }
}


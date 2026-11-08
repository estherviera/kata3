package software.ulpgc.katas.adapters;

import software.ulpgc.katas.model.User;
import software.ulpgc.katas.ports.UserReader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class JsonRandomUserReader implements UserReader {

    @Override
    public List<User> read(){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest resquest = HttpRequest.newBuilder()
                    .uri(URI.create("https://randomuser.me/api/?results=5"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(
                    resquest,
                    HttpResponse.BodyHandlers.ofString()
            );
            System.out.println(response.body());
            return List.of();
        }catch (IOException e){
            throw new RuntimeException("Error al conectar con la API", e);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            throw new RuntimeException("Peticion interrumpida", e);
        }
    }
}

package ru.naumen;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task4 {
    /**
     * Вывести только значение IP адреса с которого был сделан запрос
     * (запрос выполняется по адресу “https://httpbin.org/ip”).
     */
    public static void task4() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            JSONObject jsonObject = new JSONObject(responseBody);
            String ip = jsonObject.getString("origin");
            System.out.println("IP-адрес: " + ip);

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        task4();
    }
}

package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para buscar:");
        var busca = scanner.nextLine();

        String chave = "f45ee80a";

        String enedereco = "https://www.omdbapi.com/?t="+ busca + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(enedereco))
            .build();
        
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());
        
        System.out.println(response.body());
        String json = response.body();

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println(meuTitulo);

    }
}

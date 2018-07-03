package cz.malanius.udesee.exporter.trello.webclient;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

public class WebClient {

    public static String getRequest(URI requestUri) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(requestUri).GET().build();
        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandler.asString());
        return response.body().toString();
    }

    public static String postRequest(URI requestUri) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(requestUri).POST(HttpRequest.noBody()).build();
        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandler.asString());
        return response.body().toString();
    }
}

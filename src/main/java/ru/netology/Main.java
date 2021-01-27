package ru.netology;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();
        ObjectMapper mapper = new ObjectMapper();
        HttpGet request = new HttpGet("https://cat-fact.herokuapp.com/facts");
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        try {
            CloseableHttpResponse response = httpClient.execute(request);
            Arrays.stream(response.getAllHeaders()).forEach(System.out::println);
            List<Cats> catsList = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<Cats>>(){
            });

            System.out.println("Фильтр");
            catsList.stream()
                    .filter( value -> value.getId()!= null && value.getId().equals("58e008800aac31001185ed07") )
                    .forEach(System.out::println);

            System.out.println("Итог");
            catsList.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
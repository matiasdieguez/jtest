package com.jtest.demo;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("JTest");

		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "[\n\t\"1010\",\n\t\"1011\",\n\t\"4044922\"\n]");
		Request request = new Request.Builder().url("http://aag-api-test.tecnocode.net/api/supplier/enrolleds")
				.post(body).addHeader("Content-Type", "application/json")
				.addHeader("Authorization",
						"Basic VmlzdGFTb3V0aDExNDo0ODk4ZTRiNC0xNjhjLTQ3MzQtYWFmMS1hNjc5Yjk3ZjBkNzE=")
				.addHeader("User-Agent", "PostmanRuntime/7.20.1").addHeader("Accept", "*/*")
				.addHeader("Cache-Control", "no-cache")
				.addHeader("Postman-Token", "d02520bb-14e7-4363-8fbb-6ebe33bef75c,52f8aa90-86a6-452c-b7ff-313f48478888")
				.addHeader("Host", "aag-api-test.tecnocode.net").addHeader("Accept-Encoding", "gzip, deflate")
				.addHeader("Content-Length", "32").addHeader("Connection", "keep-alive")
				.addHeader("cache-control", "no-cache").build();

		Response response = client.newCall(request).execute();

		System.out.print(response.body().string());

		SpringApplication.run(DemoApplication.class, args);
	}

}

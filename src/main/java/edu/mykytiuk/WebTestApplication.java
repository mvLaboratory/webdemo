package edu.mykytiuk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebTestApplication {
//	private Quote quote;
	public static void main(String[] args) {
		SpringApplication.run(WebTestApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	CommandLineRunner run(RestTemplate restTemplate) throws Exception {
////		return args -> {
////			quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
////			//System.out.println(quote.toString());
////		};
//	}

//	public Quote getQuote() {
//		return quote;
//	}
}

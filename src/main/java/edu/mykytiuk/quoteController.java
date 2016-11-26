package edu.mykytiuk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class quoteController {

    @RequestMapping("/")
    public Quote showQuote(){
        RestTemplate temp = new RestTemplate();
        return temp.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}

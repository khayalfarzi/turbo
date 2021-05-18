package az.company.turbo.client;

import az.company.turbo.dto.Demo;
import az.company.turbo.dto.District;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Response {

    public ResponseEntity<?> post(Demo demo) {
        String url = "http://localhost:5051/v1/post/create";

        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity entity = new HttpEntity(headers);

        return template.postForEntity(url, demo, String.class);
    }

    public District getDistricts() {
        District district;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        String url = "http://localhost:5051/v1/get/districts";

        district = restTemplate.exchange(url, HttpMethod.GET, entity, District.class).getBody();
        return district;
    }

    public void getBrands() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity entity = new HttpEntity(httpHeaders);

        String url = "http://localhost:5050/brand";

        Object o = restTemplate.exchange(url, HttpMethod.GET, entity, Object.class).getBody();
        System.out.println(o);
    }
}

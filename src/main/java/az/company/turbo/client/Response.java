package az.company.turbo.client;

import az.company.turbo.dto.District;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class Response {

    public District getDistricts() {
        District district;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity entity = new HttpEntity(httpHeaders);

        String url = "https://api.opendata.az/v1/json/map/districts";

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

package ro.itschool.mvnbase.tema14;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestCountrySource  {
    public List<Country> getDocuments() {
        ResponseEntity<List<Country>>response= new RestTemplate()
                .exchange("https://restcountries.eu/rest/v2/all",
                        HttpMethod.GET,
                        new HttpEntity<>(null),
                        new ParameterizedTypeReference<List<Country>>() {
                        });
        return response.getBody();
    }
}

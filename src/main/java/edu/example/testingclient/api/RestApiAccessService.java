package edu.example.testingclient.api;

import edu.example.testingclient.entities.Authority;
import edu.example.testingclient.entities.TestCase;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Date;

public class RestApiAccessService implements ApiAccessService{

    private RestTemplate restTemplate;

    public RestApiAccessService(String accessToken) {
        restTemplate = new RestTemplate();
        if (accessToken != null) {
            this.restTemplate
                    .getInterceptors()
                    .add(getBearerTokenInterceptor(accessToken));
        }
    }

    private ClientHttpRequestInterceptor getBearerTokenInterceptor(String accessToken) {
        ClientHttpRequestInterceptor interceptor =
                new ClientHttpRequestInterceptor() {
                    @Override
                    public ClientHttpResponse intercept(
                            HttpRequest request, byte[] bytes,
                            ClientHttpRequestExecution execution) throws IOException {
                        request.getHeaders().add("Authorization", "Bearer " + accessToken);
                        return execution.execute(request, bytes);
                    }
                };
        return interceptor;
    }







    @Override
    public TestCase getTestCaseById(String id) {
        ResponseEntity<TestCase> entity = restTemplate.getForEntity("http://localhost:9091/api/testCases/{id}", TestCase.class, id);
        System.out.println("Status code: " + entity.getStatusCode());
        Date date = new Date(entity.getHeaders().getDate());
        System.out.println("Fetch date: " + date);
        return entity.getBody();
    }

    @Override
    public void updateTestCase(TestCase testCase) {
        restTemplate.put("http://localhost:9091/api/testCases/{id}", testCase, testCase.getId().toString());
    }

    @Override
    public void deleteTestCase(String id) {
        restTemplate.delete("http://localhost:9091/api/testCases/{id}", id);
    }

    @Override
    public Authority addAuthority(Authority authority) {
        return restTemplate.postForObject("http://localhost:9091/api/roles", authority, Authority.class);
    }



}

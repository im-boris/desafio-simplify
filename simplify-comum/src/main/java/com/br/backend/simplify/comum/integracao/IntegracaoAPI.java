package com.br.backend.simplify.comum.integracao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Getter
public class IntegracaoAPI {

    @Autowired
    private RestTemplate restTemplate;

//    protected AccessToken getAccessToken() {
//        // create headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Basic " + configuracao.getBasic());
//
//        HttpEntity request = new HttpEntity(headers);
//
//        // make a request
//        ResponseEntity<AccessToken> response = new RestTemplate().exchange(configuracao.getAuthURL(), HttpMethod.POST, request, AccessToken.class);
//
//        // get JSON response
//        return response.getBody();
//    }
//
    protected HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Bearer " + getAccessToken().getAccessToken());
//        headers.add("client_id", getConfiguracao().getClientId());
        return headers;
    }


    protected <T> T get(String url, Class<T> clazz) throws Exception {
        try {
            return getRestTemplate().exchange(url, HttpMethod.GET, new HttpEntity<>(getHeaders()), clazz).getBody();
        } catch (HttpClientErrorException e) {
//            log.error(e.getMessage(), e); // ajustar
            try {
                ObjectMapper mapper = mapper();
                return mapper.readValue(e.getResponseBodyAsString(), clazz);
            } catch (JsonProcessingException ex) {
                throw new Exception(); // lançar exception bonita
            }
        }
    }

    protected <T> T get(String url, ParameterizedTypeReference<T> clazz) throws Exception {
        try {
            return getRestTemplate().exchange(url, HttpMethod.GET, new HttpEntity<>(getHeaders()), clazz).getBody();
        } catch (HttpClientErrorException e) {
//            log.error(e.getMessage(), e);
            try {
                ObjectMapper mapper = mapper();
                return mapper.readValue(e.getResponseBodyAsString(), (JavaType) clazz.getType());
            } catch (JsonProcessingException ex) {
                throw new Exception(); // lançar exception bonita
            }
        }
    }


//    protected <T> T post(String url, Class<T> clazz) {
//        return post(url, null, clazz);
//    }

//    protected <T> T post(String url, Object body, Class<T> clazz) {
//        try {
//
//            HttpHeaders headers = getHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            return getRestTemplate().exchange(url, HttpMethod.POST, new HttpEntity<>(body, headers), clazz).getBody();
//        } catch (HttpClientErrorException e) {
//            log.error(e.getMessage(), e);
//            try {
//                ObjectMapper mapper = mapper();
//                return mapper.readValue(e.getResponseBodyAsString(), clazz);
//            } catch (JsonProcessingException ex) {
//                throw new CADINVIntegracaoException(Errorcode.ERRO_GENERICO, ex.getMessage(), ex);
//            }
//        }
//    }
//
//    protected <T> T put(String url, Object body, Class<T> clazz) {
//        try {
//            return getRestTemplate().exchange(url, HttpMethod.PUT, new HttpEntity<>(body, getHeaders()), clazz).getBody();
//        } catch (HttpClientErrorException e) {
//            log.error(e.getMessage(), e);
//            try {
//                ObjectMapper mapper = mapper();
//                return mapper.readValue(e.getResponseBodyAsString(), clazz);
//            } catch (JsonProcessingException ex) {
//                throw new CADINVIntegracaoException(Errorcode.ERRO_GENERICO, ex.getMessage(), ex);
//            }
//        }
//    }

    private ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

}

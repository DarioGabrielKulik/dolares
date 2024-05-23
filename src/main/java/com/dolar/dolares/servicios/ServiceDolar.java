package com.dolar.dolares.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ServiceDolar {

    @Autowired
    private RestTemplate restTemplate;

    public Object dolar(){
        String urlDolarApi = "https://dolarapi.com/v1/dolares";
        Object dolares = restTemplate.getForObject(urlDolarApi, Object.class);
        return dolares;
    }

}

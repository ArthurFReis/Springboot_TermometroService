package com.arthur.TermometroService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Variaveis {
    @Value("${BR}")
    private String celcius;

    @Value("${US}")
    private String fahrenheit;

    @Value("${server.port}")
    private String port;

    @Override
    public String toString() {
        return "Variaveis{" +
                "celcius='" + celcius + '\'' +
                ", fahrenheit='" + fahrenheit + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}

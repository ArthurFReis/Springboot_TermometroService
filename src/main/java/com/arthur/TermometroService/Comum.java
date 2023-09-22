package com.arthur.TermometroService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.arthur.TermometroService.*;


@Service
@Profile({"comum","default"})
public class Comum  implements Temperatura{

    @Value("${BR}")
    private String celcius;

    @Value("${US}")
    private String fahrenheit;

    @Override
    public void imprimirTemperaturas() {
        System.out.println(celcius + " " + "Graus Celcius");
        System.out.println(fahrenheit + " " +  "Graus  Fahrenheit");

    }

}

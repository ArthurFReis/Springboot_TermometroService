package com.arthur.TermometroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arthur.TermometroService.TermometroServiceApplication;
import com.arthur.TermometroService.Variaveis;
import com.arthur.TermometroService.*;


@SpringBootApplication
public class TermometroServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TermometroServiceApplication.class, args);
		showProfileImplementation(context);
		//VariavelBinding(context);
	}

//	private static void VariavelBinding(ApplicationContext context) {
//		// Binding to any kind of Component using @Value annotation
//		Variaveis variaveis = context.getBean(Variaveis.class);
//		System.out.println(variaveis);
//	}

	private static void showProfileImplementation(ApplicationContext context) {
		Temperatura temperatura = context.getBean(Temperatura.class);
		temperatura.imprimirTemperaturas();
	}

}

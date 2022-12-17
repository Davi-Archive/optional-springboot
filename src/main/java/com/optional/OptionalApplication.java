package com.optional;

import com.optional.model.Caminhao;
import com.optional.model.Motorista;
import com.optional.repository.Motoristas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class OptionalApplication {
	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		Motorista motorista = motoristas.porNome("João");

//		String cobertura =  motorista.getCaminhao().getSeguro().getCobertura();
		String cobertura = null;

		System.out.println("A cobertura é: "+cobertura);

	}

}

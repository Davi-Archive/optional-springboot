package com.optional;

import com.optional.model.Caminhao;
import com.optional.model.Motorista;
import com.optional.model.Seguro;
import com.optional.repository.Motoristas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {
    public static void main(String[] args) {
        Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal('600'));

        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);


    }

}

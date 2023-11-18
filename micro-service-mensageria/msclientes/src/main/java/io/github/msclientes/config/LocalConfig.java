package io.github.msclientes.config;

import io.github.msclientes.domain.Cliente;
import io.github.msclientes.infra.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocalConfig {

    @Autowired
    ClienteRepository clienteRepository;

    @Bean
    public void startDB(){
        Cliente c1 = new Cliente("10811135020" , "Jose Antonio" , 23);
        Cliente c2 = new Cliente("58730701058" , "Mario Andre" , 42);
        Cliente c3 = new Cliente("85885443009" , "Silvana Silva" , 34);

        clienteRepository.saveAll(List.of(c1, c2,c3));
    }
}

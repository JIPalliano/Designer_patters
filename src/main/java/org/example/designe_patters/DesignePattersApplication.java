package org.example.designe_patters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Slf4j
@SpringBootApplication
public class DesignePattersApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignePattersApplication.class, args);
    }

}

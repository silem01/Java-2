package com.coderhouse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase10Application  {

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(Clase10Application.class, args);
    }

    
}

package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Curso;

import jakarta.persistence.Entity;

@SpringBootApplication

public class Clase08Application implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}
	
	@Override
	public void run(String...arg) throws Exception{
		try {
			
			Curso curso1 = new Curso("HTML");
			Curso curso2 = new Curso("CSS");
			Curso curso3 = new Curso("JAVA");
			
			Alumno alumno1 = new Alumno("Alejandro", "Sanz", 42722383, "L42722383");
			Alumno alumno2 = new Alumno("Lionel", "Messi", 13229160, "L13229160");
			Alumno alumno3 = new Alumno("Roman", "Riquelme", 21141399, "L21141399");
			
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);
			
			
			
			
		}catch( Exception e) {
			e.printStackTrace(System.err);
		}
		
	}

}

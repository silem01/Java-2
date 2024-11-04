package com.coderhouse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner {

    @Autowired
    private DaoFactory dao;

    public static void main(String[] args) {
        SpringApplication.run(Clase09Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            Categoria categoria1 = new Categoria("Programacion FrontEnd");
            Categoria categoria2 = new Categoria("Programacion BackEnd");

            Curso curso1 = new Curso("HTML", categoria1);
            Curso curso2 = new Curso("CSS", categoria1);
            Curso curso3 = new Curso("JAVA", categoria2);

            // Cambiaremos los dni de cada alumno para evitar duplicados
            Alumno alumno1 = new Alumno("Alejandro", "Sanz", 42722383, "L42722383");
            Alumno alumno2 = new Alumno("Lionel", "Messi", 13229161, "L13229161");
            Alumno alumno3 = new Alumno("Roman", "Riquelme", 21141400, "L21141400");

            // Persistir las entidades en la base de datos
            dao.createCategoria(categoria1);
            dao.createCategoria(categoria2);
            dao.createAlumno(alumno1);
            dao.createAlumno(alumno2);
            dao.createAlumno(alumno3);
            dao.createCurso(curso1);
            dao.createCurso(curso2);
            dao.createCurso(curso3);

            System.out.println("Mostrar lista de categorias");
            List<Categoria> categorias = dao.getAllCategorias();
            categorias.forEach(categoria -> System.out.println(categoria.toString()));
            System.out.println("-----------------");

            System.out.println("Mostrar lista de cursos");
            List<Curso> cursos = dao.getAllCursos();
            cursos.forEach(curso -> System.out.println(curso.toString()));
            System.out.println("------------------------------------------");

            System.out.println("Mostrar lista de alumnos");
            List<Alumno> alumnos = dao.getAllAlumnos();
            alumnos.forEach(alumno -> System.out.println(alumno.toString()));
            System.out.println("------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}

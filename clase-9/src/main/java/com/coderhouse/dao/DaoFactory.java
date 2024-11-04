package com.coderhouse.dao;

import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createAlumno(Alumno alumno) {
        em.persist(alumno);
    }

    @Transactional
    public void createCurso(Curso curso) {
        em.persist(curso);
    }

    @Transactional
    public void createCategoria(Categoria categoria) {
        em.persist(categoria);
    }

    public List<Alumno> getAllAlumnos() {
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a", Alumno.class);
        List<Alumno> alumnos = query.getResultList();
        alumnos.forEach(a -> Hibernate.initialize(a.getCursos()));
        return alumnos;
    }

    public List<Curso> getAllCursos() {
        TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c", Curso.class);
        List<Curso> cursos = query.getResultList();
        cursos.forEach(c -> Hibernate.initialize(c.getCategoria()));
        return cursos;
    }

    public List<Categoria> getAllCategorias() {
        TypedQuery<Categoria> query = em.createQuery("SELECT ca FROM Categoria ca", Categoria.class);
        return query.getResultList();
    }

    @Transactional
    public Curso getCursoById(Long cursoId) {
        TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c WHERE c.id = :id", Curso.class);
        return query.setParameter("id", cursoId).getSingleResult();
    }

    public Alumno getAlumnoById(Long alumnoId) {
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a WHERE a.id = :id", Alumno.class);
        Alumno alumno = query.setParameter("id", alumnoId).getSingleResult();
        Hibernate.initialize(alumno.getCursos());
        return alumno;
    }

    @Transactional
    public void inscribirAlumnoEnCurso(Long cursoId, Long alumnoId) {
        Curso curso = getCursoById(cursoId);
        Alumno alumno = getAlumnoById(alumnoId);

        if (!curso.getAlumnos().contains(alumno)) {
            curso.getAlumnos().add(alumno);
            em.merge(curso); // Persistir el cambio en la base de datos
        }
    }
}

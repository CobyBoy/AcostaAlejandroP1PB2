package acosta.alejandro.pb2.models;

import java.util.LinkedList;
import java.util.List;

public class Prestamo {
	private Integer id;
	private List <Alumno> alumnoAlQueSelePresto;
	private List <Libro> libroprestado;
	
	public Prestamo(Integer id) {
		this.id = id;
		this.alumnoAlQueSelePresto = new LinkedList<Alumno>();
		this.libroprestado =  new LinkedList<Libro>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Alumno> getAlumnoAlQueSelePresto() {
		return alumnoAlQueSelePresto;
	}

	public void setAlumnoAlQueSelePresto(List<Alumno> alumnoAlQueSelePresto) {
		this.alumnoAlQueSelePresto = alumnoAlQueSelePresto;
	}

	public List<Libro> getLibroprestado() {
		return libroprestado;
	}

	public void setLibroprestado(List<Libro> libroprestado) {
		this.libroprestado = libroprestado;
	}

	public void crearPrestamo(Alumno alumno, Libro libro) {
		this.alumnoAlQueSelePresto.add(alumno);
		this.libroprestado.add(libro);
	}


}

package acosta.alejandro.pb2.models;

import java.util.LinkedList;
import java.util.List;

public class Prestamo {
	private Integer id;
	private List <Alumno> alumnoAlQueSelePresto;
	private List <Libro> libroprestado;
	
	public Prestamo(Integer id, Alumno alumno, Libro libroprestado) {
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


}

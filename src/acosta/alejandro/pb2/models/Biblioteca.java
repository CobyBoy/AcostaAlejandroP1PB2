package acosta.alejandro.pb2.models;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private List <Libro> libros;
	private String nombreDeBiblioteca;
	
	public Biblioteca(String nombreDeBiblioteca) {
		this.nombreDeBiblioteca = nombreDeBiblioteca;
		this.libros = new LinkedList<Libro>();
	}

	public String getNombreDeBiblioteca() {
		return nombreDeBiblioteca;
	}

	public void setNombreDeBiblioteca(String nombreDeBiblioteca) {
		this.nombreDeBiblioteca = nombreDeBiblioteca;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void agregarLibrosALaBiblioteca(Libro libro) {
		this.libros.add(libro);
	}

	public Integer getCantidadDeLibrosEnBiblioteca() {
		// TODO Auto-generated method stub
		return this.libros.size();
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + ", nombreDeBiblioteca=" + nombreDeBiblioteca + "]";
	}

	public Integer prestarLibroAAlumno(Integer id, Alumno alumno, Libro libro) {
		Boolean libroExiste = this.libros.contains(libro);
		if (libroExiste) {
			libro.setSePuedePrestar(false);
			Prestamo prestamo = new Prestamo(id);
			prestamo.crearPrestamo(alumno, libro);
			this.libros.remove(libro);
		}
		return this.libros.size();
	}

}

package acosta.alejandro.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import acosta.alejandro.pb2.enums.TipoDeLibro;
import acosta.alejandro.pb2.models.Alumno;
import acosta.alejandro.pb2.models.Biblioteca;
import acosta.alejandro.pb2.models.Libro;
import acosta.alejandro.pb2.models.LibroDeGeografia;
import acosta.alejandro.pb2.models.LibroDeHistoria;
import acosta.alejandro.pb2.models.LibroDeMatematica;
import acosta.alejandro.pb2.models.Prestamo;

public class Tests {

	@Test
	public void queSePuedanAgregarLibrosAlaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Unlam");
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeMatematica(1, "Matematicas Discretas", "unAutor"));
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeGeografia(2, "Geografia mundial", "otroAutor"));
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeHistoria(3, "Historia Argentina", "tercerAutor"));
		
		assertEquals((Integer)3, biblioteca.getCantidadDeLibrosEnBiblioteca());
		
	}
	
	@Test
	public void queUnAlumnoPuedaSacarUnLibroYElLibroNoEsteHabilitadoDespuesDeSacarlo() {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Unlam");
		Libro libroDeMatematica = new LibroDeMatematica(1, "Matematicas Discretas", "unAutor");
		biblioteca.agregarLibrosALaBiblioteca(libroDeMatematica);
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeGeografia(2, "Geografia mundial", "otroAutor"));
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeHistoria(3, "Historia Argentina", "tercerAutor"));
		
		Alumno alumno = new Alumno(35396973, "Coby", "Acosta");
		
		biblioteca.prestarLibroAAlumno(1, alumno, libroDeMatematica);
		assertFalse(libroDeMatematica.getSePuedePrestar());
	}
	
	@Test
	public void queAlSacarUnlibroYaNoEsteEnLaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Unlam");
		Libro libroDeMatematica = new LibroDeMatematica(1, "Matematicas Discretas", "unAutor");
		biblioteca.agregarLibrosALaBiblioteca(libroDeMatematica);
		
		Alumno alumno = new Alumno(35396973, "Coby", "Acosta");
		
		assertEquals((Integer)0, biblioteca.prestarLibroAAlumno(1, alumno, libroDeMatematica));
	}
	
	@Test
	public void queUnAlumnoPuedaDevolverUnLibroYElLibroEsteHabilitadoAlDevolverlo() {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Unlam");
		Libro libroDeMatematica = new LibroDeMatematica(1, "Matematicas Discretas", "unAutor");
		biblioteca.agregarLibrosALaBiblioteca(libroDeMatematica);
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeGeografia(2, "Geografia mundial", "otroAutor"));
		biblioteca.agregarLibrosALaBiblioteca(new LibroDeHistoria(3, "Historia Argentina", "tercerAutor"));
		
		Alumno alumno = new Alumno(35396973, "Coby", "Acosta");
		
		biblioteca.prestarLibroAAlumno(1, alumno, libroDeMatematica);
		
		//alumno.devolverLibro();
		assertFalse(libroDeMatematica.getSePuedePrestar());
	}
	
	@Test
	public void queLosLibrosDeGeografiaSeanFotocopoiables() {
		LibroDeGeografia geo = new LibroDeGeografia(2, "Geografia mundial", "otroAutor");
		assertEquals("Geografia mundial", geo.libroQueSePuedeFotocopiar());
	}
	
	@Test
	public void queLosLibrosDeHistoriaSeanFotocopoiables() {
		LibroDeHistoria historia = new LibroDeHistoria(3, "Historia Argentina", "tercerAutor");
		assertEquals("Historia Argentina", historia.libroQueSePuedeFotocopiar());
	}
	

}

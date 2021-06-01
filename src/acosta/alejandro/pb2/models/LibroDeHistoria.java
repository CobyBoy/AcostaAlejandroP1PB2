package acosta.alejandro.pb2.models;

import acosta.alejandro.pb2.interfaces.Fotocopiable;

public class LibroDeHistoria extends Libro implements Fotocopiable{

	public LibroDeHistoria(Integer id, String nombreDeLibro, String autor) {
		super(id, nombreDeLibro, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String libroQueSePuedeFotocopiar() {
		// TODO Auto-generated method stub
		return this.getNombreDeLibro();
	}

}

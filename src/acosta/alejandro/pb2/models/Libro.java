package acosta.alejandro.pb2.models;

public abstract class Libro {
	private Integer id;
	private String nombreDeLibro;
	private String autor;
	private Boolean sePuedePrestar;
	
	public Libro (Integer id, String nombreDeLibro, String autor)
	{
		this.id = id;
		this.nombreDeLibro = nombreDeLibro;
		this.autor = autor;
		this.sePuedePrestar = Boolean.TRUE;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreDeLibro() {
		return nombreDeLibro;
	}
	public void setNombreDeLibro(String nombreDeLibro) {
		this.nombreDeLibro = nombreDeLibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Boolean getSePuedePrestar() {
		return sePuedePrestar;
	}
	public void setSePuedePrestar(Boolean sePuedePrestar) {
		this.sePuedePrestar = sePuedePrestar;
	}
	@Override
	public String toString() {
		return "Libro [nombreDeLibro=" + nombreDeLibro + ", sePuedePrestar=" + sePuedePrestar + "]";
	}
	
}

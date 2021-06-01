package acosta.alejandro.pb2.models;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private final Integer CANTIDAD_MAXIMA_DE_PRESTAMOS;
	
	public Alumno(Integer dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.CANTIDAD_MAXIMA_DE_PRESTAMOS = 2;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PRESTAMOS() {
		return CANTIDAD_MAXIMA_DE_PRESTAMOS;
	}

	public void sacarLibro(Libro libro) {
		libro.setSePuedePrestar(false);
	}
	
	
}

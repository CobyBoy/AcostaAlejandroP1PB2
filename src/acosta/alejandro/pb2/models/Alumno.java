package acosta.alejandro.pb2.models;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private Integer CANTIDAD_MAXIMA_DE_PRESTAMOS;
	
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

	public void devolverLibro(Libro libro) {
		this.setCANTIDAD_MAXIMA_DE_PRESTAMOS(getCANTIDAD_MAXIMA_DE_PRESTAMOS()+1);
		libro.setSePuedePrestar(true);	
	}

	public void setCANTIDAD_MAXIMA_DE_PRESTAMOS(Integer cANTIDAD_MAXIMA_DE_PRESTAMOS) {
		CANTIDAD_MAXIMA_DE_PRESTAMOS = cANTIDAD_MAXIMA_DE_PRESTAMOS;
	}
	
	public void restarPrestamo() {
		this.setCANTIDAD_MAXIMA_DE_PRESTAMOS(this.getCANTIDAD_MAXIMA_DE_PRESTAMOS() - 1);
	}
	
}

package acosta.alejandro.pb2.models;

public class Prestamo {
	private Integer id;
	private Alumno alumnoAlQueSelePresto;
	private Libro libro;
	
	public Prestamo(Integer id, Alumno alumno, Libro libroprestado) {
		this.id = id;
		this.alumnoAlQueSelePresto = alumno;
		this.libro = libroprestado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alumno getAlumnoAlQueSelePresto() {
		return alumnoAlQueSelePresto;
	}

	public void setAlumnoAlQueSelePresto(Alumno alumnoAlQueSelePresto) {
		this.alumnoAlQueSelePresto = alumnoAlQueSelePresto;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}

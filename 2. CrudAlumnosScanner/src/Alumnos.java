
public class Alumnos {
	//Atributos
	String nombre;
	String apellido;
	int matricula;
	double promedio;

	//Constructor Vacío
	public Alumnos() {
	}

	//Constructor con parámetros
	public Alumnos(String nombre, String apellido, int matricula, double promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.promedio = promedio;
	}

	//ToString
	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellido=" + apellido + ", matrícula=" + matricula + ", promedio="
				+ promedio + "]\n";
	}

	//Encapsulamiento
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatrícula(int matricula) {
		this.matricula = matricula;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}

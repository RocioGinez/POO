
public class Empleados {
	
	//Atributos
	String nombre;
	String apellido;
	String area;
	int edad;
	
	//Constructor vacio
	public Empleados() {
	}
	
	//Constructor con parámetros
	public Empleados(String nombre, String apellido, String area, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.area = area;
		this.edad = edad;
	}

	//Método ToString
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", edad=" + edad + "]\n";
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
		

}

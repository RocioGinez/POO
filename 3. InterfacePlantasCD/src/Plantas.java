public class Plantas {
	//Atributos
	String nombre;
	String especie;
	float precio;
	int existencia;
	
	//Constructor Vacío
	public Plantas() {
	}

	//Constructor con parámetros
	public Plantas(String nombre, String especie, float precio, int existencia) {
		this.nombre = nombre;
		this.especie = especie;
		this.precio = precio;
		this.existencia = existencia;
	}

	//ToString
	@Override
	public String toString() {
		return "Plantas [nombre=" + nombre + ", especie=" + especie + ", precio= $" + precio + ", existencia="
				+ existencia + "]\n";
	}

	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
}

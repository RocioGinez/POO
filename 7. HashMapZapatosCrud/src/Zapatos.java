
public class Zapatos {

	//Atributos
	String modelo;
	String tipo;
	String marca;
	float precio;
	
	//Constructor Vacío
	public Zapatos() {
	}

	//Constructor con llave de HashMap
	public Zapatos(String modelo) {
		this.modelo = modelo;
	}

	//Constructor con parámetros
	public Zapatos(String modelo, String tipo, String marca, float precio) {
		this.modelo = modelo;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	//ToString
	@Override
	public String toString() {
		return "Zapatos [modelo=" + modelo + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + "]\n";
	}

	//Encapsulamiento
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}	
}

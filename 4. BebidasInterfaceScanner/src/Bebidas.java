public class Bebidas {
	private String nombre;
	private int porAlcohol;
	private float precio;
	private String tipo;
	
	public Bebidas() {
		super();
	}

	public Bebidas(String nombre, int porAlcohol, float precio, String tipo) {
		super();
		this.nombre = nombre;
		this.porAlcohol = porAlcohol;
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Bebidas [nombre=" + nombre + ", porAlcohol=" + porAlcohol + ", precio=$" + precio + ", tipo=" + tipo
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPorAlcohol() {
		return porAlcohol;
	}

	public void setPorAlcohol(int porAlcohol) {
		this.porAlcohol = porAlcohol;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}


public class Macetas {

	//Atributos
	private String forma;
	private String tamaño;
	private float precio;
	private int existencia;

	//Constructores
	public Macetas() {
		super();
	}

	public Macetas(String forma, String tamaño, float precio, int existencia) {
		super();
		this.forma = forma;
		this.tamaño = tamaño;
		this.precio = precio;
		this.existencia = existencia;
	}

	//ToString
	@Override
	public String toString() {
		return "Macetas [forma=" + forma + ", tamaño=" + tamaño + ", precio=" + precio + ", existencia=" + existencia
				+ "]\n";
	}

	//Encapsulamiento
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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

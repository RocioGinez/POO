
public class Macetas {

	//Atributos
	private String forma;
	private String tama�o;
	private float precio;
	private int existencia;

	//Constructores
	public Macetas() {
		super();
	}

	public Macetas(String forma, String tama�o, float precio, int existencia) {
		super();
		this.forma = forma;
		this.tama�o = tama�o;
		this.precio = precio;
		this.existencia = existencia;
	}

	//ToString
	@Override
	public String toString() {
		return "Macetas [forma=" + forma + ", tama�o=" + tama�o + ", precio=" + precio + ", existencia=" + existencia
				+ "]\n";
	}

	//Encapsulamiento
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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

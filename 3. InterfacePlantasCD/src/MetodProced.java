
public interface MetodProced {

	public void guardar(Plantas planta); // Se declara variable de tipo objeto porque ah� se almacena la informaci�n

	public void editar(int indice, Plantas planta); // Se usa el �ndice para buscar, por lo que se declara

	public void eliminar(int indice);

	public Plantas buscar(int indice); // Va a retornar informaci�n del objeto de clase Plantas

	public void mostrar(); // No se colocan par�metros porque simplemente se imprime la lista
}

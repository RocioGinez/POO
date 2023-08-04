
public interface MetodProced {

	public void guardar(Plantas planta); // Se declara variable de tipo objeto porque ahí se almacena la información

	public void editar(int indice, Plantas planta); // Se usa el índice para buscar, por lo que se declara

	public void eliminar(int indice);

	public Plantas buscar(int indice); // Va a retornar información del objeto de clase Plantas

	public void mostrar(); // No se colocan parámetros porque simplemente se imprime la lista
}

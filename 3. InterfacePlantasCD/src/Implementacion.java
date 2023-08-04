import java.util.ArrayList;
import java.util.List;

public class Implementacion implements MetodProced, Procedimiento { // Se agregan las interfaces

	// Declaramos lista
	List<Plantas> listaPlantas = new ArrayList<Plantas>();

	@Override // Significa que este bloque de c�digo est� definido en otra plantilla
	public void contar() {
		// TODO Auto-generated method stub

		System.out.println("Hay " + listaPlantas.size() + " planta(s) registrada(s) en la lista."); 
	}

	@Override
	public void guardar(Plantas planta) {
		// TODO Auto-generated method stub

		listaPlantas.add(planta); // Tomamos objeto y agregamos a la lista
	}

	@Override
	public void editar(int indice, Plantas planta) {
		// TODO Auto-generated method stub

		listaPlantas.set(indice, planta); // Se cambia la informaci�n del objeto a partir del �ndice
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub

		listaPlantas.remove(indice); // Solo se necesita del �ndice del objeto para eliminar toda su informaci�n
	}

	@Override
	public Plantas buscar(int indice) {
		// TODO Auto-generated method stub

		return listaPlantas.get(indice); // Se devuelve el contenido del �ndice indicado en la lista
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		System.out.println(listaPlantas); // Se imprime la lista
	}
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Implementacion implements MetodProced {

	// Declaramos la lista
	List<Macetas> listaMacetas = new ArrayList<Macetas>();

	@Override
	public void guardar(Macetas obj) {
		// TODO Auto-generated method stub
		listaMacetas.add(obj);
	}

	@Override
	public void editar(int indice, Macetas obj) {
		// TODO Auto-generated method stub
		listaMacetas.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaMacetas.remove(indice);
	}

	@Override
	public Macetas buscar(int indice) {
		// TODO Auto-generated method stub
		return listaMacetas.get(indice);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listaMacetas);
	}

	// M�todos personalizados
	public void contar() {
		System.out.println("Hay un total de " + listaMacetas.size() + " macetas registradas en la lista.");
	}

	public void contenidoLista() {
		for (int i = 0; i < listaMacetas.size(); i++) {
			System.out.printf("\n[%d]" + listaMacetas.get(i).getForma() + "\n", i);

		}
	}

	public int validarRegistros() {

		int tamanoLista = 0;

		if (listaMacetas.size() > 0) {
			tamanoLista = listaMacetas.size();
		} else {
			System.out.println("No hay registros en la lista.");
		}
		return tamanoLista;
	}

	public static boolean validarNum(String dato) {
		try {
			int convertirDato = Integer.parseInt(dato); // Convertir dato-formato
			return true;
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("Error. Ingrese solo el n�mero correspondiente a la opci�n requerida.");
			return false;

		}
	}

	public Macetas buscarForma(String forma) {
		Macetas maceta = null;
		for (Macetas m : listaMacetas) {
			if (m.getForma().equals(forma)) {
				maceta = m;
				//System.out.println("Se encontr� la maceta " + maceta.getForma());
				System.out.println("Se encontr� la siguiente maceta:");
				System.out.println("-Forma: " + maceta.getForma());
				System.out.println("-Tama�o: " + maceta.getTama�o());
				System.out.println("-Precio: $" + maceta.getPrecio() + "0");
				System.out.println("-Existencia: " + maceta.getExistencia() + " piezas");
			}
		}
		return maceta;
	}

	public void eliminarForma(String forma) {
		Macetas maceta = null;
		int index = 0;

		try {
			for (Macetas m : listaMacetas) { //El contenido de la lista se almacena en la variable m.
				if (m.getForma().equals(forma)) {
					maceta = m;
					System.out.println("Se eliminar� la maceta: ");
					System.out.println("-Forma: " + maceta.getForma());
					System.out.println("-Tama�o: " + maceta.getTama�o());
					System.out.println("-Precio: $" + maceta.getPrecio() + "0");
					System.out.println("-Existencia: " + maceta.getExistencia() + " piezas");
					listaMacetas.remove(index);
					System.out.println("Se elimin� correctamente.");
				}
				index++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public List<Macetas> listarTama�o(String tama�o){
		List<Macetas> listaTama�o= new ArrayList<Macetas>();
		
		for (Macetas m: listaMacetas) {
			if (m.getTama�o().equals(tama�o)) {
				listaTama�o.add(m);
				System.out.println(m);
			}
		}
		return listaTama�o;
	}
}

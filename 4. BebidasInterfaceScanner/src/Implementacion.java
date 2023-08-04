import java.util.ArrayList;
import java.util.List;

public class Implementacion implements MetodProced{

	//Declaramos la lista
	List<Bebidas> listaBebidas = new ArrayList<Bebidas>();
	
	@Override
	public void guardar(Bebidas obj) {
		// TODO Auto-generated method stub
		listaBebidas.add(obj);
	}

	@Override
	public void editar(int indice, Bebidas obj) {
		// TODO Auto-generated method stub
		listaBebidas.set(indice,obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaBebidas.remove(indice);
	}

	@Override
	public Bebidas buscar(int indice) {
		// TODO Auto-generated method stub
		return listaBebidas.get(indice);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listaBebidas);
	}
	
	//Se pueden agregar métodos personalizados
	public void contar() {
		System.out.println("Las bebidas que hay son: "+listaBebidas.size());
	}
	
	public void contenidoLista() {
		for (int i = 0; i < listaBebidas.size(); i++) {
			System.out.printf("\n[%d]" + listaBebidas.get(i).getNombre() + "\n", i);

		}
	}
}

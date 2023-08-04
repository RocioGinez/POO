import java.util.HashMap;

public class Implementacion implements MetodProced{

	//Declaramos HashMap
	HashMap<String, Zapatos> hashMapZapatos = new HashMap<String, Zapatos>();
	
	@Override
	public void guardar(Zapatos obj) {
		// TODO Auto-generated method stub
		hashMapZapatos.put(obj.getModelo(), obj);
	}

	@Override
	public void editar(Zapatos obj) {
		// TODO Auto-generated method stub
		hashMapZapatos.put(obj.getModelo(), obj);
	}

	@Override
	public void eliminar(Zapatos obj) {
		// TODO Auto-generated method stub
		hashMapZapatos.remove(obj.getModelo());
	}

	@Override
	public Zapatos buscar(Zapatos obj) {
		// TODO Auto-generated method stub
		return hashMapZapatos.get(obj.getModelo());
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapZapatos);
	}

	//Métodos personalizados
	public void contarRegistros() {
		System.out.println("El total de zapatos registrados en la lista son: "+hashMapZapatos.size());
	}
	
	
	public int validarRegistros() {

		int tamanoHashMap = 0;

		if (hashMapZapatos.size() > 0) {
			tamanoHashMap = hashMapZapatos.size();
		} else {
			System.out.println("No hay registros en la lista.");
		}
		return tamanoHashMap;
	}

	public static boolean validarNum(String dato) {
		try {
			int convertirDato = Integer.parseInt(dato); // Convertir dato-formato
			return true;
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("Error. Ingrese solo el número correspondiente a la opción requerida.");
			return false;

		}
	}
	

}

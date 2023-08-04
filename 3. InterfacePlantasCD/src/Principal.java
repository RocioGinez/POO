public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar colecci�n de objetos para que se almacenen en nuestra lista
		Plantas planta1 = new Plantas("Rosa", "Sol", 25, 10);
		Plantas planta2 = new Plantas("Jelly Bean", "Suculenta", 50, 5);
		Plantas planta3 = new Plantas("Palo de Brasil", "Sombra", 85, 15);
		
		//Instancia de clase para tener acceso a todos los m�todos o procedimientos
		Implementacion imp = new Implementacion(); //Con el constructor vac�o se hace la instancia
		
		//Guardar informaci�n de los objetos
		imp.guardar(planta1);
		imp.guardar(planta2);
		imp.guardar(planta3);
		
		//Mostrar informaci�n de la lista
		imp.mostrar();
		
		//Buscar
		Plantas planta = null; //Se hace reserva de espacio en memoria
		planta = imp.buscar(1); //Lo que se busca con el m�todo, lo almacena en la variable "planta".
		System.out.println("Se encontr� la siguiente planta: \n"+planta); //Se imprime el contenido de "planta".
		
		//Editar (Primero se realiza la b�squed)
		planta = imp.buscar(0); //Se busca el �ndice con el m�todo, lo almacena en la variable "planta".
		System.out.println("Se encontr� la siguiente planta a editar: \nNombre: "+planta.getNombre()+"\nPrecio: $"+planta.getPrecio());
		
		planta.setPrecio(100); //Se toma el nuevo valor
		imp.editar(0, planta); //Se hace el cambio de dato en la "planta" del �ndice "0"
		System.out.println("El nuevo precio de la planta "+planta.getNombre()+" es: $"+planta.getPrecio()); //Se muestra
		imp.mostrar(); //Se muestra toda la informaci�n con el m�todo
		
		//Eliminar
		imp.eliminar(2); //Se utiliza el m�todo para eliminar el �ndice 2
		imp.mostrar(); //Se muestra nueva lista
		
		//Contar
		imp.contar();
	}
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de clase con el constructor con todos los par�metros
		//Estos son la colecci�n de objetos
				
		/*�ndice 0*/Empleados empleado1 = new Empleados("Alberto","Pereda","Gerencia",35);
		/*�ndice 1*/Empleados empleado2 = new Empleados("Rocio","Ginez","Sistemas",25);
		/*�ndice 2*/Empleados empleado3 = new Empleados("Valeria","Rodr�guez","RH",30);
		
		//Declarar lista
		List<Empleados> listaEmpleados = new ArrayList<Empleados>();
		
		//Agregando objetos a la lista
		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		
		//Mostrar Lista
		System.out.println(listaEmpleados);
		
		//Declarar una variable para reserva de espacio
		Empleados empleado = null;
		
		//Buscar por el �ndice
		empleado = listaEmpleados.get(0);
		System.out.println("Se encontr� el empleado por �ndice: "+empleado.getNombre());
		
		//B�squeda por nombre dentro de la lista - foreach ciclo
		for (Empleados listEmp:listaEmpleados) {
			if (listEmp.getNombre().equals("Rocio")) {
				System.out.println("Se encontr� el empleado por b�squeda de un foreach: "+listEmp);
			}
		}
		
		//Editar
		//Buscar por el �ndice
		empleado = listaEmpleados.get(2);
		System.out.println("Se encontr� el empleado a editar: "+empleado.getNombre()+" "+empleado.getApellido());
		empleado.setNombre("Victoria");
		empleado.setApellido("Mendoza");
		empleado.setEdad(40);
		System.out.println("Nombre de nuevo empleado: "+empleado.getNombre()+" "+empleado.getApellido());
		System.out.println("Nueva lista: "+listaEmpleados);
		
		//Eliminar
		//Buscar por el �ndice
		empleado = listaEmpleados.get(1);
		System.out.println("Se encontr� el empleado a eliminar: "+empleado.getNombre()+" "+empleado.getApellido());
		listaEmpleados.remove(1);
		System.out.println("Nueva lista: "+listaEmpleados);
		
		//for normal, me va a mostrar el �ndice y el nombre del cantante
		//[0] Alberto
		//[2] Victoria
		for (int i=0; i < listaEmpleados.size(); i++) {
			System.out.println(listaEmpleados.get(i).getNombre());
		}
		
		//Iterator, mostrar los objetos de la lista
		Iterator iterando = listaEmpleados.iterator();
		for (int i=0; i<listaEmpleados.size(); i++) {
			while (iterando.hasNext())
			{
				System.out.println(iterando.next());
			}
		}
		
		//Suma de Edades
		int edades = 0;
		for (int i=0; i<listaEmpleados.size(); i++) {
			edades = edades + listaEmpleados.get(i).getEdad();
		}
		System.out.println("La suma de edades de los empleados es: "+edades);
		
	}

}

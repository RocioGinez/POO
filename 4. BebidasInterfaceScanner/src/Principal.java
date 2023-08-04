import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		String nombre;
		int porAlcohol;
		float precio;
		String tipo;

		// Reserva de espacio en memoria
		Bebidas bebida = null;
		Scanner lectura = null; // Se declara una variable para el uso del Scanner
		int indice, menuP, subMenu;

		// Instancia de clase
		Implementacion imp = new Implementacion(); // Al instanciar, ya tenemos acceso a los métodos de la clase

		do {
			System.out.println("\nMENÚ PRINCIPAL");
			System.out.println("1) Alta de bebida");
			System.out.println("2) Buscar por índice");
			System.out.println("3) Editar por índice");
			System.out.println("4) Eliminar por índice");
			System.out.println("5) Mostrar");
			System.out.println("6) Contar");
			System.out.println("7) Salir");

			lectura = new Scanner(System.in); // Scanner toma el ingreso del usuario
			menuP = lectura.nextInt(); // El ingreso de lectura se traduce a Int y se almacena en "menuP"

			switch (menuP) {
			case 1: // ALTA DE INFORMACIÓN
				System.out.println("Ingrese el nombre.");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingrese el porcentaje de alcohol: ");
				lectura = new Scanner(System.in);
				porAlcohol = lectura.nextInt();

				System.out.println("Ingrese el precio: ");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				System.out.println("Ingrese el tipo de alcohol: ");
				lectura = new Scanner(System.in);
				tipo = lectura.nextLine();

				// Guardar
				bebida = new Bebidas(nombre, porAlcohol, precio, tipo); // En la variable se guardan todos los datos
																		// con al constructor con todos los parámetros.
				imp.guardar(bebida); // Se usa el método guardar de la clase implementacion
				System.out.println("Se guardó correctamente.");
				break;

			case 2: // BUSCAR POR ÍNDICE
				// Mostrar el índice y el nombre
				imp.contenidoLista();
				System.out.println("\nIngrese el índice a buscar:");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt(); // El valor ingresado se almacena en el índice de bebida

				// Buscar
				bebida = imp.buscar(indice); // Se usa el contenido de indice para obtener la información con el método
				System.out.println("Se encontró la bebida: ");
				System.out.println("- Nombre: "+bebida.getTipo()+" "+bebida.getNombre());
				System.out.println("- % de Alcohol: "+bebida.getPorAlcohol()+"%");
				System.out.println("- Precio: $"+bebida.getPrecio()+"0");
				break;

			case 3: // EDITAR POR ÍNDICE
				// Mostrar el índice y el nombre
				imp.contenidoLista();
				System.out.println("\nIngrese el índice a editar:");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt(); // El valor ingresado se almacena en el índice de bebida
				// Buscar
				bebida = imp.buscar(indice); // Se usa el contenido de indice para obtener la información con el método
				System.out.println("Se encontró la bebida: " + bebida.getNombre());

				do {
					System.out.println("\nSUBMENÚ EDITAR");
					System.out.println("1) Nombre");
					System.out.println("2) Precio");
					System.out.println("3) Salir");

					lectura = new Scanner(System.in); // Scanner toma el ingreso del usuario
					subMenu = lectura.nextInt(); // El ingreso de lectura se traduce a Int y se almacena en "subMenu"

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo nombre: ");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine(); // Se coloca el ingreso en "nombre"

						bebida.setNombre(nombre); // Se hace el cambio de datos en el atributo del objeto
						imp.editar(indice, bebida); // Se hace el cambio en el índice indicado de la lista
						System.out.println("Se editó el nombre correctamente.");
						break;

					case 2:
						System.out.println("Ingrese el nuevo precio: ");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat(); // Se coloca el ingreso en "precio"

						bebida.setPrecio(precio); // Se hace el cambio de datos en el atributo del objeto
						imp.editar(indice, bebida); // Se hace el cambio en el índice indicado de la lista
						System.out.println("Se editó el precio correctamente.");
						break;

					case 3:
						System.out.println("Regresando al menú principal...");
						break;
					}
				} while (subMenu < 3);
				break;

			case 4: // Eliminar por índice
				// Mostrar el índice y el nombre
				imp.contenidoLista();
				System.out.println("\nIngrese el índice a eliminar:");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt(); // El valor ingresado se almacena en el índice de bebida

				// Buscar
				bebida = imp.buscar(indice); // Se usa el contenido de indice para obtener la información con el método
				System.out.println("Se eliminará la bebida: " + bebida.getNombre());

				// Eliminar
				imp.eliminar(indice);
				System.out.println("Se eliminó correctamente.");
				break;

			case 5: // Mostrar lista
				imp.mostrar();
				break;

			case 6: // Contar registros
				imp.contar();
				break;

			case 7: // Salir
				System.out.println("¡Hasta luego!");
				break;
			}
		} while (menuP < 7);
	}
}

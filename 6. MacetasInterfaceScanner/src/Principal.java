import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Atributos
		String forma;
		String tama�o;
		float precio;
		int existencia;

		// Reseva de espacio en memoria
		Macetas maceta = null;

		Scanner lectura = null;
		int indice, menuP, subMenu;

		// Instancia de clase
		Implementacion imp = new Implementacion();

		do {

			String entrada; // Se declara para almacenar la entrada del teclado

			do {
				System.out.println("\nMEN� PRINCIPAL");
				System.out.println("1) Registrar nueva maceta");
				System.out.println("2) Buscar por �ndice");
				System.out.println("3) Editar por �ndice");
				System.out.println("4) Eliminar por �ndice");
				System.out.println("5) Mostrar");
				System.out.println("6) Existencia (Contar)");
				System.out.println("7) Buscar por forma");
				System.out.println("8) Eliminar por nombre");
				System.out.println("9) Buscar por tama�o");
				System.out.println("10) Salir");

				lectura = new Scanner(System.in);
				entrada = lectura.nextLine();

			} while (!imp.validarNum(entrada)); // Se utiliza el m�todo para validar el contenido de entrada.

			menuP = Integer.parseInt(entrada); // Se traduce el valor de entrada para usar en el men�.

			// Comienza c�digo implementado
			if (menuP > 10) {
				System.out.println("Error en la elecci�n de opciones. Verificar.");
			} else {
			// }Termina C�digo Implementado

				switch (menuP) {
				case 1:
					try {
						System.out.println("Ingrese la forma: ");
						lectura = new Scanner(System.in);
						forma = lectura.nextLine();

						System.out.println("Ingrese el tama�o: ");
						lectura = new Scanner(System.in);
						tama�o = lectura.nextLine();

						System.out.println("Ingrese el precio: ");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();

						System.out.println("Ingrese el total de existencia: ");
						lectura = new Scanner(System.in);
						existencia = lectura.nextInt();

						// Guardar
						maceta = new Macetas(forma, tama�o, precio, existencia);
						imp.guardar(maceta);
						System.out.println("Se guard� correctamente.");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Error al guardar.");
					}
					break;

				case 2:
					if (imp.validarRegistros() > 0) {
						try {
							System.out.println("- LISTA DE MACETAS -");
							imp.contenidoLista();
							System.out.println("\n\nIngrese el �ndice de la maceta a buscar: ");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();
							// Buscar
							maceta = imp.buscar(indice);
							System.out.println("Se encontr� la siguiente maceta:");
							System.out.println("-Forma: " + maceta.getForma());
							System.out.println("-Tama�o: " + maceta.getTama�o());
							System.out.println("-Precio: $" + maceta.getPrecio() + "0");
							System.out.println("-Existencia: " + maceta.getExistencia() + " piezas");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("No se encontr� informaci�n. Verifique sus datos.");
						}
					}

					break;

				case 3:

					System.out.println("- LISTA DE MACETAS -");
					imp.contenidoLista();
					System.out.println("\n\nIngrese el �ndice de la maceta a editar: ");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					// Buscar
					maceta = imp.buscar(indice);
					System.out.println(
							"Se encontr� la maceta a editar: \n" + maceta.getForma() + " " + maceta.getTama�o());

					do {
						System.out.println("\nSUBMEN�");
						System.out.println("1) Editar precio");
						System.out.println("2) Editar existencia");
						System.out.println("3) Volver al men� principal.");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo precio: ");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							maceta.setPrecio(precio);
							imp.editar(indice, maceta);
							System.out.println("Se actualiz� correctamente.");
							break;
						case 2:
							System.out.println("Ingrese la nueva existencia: ");
							lectura = new Scanner(System.in);
							existencia = lectura.nextInt();

							maceta.setExistencia(existencia);
							imp.editar(indice, maceta);
							System.out.println("Se actualiz� correctamente.");
							break;
						case 3:
							break;
						}
					} while (subMenu < 3);
					break;

				case 4:
					System.out.println("- LISTA DE MACETAS -");
					imp.contenidoLista();
					System.out.println("\n\nIngrese el �ndice de la maceta a eliminar: ");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					// Buscar
					maceta = imp.buscar(indice);
					System.out.println(
							"Se encontr� la maceta a eliminar: \n" + maceta.getForma() + " " + maceta.getTama�o());

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimin� correctamente.");
					break;

				case 5:
					imp.mostrar();
					break;

				case 6:
					imp.contar();
					break;
					
				case 7:
					try {
						System.out.println("Igrese la forma que desea buscar.");
						lectura = new Scanner(System.in);
						forma = lectura.nextLine();
						
						imp.buscarForma(forma);						
					} catch (Exception e) {
						// TODO: handle exception
					}		
					break;
					
				case 8:
					System.out.println("Igrese la forma que desea eliminar.");
					lectura = new Scanner(System.in);
					forma = lectura.nextLine();
					
					imp.eliminarForma(forma);
					break;
					
				case 9:
					System.out.println("Ingresa el tama�o de macetas que desea buscar: ");
					lectura = new Scanner(System.in);
					tama�o = lectura.nextLine();
					
					imp.listarTama�o(tama�o);
					break;
				case 10:
					System.out.println("�Hasta luego!");
					break;
				} // Llave del If
			}
		} while (menuP < 10);
	}
}

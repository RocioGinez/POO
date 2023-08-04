import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos variables
		// Atributos
		String modelo;
		String tipo;
		String marca;
		float precio;

		Zapatos zapato = null;
		Scanner lectura = null;
		int menuP, subMenu;

		Implementacion imp = new Implementacion();

		do {
			
			String entrada; // Se declara para almacenar la entrada del teclado
			
			do {
				System.out.println("\nMENÚ ZAPATERÍA");
				System.out.println("1) Alta");
				System.out.println("2) Buscar");
				System.out.println("3) Editar");
				System.out.println("4) Eliminar");
				System.out.println("5) Listar");
				System.out.println("6) Contar");
				System.out.println("7) Salir");

				lectura = new Scanner(System.in);
				entrada = lectura.nextLine();
				
			} while (!imp.validarNum(entrada)); //Se valida si es número
			
			menuP = Integer.parseInt(entrada);	//Una vez validada la entrada, se convierte a entero para usar en el switch
			
			switch (menuP) {
			case 1:
				System.out.println("Ingrese el modelo:");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese el tipo de zapato:");
				lectura = new Scanner(System.in);
				tipo = lectura.nextLine();

				System.out.println("Ingrese la marca:");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el precio:");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				// Guardar
				zapato = new Zapatos(modelo, tipo, marca, precio);
				imp.guardar(zapato);
				System.out.println("Se guardó correctamente.");
				break;

			case 2:
				
				if (imp.validarRegistros()>0) {
		
					try {
						imp.listar();
						System.out.println("Ingrese el modelo del zapato a buscar:");
						lectura = new Scanner(System.in);
						modelo = lectura.nextLine();

						// Buscar
						zapato = new Zapatos(modelo); // Instancia de clase con nuestra llave
						zapato = imp.buscar(zapato); // Ocupamos variable mascota para almacenar nuestra búsqueda
						System.out.println("Se encontró el siguiente modelo de zapatos:\n");
						System.out.println("Modelo: " + zapato.getModelo());
						System.out.println("Tipo: " + zapato.getTipo());
						System.out.println("Marca: " + zapato.getMarca());
						System.out.println("Precio: $" + zapato.getPrecio() + "0");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No se encontró información. Verifique sus datos.");
					}
					
				}
				break;

			case 3:
				
				if (imp.validarRegistros()>0) {
					
					imp.listar();
					// No se puede editar la llave cuando se usa HashMap
					System.out.println("Ingrese el modelo de los zapatos a editar");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();
					
					// Buscar
					zapato = new Zapatos(modelo); // Instancia de clase con nuestra llave
					zapato = imp.buscar(zapato); // Ocupamos variable mascota para almacenar nuestra búsqueda
					System.out.println("Se encontró el siguiente modelo de zapatos:\n");
					System.out.println("Modelo: " + zapato.getModelo());
					System.out.println("Tipo: " + zapato.getTipo());
					System.out.println("Marca: " + zapato.getMarca());
					System.out.println("Precio: $" + zapato.getPrecio() + "0");

					do {
						System.out.println("\nSUBMENÚ EDITAR");
						System.out.println("1) Tipo");
						System.out.println("2) Precio");
						System.out.println("3) Salir");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("\nIngrese el nuevo tipo de calzado: ");
							lectura = new Scanner(System.in);
							tipo = lectura.nextLine();

							zapato.setTipo(tipo);
							imp.editar(zapato);
							System.out.println("Se editó el tipo correctamente.");
							break;

						case 2:
							System.out.println("\nIngrese el nuevo precio: ");
							lectura = new Scanner(System.in);
							precio = lectura.nextInt();

							zapato.setPrecio(precio);
							imp.editar(zapato);
							System.out.println("Se editó el precio correctamente.");
							break;

						case 3:
							break;
						}
					} while (subMenu < 3);
				}
		
				break;

			case 4:
				imp.listar();
				System.out.println("Ingrese el modelo del zapato a eliminar:");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				// Buscar
				zapato = new Zapatos(modelo); // Instancia de clase con nuestra llave
				zapato = imp.buscar(zapato); // Ocupamos variable mascota para almacenar nuestra búsqueda
				System.out.println("\nSe eliminará el siguiente modelo de zapatos:");
				System.out.println("Modelo: " + zapato.getModelo());
				System.out.println("Tipo: " + zapato.getTipo());
				System.out.println("Marca: " + zapato.getMarca());
				System.out.println("Precio: $" + zapato.getPrecio() + "0");
				
				//Eliminar
				imp.eliminar(zapato);
				System.out.println("\nSe eliminó correctamente.");
				break;

			case 5:
				imp.listar();
				break;

			case 6:
				imp.contarRegistros();
				break;

			case 7:
				System.out.println("¡Hasta luego!");
				break;
			}
		} while (menuP < 7);
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar variables
		String nombre;
		String apellido;
		int matricula;
		double promedio;

		// Reserva de espacio en memoria
		Alumnos alumno = null;
		Scanner lectura = null;

		List<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

		int menuP, indice, subMenu;

		do {
			String entrada;
			do {
				
				System.out.println("\nMEN� PRINCIPAL");
				System.out.println("1) Alta de alumno.");
				System.out.println("2) Buscar alumno por �ndice.");
				System.out.println("3) Editar datos del alumno.");
				System.out.println("4) Eliminar alumno por �ndice.");
				System.out.println("5) Mostrar todos los alumnos.");
				System.out.println("6) Conteo de alumnos registrados en lista.");
				System.out.println("7) B�squeda por nombre del alumno.");
				System.out.println("8) Eliminar por nombre del alumno.");
				System.out.println("9) Borrar todos los registros de la lista.");
				System.out.println("10) Salir.");
				
				lectura = new Scanner(System.in); // Se lee lo que ingres� el usuario y se almacena en "lectura"
				entrada = lectura.nextLine();
			} while (!validarNum(entrada));
			
			menuP = Integer.parseInt(entrada);
			
			switch (menuP) {
			case 1:
				System.out.println("Ingrese los siguientes datos del alumno: ");
				System.out.println("Nombre: ");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Apellido: ");
				lectura = new Scanner(System.in);
				apellido = lectura.nextLine();

				System.out.println("Matr�cula: ");
				lectura = new Scanner(System.in);
				matricula = lectura.nextInt();

				System.out.println("Promedio: ");
				lectura = new Scanner(System.in);
				promedio = lectura.nextDouble();

				// Guardar
				alumno = new Alumnos(nombre, apellido, matricula, promedio);
				listaAlumnos.add(alumno);
				System.out.println(
						"\nSe guard� correctamente el alumno: \n" + alumno.getNombre() + " " + alumno.getApellido());
				break;

			case 2:

				if (listaAlumnos.size() > 0) {
					try {
						// Muestra �ndice y nombre
						System.out.println("-LISTA DE ALUMNOS-");
						for (int i = 0; i < listaAlumnos.size(); i++) {
							System.out.printf(
									"\n[%d]" + listaAlumnos.get(i).getNombre() + " " + listaAlumnos.get(i).getApellido(),
									i);
						}
						// B�squeda
						System.out.println("\n\nIngrese el �ndice del alumno a buscar: ");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						alumno = listaAlumnos.get(indice);
						System.out.println("\n-Informaci�n del Alumno-");
						System.out.println("Nombre Completo: " + alumno.getNombre() + " " + alumno.getApellido());
						System.out.println("Matr�cula: " + alumno.getMatricula());
						System.out.println("Promedio: " + alumno.getPromedio());

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No se encontr� el alumno. Verifique sus datos.");
					}
				} else {
					System.out.println("No se encontraron registros.");
				}
				break;

			case 3:
				// Muestra �ndice y nombre
				System.out.println("�ndice de los alumno y nombre.");
				for (int i = 0; i < listaAlumnos.size(); i++) {
					System.out.printf("\n[%d]" + listaAlumnos.get(i).getNombre(), i);
				}

				// B�squeda
				System.out.println("\nIngrese el �ndice del alumno a editar: ");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				alumno = listaAlumnos.get(indice);
				System.out.println("Se encontr� el alumno " + alumno.getNombre() + " " + alumno.getApellido());

				do {
					System.out.println("SUBMEN� EDITAR DATOS DEL ALUMNO");
					System.out.println("1) Promedio");
					System.out.println("2) Matr�cula");
					System.out.println("3) Men� Principal");

					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo promedio: ");
						lectura = new Scanner(System.in);
						promedio = lectura.nextDouble();

						// Actualizar dato
						alumno.setPromedio(promedio);
						listaAlumnos.set(indice, alumno);
						System.out.println("Se edit� correctamente.");
						break;
					case 2:
						System.out.println("Ingrese la nueva matr�cula: ");
						lectura = new Scanner(System.in);
						matricula = lectura.nextInt();

						// Actualizar dato
						alumno.setMatr�cula(matricula);
						listaAlumnos.set(indice, alumno);
						System.out.println("Se edit� correctamente.");
						break;

					case 3:
						break;
					}
				} while (subMenu < 3);
				break;

			case 4:
				// Muestra �ndice y nombre
				System.out.println("�ndice de los alumnos y nombre.");
				for (int i = 0; i < listaAlumnos.size(); i++) {
					System.out.printf("\n[%d]" + listaAlumnos.get(i).getNombre(), i);
				}

				// B�squeda
				System.out.println("\nIngrese el �ndice del alumno a eliminar: ");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				alumno = listaAlumnos.get(indice);

				// Eliminar
				listaAlumnos.remove(indice);
				System.out.println("Se elimin� el alumno " + alumno.getNombre());
				break;

			case 5:
				System.out.println(listaAlumnos);
				break;

			case 6:
				int sumaRegistros = 0;

				for (int i = 0; i < listaAlumnos.size(); i++) {
					sumaRegistros = sumaRegistros + 1;
				}
				System.out.println("Tiene " + sumaRegistros + " alumno(s) registrados en la lista.");
				break;

			case 7:
				// B�squeda por nombre
				System.out.println("\nIngrese el nombre del alumno a buscar: ");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				int contador = 0;
				for (Alumnos alums : listaAlumnos) {
					if (alums.getNombre().equals(nombre)) {
						alumno = listaAlumnos.get(contador);
						System.out.println(
								"Se encontr� el siguiente alumno: " + alumno.getNombre() + alumno.getApellido());
					}
					contador++;
				}
				break;

			case 8:
				try {
					// B�squeda por nombre
					System.out.println("\nIngrese el nombre del alumno a eliminar: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					int contador2 = 0;
					for (Alumnos alums2 : listaAlumnos) { // Se declara una variable nueva para el ciclo.
						if (alums2.getNombre().equals(nombre)) {
							alumno = listaAlumnos.get(contador2);
							System.out.println("Se elimin� el alumno " + alumno.getNombre() + alumno.getApellido());
							listaAlumnos.remove(contador2);
						}
						contador2++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 9:
				listaAlumnos.clear();
				break;

			case 10:
				System.out.println("�Gracias!");
				break;
			}
		} while (menuP < 10);
		
	}
	
	public static boolean validarNum(String dato) {
		try {
			int convertirDato = Integer.parseInt(dato); //Convertir dato-formato
			return true;
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("Error");
			return false;
			
		}
	}

}

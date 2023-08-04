import java.util.Arrays;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu;
		Scanner lectura = null;

		do {
			System.out.println("MENÚ");
			System.out.println("1) Números impares");
			System.out.println("2) Ordenar de menos a mayor");
			System.out.println("3) Determinar qué número es mayor");
			System.out.println("4) Salir");
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();

			switch (menu) {
			case 1:
				int numero = 100;
				int contador = 0;

				System.out.println("Buscaremos los números inpares de forma descendiente a partir del número 100.");

				do {
					if (numero % 2 == 0) {
						numero = numero - 1;
					} else {
						System.out.println(numero);
						numero = numero - 2;
					}
					contador++;
				} while (contador < 51);
				break;

			case 2:
				System.out.println("Se ordenarán los siguientes números de menor a mayor: ");
				System.out.println("250, 100, 23, 145, 122, 432, 107, 109, 265, 194, 1");

				int[] lista = { 250, 100, 23, 145, 122, 432, 107, 109, 265, 194, 1 };
				int menor;
				Arrays.sort(lista);

				for (int i = 0; i > 10; i++) {
					menor = lista[0];
					if (lista[i] < menor) {
						menor = lista[i];
					}
				}
				System.out.println("Mostramos la lista ordenada:");
				System.out.println(Arrays.toString(lista));
				break;

			case 3:
				int numero1, numero2, numero3;
				System.out.println("Determinar qué número es mayor");

				System.out.println("Escriba el primer número:");
				lectura = new Scanner(System.in);
				numero1 = lectura.nextInt();

				System.out.println("Escriba el segundo número:");
				lectura = new Scanner(System.in);
				numero2 = lectura.nextInt();

				System.out.println("Escriba el tercer número:");
				lectura = new Scanner(System.in);
				numero3 = lectura.nextInt();

				if (numero1 > numero2) {
					if (numero1 > numero3) {
						System.out.println("El primer número es mayor.");
					} else {
						System.out.println("El tercer número es mayor.");
					}
				} else {
					if (numero2 > numero3) {
						System.out.println("El segundo número es mayor.");
					} else {
						System.out.println("El tercer número es mayor.");
					}
				}
				break;

			case 4:
				System.out.println("¡Hasta luego!");
				break;
			}
		} while (menu > 4);
	}
}

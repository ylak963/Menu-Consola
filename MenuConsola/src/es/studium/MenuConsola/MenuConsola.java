package es.studium.MenuConsola;

import java.util.Scanner;

public class MenuConsola {

	public static void main(String[] args) {
		int opcion;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Indique el número correspondiente a una opción del siguiente menu:" + "\n* MENÚ *\r\n"
					+ "1. Abrir\r\n" + "2. Cerrar\r\n" + "3. Modificar\r\n" + "4. Salir"+"\nEscriba aqui --->");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La opción elegida es ABRIR");
				break;
			case 2:
				System.out.println("La opción elegida es CERRAR");
				break;
			case 3:
				System.out.println("La opción elegida es MODIFICAR");
				break;
			case 4:
				System.out.println("La opción elegida es SALIR");
				break;
			default:
				System.out.println("La opción NO es VÁLIDA");

			}
		} while (opcion != 4);

		teclado.close();
	}
}

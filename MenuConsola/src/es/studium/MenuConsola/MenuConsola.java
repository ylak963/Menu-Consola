package es.studium.MenuConsola;

import java.util.Scanner;

public class MenuConsola {

	public static void main(String[] args) {
		int opcion;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Indique el n�mero correspondiente a una opci�n del siguiente menu:" + "\n* MEN� *\r\n"
					+ "1. Abrir\r\n" + "2. Cerrar\r\n" + "3. Modificar\r\n" + "4. Salir"+"\nEscriba aqui --->");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La opci�n elegida es ABRIR");
				break;
			case 2:
				System.out.println("La opci�n elegida es CERRAR");
				break;
			case 3:
				System.out.println("La opci�n elegida es MODIFICAR");
				break;
			case 4:
				System.out.println("La opci�n elegida es SALIR");
				break;
			default:
				System.out.println("La opci�n NO es V�LIDA");

			}
		} while (opcion != 4);

		teclado.close();
	}
}

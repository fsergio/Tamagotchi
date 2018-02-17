package tamagotchi;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private Scanner sr;
	private Tamagotchi tamagotchi;

	public void menu() {
		sr = new Scanner(System.in);
		int entrada = 0;
		System.out.print(
				"\t Ingrese el estado inicial para su mascota Tamagotchi |0 Para Salir|\n|-1 Feliz| |-2 Triste| |-3 Hambriendo| |4- Sediento| :");
		try {
			entrada = sr.nextInt();
			sr.nextLine();
			do {
				switch (entrada) {
				// feliz
				case 1:
					tamagotchi = new Tamagotchi(1);
					tamagotchi.menu(sr);
					break;
				// triste
				case 2:
					tamagotchi = new Tamagotchi(2);
					tamagotchi.menu(sr);
					break;
				// hambriento
				case 3:
					tamagotchi = new Tamagotchi(3);
					tamagotchi.menu(sr);
					break;
				// sediento
				case 4:
					tamagotchi = new Tamagotchi(4);
					tamagotchi.menu(sr);
					break;
				default:
					if (entrada != 0)
						System.out.println("Ninguna coincidencia seleccionada...");
					break;
				}
				System.out.println(
						"---------------------------------------------------------------------------------------------------------------------");
				System.out.print(
						"\t Ingrese el estado inicial para su mascota Tamagotchi |0 Para Salir|\n|-1 Feliz| |-2 Triste| |-3 Hambriendo| |4- Sediento|");
				System.out.println(
						"\n---------------------------------------------------------------------------------------------------------------------");
				entrada = sr.nextInt();
				sr.nextLine();// borrado de buffer...
			} while (entrada != 0);
			new Pokemon().dibujar();
			System.out.println("\t¡Hasta la proxima!");
		} catch (InputMismatchException e) {
			System.out.println("Algo ocurrio: " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Algo ocurrio: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("Algo ocurrio: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Algo ocurrio: " + e.getMessage());
		}
	}

	// ---------------------------------------------MAIN-------------------------------------------------------
	public static void main(String[] args) {
		new Main().menu();
	}

}

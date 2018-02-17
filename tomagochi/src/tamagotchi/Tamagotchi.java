package tamagotchi;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Tamagotchi {
	private Estado estado;// feliz, triste, hambriento, sediento...

	// estado incial de la mascota virtual- polimorfico...
	public Tamagotchi(int estadoInicial) {
		if (estadoInicial == 1)
			this.estado = new Feliz(this);
		if (estadoInicial == 2)
			this.estado = new Triste(this);
		if (estadoInicial == 3)
			this.estado = new Hambriento(this);
		if (estadoInicial == 4)
			this.estado = new Sediento(this);
	}

	public void beber() {
		estado.beber();
	}

	public void comer() {
		estado.comer();
	}

	public void mimos() {
		estado.mimos();
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void menu(Scanner sr) throws InputMismatchException, NoSuchElementException, IllegalStateException {
		System.out.print("\t|BEBER-1|  |COMER-2| |MIMOS-3| |PULSE UN NUMERO DISTINTO PARA SALIR||");
		int entrada = sr.nextInt();
		sr.nextLine();// borrado de buffer...
		do {
			if (entrada == 1)
				beber();
			if (entrada == 2)
				comer();
			if (entrada == 3)
				mimos();
			entrada = sr.nextInt();
			sr.nextLine();// borrado de buffer...
		} while (entrada == 1 || entrada == 2 || entrada == 3);
		System.out.println("\n \n \n \n \n \n¡Has matado a tu Tamagotchi!");
	}
}

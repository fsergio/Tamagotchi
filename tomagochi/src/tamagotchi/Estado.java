package tamagotchi;

/*Clase que representa, la super clase de cada estado del bichito...(comportamientos como objetos...)*/
public abstract class Estado {
	public static Tamagotchi tamagotchi;

	// obligo a las subclases a inicializar tamagotchi.
	public Estado(Tamagotchi tamagotchi) {
		setTamagotchi(tamagotchi);
	}

	// ---------------------------------------------------------------------

	// metodos mas especificos, de cada subclase.
	public abstract void comer();

	public abstract void beber();

	public abstract void mimos();

	// --------------------------------------------------------------------

	public void beeps(int beeps) {
		System.out.println("Suenan " + beeps + " beeps...");
	};

	public void titilar() {
		System.out.println("estoy titilando...");
	};

	public void vomitar() {
		System.out.println("¡correte!, estoy por devolver");
	}

	public static void setTtamagotchi(Tamagotchi tamagotchi) {
		Estado.tamagotchi = tamagotchi;
	}

	public static Tamagotchi getTamagotchi() {
		return tamagotchi;
	}

	public static void setTamagotchi(Tamagotchi tamagotchi) {
		Estado.tamagotchi = tamagotchi;
	}

}

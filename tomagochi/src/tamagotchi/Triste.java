package tamagotchi;

public class Triste extends Estado {

	public Triste(Tamagotchi tamagotchi) {
		super(tamagotchi);
		System.out.println("Ahora me encuentro triste...");
	}

	/*
	 * Si se le da de comer estando triste, hace 2 beep y el display muestra a la
	 * mascota vomitando
	 */
	@Override
	public void comer() {
		System.out.println("Me has dado de comer, estando triste...");
		beeps(2);
		vomitar();
	}

	/*
	 * Si se le da de tomar estando triste, el artefacto hace 3 beep y titila el
	 * display
	 */
	@Override
	public void beber() {
		System.out.println("Me has dado de beber, estando triste...");
		beeps(3);
		titilar();
	}

	// Si se le hace mimo estando Triste, se pone Feliz
	@Override
	public void mimos() {
		System.out.println("Me has dado muchos mimos, estando: " + getTamagotchi().getEstado().getClass().getName());// instrospeccion...
		getTamagotchi().setEstado(new Feliz(getTamagotchi()));

	}

}

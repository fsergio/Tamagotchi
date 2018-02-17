package tamagotchi;

public class Feliz extends Estado {

	public Feliz(Tamagotchi tamagotchi) {
		super(tamagotchi);
		System.out.println("Ahora me encuentro feliz...");
	}

	// Si se le da de tomar estando Feliz, el artefacto hace 5 beep
	@Override
	public void beber() {
		System.out.println("Me has dado de beber, estando feliz...");
		beeps(5);
	}

	// Si se le da de comer estando Feliz, no pasa nada
	@Override
	public void comer() {
		System.out.println("Me has dado de comer, estando feliz, no pasa nada...");
	}

	// Si se le hace mimo estando Feliz, no pasa nada
	@Override
	public void mimos() {
		System.out.println("Me has dado muchos mimos, estando feliz, no pasa nada...");
	}
}

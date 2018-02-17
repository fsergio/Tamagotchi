package tamagotchi;

public class Sediento extends Estado {

	public Sediento(Tamagotchi tamagotchi) {
		super(tamagotchi);
		System.out.println("Ahora me encuentro Sediento...");
	}

	// Si se le da de comer estando Sediento, no pasa nada
	@Override
	public void comer() {
		System.out.println("Me has dado de comer estando sediento, no pasa nada...");

	}

	// Si se le da de tomar estando sediento, se pone Feliz
	@Override
	public void beber() {
		System.out.println("Me has dado de beber, estando: " + getTamagotchi().getEstado().getClass().getName());// instrospeccion...
		tamagotchi.setEstado(new Feliz(getTamagotchi()));

	}

	// Si se le hace mimo estando Sediento, no pasa nada
	@Override
	public void mimos() {
		System.out.println("Me has dado muchos mimos, estando sediento, no pasa nada...");

	}

}

package tamagotchi;

public class Hambriento extends Estado {

	public Hambriento(Tamagotchi tomagotchi) {
		super(tomagotchi);
		System.out.println("Ahora me encuentro Hambriento...");
	}

	// Si se le da de comer estando hambriento, se pone Feliz
	@Override
	public void comer() {
		System.out.println("Me has dado de comer, estando: " + getTamagotchi().getEstado().getClass().getName());// instrospeccion...
		tamagotchi.setEstado(new Feliz(getTamagotchi()));
	}

	// Si se le da de tomar estando hambriento, no pasa nada
	@Override
	public void beber() {
		System.out.println("Me has dado de beber estando hambriento, no pasa nada...");

	}

	// Si se le hace mimo estando hambriento, no pasa nada
	@Override
	public void mimos() {
		System.out.println("Me has muchos mismos, estando hambriento, no pasa nada...");

	}

}

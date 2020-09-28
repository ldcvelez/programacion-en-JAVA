package monjesVikingos;

public class StateBerseker extends State {

	@Override
	public void atacar(Monje monje) {
		System.out.println("Soy una maquina de ataque!! Mi podes de ataque es " + monje.puntosAtaque);
	}

	@Override
	public void defender(Monje monje) {
		System.out.println("Soy una maquina de ataque!! Me han atacado!!.Mis puntos de defensa es " + monje.puntosDefensa);
	}

	@Override
	public void meditar(Monje monje) {
		System.out.println("Voy a meditar.");
		monje.setState(new StateNormal());
		monje.puntosAtaque=10;
		monje.puntosDefensa=20;
	}

}

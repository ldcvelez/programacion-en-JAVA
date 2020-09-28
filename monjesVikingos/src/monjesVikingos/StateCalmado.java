package monjesVikingos;

public class StateCalmado extends State {

	@Override
	public void atacar(Monje monje) {
		System.out.println("Estoy listo para la batalla. Voy a atacar!!");
		monje.setState(new StateNormal());
		monje.puntosAtaque=10;
		monje.puntosDefensa=20;
	}
	
	@Override
	public void defender(Monje monje) {
		System.out.println("No estoy en la batalla.");
	}

	@Override
	public void meditar(Monje monje) {
		System.out.println("Sigo meditando");
	}

	
}

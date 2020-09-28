package monjesVikingos;

public class StateColerico extends State {

	@Override
	public void meditar(Monje monje) {
		System.out.println("Voy a meditar");
		monje.setState(new StateNormal());
		monje.puntosAtaque=10;
		monje.puntosDefensa=20;
	}
	
	@Override
	public void atacar(Monje monje) {
		System.out.println("Al ataque!! Mi podes de ataque es " + monje.puntosAtaque);
	}

	@Override
	public void defender(Monje monje) {
		System.out.println("Me han atacado!!.Mis puntos de defensa es " + monje.puntosDefensa);
		monje.puntosAtaque+=20;
		monje.puntosDefensa/=2;
		monje.setState(new StateBerseker());
	}

}

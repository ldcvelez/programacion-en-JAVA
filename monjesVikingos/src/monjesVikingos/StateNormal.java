package monjesVikingos;

public class StateNormal extends State{

	@Override
	public void atacar(Monje monje) {
		System.out.println("Al ataque!! Mi poder de ataque es " + monje.puntosAtaque);
	}

	@Override
	public void defender(Monje monje) {
		System.out.println("Me han atacado!!.Mis puntos de defensa es " + monje.puntosDefensa);
		monje.setState(new StateColerico());
		monje.puntosAtaque+=10;
		monje.puntosDefensa-=20;
	}
	
	@Override
	public void meditar(Monje monje) {
		System.out.println("Voy a meditar.");
		monje.setState(new StateCalmado());
		monje.puntosAtaque=0;
		monje.puntosDefensa=0;
	}

}

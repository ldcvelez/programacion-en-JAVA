package monjesVikingos;

public class Monje {
	
	private State state;
	public double puntosAtaque;
	public double puntosDefensa;

	public Monje() {
		this.setState(new StateNormal());
		this.puntosAtaque=10;
		this.puntosDefensa=20;
	}

	protected void setState(State state) {
		this.state = state;
	}
	
	public void defender() {
		state.defender(this);//cuando me defiendo es porque me atacan, el estado puede evolucionar
	}
	
	public void atacar() {
		this.state.atacar(this);
	}
	
	public void meditar() {
		this.state.meditar(this);
	}
	
	public String getState() {
		return this.state.getClass().getName();
	}

	@Override
	public String toString() {
		return "Monje [state=" + this.state.getClass().getName() + ", puntosAtaque=" + puntosAtaque + ", 	puntosDefensa=" + puntosDefensa + "]";
	}

}

package monjesVikingosSinState;

public class Monje {
	
	private String state;
	public double puntosAtaque;
	public double puntosDefensa;

	public Monje() {
		this.state = "Normal";
		this.puntosAtaque=10;
		this.puntosDefensa=20;
	}
	

	@Override
	public String toString() {
		return "Monje [state=" + state + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa=" + puntosDefensa + "]";
	}


	public void atacar() {
		System.out.println("Estoy atacando!");
		if(this.state == "Normal")
		{
			System.out.println("Mi podes de ataque es " + getPuntosAtaque());
		}else if(this.state == "Colerico")
		{
			System.out.println("Mi podes de ataque es " + getPuntosAtaque());
		}else if(this.state == "Berseker") {
			System.out.println("Soy una maquina de combate!. Mis ataques valen es " + getPuntosAtaque());
		}else if(this.state == "Calmado") {
			System.out.println("Estoy listo para la batalla. Voy a atacar!");
			this.state = "Normal";
			this.puntosAtaque=10;
			this.puntosDefensa=20;
			System.out.println("Mi podes de ataque es " + getPuntosAtaque());
		}
	}
	
	public void defender() {
		System.out.println("Me estan atacando!");
		System.out.println("Mi defensa es " + getPuntosDefensa());
		if(this.state == "Normal")
		{
			this.state = "Colerico";
			puntosAtaque+=10;
			puntosDefensa-=20;
			System.out.println("Ahora mi defensa es " + getPuntosDefensa());
		}else if(this.state == "Colerico")
		{
			this.state = "Berseker";
			puntosAtaque+=20;
			puntosDefensa/=2;
			System.out.println("Soy una maquina de combate!. Mi defensa es " + getPuntosDefensa());
		}else if(this.state == "Berseker") {
			System.out.println("Soy una maquina de combate!. Mi defensa es " + getPuntosDefensa());
		}else if(this.state == "Calmado") {
			System.out.println("No estoy en la batalla.");
			puntosAtaque=0;
			puntosDefensa=0;
			System.out.println("Ahora mi defensa es " + getPuntosDefensa());
		}
	}
	
	public double getPuntosAtaque() {
		return puntosAtaque;
	}


	public double getPuntosDefensa() {
		return puntosDefensa;
	}


	public void meditar() {
		System.out.println("Voy a meditar");
		if(this.state == "Normal") {
			this.state = "Calmado";
			puntosAtaque=0;
			puntosDefensa=0;
		}else if(this.state == "Colerico" || this.state == "Berseker") {
			this.state = "Normal";
			this.puntosAtaque=10;
			this.puntosDefensa=20;
		}else if(this.state == "Calmado") {
			System.out.println("Sigo meditando");
		}
	}
}

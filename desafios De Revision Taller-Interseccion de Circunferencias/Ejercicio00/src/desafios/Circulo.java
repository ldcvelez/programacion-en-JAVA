package desafios;

public class Circulo {
	
	Punto p1;
	private double radio;
	
	public Circulo (Punto p, double r){
		
		if(r<0)
		{	System.out.println("El radio no puede ser negativo");
			System.exit(1);
		}
		
		this.radio = r;
		this.p1 = p;
	}
	
	public String intersectaCon(Circulo c) {
		
		double radioTotal = this.radio + c.radio;
		double distancia = p1.distanciaEntreDosPuntos(this.p1, c.p1);
		
		if(radioTotal < distancia)
			return "Los circulos no se intersectan.";
		else
			return "Los circulos se intersectan.";
	}
}

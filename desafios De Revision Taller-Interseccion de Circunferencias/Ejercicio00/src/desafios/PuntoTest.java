package desafios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTest {

	@Test
	public void distanciaEntreDosPuntos() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(0,0);
		
		double esperado = 0;
		double actual = p1.distanciaEntreDosPuntos(p1, p2);
		
		assertEquals(esperado, actual);
	}

}

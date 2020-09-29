package desafios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test	
	public void seIntersectan() {
		//1.Arrange / Preparar
		Circulo c1 = new Circulo(new Punto(0,0),1);
		Circulo c2 = new Circulo(new Punto(1,1),1.5);
		String esperado = "Los circulos se intersectan.";
	
		//2.Act / Actuar
		String actual = c1.intersectaCon(c2);
		
		//3.Assert / Verificar
		assertEquals(esperado,actual);  //(esperado, real, precision)
	
		//4.Annihilate / Eliminar
		//borrar cosas que crearon, cerrar archivos abierto
	}
}

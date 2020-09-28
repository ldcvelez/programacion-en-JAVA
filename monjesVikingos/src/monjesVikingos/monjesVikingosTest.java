package monjesVikingos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class monjesVikingosTest {
	
	private Monje monje = new Monje();
	
//	@Before
//	public void iniciar(){
//		this.monje = new Monje();
//	}
	
	@Test
	public void estadoInicial() {
		assertEquals("monjesVikingos.StateNormal",monje.getState());
		
	}
	
	@Test
	public void estadoNormalAEstadoColerico() {
		this.monje.defender();
		assertEquals("monjesVikingos.StateColerico",monje.getState());
		
	}
	
	@Test
	public void estadoColericoAEstadoBerseker() {
		this.monje.defender();
		this.monje.defender();
		assertEquals("monjesVikingos.StateBerseker",monje.getState());
		
	}
	
	@Test
	public void estadoNormalAEstadoCalmado() {
		this.monje.meditar();
		assertEquals("monjesVikingos.StateCalmado",monje.getState());
		
	}
	
	@Test
	public void estadoColericoAEstadoCalmado() {
		this.monje.defender();
		this.monje.meditar();
		assertEquals("monjesVikingos.StateNormal",monje.getState());
		
	}
	
	@Test
	public void estadoBersekerAEstadoCalmado() {
		this.monje.defender();
		this.monje.defender();
		this.monje.meditar();
		this.monje.meditar();
		assertEquals("monjesVikingos.StateCalmado",monje.getState());
		
	}
	

}

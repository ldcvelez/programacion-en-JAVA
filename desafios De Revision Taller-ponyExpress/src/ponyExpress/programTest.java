package ponyExpress;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class programTest {

	@Test
	public void pruebJinetes() {
		//1.Arrange / Preparar		
		//2.Act / Actuar	
		//3.Assert / Verificar
		assertEquals(1, jinetes(new int[] {18, 15}));
		assertEquals(2, jinetes(new int[] {43, 23, 40, 13}));
		assertEquals(3, jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
		assertEquals(3, jinetes(new int[] {51, 51, 51}));
		assertEquals(4, jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
		assertEquals(4, jinetes(new int[] {100,100,100,100}));
		assertEquals(13, jinetes(new int[] {1000,100,100,100}));
		assertEquals(13, jinetes(new int[] {100,100,100,1000}));
		assertEquals(30, jinetes(new int[] {1000,1000,1000}));
		assertEquals(29, jinetes(new int[] {1000,1000,899}));
		assertEquals(0, jinetes(new int[] {0, 0, 0}));
		assertEquals(0, jinetes(new int[] {0}));
		//4.Annihilate / Eliminar
	}
	
	public static int jinetes(int [] estaciones) {
		
		int cantJinetes = 1;
		int sum = 0;
		int i=0;
		
		while(i<estaciones.length) 
		{
			while(estaciones[i]>100)
			{
				estaciones[i]-=100;
				cantJinetes++;
			}
			
			sum+=estaciones[i];
			if(sum>100)
			{
				cantJinetes++;
				sum = estaciones[i];
			}	
			
			i++;
		}
		
		if(sum==0)
			return 0;
		
		return cantJinetes;
	}
}

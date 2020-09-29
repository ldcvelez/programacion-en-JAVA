package ponyExpress;

public class program {

	public static void main(String[] args) {
		
		int[] estaciones = {51, 51, 51};
		
		System.out.println("Se necesitan " + jinetes(estaciones) + " jinete(s) para el recorrido.");


	}
	
	public static int jinetes(int [] estaciones) {
		
		int cantJinetes = 1;
		int sum = estaciones[0];
		for(int i=1; i<estaciones.length; i++) {
			sum+=estaciones[i];
			if(sum>100)
			{
				cantJinetes++;
				sum = estaciones[i];
			}			
		}
		
		return cantJinetes;
	}
	
}

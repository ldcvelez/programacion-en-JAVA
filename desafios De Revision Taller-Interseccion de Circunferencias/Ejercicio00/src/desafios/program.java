package desafios;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		/*Scanner a = new Scanner (System.in);
		 System.out.print("Ingrese coordenadas x e y del punto 1:");
		 double x = a.nextDouble();
		 double y = a.nextDouble();
		
		 System.out.print("Ingrese radio del circulo 1 :");
		 double radio  = a.nextDouble();
		 
		 System.out.print("Ingrese coordenadas x e y del punto 2:");
		 double x2 = a.nextDouble();
		 double y2 = a.nextDouble();
		
		 System.out.print("Ingrese radio del circulo 2 :");
		 double radio2  = a.nextDouble();
		 
		Circulo c1 = new Circulo(new Punto(x,y),radio);
		Circulo c2 = new Circulo(new Punto(x2,y2),radio2);*/
		 
		Circulo c1 = new Circulo(new Punto(0,0),50);
		Circulo c2 = new Circulo(new Punto(1,1),1.5);
		
		System.out.println(c1.intersectaCon(c2));
		
		//a.close();

	}

}

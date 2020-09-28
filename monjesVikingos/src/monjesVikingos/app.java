package monjesVikingos;

public class app {

	public static void main(String[] args) {
		
		
		Monje monje = new Monje();
		System.out.println(monje.getState());
		System.out.println(monje.toString());
		monje.atacar();
		monje.defender();
		System.out.println(monje.toString());
		monje.atacar();
		monje.defender();
		System.out.println(monje.toString());
		monje.atacar();
		monje.defender();
		System.out.println(monje.toString());
		monje.atacar();
		monje.defender();
		System.out.println(monje.toString());
		monje.meditar();
		System.out.println(monje.toString());
		monje.meditar();
		System.out.println(monje.toString());
		monje.meditar();
		System.out.println(monje.toString());
	}

}

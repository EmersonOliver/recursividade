package app;

import modulo.Modulo;

public class Principal {

	public static void main(String[] args) {

		Modulo modulo = new Modulo();
		Modulo modulo1 = new Modulo();
		modulo1.setNome("João");
		Modulo modulo2 = new Modulo();
		modulo2.setNome("Maria");
		Modulo modulo3 = new Modulo();
		modulo3.setNome("Joaquim");
		Modulo modulo4 = new Modulo();
		modulo4.setNome("Albert");
		Modulo modulo5 = new Modulo();
		modulo5.setNome("Einstein");

		modulo.addModulo(modulo1);
		modulo.addModulo(modulo2);
		modulo.addModulo(modulo3);
		modulo.addModulo(modulo4);
		modulo.addModulo(modulo5);
		

		System.out.println(modulo.toString());
		System.out.println(modulo.size());

	}
}

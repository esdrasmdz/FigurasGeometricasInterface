package org.generationch41;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo("TrianguloTE",250,175,145);
		Cuadrado cuad = new Cuadrado ("CuadradoCuad",75);
		Rectangulo r = new Rectangulo("RectanguloRect",30,20);
		Rombo rom = new Rombo("Romborom",24,18,32);
		Romboide rombi = new Romboide("Romboiderombi",50,30);
		Trapecio trapito = new Trapecio("Trapreciotrapito",8,8,15,15,8,15,7);
		
		imprimirCalculo(trapito);
		imprimirCalculo(rombi);
		imprimirCalculo(rom);
		imprimirCalculo(r);
		imprimirCalculo(cuad);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
	}//main

	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+================+");
		System.out.println("| El área de ["+ f.getNombre()
				+ "] es : " + f.Area() );
		System.out.println("| El perímetro de ["+ f.getNombre()
				+ "] es : " + f.Perimetro());
		System.out.println("+================+");
	
	}//imprimirCalculo
	
	
}//class Main

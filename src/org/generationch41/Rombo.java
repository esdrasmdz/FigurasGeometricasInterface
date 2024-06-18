package org.generationch41;

public class Rombo implements FiguraGeometrica{

	private String nombre;
	private double diagonalMay;
	private double diagolanMen;
	private double lado;
	
	
	
	
	
	public Rombo(String nombre, double diagonalMay, double diagolanMen, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMay = diagonalMay;
		this.diagolanMen = diagolanMen;
		this.lado = lado;
	}//consructor

	//1.1 Operaciones para calcular valores
		public double Area() {
			return (diagonalMay*diagolanMen)/2;
		}//calcularArea
		
		public double Perimetro() {
			return (lado + lado + lado + lado);
		}//calcularPerimetro

		
		//2.getters and setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getDiagonalMay() {
			return diagonalMay;
		}

		public void setDiagonalMay(double diagonalMay) {
			this.diagonalMay = diagonalMay;
		}

		public double getDiagolanMen() {
			return diagolanMen;
		}

		public void setDiagolanMen(double diagolanMen) {
			this.diagolanMen = diagolanMen;
		}

		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		@Override
		public String toString() {
			return "Rombo [nombre=" + nombre + ", diagonalMay=" + diagonalMay + ", diagolanMen=" + diagolanMen
					+ ", lado=" + lado + "]";
		}//toString
	
		
		
		
		
}//Class Rombo

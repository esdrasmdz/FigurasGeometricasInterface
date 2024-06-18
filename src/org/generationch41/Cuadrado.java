package org.generationch41;

public class Cuadrado  implements FiguraGeometrica{
	
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	
	
	//operaciones para area y perimetro
	//1.1 Operaciones para calcular valores
		public double Area() {
			return (lado*lado);
		}//calcularArea
		
		public double Perimetro() {
			return (lado + lado + lado+lado);
		}//calcularPerimetro
	//------------------------
	
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado



	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//to String()
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}//class Cuadrado

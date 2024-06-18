package org.generationch41;

public class Romboide implements FiguraGeometrica{

	private String nombre;
	private double base;
	private double altura;
	
	
	
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor

				//operaciones para area y perimetro
			//1.1 Operaciones para calcular valores
				public double Area() {
					return (base*altura);
				}//calcularArea
				
				public double Perimetro() {
					return (base + base + altura + altura);
				}//calcularPerimetro
				
				
			//----------- Getters and Setters

				public String getNombre() {
					return nombre;
				}

				public void setNombre(String nombre) {
					this.nombre = nombre;
				}

				public double getBase() {
					return base;
				}

				public void setBase(double base) {
					this.base = base;
				}

				public double getAltura() {
					return altura;
				}

				public void setAltura(double altura) {
					this.altura = altura;
				}

				
				
				@Override
				public String toString() {
					return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
				}//to string
				
				
				
	
	
}//class Romboide

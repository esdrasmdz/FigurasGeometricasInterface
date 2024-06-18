package org.generationch41;

public class Rectangulo implements FiguraGeometrica {

	private String nombre;
	private double base;
	private double altura;
	
	
	//operaciones para area y perimetro
		//1.1 Operaciones para calcular valores
			public double Area() {
				return (base*altura);
			}//calcularArea
			
			public double Perimetro() {
				return (base + base + altura + altura);
			}//calcularPerimetro
		//------------------------
	
	
	
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	
	
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
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	
	
	
}//class rectangulo

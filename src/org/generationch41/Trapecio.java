package org.generationch41;

public class Trapecio implements FiguraGeometrica {

	private String nombre;
	private double ladoUno;
	private double ladoDos;
	private double ladoTres;
	private double ladoCuatro;
	private double baseMen;
	private double baseMay;
	private double altura;
	
	public Trapecio(String nombre, double ladoUno, double ladoDos, double ladoTres, double ladoCuatro, double baseMen,
			double baseMay, double altura) {
		super();
		this.nombre = nombre;
		this.ladoUno = ladoUno;
		this.ladoDos = ladoDos;
		this.ladoTres = ladoTres;
		this.ladoCuatro = ladoCuatro;
		this.baseMen = baseMen;
		this.baseMay = baseMay;
		this.altura = altura;
	}//constructor
	
	//operaciones para area y perimetro
	//1.1 Operaciones para calcular valores
		public double Area() {
			return ((altura*(baseMen+baseMay))/2);
		}//calcularArea
		
		public double Perimetro() {
			return (ladoUno + ladoDos + ladoTres + ladoCuatro);
		}//calcularPerimetro

		
		//Getters and Setters-----------
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getLadoUno() {
			return ladoUno;
		}

		public void setLadoUno(double ladoUno) {
			this.ladoUno = ladoUno;
		}

		public double getLadoDos() {
			return ladoDos;
		}

		public void setLadoDos(double ladoDos) {
			this.ladoDos = ladoDos;
		}

		public double getLadoTres() {
			return ladoTres;
		}

		public void setLadoTres(double ladoTres) {
			this.ladoTres = ladoTres;
		}

		public double getLadoCuatro() {
			return ladoCuatro;
		}

		public void setLadoCuatro(double ladoCuatro) {
			this.ladoCuatro = ladoCuatro;
		}

		public double getBaseMen() {
			return baseMen;
		}

		public void setBaseMen(double baseMen) {
			this.baseMen = baseMen;
		}

		public double getBaseMay() {
			return baseMay;
		}

		public void setBaseMay(double baseMay) {
			this.baseMay = baseMay;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		//----------- Getters and Setters
		
		
		
		@Override
		public String toString() {
			return "Trapecio [nombre=" + nombre + ", ladoUno=" + ladoUno + ", ladoDos=" + ladoDos + ", ladoTres="
					+ ladoTres + ", ladoCuatro=" + ladoCuatro + ", baseMen=" + baseMen + ", baseMay=" + baseMay
					+ ", altura=" + altura + "]";
		}//to String
		
		
	
	
	
	
	
}//class Trapecio

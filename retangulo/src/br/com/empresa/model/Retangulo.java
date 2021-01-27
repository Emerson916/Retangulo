package br.com.empresa.model;

public class Retangulo {

	private double altura;
	private double base;
	
	//set/get - Altura
	public void setAltura(double altura) {
		 this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	//*************************************************//
	
	//set/get - Base
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	//*****************************************************//
	
	// Calcular Area e Perimetro //
	public double calcularArea() {
		return this.base * this.altura;	
	}

	public double calcularPerimetro() {
		return 2 * (this.base + this.altura);
	}
	
}


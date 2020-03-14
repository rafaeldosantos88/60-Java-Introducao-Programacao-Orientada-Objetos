package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() { //Não preciso receber parametro porque os dados já estão na classe triangulo a b c
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}

package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() { //N�o preciso receber parametro porque os dados j� est�o na classe triangulo a b c
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}

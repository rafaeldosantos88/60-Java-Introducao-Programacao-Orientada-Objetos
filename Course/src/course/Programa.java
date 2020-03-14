package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Programa {

	public static void main(String[] args) {
		// Criando programa sem orienta��o objetos.Programa para ler os ladors de um triangulo
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Triangulo x,y;
		x= new Triangulo();
		y =new Triangulo();
		
		
		System.out.println("Entra com as medidas do tri�ngulo X:");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("Entra com as medidas do tri�ngulo Y:");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
	
		double areaX= x.area(); //Foi criado metodo area na classe triangulo assim fazendo reaproveitamento
		double areaY=y.area();
		
		System.out.printf("Tamanho area Triangulo X = %.4f%n",areaX);
		System.out.printf("Tamanho area Triangulo Y = %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("A area X � maior que area Y");
			
		}else {
			System.out.println("A area Y � maior que area X");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

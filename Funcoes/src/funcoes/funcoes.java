package funcoes;

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		/* Processamento que possui significado
		 •Math.sqrt(double)
		 •System.out.println(string)
		 -Vatagens modularização,delegação e reaproveitamento
		 • Na orientação objetos é os métodos
		 */
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Entre com três números:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		mostraResultado(maior);
		
		
		
		sc.close();

	}
	//criando a função abaixo.
	
  public static int max (int x,int y,int z) {
		int aux; //variavel local
		if ( x > y && x > z) {
			aux=x;
		}
		else if(y > z) {
			aux=y;
		}
		else{
			aux=z;
		}
		return aux;
		
		
	}
  public static void mostraResultado(int value) {
	 System.out.println("Maior = " + value );
  }

}

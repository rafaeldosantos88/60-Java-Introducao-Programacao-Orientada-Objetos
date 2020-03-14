package bitwise;

import java.util.Scanner;

public class Mainbitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int masca =0b1000000;// coloquei 0b como referencia de um bit
int n =sc.nextInt(); //Vai imprimir na tela

if((n & masca) != 0) { //Usamos & o qual é diferente &&
	System.out.println("Bit verdadeiro");
}
else {
	System.out.println("Bit falso");
	
}

	}

}

package string;

public class RecortandoString {

	public static void main(String[] args) {
		/* recortando string
		   •Formata:toLowerCase(),toUpperCase(),trim()
		   •Recortar:Substring(inicio),substring(inicio,fim)
		   •Substituir:Replace(char,char),Replace(string,string)
		   •Buscar:indexOf,LastIndexOf
		   •str.Split("") →Recorta string  
		
		String s= "potato apple lemon";
		String[vect =s.split(" ");
		string word1=vect[0];
		string word2=vect[1];
		string word3=vect[2];
		
		
		*/
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 =original.toLowerCase(); //Convertendo tudo em minúscula
		String s02 =original.toUpperCase(); //Convertendo tudo em Maiúsculo
		String s03 =original.trim();        //Elimina os espaços em brnacos no final
		String s04 =original.substring(2);  //Vai pular duas casa e vai imprimir das cadas em diantes
		String s05 =original.substring(2, 9);
		String s06 =original.replace('a', 'R'); //Troca o caractere
		String s07 =original.replace("abc","rafa");//Troca  substring
		int i= original.indexOf("bc");             //Primeira ocorrência
		int j= original.lastIndexOf("bc");     //Ultima ocorrencia do bc
		
		
		System.out.println("Original:"+ original);
		System.out.println("ToLowerCase:"+ s01);
		System.out.println("ToUpperCase:"+ s02);
		System.out.println("Trim:"+ s03);   
		System.out.println("substring(2):"+ s04);   
		System.out.println("substring(2,9):"+ s05); 
		System.out.println("Replace(a',x'):"+ s06); 
		System.out.println("Replace(abc trocada por rafa ):" + s07);
		System.out.println("index of  'bc' :"+ i);
		System.out.println("LAST index of  'bc' :"+ j);
		
		
		
		
		
		 

	}

}

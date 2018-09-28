/* suma 
 programa ue suma 2 numeros
*/

import java.util.Scanner;

public class Suma{
	
	public static void main (String args[]){
	
	
	
		Scanner entrada=new Scanner(System.in);
		
	
	
		int num1;
		int num2;
		int res;
	
		System.out.print("dame un numero: ");
		num1=entrada.nextInt();
		System.out.print("dame el otro numero: ");
		num2=entrada.nextInt();
	
	
		res=num1+num2;
	
		//System.out.print("la suma de "+ num1+ " y "+num2+" es "+res);
		System.out.printf("la suma es %d\n", res);
	
	
	}
	
	
}

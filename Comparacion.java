 
 import java.util.Scanner;
 
 public class Comparacion{
	 
	 public static void main (String args[]){
		 
		 int num1;
		 int num2;
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("introduce el primer numero: ");
		 num1=sc.nextInt();
		 System.out.println("introduce el segundo numero: ");
		 num2=sc.nextInt();
		 
		 if(num1==num2) System.out.printf(" el numero %d es igual que %d", num1,num2);
			  
		 else{
			 
			 if(num1<num2 && num1!=num2) System.out.printf("el numero %d es menor que %d", num1, num2);
			 else  System.out.printf("el numero %d es mayor que %d", num1, num2);
			 	 
		 }
		 } 
 }

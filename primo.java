/*saber si un numero es primo
 * /
 **/
 import java.util.Scanner;
 
 public class primo
 {
	 
	 
	 
	 public static void main (String args[])
	 {
		 
		 int num;
		 int count=1;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("introduce un numero: ");
		 num=sc.nextInt();
		 
		 while(count<=num){
			 //siempre es divisible entre 1
				if(count==1){
				 count++;
				 }
				 
				 
				if(num%count!=0){
					System.out.print("el numero no es primo");
					break;
				}
				///////////
				else{
					
					if(count!=num){count++;}
					else{
						
						System.out.print("el numero es primo");
						
						
					}
					
					
				}
	
				 
				 
				 	
		 
		  		 
		 }
	 }
	 
	 
	 
	
}

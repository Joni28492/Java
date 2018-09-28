/* pide edad y muestra mensaje por pantalla
 * */
 
 import java.util.Scanner;
 
 
 public class Edad{
	 
	 
	 
	 public static void main(String args[]){
	 
	 int edad;
	 String nombre;
	 
	 Scanner sc=new Scanner(System.in);
	System.out.print("Introduce tu nombre: ");
	nombre=sc.nextLine();
	
	
	 System.out.print("Introduce tu edad: ");
	 edad=sc.nextInt();
	  
	 
	 
	 System.out.printf("%s%s%s%d\n", "me llamo ", nombre, " y tengo ", edad);
	 
 }
	 
	 }

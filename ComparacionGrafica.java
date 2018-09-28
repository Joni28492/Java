/*comparacion con interfaz grafica
 * */
 
 
 import javax.swing.*;
 
 public class ComparacionGrafica{
	 
	 
	 public static void main (String args[]){
		 
	int num1= Integer.parseInt(JOptionPane.showInputDialog(null,"introduce el primer numero"));
	int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el segundo numero"));
	
	if(num1==num2) JOptionPane.showMessageDialog(null, "el numero "+num1+" es igual que "+num2);
	if(num1<num2) JOptionPane.showMessageDialog(null, "el numero "+num1+" es menor que "+ num2);
	if(num1>num2) JOptionPane.showMessageDialog(null, "el numero "+num1+" es mayor que "+num2); 	 
		 
	String message="confirmas que quieres salir?";
	String title="seguro";
		 
		 
	/*int bt=JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_CANCEL);
		 	if (bt==JOptionPane.YES_OPTION) System.exit(0);*/
	}
	 
}

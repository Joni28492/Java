/*
 * JOptionPanc -> ShowInputDialog -pedir datos
 * 				  ShowMessageDialog-dar mensaje
 
 sumar 2 numeros
 * */
 
 import javax.swing.*;

public class SumaGrafica{
	
	
	
	
		public static void main(String args[]){
		
		
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el primer numero "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el segundo numero "));
		
		int res=num1+num2;
		
		JOptionPane.showMessageDialog(null,"la suma de "+num1+" y "+num2+" es igual a "+ res);
		
		
		

		
		}
	
	

	
	}

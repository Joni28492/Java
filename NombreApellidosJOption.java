/*
 * utilizar JOptionpane para pedir datos
 * */
 
 import javax.swing.*;
 
 public class NombreApellidosJOption{
	 
	 
	 
	 
		public static void main(String  args[]){
		
		
		String nombre = JOptionPane.showInputDialog(null,"cual es tu nombre?");
		String apellidos=JOptionPane.showInputDialog(null, "cuales son tus apellidos");
		int edad =Integer.parseInt(JOptionPane.showInputDialog(null,"cuantos años tienes?"));

		
		System.out.printf("%s%s%s%s%s%d%s","mi nombre es ", nombre,
		" y me apellido ", apellidos," y tengo ", edad, " años");
		
		
		

		} 
	 
	 
	 
	 
 }

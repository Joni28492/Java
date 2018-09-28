/*programa que te pide los ingredientes del bocata
 * */
 
 import javax.swing.*;
 
 public class Bocata{
	 
	 
	 
	 
	public static void main (String args[]){
		 
	
			String nombre= JOptionPane.showInputDialog(null,"cual es tu nombre");
			String ingrediente1= JOptionPane.showInputDialog(null,"cual es tuprimer ingrediente");
			String ingrediente2=JOptionPane.showInputDialog(null,"cual es tu segundo Ingrediente");
			String ingrediente3=JOptionPane.showInputDialog(null, "cual es tu ultimo ingrediente");
			
			//System.out.print("tu bocata se esta preparando "+nombre+" y tiene 3 ingredientes "+ ingrediente1+ ", "+ingrediente2+" y "+ingrediente3);
		 
			JOptionPane.showMessageDialog(null,"tu bocata se esta preparando "+nombre+" y tiene 3 ingredientes "+ ingrediente1+ ", "+ingrediente2+" y "+ingrediente3);
		 
	 }
	 
	 
}

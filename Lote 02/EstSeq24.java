import javax.swing.*;

public class EstSeq24 {
	
	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Verifique valor se é divisível por 2 e 3:"));
		
		if(valor % 2 == 0 && valor % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 2 e 3");
		}
		else if(valor % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 2");
		}
		else if(valor % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 3");
		}
		
	}
}

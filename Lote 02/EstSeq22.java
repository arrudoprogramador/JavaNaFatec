import javax.swing.*;

public class EstSeq22 {
	public static void main(String[] args) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if(valor1 > valor2) {
			JOptionPane.showMessageDialog(null, valor2 + " " + valor1);
			
		} else {
			JOptionPane.showMessageDialog(null, valor1 + " " + valor2);
			
		}
	}
}

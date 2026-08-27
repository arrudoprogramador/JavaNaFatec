import javax.swing.*;

public class EstSeq19 {
	public static void main(String[] args) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if(valor1 > valor2) {
			JOptionPane.showMessageDialog(null,  "O maior número é: " + valor1);
			
		} else {
			JOptionPane.showMessageDialog(null,  "A maior número é: " + valor2);
			
		}
		
	}
}

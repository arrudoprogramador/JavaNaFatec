import javax.swing.*;

public class EstSeq26 {
	
	public static void main(String[] args) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e verifique multiplicidade:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));

		if(valor1 >= valor2 && valor1 % valor2 == 0) {
			JOptionPane.showMessageDialog(null, "O maior número É múltiplo do menor");
		}
		
		else if(valor2 > valor1 && valor2 % valor1 == 0) {
			JOptionPane.showMessageDialog(null, "O maior número É múltiplo do menor");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O maior número NÃO é múltiplo do menor");
		}
		
	}
}

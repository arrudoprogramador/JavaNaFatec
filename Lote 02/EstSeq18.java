import javax.swing.*;

public class EstSeq18 {
	public static void main(String[] args) {
		int valor1, valor2, diferenca;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if(valor1 > valor2) {
			diferenca = valor1 - valor2;
			
		} else {
			diferenca = valor2 - valor1;
			
		}
		
		JOptionPane.showMessageDialog(null,  "A diferença do maior pelo menor é: " + diferenca);

	}
}

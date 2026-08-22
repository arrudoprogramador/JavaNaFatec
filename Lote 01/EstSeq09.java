import javax.swing.*;

public class EstSeq09 {
	public static void main(String[] args) {
		int numero1 = 0, numero2 = 0, somaQuadrados = 0;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

		somaQuadrados = (numero1 * numero1) + (numero2 * numero2);

		
		JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + somaQuadrados);	
	}
}

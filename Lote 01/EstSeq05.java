import javax.swing.*;

public class EstSeq05 {
	public static void main(String[] args) {
		Double a = 0.0, b = 0.0, c = 0.0, delta,  raiz1, raiz2;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));

		delta = ((b * b) - 4 * a * c);
		
		raiz1 = ((-b) + Math.sqrt(delta)) /(2 * a);
		raiz2 = ((-b) - Math.sqrt(delta)) /(2 * a);
		
		JOptionPane.showMessageDialog(null,
			    String.format("Raiz 1: %.2f%nRaiz 2: %.2f", raiz1, raiz2),
			    "Resultado da Equação",
			    JOptionPane.INFORMATION_MESSAGE);	}
}

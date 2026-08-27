import javax.swing.*;

public class EstSeq20 {
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B" ));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
		
		delta = ((b*b) - 4 * a * c);
		
		if(delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("Raíz 1: %.1f%nRaíz 2: %.1f", x1, x2));
		}
		if(delta == 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, x1);
		}
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "Não há raízes reais nessa equação.");
		}
	}
}

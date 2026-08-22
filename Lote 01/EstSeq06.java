import javax.swing.*;

public class EstSeq06 {
	public static void main(String[] args) {
		int x = 0, y = 0, coringa;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));

		
		coringa = x;
		x = y;
		y = coringa;
		
		JOptionPane.showMessageDialog(null, "Valor de X: " + x + "\nValor de Y: " + y);	
	}
}

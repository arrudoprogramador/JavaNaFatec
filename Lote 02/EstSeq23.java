import javax.swing.JOptionPane;

public class EstSeq23 {
	public static void main(String[] args) {
		int valor1, valor2, valor3, valor4;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));
		valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor:"));
		
		if(valor4 > valor3) {
			JOptionPane.showMessageDialog(null, valor1 + " " + valor2 + " " + valor3 + " " + valor4);
		
		}if(valor4 < valor1) {
			JOptionPane.showMessageDialog(null, valor4 + " " +  valor1 + " " + valor2 + " " + valor3);
		
		}
	}
}

import javax.swing.*;

public class EstSeq07 {
	public static void main(String[] args) {
		Double comprimento = 0.0, largura = 0.0, altura = 0.0, volume = 0.0;
		
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite comprimento: "));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Digite largura: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura: "));

		volume = comprimento * largura * altura;

		
		JOptionPane.showMessageDialog(null, "Volume: " + volume);	
	}
}

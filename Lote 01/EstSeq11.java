import javax.swing.*;

public class EstSeq11 {
	
	public static void main(String[] args) {
		
		Double circunferencia = 0.0, raio = 0.0;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferênciaa: "));
		
		circunferencia = 2 * 3.14 * raio;
		
		JOptionPane.showMessageDialog(null, "Comprimento da circunferência: " + circunferencia);	
	}
}

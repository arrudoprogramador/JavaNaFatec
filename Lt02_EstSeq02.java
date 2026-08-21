import javax.swing.*;

public class Lt01_EstSeq02 {
	
	public static void main(String[] args) {
		
		double salario = 0, reajuste = 0;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário para cálculo de reajuste:"));
		
		reajuste = (salario*1.15);
		
		JOptionPane.showMessageDialog(null, "Valor com reajuste: " + reajuste);

		
	}
}

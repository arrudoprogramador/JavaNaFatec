import javax.swing.*;

public class Primeiro_Programa {
	
	public static void main(String[] args) {
		
		double salario = 0, reajuste = 0;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário para cálculo de reajuste:"));
		
		reajuste = (salario*1.15);
		
		JOptionPane.showMessageDialog(null, "Valor com reajuste: " + reajuste);

		
	}
}

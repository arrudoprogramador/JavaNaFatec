import javax.swing.*;

public class EstSeq16 {
	
	public static void main(String[] args) {
		
		Double horasTrabalhadas = 0.0, valorHora = 0.0, desconto = 0.0, salarioBruto = 0.0, salarioLiquido = 0.0;
		int dependentes;
		
		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
		dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));

		salarioBruto = horasTrabalhadas * valorHora;
		salarioLiquido = salarioBruto - desconto;
		
		salarioLiquido = salarioLiquido + (dependentes * 100);
		
		JOptionPane.showMessageDialog(null, "Salário a receber: " + salarioLiquido);	
	}
}

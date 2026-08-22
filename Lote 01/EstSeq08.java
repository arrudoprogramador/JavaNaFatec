import javax.swing.*;

public class EstSeq08 {
	
	public static void main(String[] args) {
		
		Double depositoPoupanca = 0.0, valorPosterior = 0.0;
		
		depositoPoupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito em poupança: "));
		
		valorPosterior = depositoPoupanca * 1.3;
		
		JOptionPane.showMessageDialog(null, "Valor após 1 mês de aplicação: R$" + valorPosterior);	
	}
}

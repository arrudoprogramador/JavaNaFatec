import javax.swing.*;

public class EstSeq17 {
	public static void main(String[] args) {
		Double litrosConsumidos = 0.0, tempoPercurso = 0.0, velocidadeMedia = 0.0;
		
		tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso: (em horas)"));
		velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));

		litrosConsumidos = (velocidadeMedia / 12) * tempoPercurso;
		
		JOptionPane.showMessageDialog(null, String.format("Quantidade de litros consumidos: %.1f", litrosConsumidos));	
	}
}
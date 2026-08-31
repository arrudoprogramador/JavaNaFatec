import javax.swing.*;

public class EstSeq27 {
	
	public static void main(String[] args) {
		int veloMedia, numVoltas, extensaoCircuito, tempoDuracao;
		
		numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas:"));
		extensaoCircuito = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros):"));
		tempoDuracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração (minutos):"));

		veloMedia = (numVoltas * (extensaoCircuito / 1000)) / (tempoDuracao / 60);
		
		JOptionPane.showMessageDialog(null, "Velocidade média: " + veloMedia);
		
	}
}

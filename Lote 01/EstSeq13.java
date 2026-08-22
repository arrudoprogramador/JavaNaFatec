import javax.swing.*;

public class EstSeq03 {
	
	public static void main(String[] args) {
		
		int quilosAlimento = 0, duracaoDias = 0;
		
		quilosAlimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimento: (em KG)"));
		
		quilosAlimento = quilosAlimento * 1000;

		duracaoDias = quilosAlimento / 50;
		
		JOptionPane.showMessageDialog(null, "Esse alimento durará: " + duracaoDias + " dias");	
	}
}

import javax.swing.*;

public class Lt01_EstSeq01 {
	
	public static void main(String[] args) {
		
		int lado = 0, area = 0;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
		
		area = lado * lado;
		
		JOptionPane.showMessageDialog(null, "Area do quadrado: " + area);
		
	}

}

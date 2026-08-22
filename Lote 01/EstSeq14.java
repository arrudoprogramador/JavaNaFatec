import javax.swing.*;

public class EstSeq14 {
	public static void main(String[] args) {
		int angulo1 = 0, angulo2 = 0, angulo3 = 0;
		
		angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro ângulo: "));
		angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo ângulo: "));

		angulo3 = 180 - (angulo1 + angulo2);

		
		JOptionPane.showMessageDialog(null, "O terceiro ângulo tem: " + angulo3 + "°");	
	}
}

import javax.swing.*;

public class EstSeq03 {
	public static void main(String[] args) {
		Double baseTriangulo = 0.0, alturaTriangulo = 0.0, areaTriangulo = 0.0;
		
		baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
		alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
	
		areaTriangulo = (alturaTriangulo * baseTriangulo)/2;
		
		JOptionPane.showMessageDialog(null, "A área do triangulo é de: " + areaTriangulo);
	}
}

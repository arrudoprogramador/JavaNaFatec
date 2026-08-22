import javax.swing.*;

public class EstSeq03 {
	public static void main(String[] args) {
		Double cateto1 = 0.0, cateto2 = 0.0, hipotenusa = 0.0;
		
		cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto: "));
		cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));

		
		hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		hipotenusa = Math.sqrt(hipotenusa);

		
		JOptionPane.showMessageDialog(null, "A hipotenusa é: " + hipotenusa);	
	}
}

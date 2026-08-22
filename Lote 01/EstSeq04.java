import javax.swing.*;

public class EstSeq04 {
	public static void main(String[] args) {
		Double grausCelsius = 0.0, grausFahrenheit = 0.0;
		
		grausCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite os graus Celsius: "));
	
		grausFahrenheit = (9 * grausCelsius + 160)/5;
		
		JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit é de: " + grausFahrenheit);
	}
}

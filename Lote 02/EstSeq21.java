import javax.swing.*;

public class EstSeq21 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
		
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "APROVADO");
		} 
		if(media >= 3 && media < 6) {
			JOptionPane.showMessageDialog(null, "EXAME");
		}
		if(media < 3) {
			JOptionPane.showMessageDialog(null, "RETIDO");
		}
	}
}

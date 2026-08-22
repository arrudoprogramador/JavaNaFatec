import javax.swing.*;

public class EstSeq12 {
	public static void main(String[] args) {
		int anoNascimento = 0, anoAtual = 0, idade;
		
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

		idade = anoAtual - anoNascimento;
		
		JOptionPane.showMessageDialog(null, String.format("Sua idade Atual: %d%nQuantos anos terá daqui a 17 anos: %d", idade, (idade + 17)));	
	}
}

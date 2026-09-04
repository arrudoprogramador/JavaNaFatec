import javax.swing.*;

public class ex28 {
			
		public static int recebeValores() {
			Double precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço atual do produto:"));
			Double mediaMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a média mensal do produto:"));
		
		}
		
		public static void calcula(Double precoAtual, Double mediaMensal) {
			Double precoNovo;
			
			if (vendaMensal < 500 && precoAtual < 30) {
	            precoNovo = precoAtual * 1.10;
	        }
	        else if (vendaMensal >= 500 && vendaMensal < 1000
	                && precoAtual >= 30 && precoAtual < 80) {
	            precoNovo = precoAtual * 1.15;
	        }
	        else if (vendaMensal >= 1000 && precoAtual >= 80) {
	            precoNovo = precoAtual * 0.95;
	        }
	        else {
	            precoNovo = precoAtual;
	        }
			
			return precoNovo = precoAtual;
			
		}
		
		public static void main(String[] args) {
			
			Double precoAtual;
	        double vendaMensal;
	        double precoNovo;

	        precoAtual = recebeValores();
	        vendaMensal = recebeVendaMensal();

	        precoNovo = calcula(precoAtual, vendaMensal);

	        mostraResultado(precoNovo);
		
	}
}

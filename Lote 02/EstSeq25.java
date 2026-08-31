import javax.swing.*;

public class EstSeq25 {
	
	public static void main(String[] args) {
		int horaInicio, horaFinal, minInicio, minFinal, tempoMin, tempoHoras;
		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo:"));
		minInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos inicial do jogo:"));
		horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo:"));
		minFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos final do jogo:"));
		
		if (horaFinal < horaInicio) {
			tempoHoras = (24 - horaInicio) + horaFinal;
		} else {
			tempoHoras = horaFinal - horaInicio;
		}
		
		if (minFinal < minInicio) {
			tempoMin = (60 - minInicio) + minFinal;
			horaFinal--;
		} else {
			tempoMin = minFinal - minInicio;
		}

		JOptionPane.showMessageDialog(null, String.format("Tempo gasto: %dh%02dmin", tempoHoras, tempoMin));
		
	}
}

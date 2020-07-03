package manipolatoreStringhe;

import javax.swing.JOptionPane;

public class ApplicazioneStringhe {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Inserisci una Stringa");
		Stringa st = new Stringa(s);
		JOptionPane.showMessageDialog(null,s);
		

	}

}

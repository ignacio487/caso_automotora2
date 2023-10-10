package principal;
import vista.VentanaAutomotora;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaAutomotora ventanaAutomotora = new VentanaAutomotora();
				ventanaAutomotora.setVisible(true);
			}
		});
	}
	}
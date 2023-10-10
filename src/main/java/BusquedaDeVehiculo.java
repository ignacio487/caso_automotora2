import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusquedaDeVehiculo extends JFrame{
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton buscarVehiculoBt;
    private JButton regresarBt;
    private JLabel marcavehiculoText;

    public BusquedaDeVehiculo() {
        buscarVehiculoBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        regresarBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

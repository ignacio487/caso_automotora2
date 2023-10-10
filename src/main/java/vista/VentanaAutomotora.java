import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAutomotora extends JFrame {

    public VentanaAutomotora() {
        // Configurar la ventana
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Automotora XYZ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Botón para registrar clientes
        JButton registroClienteButton = new JButton("Agregar Cliente");
        registroClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de registrar cliente aquí
            }
        });

        // Botón para registrar vehículos
        JButton registrarVehiculoButton = new JButton("Agregar Vehículo");
        registrarVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de registrar vehículo aquí
            }
        });

        // Botón para buscar vehículos
        JButton BusquedaDeVehiculoButton = new JButton("Buscar Vehículo");
        BusquedaDeVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de buscar vehículo aquí
            }
        });

        // Agregar botones a un panel
        JPanel panel = new JPanel();
        panel.add(registroClienteButton);
        panel.add(registrarVehiculoButton);
        panel.add(BusquedaDeVehiculoButton);

        // Agregar el panel a la ventana
        add(panel);

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaAutomotora();
            }
        });
    }
}
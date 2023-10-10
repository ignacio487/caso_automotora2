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

        // Botón para agregar clientes
        JButton agregarClienteButton = new JButton("Agregar Cliente");
        agregarClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de agregar cliente aquí
            }
        });

        // Botón para agregar vehículos
        JButton agregarVehiculoButton = new JButton("Agregar Vehículo");
        agregarVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de agregar vehículo aquí
            }
        });

        // Botón para buscar vehículos
        JButton buscarVehiculoButton = new JButton("Buscar Vehículo");
        buscarVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir la ventana de buscar vehículo aquí
            }
        });

        // Agregar botones a un panel
        JPanel panel = new JPanel();
        panel.add(agregarClienteButton);
        panel.add(agregarVehiculoButton);
        panel.add(buscarVehiculoButton);

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
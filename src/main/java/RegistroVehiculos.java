import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegistroVehiculos extends JFrame{
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton registrarVehiculoButton;
    private JButton cancelarButton;
    Connection con;

    public RegistroVehiculos() {
        registrarVehiculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conectar();
            }
        });
    }
public static void main (String[]args){
        RegistroVehiculos registroVehiculos = new RegistroVehiculos();
        registroVehiculos.setContentPane(new RegistroVehiculos().panel);
        registroVehiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroVehiculos.pack();
        registroVehiculos.setVisible(true);
}

public void conectar(){
try {
    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/learning", "root", "");
    System.out.println("Conexion exitosa");
} catch (SQLException e){
    throw new RuntimeException("e");
}
}

}
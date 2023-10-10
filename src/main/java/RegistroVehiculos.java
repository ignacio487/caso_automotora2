import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegistroVehiculos extends JFrame{
    Connection con;
    DefaultListModel mod = new DefaultListModel();
    Statement statement;
    ResultSet resultSet;
    private JPanel panel;
    private JList lista;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton registrarVehiculoButton;
    private JButton cancelarButton;


    public void listarVehiculos() throws SQLException {
        conectar();
        lista.setModel(mod);
        statement=con.createStatement();
        resultSet=statement.executeQuery("SELECT * FROM vehiculo");
        while (resultSet.next()){
            mod.addElement(resultSet.getString("marca"));
        }

    }

    public void insertarVehiculo(){
        conectar();
        String marca = textField1.getText();
        String modelo = textField3.getText();
        String color = textField4.getText();
        String patente = textField5.getText();
        String tipo = comboBox1.getSelectedItem().toString();
        String transmision = comboBox2.getSelectedItem().toString();
        String sql = "INSERT INTO vehiculo (marca, modelo, color, patente, tipo, transmision) VALUES ('"+marca+"','"+modelo+"','"+color+"','"+patente+"','"+tipo+"','"+transmision+"')";
        try{
            con.createStatement().execute(sql);
            JOptionPane.showMessageDialog(null, "Vehiculo ingresado exitosamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar vehiculo");
        }
    }

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
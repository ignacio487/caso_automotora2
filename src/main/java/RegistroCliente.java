import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegistroCliente extends JFrame{
    Connection con;
    DefaultListModel mod = new DefaultListModel();
    Statement statement;
    ResultSet resultSet;
    private JPanel mainPanel;
    private JList lista;
    private JPanel panel;
    private JButton cancelarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton registrarClienteButton;

    public void listarClientes() throws SQLException {
        conectar();
        lista.setModel(mod);
        statement=con.createStatement();
        resultSet=statement.executeQuery("SELECT * FROM cliente");
        while (resultSet.next()){
            mod.addElement(resultSet.getString("nombre"));
        }

    }

    public void insertarCliente(){
        conectar();
        String nombre = textField1.getText();
        String direccion = textField2.getText();
        String rut = textField3.getText();
        String telefono = textField4.getText();
        String correo = textField5.getText();
        String sql = "INSERT INTO cliente (nombre, direccion, rut, telefono, correo) VALUES ('"+nombre+"','"+direccion+"','"+rut+"','"+telefono+"','"+correo+"')";
        try{
            con.createStatement().execute(sql);
            JOptionPane.showMessageDialog(null, "Cliente ingresado exitosamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar cliente");
        }
    }

    public RegistroCliente() {
        registrarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conectar();
            }
        });

    }

    public RegistroCliente(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args){
        JFrame frame=new RegistroCliente("My Celcisus Converter");
        frame.setVisible(true);
        RegistroCliente registroCliente = new RegistroCliente();
        registroCliente.setContentPane(new RegistroCliente().panel);
        registroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroCliente.pack();
        registroCliente.setVisible(true);
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

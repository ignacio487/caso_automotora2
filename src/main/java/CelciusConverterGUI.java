import javax.swing.*;

public class CelciusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JButton cancelarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton registrarClienteButton;

    public CelciusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
    public static void main(String[] args){
        JFrame frame=new CelciusConverterGUI("My Celcisus Converter");
        frame.setVisible(true);
    }
}

package Bank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Bank.Atm;

public class Login extends javax.swing.JFrame {

    private JLabel salamLabel;
    private JLabel bankLabel;
    private JLabel masukanPinLabel;
    private JLabel endLabel;
    private JPasswordField passwordField1;
    private JButton ENTERButton;
    private JButton CANCELButton;
    private JPanel loginPanel;
    private String password;

    public Login() {
        initComponents();
    }

    private void initComponents(){
        salamLabel  = new JLabel();
        bankLabel = new JLabel();
        masukanPinLabel = new JLabel();
        endLabel = new JLabel();
        passwordField1 = new JPasswordField();
        ENTERButton = new JButton();
        CANCELButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        salamLabel.setText("Selamat Datang di Bank ABC");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

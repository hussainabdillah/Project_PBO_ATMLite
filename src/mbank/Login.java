package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Login implements ActionListener {
    public static void main(String[] args) {
        Login login = new Login();
    }

    private static JLabel label;

    public Login() {
        JFrame frame = new JFrame("Login");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(new Color(0xFFFFFF));

        JLabel label = new JLabel("BANK MU");
        label.setBounds(168, 27, 300, 50);
        label.setFont(new Font("Inter", Font.BOLD, 48 ));
        label.setForeground(new Color(0x0A5A67));
        panel.add(label);

        JLabel label1 = new JLabel("Selamat Datang di Bank MU Mobile Banking");
        label1.setBounds(87,80, 305, 25);
        label1.setFont(new Font("Roboto", Font.BOLD, 14));
        label1.setForeground(new Color(0xEC5E2C));
        panel.add(label1);

        JLabel label2 = new JLabel("MASUKKAN USER  ID DAN MPIN ANDA");
        label2.setBounds(98, 140, 300, 25);
        label2.setFont(new Font("Arial", Font.PLAIN, 15 ));
        label2.setForeground(new Color(0x0A5A67));
        panel.add(label2);

        JTextField textField = new JTextField();
        textField.setBounds(159, 180, 245, 25);
        textField.setFont(new Font("Roboto", Font.PLAIN, 15));
        panel.add(textField);

        JLabel username = new JLabel("USER ID");
        username.setBounds(70, 180, 165, 25);
        username.setFont(new Font("Arial", Font.PLAIN, 15));
        username.setForeground(new Color(0xA00A5A67, true));
        panel.add(username);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(159, 220, 245, 25);
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 15 ));
        panel.add(passwordField);

        JLabel mpin = new JLabel("MPIN");
        mpin.setBounds(70, 220, 165, 25);
        mpin.setFont(new Font("Arial", Font.PLAIN, 15));
        mpin.setForeground(new Color(0xA00A5A67, true));
        panel.add(mpin);

        JLabel datasalah = new JLabel("Data yang anda masukkan salah");
        datasalah.setBounds(159, 240, 400, 25);
        datasalah.setFont(new Font("Roboto", Font.PLAIN, 15));
        datasalah.setForeground(new Color(0xC76671));
        datasalah.setVisible(false);
        panel.add(datasalah);

        JButton login = new JButton("LOGIN");
        login.setBounds(70, 278, 200, 40);
        login.setForeground(new Color(0xFFFFFF));
        login.setFont(new Font("Roboto", Font.BOLD, 15));
        login.setBackground(new Color(0x1AC2D0));
        login.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().equals("admin") && passwordField.getText().equals("admin")) {
                    datasalah.setVisible(false);
                    frame.dispose();
                    new Bank();
//                    JOptionPane.showMessageDialog(null, "Login Berhasil");

                }
                else {
                    datasalah.setVisible(true);
                }
            }
        });
        panel.add(login);

        JButton exit = new JButton("EXIT");
        exit.setBounds(300, 278, 103, 40);
        exit.setForeground(new Color(0xFFFFFF));
        exit.setFont(new Font("Roboto", Font.BOLD, 15));
        exit.setBackground(new Color(0xEC5E2C));
        exit.setBorder(BorderFactory.createLineBorder(new Color(0xEC5E2C)));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exit);

        //add image to the panel
        URL imageTest = Login.class.getResource("VectorBlue.png");
        ImageIcon imageIcon = new ImageIcon(imageTest);
        JLabel label3 = new JLabel(imageIcon);
        label3.setBounds(0, 415, 500, 50);
        panel.add(label3);

        URL logoBank = Login.class.getResource("logo.png");
        ImageIcon logo = new ImageIcon(logoBank);
        JLabel label4 = new JLabel(logo);
        label4.setBounds(-130, -200, 500, 500);
        panel.add(label4);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String labelValue = label.getText();
        System.out.println(labelValue);
    }
}

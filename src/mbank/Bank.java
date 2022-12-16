package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();
    }

    private static JLabel label;
    private double saldonasabah;
    private double hasil;

    public Bank() {
        JFrame frame = new JFrame("Bank");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(new Color(0xFFFFFF));

        URL logoBank = Login.class.getResource("logomini.png");
        ImageIcon logo = new ImageIcon(logoBank);
        JLabel label4 = new JLabel(logo);
        label4.setBounds(-210, -220, 500, 500);
        panel.add(label4);

        JLabel labelBank = new JLabel("BANK");
        labelBank.setBounds(70, 5, 200, 50);
        labelBank.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelBank.setForeground(new Color(0x000000));
        panel.add(labelBank);

        JLabel labelMU = new JLabel("MU");
        labelMU.setBounds(145, 5, 200, 50);
        labelMU.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelMU.setForeground(new Color(0xEC5E2C));
        panel.add(labelMU);

        JLabel  nama = new JLabel( "HUSSAIN ABDILLAH");
        nama.setBounds(30, 47, 250, 50);
        nama.setFont(new Font("Inter", Font.BOLD,  18 ));
        nama.setForeground(new Color(0x000000));
        panel.add(nama);

        JLabel norek =  new JLabel("801322123");
        norek.setBounds(30, 65, 250, 50);
        norek.setFont(new Font("Inter", Font.BOLD,  13 ));
        norek.setForeground(new Color(0xEC5E2C));
        panel.add(norek);

        JLabel saldo = new JLabel("Rp " + String.valueOf(String.format(" %,.2f ",saldonasabah)));
        saldo.setBounds(300, 50, 250, 50);
        saldo.setFont(new Font("Inter", Font.BOLD,  20 ));
        saldo.setForeground(new Color(0x000000));
        panel.add(saldo);




        URL vectorBawah = Bank.class.getResource("VectorOrange.png");
        ImageIcon vector = new ImageIcon(vectorBawah);
        JLabel label5 = new JLabel(vector);
        label5.setBounds(0, 415, 500, 50);
        panel.add(label5);




        frame.setVisible(true);

    }
}

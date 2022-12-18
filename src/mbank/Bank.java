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
    private double saldonasabah = 1000000;
    private double hasil;

    public Bank() {
        JFrame frame = new JFrame("Homepage");
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

        JButton cekSaldo = new JButton("CEK SALDO");
        cekSaldo.setBounds(50, 140, 150, 40);
        cekSaldo.setFont(new Font("Inter", Font.BOLD,  15 ));
        cekSaldo.setForeground(new Color(0xFFFFFF));
        cekSaldo.setBackground(new Color(0x1AC2D0));
        cekSaldo.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        cekSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saldo anda sebesar Rp " + String.valueOf(String.format(" %,.2f ",saldonasabah)));
            }
        });
        panel.add(cekSaldo);

        JButton informasi = new JButton("INFORMASI");
        informasi.setBounds(285, 140, 150, 40);
        informasi.setFont(new Font("Inter", Font.BOLD,  15 ));
        informasi.setForeground(new Color(0xFFFFFF));
        informasi.setBackground(new Color(0x1AC2D0));
        informasi.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(informasi);

        JButton isiSaldo = new JButton("ISI SALDO");
        isiSaldo.setBounds(50, 200, 150, 40);
        isiSaldo.setFont(new Font("Inter", Font.BOLD,  15 ));
        isiSaldo.setForeground(new Color(0xFFFFFF));
        isiSaldo.setBackground(new Color(0x1AC2D0));
        isiSaldo.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(isiSaldo);

        JButton tarikSaldo = new JButton("TARIK SALDO");
        tarikSaldo.setBounds(285, 200, 150, 40);
        tarikSaldo.setFont(new Font("Inter", Font.BOLD,  15 ));
        tarikSaldo.setForeground(new Color(0xFFFFFF));
        tarikSaldo.setBackground(new Color(0x1AC2D0));
        tarikSaldo.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(tarikSaldo);

        JButton transfer = new JButton("TRANSFER");
        transfer.setBounds(50, 260, 150, 40);
        transfer.setFont(new Font("Inter", Font.BOLD,  15 ));
        transfer.setForeground(new Color(0xFFFFFF));
        transfer.setBackground(new Color(0x1AC2D0));
        transfer.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(transfer);

        JButton pembayaran = new JButton("PEMBAYARAN");
        pembayaran.setBounds(285, 260, 150, 40);
        pembayaran.setFont(new Font("Inter", Font.BOLD,  15 ));
        pembayaran.setForeground(new Color(0xFFFFFF));
        pembayaran.setBackground(new Color(0x1AC2D0));
        pembayaran.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(pembayaran);

        JButton logout = new JButton("LOGOUT");
        logout.setBounds(168, 320, 150, 40);
        logout.setFont(new Font("Inter", Font.BOLD,  15 ));
        logout.setForeground(new Color(0xFFFFFF));
        logout.setBackground(new Color(0xEC5E2C));
        logout.setBorder(BorderFactory.createLineBorder(new Color(0xEC5E2C)));
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login();
            }
        });
        panel.add(logout);


        


        URL vectorBawah = Bank.class.getResource("VectorOrange.png");
        ImageIcon vector = new ImageIcon(vectorBawah);
        JLabel label5 = new JLabel(vector);
        label5.setBounds(0, 415, 500, 50);
        panel.add(label5);




        frame.setVisible(true);

    }
}

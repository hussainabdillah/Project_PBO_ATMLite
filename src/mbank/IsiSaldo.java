package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Objects;


public class IsiSaldo {
    public static void main(String[] args) {
        IsiSaldo isiSaldo = new IsiSaldo();
    }

    private static JLabel label;
    private double saldonasabah = 1000000;
    private double hasil;

    public IsiSaldo() {
        JFrame frame = new JFrame("Isi Saldo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(new Color(0xFFFFFF));

        URL vectorbawah = Login.class.getResource("VectorBlue.png");
        ImageIcon vector = new ImageIcon(vectorbawah);
        JLabel label3 = new JLabel(vector);
        label3.setBounds(0, 415, 500, 50);
        panel.add(label3);

        URL logoBank = Login.class.getResource("logomini.png");
        ImageIcon logo = new ImageIcon(logoBank);
        JLabel coinlogo = new JLabel(logo);
        coinlogo.setBounds(-210, -220, 500, 500);
        panel.add(coinlogo);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(370, 20, 85, 30);
        backButton.setBackground(new Color(0xEC5E2C));
        backButton.setForeground(new Color(0xFFFFFF));
        backButton.setBorder(BorderFactory.createLineBorder(new Color(0xEC5E2C)));
        backButton.setFont(new Font("Inter", Font.BOLD, 10));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Bank();
            }
        });
        panel.add(backButton);

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

        JLabel labelSaldo = new JLabel("ISI SALDO");
        labelSaldo.setBounds(30, 47, 250, 50);
        labelSaldo.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelSaldo.setForeground(new Color(0x000000));
        panel.add(labelSaldo);

        JLabel pilihRekening = new JLabel("PILIH REKENING");
        pilihRekening.setBounds(30, 100, 250, 50);
        pilihRekening.setFont(new Font("Inter", Font.PLAIN, 14 ));
        pilihRekening.setForeground(new Color(0x000000));
        panel.add(pilihRekening);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(30, 140, 425, 30);
        comboBox.setBackground(new Color(0xFFFFFF));
        comboBox.setForeground(new Color(0x000000));
        comboBox.setFont(new Font("Inter", Font.ITALIC, 14));
        comboBox.addItem("Rekening Tabungan");
        comboBox.addItem("Rekening Giro");
        comboBox.addItem("Rekening Deposito");
        comboBox.addItem("Rekening Investasi");
        comboBox.addItem("Rekening Kredit");
        comboBox.addItemListener(e -> {
            if (Objects.equals(comboBox.getSelectedItem(), "Rekening Tabungan")) {
                label.setText("Rp. " + saldonasabah);
            } else if (Objects.equals(comboBox.getSelectedItem(), "Rekening Giro")) {
                label.setText("Rp. " + saldonasabah);
            } else if (Objects.equals(comboBox.getSelectedItem(), "Rekening Deposito")) {
                label.setText("Rp. " + saldonasabah);
            } else if (Objects.equals(comboBox.getSelectedItem(), "Rekening Investasi")) {
                label.setText("Rp. " + saldonasabah);
            } else if (Objects.equals(comboBox.getSelectedItem(), "Rekening Kredit")) {
                label.setText("Rp. " + saldonasabah);
            }
        });
        String valueRekening = (String) comboBox.getSelectedItem();
        panel.add(comboBox);


        JLabel labelMetodePemb = new JLabel("METODE PEMBAYARAN");
        labelMetodePemb.setBounds(30, 170, 250, 50);
        labelMetodePemb.setFont(new Font("Inter", Font.PLAIN, 14 ));
        labelMetodePemb.setForeground(new Color(0x000000));
        panel.add(labelMetodePemb);

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setBounds(30, 210, 425, 30);
        comboBox2.setBackground(new Color(0xFFFFFF));
        comboBox2.setForeground(new Color(0x000000));
        comboBox2.setFont(new Font("Inter", Font.ITALIC, 14));
        comboBox2.addItem("Transfer Bank");
        comboBox2.addItem("OVO");
        comboBox2.addItem("DANA");
        comboBox2.addItem("GoPay");
        comboBox2.addItem("LinkAja");
        String valueMetode = Objects.requireNonNull(comboBox2.getSelectedItem()).toString();
        panel.add(comboBox2);


        JLabel labelNominal = new JLabel("NOMINAL");
        labelNominal.setBounds(30, 240, 250, 50);
        labelNominal.setFont(new Font("Inter", Font.PLAIN, 14 ));
        labelNominal.setForeground(new Color(0x000000));
        panel.add(labelNominal);

        JTextField nominalTextField = new JTextField();
        nominalTextField.setBounds(30, 280, 425, 30);
        nominalTextField.setBackground(new Color(0xFFFFFF));
        nominalTextField.setForeground(new Color(0x000000));
        nominalTextField.setFont(new Font("Inter", Font.PLAIN, 14));
        panel.add(nominalTextField);

        JButton isiButton = new JButton("BAYAR");
        isiButton.setBounds(168, 340, 150, 40);
        isiButton.setBackground(new Color(0x1AC2D0));
        isiButton.setForeground(new Color(0xFFFFFF));
        isiButton.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        isiButton.setFont(new Font("Inter", Font.BOLD, 15));
        isiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nominal = nominalTextField.getText();
                hasil = Double.parseDouble(nominal);
                saldonasabah = saldonasabah + hasil;
                JOptionPane.showMessageDialog(null, "Pengisian Saldo anda untuk " + valueRekening + " melalui metode "  + valueMetode + " telah berhasil " + "Saldo anda saat ini adalah Rp. " + String.format(" %,.2f ",saldonasabah));
                System.out.println(valueRekening);
            }
        });
//        isiButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.dispose();
//                new Berhasil();
//            }
//        });
        panel.add(isiButton);
        //    private void isiButtonActionPerformed(java.awt.event.ActionEvent evt) {
//            hasil =  saldonasabah + Integer.parseInt(textField.getText());
//        }

        frame.setVisible(true);
    }
}

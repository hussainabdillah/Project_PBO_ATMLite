package admin;


import mbank.Login;
import mbank.Nasabah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.DecimalFormat;

public class TarikSaldo extends Nasabah {
    public static void main(String[] args) {
        TarikSaldo tarikSaldo = new TarikSaldo();
    }

    private static JLabel label;

    public TarikSaldo(){

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        JFrame frame = new JFrame("Tarik Saldo");
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
                new admin.Bank();
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

        JLabel labelTarikSaldo = new JLabel("TARIK SALDO");
        labelTarikSaldo.setBounds(30, 47, 250, 50);
        labelTarikSaldo.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelTarikSaldo.setForeground(new Color(0x000000));
        panel.add(labelTarikSaldo);

        JLabel labelMetode = new JLabel("METODE PENARIKAN");
        labelMetode.setBounds(30, 100, 250, 50);
        labelMetode.setFont(new Font("Inter", Font.PLAIN, 14 ));
        labelMetode.setForeground(new Color(0x000000));
        panel.add(labelMetode);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(30, 140, 425, 30);
        comboBox.setBackground(new Color(0xFFFFFF));
        comboBox.setForeground(new Color(0x000000));
        comboBox.setFont(new Font("Inter", Font.ITALIC, 14));
        comboBox.addItem("BANK ATM");
        comboBox.addItem("ALFAMART");
        comboBox.addItem("INDOMARET");
        comboBox.addItem("PEGADAIAN");
        comboBox.addItem("TELLER");
        panel.add(comboBox);

        JLabel labelNominal = new JLabel("NOMINAL");
        labelNominal.setBounds(30, 170, 250, 50);
        labelNominal.setFont(new Font("Inter", Font.PLAIN, 14 ));
        labelNominal.setForeground(new Color(0x000000));
        panel.add(labelNominal);

        JTextField nominalTextField = new JTextField();
        nominalTextField.setBounds(30, 210, 425, 30);
        nominalTextField.setFont(new Font("Inter", Font.PLAIN, 14 ));
        nominalTextField.setForeground(new Color(0x000000));
        panel.add(nominalTextField);

        JButton tarikButton = new JButton("TARIK");
        tarikButton.setBounds(168, 270, 150, 40);
        tarikButton.setBackground(new Color(0x1AC2D0));
        tarikButton.setForeground(new Color(0xFFFFFF));
        tarikButton.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        tarikButton.setFont(new Font("Inter", Font.BOLD, 15));
        tarikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double nominal = Double.parseDouble(nominalTextField.getText());
                if (nominal > saldoadmin){
                    JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                }
                else {
                    saldoadmin -= nominal;
                    int value = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin melakukan penarikan sebesar Rp. " +
                            df.format(nominal) + " ?", "Konfirmasi Penarikan", JOptionPane.YES_NO_OPTION);
                    if (value == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Anda telah berhasil menarik saldo sebesar Rp. " +
                                df.format(nominal) + " melalui " + comboBox.getSelectedItem() + " Saldo anda saat ini tersisa Rp. " +
                                df.format(saldoadmin));
                    }
                    else if (value == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Penarikan Saldo dibatalkan");
                        saldoadmin += nominal;
                    }
                }
                }
            });
        panel.add(tarikButton);

        frame.setVisible(true);
    }

}


package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Pembayaran {
    public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran();
    }

    private static JLabel label;
    public Pembayaran(){
        JFrame frame = new JFrame("Pembayaran");
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

        JLabel labelPembayaran = new JLabel("PEMBAYARAN");
        labelPembayaran.setBounds(30, 47, 250, 50);
        labelPembayaran.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelPembayaran.setForeground(new Color(0x000000));
        panel.add(labelPembayaran);

        JButton pendidikan = new JButton("PENDIDIKAN");
        pendidikan.setBounds(50, 140, 150, 40);
        pendidikan.setFont(new Font("Inter", Font.BOLD,  15 ));
        pendidikan.setForeground(new Color(0xFFFFFF));
        pendidikan.setBackground(new Color(0x1AC2D0));
        pendidikan.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(pendidikan);

        JButton pulsaData = new JButton("PULSA & DATA");
        pulsaData.setBounds(285, 140, 150, 40);
        pulsaData.setFont(new Font("Inter", Font.BOLD,  15 ));
        pulsaData.setForeground(new Color(0xFFFFFF));
        pulsaData.setBackground(new Color(0x1AC2D0));
        pulsaData.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(pulsaData);

        JButton eCommerce = new JButton("E-COMMERCE");
        eCommerce.setBounds(50, 200, 150, 40);
        eCommerce.setFont(new Font("Inter", Font.BOLD,  15 ));
        eCommerce.setForeground(new Color(0xFFFFFF));
        eCommerce.setBackground(new Color(0x1AC2D0));
        eCommerce.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));;
        panel.add(eCommerce);

        JButton eMoney = new JButton("E-MONEY");
        eMoney.setBounds(285, 200, 150, 40);
        eMoney.setFont(new Font("Inter", Font.BOLD,  15 ));
        eMoney.setForeground(new Color(0xFFFFFF));
        eMoney.setBackground(new Color(0x1AC2D0));
        eMoney.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(eMoney);

        JButton zakatInfaq = new JButton("ZAKAT & INFAQ");
        zakatInfaq.setBounds(50, 260, 150, 40);
        zakatInfaq.setFont(new Font("Inter", Font.BOLD,  15 ));
        zakatInfaq.setForeground(new Color(0xFFFFFF));
        zakatInfaq.setBackground(new Color(0x1AC2D0));
        zakatInfaq.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(zakatInfaq);

        JButton bpjsKesehatan = new JButton("BPJS KESEHATAN");
        bpjsKesehatan.setBounds(285, 260, 150, 40);
        bpjsKesehatan.setFont(new Font("Inter", Font.BOLD,  15 ));
        bpjsKesehatan.setForeground(new Color(0xFFFFFF));
        bpjsKesehatan.setBackground(new Color(0x1AC2D0));
        bpjsKesehatan.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        panel.add(bpjsKesehatan);









        frame.setVisible(true);
    }

}

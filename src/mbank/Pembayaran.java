package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.DecimalFormat;

public class Pembayaran {
    public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran();
    }

    private static JLabel label;
    String universitas;
    String nim;
    double tagihan;

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

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        JButton pendidikan = new JButton("PENDIDIKAN");
        pendidikan.setBounds(50, 140, 150, 40);
        pendidikan.setFont(new Font("Inter", Font.BOLD,  15 ));
        pendidikan.setForeground(new Color(0xFFFFFF));
        pendidikan.setBackground(new Color(0x1AC2D0));
        pendidikan.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        pendidikan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                universitas = JOptionPane.showInputDialog("Masukkan Nama Universitas");
                if (universitas == null){
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                } else {
                    nim = JOptionPane.showInputDialog("Masukkan NIM");
                    if (nim == null){
                        JOptionPane.showMessageDialog(null, "Anda belum memasukkan NIM");
                    } else {
                        int value = JOptionPane.showConfirmDialog(null, "Pembayaran pendidikan " + universitas + " dengan NIM " + nim + " apakah sudah benar?");
                        if (value == JOptionPane.YES_OPTION){
                            tagihan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jumlah tagihan"));
                            if (tagihan == 0){
                                JOptionPane.showMessageDialog(null, "Anda belum memasukkan jumlah tagihan");
                            } else {
                                JOptionPane.showMessageDialog(null, "Pembayaran pendidikan " + universitas + " dengan NIM " + nim + " sebesar Rp. " + df.format(tagihan) + " berhasil");
                            }
                        } else if (value == JOptionPane.NO_OPTION || value == JOptionPane.CANCEL_OPTION){
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                        }
                    }
                }
            }
        });
        panel.add(pendidikan);

        JButton pulsaData = new JButton("PULSA");
        pulsaData.setBounds(285, 140, 150, 40);
        pulsaData.setFont(new Font("Inter", Font.BOLD,  15 ));
        pulsaData.setForeground(new Color(0xFFFFFF));
        pulsaData.setBackground(new Color(0x1AC2D0));
        pulsaData.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        pulsaData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomorHandphone = JOptionPane.showInputDialog("Masukkan Nomor Handphone anda");
                if (nomorHandphone == null){
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian pulsa");
                } else {
                    int value = JOptionPane.showConfirmDialog(null, "Pembayaran pulsa dengan nomor " + nomorHandphone + " apakah sudah benar?");
                    if (value == JOptionPane.YES_OPTION){
                        tagihan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jumlah Tagihan Pulsa"));
                        if (tagihan == 0){
                            JOptionPane.showMessageDialog(null, "Anda belum memasukkan tagihan");
                        } else {
                            JOptionPane.showMessageDialog(null,"Anda akan membayar tagihan sebesar Rp. " + df.format(tagihan) + "\nKlik OK untuk BAYAR");
                            JOptionPane.showMessageDialog(null, "Pembayaran pulsa dengan nomor " + nomorHandphone + " sebesar Rp. " + df.format(tagihan) + " telah berhasil");
                        }
                    }
                    else if (value == JOptionPane.NO_OPTION || value == JOptionPane.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian pulsa");
                    }
                }
            }
        });
        panel.add(pulsaData);

        JButton eCommerce = new JButton("E-COMMERCE");
        eCommerce.setBounds(50, 200, 150, 40);
        eCommerce.setFont(new Font("Inter", Font.BOLD,  15 ));
        eCommerce.setForeground(new Color(0xFFFFFF));
        eCommerce.setBackground(new Color(0x1AC2D0));
        eCommerce.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));;
        eCommerce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String namaToko = JOptionPane.showInputDialog("Masukkan Nama Toko");
                if (namaToko == null){
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                } else {
                    String kodePembayaran = JOptionPane.showInputDialog("Pembayaran untuk " +namaToko+ " Masukkan kode pembayaran");
                    if (kodePembayaran == null){
                        JOptionPane.showMessageDialog(null, "Anda belum memasukkan kode pembayaran");
                    } else {
                        tagihan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jumlah Tagihan"));
                        if (tagihan == 0){
                            JOptionPane.showMessageDialog(null, "Anda belum memasukkan tagihan");
                        } else {
                            JOptionPane.showMessageDialog(null,"Anda akan membayar tagihan sebesar Rp. " + df.format(tagihan) + "\nKlik OK untuk BAYAR");
                            JOptionPane.showMessageDialog(null, "Pembayaran e-commerce " + namaToko + " dengan tagihan sebesar Rp. " + df.format(tagihan) + " telah berhasil");
                        }
                    }
                }
            }
        });
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

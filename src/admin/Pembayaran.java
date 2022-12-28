package admin;


import mbank.Login;
import mbank.Nasabah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.DecimalFormat;


public class Pembayaran extends Nasabah {
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
                if (universitas == null ) {
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                } else if (universitas.equals("")) {
                    JOptionPane.showMessageDialog(null, "Anda belum memasukkan Universitas");
                } else {
                    nim = JOptionPane.showInputDialog("Masukkan NIM");
                    if (nim == null ){
                        JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                    } else if (nim.equals("")) {
                        JOptionPane.showMessageDialog(null, "Anda belum memasukkan NIM");
                    } else {
                        int value = JOptionPane.showConfirmDialog(null, "Pembayaran pendidikan " +
                                universitas + " dengan NIM " + nim + " apakah sudah benar?","Konfirmasi Identitas",
                                JOptionPane.YES_NO_OPTION);
                        if (value == JOptionPane.YES_OPTION){
                            tagihan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jumlah tagihan"));
                            if (tagihan == 0){
                                JOptionPane.showMessageDialog(null, "Anda belum memasukkan jumlah tagihan");
                            } else if (tagihan > saldonasabah) {
                                JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                            } else if (tagihan == JOptionPane.CANCEL_OPTION){
                                JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                            } else {
                                int value2 = JOptionPane.showConfirmDialog(null, "Anda akan membayar tagihan "
                                        + universitas + " dengan NIM " + nim + " sebesar Rp. " + df.format(tagihan) + " apakah sudah benar?",
                                        "Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                                if (value2 == JOptionPane.YES_OPTION){
                                    saldonasabah -= tagihan;
                                    JOptionPane.showMessageDialog(null, "Pembayaran Pendidikan " +
                                            universitas + " dengan NIM " + nim + " sebesar Rp. " + df.format(tagihan) + " berhasil");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                                }

                            }
                        } else if (value == JOptionPane.NO_OPTION){
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
                    int value = JOptionPane.showConfirmDialog(null, "Pembayaran pulsa dengan nomor "
                            + nomorHandphone + " apakah sudah benar?","Konfirmasi",JOptionPane.YES_NO_OPTION);
                    if (value == JOptionPane.YES_OPTION){
                        String input = "";
                        input = JOptionPane.showInputDialog(null,"Masukkan jumlah Tagihan Pulsa",
                                "Pembayaran Pulsa",JOptionPane.INFORMATION_MESSAGE);
                        if(input != null){
                            tagihan = Double.parseDouble(input) ;
                            int value3 = JOptionPane.showConfirmDialog(null,"Anda akan membayar tagihan sebesar Rp. "
                                    + df.format(tagihan) ,"Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                            if (value3 == JOptionPane.YES_OPTION){
                                if (tagihan > saldonasabah){
                                    JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                                } else {
                                    saldonasabah -= tagihan;
                                    JOptionPane.showMessageDialog(null, "Pembayaran Pulsa dengan nomor "
                                            + nomorHandphone + " sebesar Rp. " + df.format(tagihan) + " telah berhasil");
                                }
                            }
                            else if (value3 == JOptionPane.NO_OPTION){
                                JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian pulsa");
                        }
                    }
                    else if (value == JOptionPane.NO_OPTION){
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
                        String input = "";
                        input = JOptionPane.showInputDialog(null,"Masukkan jumlah Tagihan",
                                "Pembayaran E-Commerce",JOptionPane.INFORMATION_MESSAGE);
                        if (input == null){
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                        } else {
                            tagihan = Double.parseDouble(input);
                            int value4 = JOptionPane.showConfirmDialog(null, "Anda akan membayar tagihan "
                                    + namaToko + " sebesar Rp. " + df.format(tagihan) ,"Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                            if (value4 == JOptionPane.YES_OPTION){
                                if (tagihan > saldonasabah){
                                    JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                                } else {
                                    saldonasabah -= tagihan;
                                    JOptionPane.showMessageDialog(null, "Pembayaran E-Commerce "
                                            + namaToko + " sebesar Rp. " + df.format(tagihan) + " telah berhasil");
                                }
                            } else if (value4 == JOptionPane.NO_OPTION){
                                JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                            }
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
        eMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomorHpeMoney = JOptionPane.showInputDialog("Masukkan Nomor Handphone anda");
                if (nomorHpeMoney == null){
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian e-Money");
                } else {
                    String jenisEmoney = JOptionPane.showInputDialog("Masukkan Jenis e-Money yang akan diisi");
                    int value = JOptionPane.showConfirmDialog(null, "Pengisian e-Money " + jenisEmoney
                            + " untuk nomor " + nomorHpeMoney + " apakah sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (value == JOptionPane.YES_OPTION){
                        String input = "";
                        input = JOptionPane.showInputDialog(null,"Masukkan nominal e-Money yang Anda inginkan",
                                "Pembayaran e-Money",JOptionPane.INFORMATION_MESSAGE);
                        if (input == null){
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian e-Money");
                        } else {
                            tagihan = Double.parseDouble(input);
                            int value5 = JOptionPane.showConfirmDialog(null, "Anda akan mengisi saldo " +
                                    jenisEmoney + " sebesar Rp. " + df.format(tagihan) ,"Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                            if (value5 == JOptionPane.YES_OPTION){
                                if (tagihan > saldonasabah){
                                    JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                                } else {
                                    saldonasabah -= tagihan;
                                    JOptionPane.showMessageDialog(null, "Pengisian e-Money " + jenisEmoney +
                                            " dengan nomor " + nomorHpeMoney +" sebesar Rp. " + df.format(tagihan) + " telah berhasil");
                                }
                            } else if (value5 == JOptionPane.NO_OPTION){
                                JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian e-Money");
                            }
                        }
                    }
                    else if (value == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Anda membatalkan pengisian e-Money");
                    }
                }
            }
        });
        panel.add(eMoney);

        JButton zakatInfaq = new JButton("ZAKAT & INFAQ");
        zakatInfaq.setBounds(50, 260, 150, 40);
        zakatInfaq.setFont(new Font("Inter", Font.BOLD,  15 ));
        zakatInfaq.setForeground(new Color(0xFFFFFF));
        zakatInfaq.setBackground(new Color(0x1AC2D0));
        zakatInfaq.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        zakatInfaq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String zakInChoice = JOptionPane.showInputDialog("Silakan pilih transaksi yang Anda inginkan, " +
                        "Anda dapat memilih antara Zakat atau Infaq");
                if (zakInChoice == null){
                    JOptionPane.showMessageDialog(null, "Anda telah membatalkan pembayaran Zakat & Infaq");
                } else {
                    String atasNama = JOptionPane.showInputDialog("Masukkan nama yang melakukan pembayaran");
                    if (atasNama == null) {
                        JOptionPane.showMessageDialog(null, "Anda telah membatalkan transaksi");
                    }else {
                        String input = "";
                        input = JOptionPane.showInputDialog(null,"Masukkan nominal "+ zakInChoice
                                +" yang Anda inginkan","Pembayaran Zakat & Infaq",JOptionPane.INFORMATION_MESSAGE);
                        if (input == null) {
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                        }
                        else {
                            tagihan = Double.parseDouble(input);
                            int value = JOptionPane.showConfirmDialog(null, "Anda akan melakukan pembayaran "
                                    + zakInChoice + " sebesar Rp. " + df.format(tagihan) ,"Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                            if (value == JOptionPane.YES_OPTION){
                                if (tagihan > saldonasabah){
                                    JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                                } else {
                                    saldonasabah -= tagihan;
                                    JOptionPane.showMessageDialog(null, "Pembayaran " + zakInChoice
                                            + " atas nama " + atasNama + " sebesar Rp. " + df.format(tagihan)
                                            + " telah berhasil. Dana telah diterima oleh LazisMU");
                                }
                            } else if (value == JOptionPane.NO_OPTION){
                                JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran");
                            }
                        }
                    }
                }
            }
        });
        panel.add(zakatInfaq);

        JButton bpjsKesehatan = new JButton("BPJS KESEHATAN");
        bpjsKesehatan.setBounds(285, 260, 150, 40);
        bpjsKesehatan.setFont(new Font("Inter", Font.BOLD,  15 ));
        bpjsKesehatan.setForeground(new Color(0xFFFFFF));
        bpjsKesehatan.setBackground(new Color(0x1AC2D0));
        bpjsKesehatan.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
        bpjsKesehatan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String virtualAccount = JOptionPane.showInputDialog("Masukkan Nomor Virtual Account anda");
                if (virtualAccount == null){
                    JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran BPJS Kesehatan");
                } else {
                    String input = "";
                    input = JOptionPane.showInputDialog(null,"Masukkan tagihan BPJS Kesehatan Anda ",
                            "Pembayaran BPJS Kesehatan",JOptionPane.INFORMATION_MESSAGE);
                    if (input == null){
                        JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran BPJS Kesehatan");
                    } else {
                        tagihan = Double.parseDouble(input);
                        int value = JOptionPane.showConfirmDialog(null, "Anda akan melakukan pembayaran BPJS Kesehatan dengan no VA "
                                + virtualAccount + " sebesar Rp. " + df.format(tagihan) ,"Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION);
                        if (value == JOptionPane.YES_OPTION){
                            if (tagihan > saldonasabah){
                                JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi");
                            } else {
                                saldonasabah -= tagihan;
                                JOptionPane.showMessageDialog(null, "Pembayaran BPJS Kesehatan sebesar Rp. "
                                        + df.format(tagihan) + " telah berhasil");
                            }
                        }
                        else if (value == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Anda membatalkan pembayaran BPJS Kesehatan");
                        }
                    }
                }
            }
        });
        panel.add(bpjsKesehatan);
        frame.setVisible(true);
    }
}
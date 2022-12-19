package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Informasi {
public static void main(String[] args) {
        Informasi informasi = new Informasi();
    }

    private static JLabel label;
    private String nama = "HUSSAIN ABDILLAH T.K";
    private double saldonasabah = 1000000;
    private double hasil;
    private String jenis = "BMU Prioritas";

    public Informasi() {
        JFrame frame = new JFrame("Informasi");
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
        JLabel label4 = new JLabel(logo);
        label4.setBounds(-210, -220, 500, 500);
        panel.add(label4);

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

        JLabel labelInformasi = new JLabel("INFORMASI");
        labelInformasi.setBounds(30, 47, 250, 50);
        labelInformasi.setFont(new Font("Inter", Font.BOLD, 25 ));
        labelInformasi.setForeground(new Color(0x000000));
        panel.add(labelInformasi);

        JLabel labelNamaNasabah = new JLabel("NAMA     : ");
        labelNamaNasabah.setBounds(30, 100, 250, 50);
        labelNamaNasabah.setFont(new Font("Inter", Font.PLAIN, 15 ));
        labelNamaNasabah.setForeground(new Color(0x000000));
        panel.add(labelNamaNasabah);

        JTextField namaNasabah = new JTextField(String .valueOf(" " + nama));
        namaNasabah.setBounds(100, 110, 350, 30);
        namaNasabah.setFont(new Font("Inter", Font.PLAIN, 14));
        namaNasabah.setBackground(new Color(0xFFFFFF));
        namaNasabah.setForeground(new Color(0x000000));
        namaNasabah.setEditable(false);
        panel.add(namaNasabah);

        JLabel labelNoRekening = new JLabel("NO REK : ");
        labelNoRekening.setBounds(30, 150, 250, 50);
        labelNoRekening.setFont(new Font("Inter", Font.PLAIN, 15 ));
        labelNoRekening.setForeground(new Color(0x000000));
        panel.add(labelNoRekening);

        JTextField noRekening = new JTextField(String .valueOf(" " + 123456789));
        noRekening.setBounds(100, 160, 350, 30);
        noRekening.setFont(new Font("Inter", Font.PLAIN, 14));
        noRekening.setBackground(new Color(0xFFFFFF));
        noRekening.setForeground(new Color(0x000000));
        noRekening.setEditable(false);
        panel.add(noRekening);

        JLabel labelJenisTabungan = new JLabel("JENIS     : ");
        labelJenisTabungan.setBounds(30, 200, 250, 50);
        labelJenisTabungan.setFont(new Font("Inter", Font.PLAIN, 15 ));
        labelJenisTabungan.setForeground(new Color(0x000000));
        panel.add(labelJenisTabungan);

        JTextField infoJenisTabungan = new JTextField(String .valueOf(" " + jenis));
        infoJenisTabungan.setBounds(100, 210, 350, 30);
        infoJenisTabungan.setFont(new Font("Inter", Font.PLAIN, 14));
        infoJenisTabungan.setBackground(new Color(0xFFFFFF));
        infoJenisTabungan.setForeground(new Color(0x000000));
        infoJenisTabungan.setEditable(false);
        panel.add(infoJenisTabungan);











//        JLabel  nama = new JLabel( "HUSSAIN ABDILLAH");
//        nama.setBounds(30, 47, 250, 50);
//        nama.setFont(new Font("Inter", Font.BOLD,  18 ));
//        nama.setForeground(new Color(0x000000));
//        panel.add(nama);
//
//        JLabel norek =  new JLabel("801322123");
//        norek.setBounds(30, 65, 250, 50);
//        norek.setFont(new Font("Inter", Font.BOLD,  13 ));
//        norek.setForeground(new Color(0xEC5E2C));
//        panel.add(norek);
//
//        JLabel saldo = new JLabel("Rp " + String.valueOf(String.format(" %,.2f ",saldonasabah)));
//        saldo.setBounds(30, 85, 250, 50);
//        saldo.setFont(new Font("Inter", Font.BOLD,  13 ));
//        saldo.setForeground(new Color(0x000000));
//        panel.add(saldo);



        frame.setVisible(true);
}
}

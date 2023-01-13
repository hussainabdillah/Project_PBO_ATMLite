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

    public Informasi() {
        Nasabah nasabah = new Nasabah();
        nasabah.setNama("Hussain Abdilah T.K");
        nasabah.setNoRekening("835906355");
        String nama = nasabah.getNama();
        String noRekening = nasabah.getNoRekening();
        String jenisTabungan = "BMU Prioritas";

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

        JTextField noRekeningField = new JTextField(String .valueOf(" " + noRekening));
        noRekeningField.setBounds(100, 160, 350, 30);
        noRekeningField.setFont(new Font("Inter", Font.PLAIN, 14));
        noRekeningField.setBackground(new Color(0xFFFFFF));
        noRekeningField.setForeground(new Color(0x000000));
        noRekeningField.setEditable(false);
        panel.add(noRekeningField);

        JLabel labelJenisTabungan = new JLabel("JENIS     : ");
        labelJenisTabungan.setBounds(30, 200, 250, 50);
        labelJenisTabungan.setFont(new Font("Inter", Font.PLAIN, 15 ));
        labelJenisTabungan.setForeground(new Color(0x000000));
        panel.add(labelJenisTabungan);

        JTextField infoJenisTabungan = new JTextField(String .valueOf(" " + jenisTabungan));
        infoJenisTabungan.setBounds(100, 210, 350, 30);
        infoJenisTabungan.setFont(new Font("Inter", Font.PLAIN, 14));
        infoJenisTabungan.setBackground(new Color(0xFFFFFF));
        infoJenisTabungan.setForeground(new Color(0x000000));
        infoJenisTabungan.setEditable(false);
        panel.add(infoJenisTabungan);


        frame.setVisible(true);
}
}

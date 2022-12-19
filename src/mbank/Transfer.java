package mbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Transfer {
    public static void main(String[] args) {
        Transfer transfer = new Transfer();
    }

    private static JLabel label;
    public Transfer(){
    JFrame frame = new JFrame("Transfer");
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

    JLabel  transferLabel = new JLabel( "TRANSFER");
    transferLabel.setBounds(30, 47, 250, 50);
    transferLabel.setFont(new Font("Inter", Font.BOLD,  25 ));
    transferLabel.setForeground(new Color(0x000000));
    panel.add(transferLabel);

    JLabel  namaPenerima = new JLabel( "NAMA PENERIMA");
    namaPenerima.setBounds(30, 100, 250, 50);
    namaPenerima.setFont(new Font("Inter", Font.PLAIN,  14 ));
    namaPenerima.setForeground(new Color(0x000000));
    panel.add(namaPenerima);

    JTextField namaPenerimaField = new JTextField();
    namaPenerimaField.setBounds(30, 140, 427, 30);
    namaPenerimaField.setFont(new Font("Roboto", Font.PLAIN,  14 ));
    namaPenerimaField.setForeground(new Color(0x000000));
    panel.add(namaPenerimaField);

    JLabel  noRekTujuan = new JLabel( "REKENING TUJUAN");
    noRekTujuan.setBounds(30, 170, 250, 50);
    noRekTujuan.setFont(new Font("Inter", Font.PLAIN,  14 ));
    noRekTujuan.setForeground(new Color(0x000000));
    panel.add(noRekTujuan);

    JTextField noRekTujuanField = new JTextField();
    noRekTujuanField.setBounds(30, 210, 427, 30);
    noRekTujuanField.setFont(new Font("Roboto", Font.PLAIN,  14 ));
    noRekTujuanField.setForeground(new Color(0x000000));
    panel.add(noRekTujuanField);

    JLabel  nominal = new JLabel( "NOMINAL");
    nominal.setBounds(30, 240, 250, 50);
    nominal.setFont(new Font("Inter", Font.PLAIN,  14 ));
    nominal.setForeground(new Color(0x000000));
    panel.add(nominal);

    JTextField nominalField = new JTextField();
    nominalField.setBounds(30, 280, 427, 30);
    nominalField.setFont(new Font("Roboto", Font.PLAIN,  14 ));
    nominalField.setForeground(new Color(0x000000));
    panel.add(nominalField);

    JButton buttonTransfer = new JButton("TRANSFER");
    buttonTransfer.setBounds(168, 340, 150, 40);
    buttonTransfer.setFont(new Font("Inter", Font.BOLD,  15 ));
    buttonTransfer.setForeground(new Color(0xFFFFFF));
    buttonTransfer.setBackground(new Color(0x1AC2D0));
    buttonTransfer.setBorder(BorderFactory.createLineBorder(new Color(0x1AC2D0)));
    panel.add(buttonTransfer);








    frame.setVisible(true);
}
}

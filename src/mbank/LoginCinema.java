package mbank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginCinema implements ActionListener {
    public static void main(String[] args) {
        LoginCinema login = new LoginCinema();
    }
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel, passwordLabel;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton loginButton;

    public LoginCinema(){
        frame = new JFrame("TicketMU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(100, 500, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(190, 500, 180, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 540, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(190, 540, 180, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(288, 580, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);





        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        if (password.equals("user")){
            System.out.println("Logged in as user");
        } else if (password.equals("member")){
            System.out.println("Logged in as member");
        } else {
            System.out.println("Wrong password");
        }

    }
}
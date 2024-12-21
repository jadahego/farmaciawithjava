package farmacia_pakage.views;

import javax.swing.*;
import java.awt.*;

public class LoginView {

    private JFrame frame;
    private JPanel mainPanel;
    private JButton INGRESAR;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JLabel TEXT_CONTRASEÑA;
    private JLabel TEXT_USUARIO;
    private JLabel INICIAR_SEC;
    private JLabel imageLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;


    public void createUI() {
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(930, 415);
        frame.setResizable(false);
        frame.setTitle("Ingresar al sistema");
        frame.setLocationRelativeTo(null);

        //panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        //panel derecho
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBounds(440, 0, 490, 420);
        jPanel1.setBackground(new java.awt.Color(40, 147, 153));
        mainPanel.add(jPanel1);

        // Agregar componentes al panel derecho
        TEXT_USUARIO = new JLabel("Usuario:");
        TEXT_USUARIO.setBounds(60, 170, 100, 30);
        TEXT_USUARIO.setFont(new Font("Arial", Font.PLAIN, 18));
        jPanel1.add(TEXT_USUARIO);

        textField2 = new JTextField();
        textField2.setBounds(200, 170, 210, 35);
        textField2.setFont(new Font("Arial", Font.PLAIN, 12));
        jPanel1.add(textField2);

        TEXT_CONTRASEÑA = new JLabel("Contraseña:");
        TEXT_CONTRASEÑA.setBounds(60, 230, 150, 30);
        TEXT_CONTRASEÑA.setFont(new Font("Arial", Font.PLAIN, 18));
        jPanel1.add(TEXT_CONTRASEÑA);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(200, 220, 210, 35);
        passwordField1.setFont(new Font("Arial", Font.PLAIN, 12));
        jPanel1.add(passwordField1);

        INGRESAR = new JButton("Ingresar");
        INGRESAR.setBounds(200, 280, 210, 35);
        INGRESAR.setFont(new Font("Arial", Font.PLAIN, 12));
        INGRESAR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jPanel1.add(INGRESAR);

        // Crear un título dentro de jPanel1
        INICIAR_SEC = new JLabel("Iniciar Sesión");
        INICIAR_SEC.setBounds(100, 50, 300, 60);
        INICIAR_SEC.setFont(new Font("Arial", Font.BOLD, 36));
        INICIAR_SEC.setHorizontalAlignment(SwingConstants.CENTER);
        INICIAR_SEC.setVerticalAlignment(SwingConstants.CENTER);
        jPanel1.add(INICIAR_SEC);

        // Panel Izquierdo
        jPanel2 = new JPanel();
        jPanel2.setLayout(null);
        jPanel2.setBounds(0, 0, 440, 412);
        mainPanel.add(jPanel2);

        ImageIcon icon = new ImageIcon(getClass().getResource("/farmacia_pakage/images/Iconos/wallpaper.jpg"));
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(440, 412, Image.SCALE_SMOOTH);
        imageLabel = new JLabel(new ImageIcon(resizedImage));
        imageLabel.setBounds(0, 0, 440, 412);
        jPanel2.add(imageLabel);

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}




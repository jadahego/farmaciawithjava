package farmacia_pakage.views;


import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SystemView {

    private JFrame frameSystem;
    private JPanel SystemPanel;
    private JPanel jPanel_menu;
    private JPanel jpanel_logo;
    private JPanel jpanel_header;
    public JPanel jPanelProducts;
    public JPanel jPanelPurchases;
    public JPanel jPanelCustomers;
    public JPanel jPanelEmployees;
    public JPanel jPanelSuppliers;
    public JPanel jPanelCategories;
    public JPanel jPanelReports;
    public JPanel jPanelSettings;
    private JLabel LogoLabel;
    private JButton BtnFhoto;
    private JButton BtnLogout;
    private JLabel HeaderLabel;
    private JTabbedPane tabbedPane1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SystemView().createSystem());
    }

    public void createSystem() {
        frameSystem = new JFrame("System");
        frameSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSystem.setSize(1208, 680);
        frameSystem.setResizable(false);
        frameSystem.setTitle("Panel Administracion");
        frameSystem.setLocationRelativeTo(null);




        // Panel principal
        SystemPanel = new JPanel();
        SystemPanel.setLayout(null);

        // Panel menú
        jPanel_menu = new JPanel();
        jPanel_menu.setLayout(null);
        jPanel_menu.setBounds(0, 100, 200, 580);
        jPanel_menu.setBackground(new Color(18, 45, 61));
        SystemPanel.add(jPanel_menu);

        // Panel de productos
        jPanelProducts = createMenuPanel(0, 10, "Productos", "/farmacia_pakage/images/Iconos/box.png", jPanel_menu);

        // Panel de compras
        jPanelPurchases = createMenuPanel(0, 70, "Compras", "/farmacia_pakage/images/Iconos/purchase.png", jPanel_menu);

        // Panel de clientes
        jPanelCustomers = createMenuPanel(0, 130, "Clientes", "/farmacia_pakage/images/Iconos/customer.png", jPanel_menu);

        // Panel de empleados
        jPanelEmployees = createMenuPanel(0, 190, "Empleados", "/farmacia_pakage/images/Iconos/employee.png", jPanel_menu);

        // Panel de proveedores
        jPanelSuppliers = createMenuPanel(0, 250, "Proveedores", "/farmacia_pakage/images/Iconos/supplier.png", jPanel_menu);

        // Panel de categorías
        jPanelCategories = createMenuPanel(0, 310, "Categorías", "/farmacia_pakage/images/Iconos/categories.png", jPanel_menu);

        // Panel de reportes
        jPanelReports = createMenuPanel(0, 370, "Reportes", "/farmacia_pakage/images/Iconos/business-report.png", jPanel_menu);

        // Panel de configuración
        jPanelSettings = createMenuPanel(0, 430, "Configuración", "/farmacia_pakage/images/Iconos/settings.png", jPanel_menu);

        // Panel del logo
        jpanel_logo = new JPanel();
        jpanel_logo.setLayout(null);
        jpanel_logo.setBounds(0, 0, 200, 100);
        jpanel_logo.setBackground(Color.WHITE);
        SystemPanel.add(jpanel_logo);

        // Logo de la aplicación
        ImageIcon icon = new ImageIcon(getClass().getResource("/farmacia_pakage/images/Iconos/farmacia.png"));
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        LogoLabel = new JLabel(new ImageIcon(resizedImage));
        LogoLabel.setBounds(0, 0, 200, 100);
        jpanel_logo.add(LogoLabel);

        // Panel de encabezado
        jpanel_header = new JPanel();
        jpanel_header.setLayout(null);
        jpanel_header.setBounds(200, 0, 1008, 100);
        jpanel_header.setBackground(new Color(18, 45, 61));
        SystemPanel.add(jpanel_header);

        // Título en el encabezado
        HeaderLabel = new JLabel("FARMACIA JADAHEGO");
        HeaderLabel.setBounds(90, 2, 340, 100);
        HeaderLabel.setFont(new Font("Arial", Font.BOLD, 24));
        HeaderLabel.setForeground(Color.WHITE);
        jpanel_header.add(HeaderLabel);

        // Botón de usuario
        BtnFhoto = new JButton();
        BtnFhoto.setBounds(630, 20, 80, 65);
        BtnFhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ImageIcon iconMan = new ImageIcon(getClass().getResource("/farmacia_pakage/images/Iconos/man.png"));
        Image scaledImage = iconMan.getImage().getScaledInstance(80, 65, Image.SCALE_SMOOTH);
        BtnFhoto.setIcon(new ImageIcon(scaledImage));
        jpanel_header.add(BtnFhoto);

        // Botón de salir
        BtnLogout = new JButton("Salir");
        BtnLogout.setBounds(890, 35, 80, 30);
        BtnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        BtnLogout.setFont(new Font("Arial", Font.BOLD, 12));
        jpanel_header.add(BtnLogout);

        // Panel de pestañas
        tabbedPane1 = new JTabbedPane();
        tabbedPane1.setBounds(200, 100, 1008, 580);

        String[] tabNames = {"Productos", "Compras", "Clientes", "Empleados", "Proveedores", "Categorías", "Reportes", "Configuración"};

        for (int i = 0; i < tabNames.length; i++) {
            JPanel tabPanel = new JPanel();
            tabPanel.setLayout(null);
            tabPanel.setBackground(new Color(152 - i, 202 - i, 63));

            JLabel label = new JLabel("Contenido de la pestaña " + tabNames);
            label.setBounds(50, 50, 200, 30);
            label.setFont(new Font("Arial", Font.PLAIN, 18));
            tabPanel.add(label);

            tabbedPane1.addTab(tabNames[i], tabPanel);
        }

        SystemPanel.add(tabbedPane1);

        frameSystem.add(SystemPanel);
        frameSystem.setVisible(true);
    }

    public JPanel createMenuPanel(int x, int y, String text, String iconPath, JPanel parentPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(x, y, 200, 50); // Altura ajustada para íconos
        panel.setBackground(new Color(18, 45, 61)); // Fondo igual a la barra de menú


        JLabel iconLabel = new JLabel();
        iconLabel.setBounds(10, 10, 30, 30);
        ImageIcon icon = new ImageIcon(getClass().getResource(iconPath));
        Image scaledImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        iconLabel.setIcon(new ImageIcon(scaledImage));
        panel.add(iconLabel);


        JLabel textLabel = new JLabel(text);
        textLabel.setBounds(50, 10, 140, 30);
        textLabel.setForeground(Color.WHITE); // Letras blancas
        textLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(textLabel);

        textLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(new Color(52, 202, 63));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(new Color(18, 45, 61));
            }
        });

        iconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(new Color(52, 202, 63));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(new Color(18, 45, 61));
            }
        });


        parentPanel.add(panel);
        return panel;
    }
}




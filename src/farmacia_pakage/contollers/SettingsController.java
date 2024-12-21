package farmacia_pakage.contollers;

import farmacia_pakage.views.SystemView;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SettingsController implements MouseListener {

    private SystemView views;

    public SettingsController(SystemView views){

        this.views = views;
        this.views.jPanelProducts.addMouseListener(this);
        this.views.jPanelPurchases.addMouseListener(this);
        this.views.jPanelCustomers.addMouseListener(this);
        this.views.jPanelEmployees.addMouseListener(this);
        this.views.jPanelSuppliers.addMouseListener(this);
        this.views.jPanelCategories.addMouseListener(this);
        this.views.jPanelReports.addMouseListener(this);
        this.views.jPanelSettings.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Cambiar el color solo del panel en el que se pasa el mouse
        if(e.getSource() == views.jPanelReports){
            views.jPanelReports.setBackground(new Color(52, 202, 63)); // Cambia el color de Reports
        } else if (e.getSource() == views.jPanelPurchases) {
            views.jPanelPurchases.setBackground(new Color(52, 202, 63)); // Cambia el color de Purchases
        } else if (e.getSource() == views.jPanelCustomers) {
            views.jPanelCustomers.setBackground(new Color(52, 202, 63)); // Cambia el color de Customers
        } else if (e.getSource() == views.jPanelEmployees) {
            views.jPanelEmployees.setBackground(new Color(52, 202, 63)); // Cambia el color de Employees
        } else if (e.getSource() == views.jPanelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(52, 202, 63)); // Cambia el color de Suppliers
        } else if (e.getSource() == views.jPanelCategories) {
            views.jPanelCategories.setBackground(new Color(52, 202, 63)); // Cambia el color de Categories
        } else if (e.getSource() == views.jPanelSettings) {
            views.jPanelSettings.setBackground(new Color(52, 202, 63)); // Cambia el color de Settings
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Restablecer el color al original (no debe afectar los demás paneles)
        if(e.getSource() == views.jPanelReports){
            views.jPanelReports.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Reports
        } else if (e.getSource() == views.jPanelPurchases) {
            views.jPanelPurchases.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Purchases
        } else if (e.getSource() == views.jPanelCustomers) {
            views.jPanelCustomers.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Customers
        } else if (e.getSource() == views.jPanelEmployees) {
            views.jPanelEmployees.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Employees
        } else if (e.getSource() == views.jPanelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Suppliers
        } else if (e.getSource() == views.jPanelCategories) {
            views.jPanelCategories.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Categories
        } else if (e.getSource() == views.jPanelSettings) {
            views.jPanelSettings.setBackground(new Color(18, 45, 61)); // Vuelve al color original de Settings
        }
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author Lab Informatika
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonHandling extends JFrame implements ActionListener{

    private JLabel label;
    private JButton btnsetuju;
    private JButton btngagal;
    
    public ButtonHandling (){
        super("Coba Button Handling");
        label = new JLabel("Status : None");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        btnsetuju = new JButton ("Setuju");
        btngagal = new JButton ("Gagal");
        btnsetuju.addActionListener(this);
        btngagal.addActionListener(this);
        setLayout(new BorderLayout());
        add(label, "North");
        add(btnsetuju, "West");
        add(btngagal, "East");
        
        pack();
        setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(3);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnsetuju){
            label.setText("Status : Setuju");
        }
        if(e.getSource()==btngagal){
            label.setText("Status : Gagal");
        }
    }
    
}

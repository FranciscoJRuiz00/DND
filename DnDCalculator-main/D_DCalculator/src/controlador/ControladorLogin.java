/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.SqlUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.Personaje;
import Test.test;

import modelo.hash;
import modelo.modeloPjs;
import modelo.usuarios;
import vista.Personaje;
import vista.crearCuenta;
import vista.login;
/**
 *
 * @author Usuario
 */
public class ControladorLogin implements ActionListener, MouseListener {
    
    private usuarios usuarios;
    private hash hash;
    private login login;
    private Personaje personaje;
    
    public ControladorLogin(usuarios usuarios, hash hash, login login,Personaje personaje) {
         this.hash = hash;
         this.usuarios= usuarios;
         this.login=login;
         this.personaje= personaje;
         this.login.Passwrd.addActionListener(this);
         this.login.cclabel.addMouseListener(this);
         this.login.username.addActionListener(this);
         this.login.isLabel.addMouseListener(this);
    }

    
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if (evt.equals(login.Passwrd)) {
            
        }
        
        if (evt.equals(login.username)) {

        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       Object evt = me.getSource();
       
       if (evt.equals(login.cclabel)) {
            
        }
       
       if (evt.equals(login.isLabel)) {
           
        SqlUsuarios modSql= new SqlUsuarios();
        usuarios mod = new usuarios();
        
        String passStr = new String(login.Passwrd.getPassword());
        
        if (!login.username.getText().equals("") && !login.Passwrd.equals("") || !String.valueOf(login.Passwrd.getPassword()).equals("********")&& !login.username.getText().equals("Ingrese nombre de usuario")) {
            String nuevoPass= hash.sha1(passStr);
            
            mod.setUsuario(login.username.getText());
            mod.setPassword(nuevoPass);
            
            if(modSql.login(mod)){
                
                login.setVisible(false);
                personaje.setVisible(true);
                
            } else{
                JOptionPane.showMessageDialog(null,"Datos Incorrectos");
            }
            
        } else{
            JOptionPane.showMessageDialog(null,"Debe ingresar datos, Aventurero");
        }
           
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import controlador.Controlador;
import controlador.ControladorLogin;
import modelo.modeloPjs;
import modelo.usuarios;
import vista.Personaje;
import vista.crearCuenta;
import vista.login;
import modelo.hash;

/**
 *
 * @author Usuario
 */
public class test {
    public static void main(String[] args){
        login log = new login();
        crearCuenta cc = new crearCuenta();
        Personaje pjs = new Personaje();
        modeloPjs modeloPjs = new modeloPjs();
        Controlador ControlPjs = new Controlador(pjs, modeloPjs,log);
        ControlPjs.iniciar();  
       
       hash hash = new hash();
       usuarios usuarios = new usuarios();
       ControladorLogin contrologin = new ControladorLogin(usuarios,hash,log,pjs); 
       
       log.setVisible(true);
    }

    
}


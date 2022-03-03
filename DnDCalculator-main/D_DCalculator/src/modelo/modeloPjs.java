/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Usuario
 */
public class modeloPjs {
    
    
    int salud = ThreadLocalRandom.current().nextInt(40, 101);
    int fuerza = ThreadLocalRandom.current().nextInt(1, 21);
    int defensa = ThreadLocalRandom.current().nextInt(1, 21);
    int destreza = ThreadLocalRandom.current().nextInt(1, 21);
    int sabiduria = ThreadLocalRandom.current().nextInt(1, 21);
    int carisma = ThreadLocalRandom.current().nextInt(1, 21);
    
    int numDado;
    int selector;
    int saludI = salud;
    int fuerzaI = fuerza;
    int defensaI = defensa;
    int destrezaI = destreza;
    int sabiduriaI = sabiduria;
    int carismaI = carisma;

    public int getNumDado() {
        return numDado;
    }

    public void setNumDado(int numDado) {
        this.numDado = numDado;
    }

    public int getSelector() {
        return selector;
    }

    public void setSelector(int selector) {
        this.selector = selector;
    }

    public int getSaludI() {
        return saludI;
    }

    public void setSaludI(int saludI) {
        this.saludI = saludI;
    }

    public int getFuerzaI() {
        return fuerzaI;
    }

    public void setFuerzaI(int fuerzaI) {
        this.fuerzaI = fuerzaI;
    }

    public int getDefensaI() {
        return defensaI;
    }

    public void setDefensaI(int defensaI) {
        this.defensaI = defensaI;
    }

    public int getDestrezaI() {
        return destrezaI;
    }

    public void setDestrezaI(int destrezaI) {
        this.destrezaI = destrezaI;
    }

    public int getSabiduriaI() {
        return sabiduriaI;
    }

    public void setSabiduriaI(int sabiduriaI) {
        this.sabiduriaI = sabiduriaI;
    }

    public int getCarismaI() {
        return carismaI;
    }

    public void setCarismaI(int carismaI) {
        this.carismaI = carismaI;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
      
    
}

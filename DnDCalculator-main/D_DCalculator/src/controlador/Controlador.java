/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import modelo.modeloPjs;
import vista.Personaje;
import vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador implements ActionListener {

    private Personaje pjs;
    private modeloPjs modelpjs;
    private login lgs;

    public Controlador(Personaje pjs, modeloPjs modelpjs,login lgs) {
        this.pjs = pjs;
        this.modelpjs = modelpjs;
        this.lgs= lgs;

        this.pjs.DadoAccion.addActionListener(this);
        this.pjs.DadoCofre.addActionListener(this);
        this.pjs.Dadoataque.addActionListener(this);
        this.pjs.DadoAprendiz.addActionListener(this);
        this.pjs.Dadomagia.addActionListener(this);
        this.pjs.reestablecer.addActionListener(this);
        this.pjs.jButton7.addActionListener(this);
        this.pjs.fotopg.addMouseListener(new MouseAdapter() 
        {
        public void mouseClicked(MouseEvent ev){
        
        Object evt = ev.getSource();
        
        if(evt.equals(pjs.fotopg)){
                    JFileChooser browseImageFile = new JFileChooser();

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File SelectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = SelectedImageFile.getAbsolutePath();

            ImageIcon ii = new ImageIcon(selectedImagePath);

            Image image = ii.getImage().getScaledInstance(pjs.fotopg.getWidth(), pjs.fotopg.getHeight(), Image.SCALE_SMOOTH);

            pjs.fotopg.setIcon(new ImageIcon(image));
        }
        }
        }
        });
    }

    public void iniciar() {
        pjs.setTitle("Creador de Personaje");
        pjs.setLocationRelativeTo(null);
    }

    
    
    public void actionPerformed(ActionEvent e) {

        Object evt = e.getSource();
        
        if (evt.equals(pjs.DadoCofre)) {
            modelpjs.setNumDado((int) (Math.random()*6+1));
            if (modelpjs.getNumDado() == 1) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Al abrir el cofre sale de repente una serpiente que te muerde en la mano, la serpiente no era venenosa por lo cual no pierdes vida,pero rompe un pedazo de tu armadura, tu defensa se ve reducida en 2”");

                modelpjs.setDefensaI(modelpjs.getDefensaI() - 2);
                pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensaI()));

            }

            if (1 < modelpjs.getNumDado() && modelpjs.getNumDado() < 4) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                modelpjs.setSelector(((int) (Math.random() * 2 + 1)));
                switch (modelpjs.getSelector()) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "“Al abrir el cofre no encuentras nada, está completamente vacío, tus estadisticas permanecen igual”");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "“Al abrir el cofre te cortas la mano con una espada oxidada y no puedes moverla igual, tu destreza se ve reducida en 1”");
                        modelpjs.setDestrezaI(modelpjs.getDestrezaI() - 1);
                        pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestrezaI()));
                        break;
                }
            }

            if (modelpjs.getNumDado() < 6 && modelpjs.getNumDado() > 3) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                modelpjs.setSelector((int) (Math.random() * 2 + 1));
                switch (modelpjs.getSelector()) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "“Al abrir el cofre te encuentras un afilador para tu espada, obtienes 1 de fuerza”");
                        modelpjs.setFuerzaI(modelpjs.getFuerzaI() + 1);
                        pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerzaI()));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "“Al abrir el cofre encuentras una poción de vida, decides beberla y obtienes 10 de salud”");
                        modelpjs.setSaludI(modelpjs.getSaludI() + 10);
                        pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
                        break;
                }
            }

            if (modelpjs.getNumDado() == 6) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Al abrir el cofre encuentras un anillo mágico, al ponertelo te sientes mas guapo, tu carisma aumenta en 3”");
                modelpjs.setCarismaI(modelpjs.getCarismaI() + 3);
                pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarismaI()));
            }

        }
        
        if (evt.equals(pjs.DadoAccion)){
            
        }
        
        if (evt.equals(pjs.DadoAprendiz)) {
            modelpjs.setSelector((int) (Math.random() * 10 + 1));
            if (modelpjs.getNumDado() == 1) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Intentaste aprender a transformarte, pero en lugar de eso solamente conseguiste deformar tu cara, pierdes 10 de carisma”");
                modelpjs.setCarismaI(modelpjs.getCarismaI() - 10);
                pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarismaI()));
            }

            if (modelpjs.getNumDado() > 1 && modelpjs.getNumDado() < 6) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Intentaste aprender un hechizo explosivo pero lo ejecutaste mal y saliste herido, tu salud se redujo en 5 junto con tu sabiduria”");
                modelpjs.setSaludI(modelpjs.getSaludI() - 5);
                modelpjs.setSabiduriaI(modelpjs.getSabiduriaI() - 5);
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
                pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduriaI()));
            }

            if (modelpjs.getNumDado() > 5 && modelpjs.getNumDado() < 10) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Genial has aprendido a utilizar el hechizo de ralentización, obtienes 2 de destreza ”");
                modelpjs.setDestrezaI(modelpjs.getDestrezaI() + 2);
                pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestrezaI()));
            }

            if (modelpjs.getNumDado() == 10) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“¡Asombroso!, has aprendido a cómo usar la gran bola de fuego, tu fuerza ha aumentado en 10”");
                modelpjs.setFuerzaI(modelpjs.getFuerzaI() + 10);
                pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerzaI()));
            }
        }

        if (evt.equals(pjs.Dadoataque)) {
            modelpjs.setNumDado((int) (Math.random()*20+1));
            if (modelpjs.getNumDado() == 1) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Tu ataque termina horriblemente mal, te atoraste en un hueco y el enemigo aprovechó para meterte un golpe critico, pierdes 50 de vida");
                modelpjs.setSaludI(modelpjs.getSaludI() - 50);
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
            }

            if (modelpjs.getNumDado() > 1 && modelpjs.getNumDado() < 5) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "El enemigo esquiva tu ataque, además quedaste en una mala posición y diste una oportunidad para que el enemigo contraatacara, pierdes 20 de vida");
                modelpjs.setSaludI(modelpjs.getSaludI() - 20);
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
            }

            if (modelpjs.getNumDado() > 4 && modelpjs.getNumDado() < 11) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Pierdes el equilibrio y fallas el ataque, el enemigo aprovecha a contraatacar pero al perder el equilibrio su ataque no conecta adecuadamente, pierdes 10 de vida");
                modelpjs.setSaludI(modelpjs.getSaludI() - 10);
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
            }

            if (modelpjs.getNumDado() > 10 && modelpjs.getNumDado() < 14) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Tu ataque falla, pero el enemigo no tuvo oportunidad de contraatacar");
            }

            if (modelpjs.getNumDado() > 13 && modelpjs.getNumDado() < 20) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Haz acertado tu ataque, el enemigo pierde vida igual a tu fuerza");
            }

            if (modelpjs.getNumDado() == 20) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Al atacar al enemigo haz acertado un golpe critico, lo que inflinge el triple de tu fuerza como daño”");
            }
        }

        if (evt.equals(pjs.Dadomagia)) {
            modelpjs.setNumDado((int) (Math.random()*12+1));
            if (modelpjs.getNumDado() == 1) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "“Tu magia ha salido terriblemente mal, todas tus estadisticas se reducieron en 5”");               
                modelpjs.setSaludI(modelpjs.getSaludI() - 5);
                modelpjs.setCarismaI(modelpjs.getCarismaI() - 5);
                modelpjs.setFuerzaI(modelpjs.getFuerzaI() - 5);
                modelpjs.setDestrezaI(modelpjs.getDestrezaI() - 5);
                modelpjs.setSabiduriaI(modelpjs.getSabiduriaI() - 5);
                modelpjs.setDefensaI(modelpjs.getDefensaI() - 5);
                
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
                pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarismaI()));
                pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestrezaI()));
                pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerzaI()));
                pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduriaI()));
                pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensaI()));
            }

            if (modelpjs.getNumDado() > 1 && modelpjs.getNumDado() < 5) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Tu magia ha salido y has desgastado tu armadura, se redució en 2 tu defensa");
                modelpjs.setDefensaI(modelpjs.getDefensaI() - 2);
                pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensaI()));
            }

            if (modelpjs.getNumDado() > 4 && modelpjs.getNumDado() < 9) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Tu magia ha salido bien y has memorizado textos runicos, haz ganado 2 de sabiduria");
                modelpjs.setSabiduriaI(modelpjs.getSabiduriaI() + 2);
                pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduriaI()));
            }

            if (modelpjs.getNumDado() > 8 && modelpjs.getNumDado() < 12) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "Tu magia ha salido muy bien, te aplicaste a ti mismo un hechizo de agilidad, tu destreza aumentó en 3");
                modelpjs.setDestrezaI(modelpjs.getDestrezaI() + 3);
                pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestrezaI()));
            }

            if (modelpjs.getNumDado() == 12) {
                System.out.println("Te ha salido un: ");
                System.out.println(modelpjs.getNumDado());
                JOptionPane.showMessageDialog(null, "¡Haz ejecutado tu magia de manera pefecta!, todas tus estadisticas aumentaron en 5");
                modelpjs.setSaludI(modelpjs.getSaludI() + 5);
                modelpjs.setCarismaI(modelpjs.getCarismaI() + 5);
                modelpjs.setDestrezaI(modelpjs.getDestrezaI() + 5);
                modelpjs.setFuerzaI(modelpjs.getFuerzaI() + 5);
                modelpjs.setSabiduriaI(modelpjs.getSabiduriaI() + 5);
                modelpjs.setDefensaI(modelpjs.getDefensaI() + 5);
                
                pjs.saludBtn.setText(String.valueOf(modelpjs.getSaludI()));
                pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarismaI()));
                pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestrezaI()));
                pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerzaI()));
                pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduriaI()));
                pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensaI()));
            }
        }
        
        if (evt.equals(pjs.reestablecer)) {

            pjs.saludBtn.setText(String.valueOf(modelpjs.getSalud()));
            pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarisma()));
            pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestreza()));
            pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerza()));
            pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduria()));
            pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensa()));
        }

        if (evt.equals(pjs.jButton7)) {
            //JOptionPane.showMessageDialog(null, "Generacion de estadisticas");
            modelpjs.setSalud(ThreadLocalRandom.current().nextInt(40, 101));
            modelpjs.setFuerza(ThreadLocalRandom.current().nextInt(1, 21));
            modelpjs.setDefensa(ThreadLocalRandom.current().nextInt(1, 21));
            modelpjs.setDestreza(ThreadLocalRandom.current().nextInt(1, 21));
            modelpjs.setSabiduria(ThreadLocalRandom.current().nextInt(1, 21));
            modelpjs.setCarisma(ThreadLocalRandom.current().nextInt(1, 21));

            pjs.saludBtn.setText(String.valueOf(modelpjs.getSalud()));
            pjs.carismaBtn.setText(String.valueOf(modelpjs.getCarisma()));
            pjs.destrezaBtn.setText(String.valueOf(modelpjs.getDestreza()));
            pjs.fuerzaBtn.setText(String.valueOf(modelpjs.getFuerza()));
            pjs.sabiduriaBtn.setText(String.valueOf(modelpjs.getSabiduria()));
            pjs.defensaBts.setText(String.valueOf(modelpjs.getDefensa()));

        }

    }

}
